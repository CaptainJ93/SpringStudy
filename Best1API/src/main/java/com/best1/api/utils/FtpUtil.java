package com.best1.api.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

import sun.net.TelnetInputStream;
import sun.net.TelnetOutputStream;
import sun.net.ftp.FtpClient;
import sun.net.ftp.FtpProtocolException;

	/**
	 * 操作与ftp相关的工具类
	 * @author zhangzujie
	 *
	 */
	public class FtpUtil {
		
		public static boolean downloadFileBySun(String fromftpserver,
				String fromftpuserName, String fromftpuserPassword,
				String fromftpDer, String fromftpfileEnd, String fromftpfileCode,
				String tocalbackDer) {
			String line;
			byte[] b = new byte[1024 * 5];
			int len;
			FtpClient ftpClient = FtpClient.create();

			try {
				TelnetInputStream fileContent = null;
				TelnetInputStream fileDirectory = null;

				// 打开ftp服务器
				/**
				 * jdk 1.6 开启
				 */
				//ftpClient.openServer(fromftpserver); jdk 1.6
				//ftpClient.login(fromftpuserName, fromftpuserPassword);
				//ftpClient.binary(); // 用二级制下载
				//ftpClient.cd(fromftpDer); //登陆目录
				//fileDirectory = ftpClient.list();  //获取文件列表
				
				SocketAddress  socketAddress = new InetSocketAddress(fromftpserver,21);
				ftpClient.connect(socketAddress);
				// 使用指定用户登录
				ftpClient.login(fromftpuserName, fromftpuserPassword.toCharArray());

				
				ftpClient.setBinaryType();
				
				ftpClient.changeDirectory(fromftpDer);
				//fileDirectory = ftpClient.list();

				InputStreamReader ir = new InputStreamReader(fileDirectory,
						fromftpfileCode);

				BufferedReader br = new BufferedReader(ir);

				while ((line = br.readLine()) != null) {
					if (line.endsWith(fromftpfileEnd)) {
						String fileName = line.split(" ")[line.split(" ").length - 1];
						/**
						File backFile = new File(ConstantVari.fromLocalDer
								+ fileName);**/
						File backFile = new File(fileName);
					//	fileContent = ftpClient.get(fileName);

						FileOutputStream os = new FileOutputStream(backFile);
						try {
							while ((len = fileContent.read(b)) != -1) {
								os.write(b, 0, len);
							}
							os.flush();
							os.close();
							fileContent.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						//ftpClient.sendServer("DELE" + fileName + "\r\n");
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					// 关闭ftp连接
					//ftpClient.closeServer();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return true;

		}

		/**
		 * 本地文件夹下的文件上传到FTP，并删除
		 * @param toftpserver
		 * @param toftpuserName
		 * @param toftpuserPassword
		 * @param toftpDer
		 * @param toftpfileCode
		 * @param toLocalDer
		 * @return
		 */
		@SuppressWarnings("resource")
		public static boolean uploadFileBySun(String toftpserver,
				String toftpuserName, String toftpuserPassword, String toftpDer,
				String toftpfileCode, String fromLocalDer) {
			

			
				File fromDir = new File(fromLocalDer);
				File[] files = fromDir.listFiles();
				
				
				//System.out.println("文件总数:----------"+files.length);
				int filesLen = files.length;
			
				for (int i = 0; i < filesLen; i++) {
					//System.out.println(files[i].getName()+"*************************************");
					if(files[i].getName().endsWith(".tmp"))
						continue ;
					try {
					byte[] b = new byte[1024 * 5];
					int len;
					TelnetOutputStream os = null;
					/**
					FtpClient ftpClient = new FtpClient();
					// 打开ftp服务器
					ftpClient.openServer(toftpserver);
					// 使用指定用户登录
					ftpClient.login(toftpuserName, toftpuserPassword);
					// 转到指定路径
					ftpClient.cd(toftpDer);
					*/
					
					FtpClient ftpClient = FtpClient.create();
					SocketAddress  socketAddress = new InetSocketAddress(toftpserver,21);
					try {
						ftpClient.connect(socketAddress);
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					// 使用指定用户登录
					try {
						ftpClient.login(toftpuserName, toftpuserPassword.toCharArray());
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					try {
						ftpClient.setBinaryType();
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					try {
						ftpClient.changeDirectory(toftpDer);
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					
					if (files[i].getName().endsWith("FediRefund")) {
						if ((files[i].exists())&&(files[i].length() == 0)) {
							files[i].delete();
							continue ;
					    }
						FileInputStream is = new FileInputStream(files[i]);
						// os = ftpClient.put(files[i].getName());  //JDK 1.6 
						 try {
							os = (TelnetOutputStream) ftpClient.putFileStream(files[i].getName());
						} catch (FtpProtocolException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return false;
						} 
							while ((len = is.read(b)) != -1) {
								os.write(b, 0, len);
							}
							os.flush();
							os.close();
							is.close();
							// ftpClient.closeServer();//JDK 1.6 
							ftpClient.close();
							if(files[i].exists()){
								files[i].delete();
							}
					}
					} catch (IOException e) {
						e.printStackTrace();
						return false;
					} finally {
						try {
						// 关闭ftp连接
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
				}
				
			return true;

		}
		
		/**
		 * 本地文件夹下的文件上传到FTP，并删除
		 * @param toftpserver
		 * @param toftpuserName
		 * @param toftpuserPassword
		 * @param toftpDer
		 * @param toftpfileCode
		 * @param toLocalDer
		 * @return
		 */
		@SuppressWarnings("resource")
		public static boolean uploadFileBType(String toftpserver,
				String toftpuserName, String toftpuserPassword, String toftpDer,
				String toftpfileCode, String fromLocalDer,String type) {
			

			
				File fromDir = new File(fromLocalDer);
				File[] files = fromDir.listFiles();
				
				
				//System.out.println("文件总数:----------"+files.length);
				int filesLen = files.length;
			
				for (int i = 0; i < filesLen; i++) {
					System.out.println(files[i].getName()+"*************************************");
					if(files[i].getName().endsWith(".tmp"))
						continue ;
					try {
					byte[] b = new byte[1024 * 5];
					int len;
					TelnetOutputStream os = null;
					/**
					FtpClient ftpClient = new FtpClient();
					// 打开ftp服务器
					ftpClient.openServer(toftpserver);
					// 使用指定用户登录
					ftpClient.login(toftpuserName, toftpuserPassword);
					// 转到指定路径
					ftpClient.cd(toftpDer);
					*/
					
					FtpClient ftpClient = FtpClient.create();
					SocketAddress  socketAddress = new InetSocketAddress(toftpserver,21);
					try {
						ftpClient.connect(socketAddress);
						
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					// 使用指定用户登录
					try {
						ftpClient.login(toftpuserName, toftpuserPassword.toCharArray());
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					try {
						ftpClient.setBinaryType();
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					try {
						ftpClient.changeDirectory(toftpDer);
					} catch (FtpProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}
					
					if (files[i].getName().endsWith(type)) {
						if ((files[i].exists())&&(files[i].length() == 0)) {
							files[i].delete();
							continue ;
					    }
						FileInputStream is = new FileInputStream(files[i]);
						// os = ftpClient.put(files[i].getName());  //JDK 1.6 
						 try {
							os = (TelnetOutputStream) ftpClient.putFileStream(files[i].getName());
						} catch (FtpProtocolException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return false;
						} 
							while ((len = is.read(b)) != -1) {
								os.write(b, 0, len);
							}
							os.flush();
							os.close();
							is.close();
							// ftpClient.closeServer();//JDK 1.6 
							ftpClient.close();
							if(files[i].exists()){
								files[i].delete();
							}
					}
					} catch (IOException e) {
						e.printStackTrace();
						return false;
					} finally {
						try {
						// 关闭ftp连接
						} catch (Exception e) {
							e.printStackTrace();
						}

					}
				}
				
			return true;

		}
		
		public static void main(String[] args) {
			FtpUtil.uploadFileBType("ftp.best1.com",
					"wms_qa","123456","EDIInputFiles/VWMS/InventoryUpdates/EDI/",
					"UTF-8","wmsinventory","cso");
		}
}
