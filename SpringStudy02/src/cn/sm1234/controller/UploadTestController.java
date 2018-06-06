package cn.sm1234.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="/upload")
public class UploadTestController {
	@RequestMapping(value="/upload")
	//multipartfile固定，img必须和表单中name一致，也可以RequestParam绑定其他名字
	public String upload(HttpServletRequest request,String username,String password,MultipartFile img) throws Exception {
		System.out.println(username);
		System.out.println(password);
		
		String uploadPath = request.getServletContext().getRealPath("/upload");
//		String uploadPath = "D:\\workspace\\SpringStudy02\\WebRoot\\upload";
		System.out.println(uploadPath);
		System.out.println(img.getOriginalFilename());
		img.transferTo(new File(uploadPath + "/" + img.getOriginalFilename()));
		return "/WEB-INF/jsp/success.jsp";
	}
}
