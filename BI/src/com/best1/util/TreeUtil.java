//package com.best1.util;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import com.best1.db.TreeInfoDAO;
//import com.best1.domain.MenuInfo;
//
//public class TreeUtil {
//
//		private List<Long> returnList = new ArrayList<Long>();
//		
//		/**
//		 * 根据父节点的ID获取所有子节点
//		 * @param list 分类表
//		 * @param typeId 传入的父节点ID
//		 * @return String
//		 */
//		public String getChildMenuInfos(List<MenuInfo> list, Long typeId) {
//			if(list == null && typeId == null) return "";
//			for (Iterator<MenuInfo> iterator = list.iterator(); iterator.hasNext();) {
//				MenuInfo menuInfo = (MenuInfo) iterator.next();
//				// 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
//				if (menuInfo.getPid()==0 && typeId==menuInfo.getId()) {
//					recursionFn(list,menuInfo);
//				}
//				// 二、遍历所有的父节点下的所有子节点
//				/*if (MenuInfo.getParentId()==0) {
//					recursionFn(list, MenuInfo);
//				}*/
//			}
//			return returnList.toString();
//		}
//		
//		private void recursionFn(List<MenuInfo> list, MenuInfo MenuInfo) {
//			List<MenuInfo> childList = getChildList(list, MenuInfo);// 得到子节点列表
//			if (hasChild(list, MenuInfo)) {// 判断是否有子节点
//				returnList.add(MenuInfo.getId());
//				Iterator<MenuInfo> it = childList.iterator();
//				while (it.hasNext()) {
//					MenuInfo n = (MenuInfo) it.next();
//					recursionFn(list, n);
//				}
//			} else {
//				returnList.add(MenuInfo.getId());
//			}
//		}
//		
//		// 得到子节点列表
//		private List<MenuInfo> getChildList(List<MenuInfo> list, MenuInfo MenuInfo) {
//			List<MenuInfo> MenuInfoList = new ArrayList<MenuInfo>();
//			Iterator<MenuInfo> it = list.iterator();
//			while (it.hasNext()) {
//				MenuInfo n = (MenuInfo) it.next();
//				if (n.getPid() == MenuInfo.getId()) {
//					MenuInfoList.add(n);
//				}
//			}
//			return MenuInfoList;
//		}
//
//		// 判断是否有子节点
//		private boolean hasChild(List<MenuInfo> list, MenuInfo MenuInfo) {
//			return getChildList(list, MenuInfo).size() > 0 ? true : false;
//		}
//		
//		
//		// 本地模拟数据测试
//		public static void main(String[] args) {
//			long start = System.currentTimeMillis();
//			List<MenuInfo> MenuInfoList = new ArrayList<MenuInfo>();
//			TreeInfoDAO treeInfoDAO = new TreeInfoDAO();
//			MenuInfoList = treeInfoDAO.getInfos(); 
//			TreeUtil mt = new TreeUtil();
//			System.out.println(mt.getChildMenuInfos(MenuInfoList, 0l));
//			long end = System.currentTimeMillis();
//			System.out.println("用时:" + (end - start) + "ms");
//		}
//		
//}
