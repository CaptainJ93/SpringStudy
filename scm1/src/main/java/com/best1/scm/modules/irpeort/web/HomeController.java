package com.best1.scm.modules.irpeort.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.irpeort.entity.JavaBeanPerson;
import com.best1.scm.modules.irpeort.entity.TrackingPackageInfoBean;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "${adminPath}/ireport/home")
public class HomeController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/**
	 * 返回iReport报表视图
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"report"},method=RequestMethod.GET)
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	public String report(Model model) {
		// 报表数据源
		//JRDataSource jrDataSource = new JRBeanCollectionDataSource(JavaBeanPerson.getList());
		JRDataSource jrDataSource = new JRBeanCollectionDataSource(TrackingPackageInfoBean.getList());
		System.out.println("新增");
		// 动态指定报表模板url
		//model.addAttribute("url", "/WEB-INF/jasper/MvcIReportExample.jasper");
		model.addAttribute("url", "/WEB-INF/jasper/Best1_MianDan3.jasper");
		model.addAttribute("format", "pdf"); // 报表格式
		model.addAttribute("jrMainDataSource", jrDataSource);
		
		return "iReport"; // 对应jasper-defs.xml中的bean id
	}
	
}
