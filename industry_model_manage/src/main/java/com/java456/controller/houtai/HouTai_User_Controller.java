package com.java456.controller.houtai;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.google.gson.Gson;
import com.java456.entity.User;
import com.java456.service.PublicService;
import com.java456.service.UserService;
import com.java456.util.CryptographyUtil;
import com.java456.util.ResponseUtil;
import com.java456.util.StringUtil;



@Controller
@RequestMapping("/houtai/user")
public class HouTai_User_Controller {
	
	
	@Resource
	private UserService  userService;
	@Resource
	private PublicService  publicService;
	
	
	/**
	 * 
	 * @param t  ��null ��������ȫ��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manage")
	public ModelAndView manage() throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageTitle", "�û�����");
		mav.addObject("title", "�û�����");
		mav.setViewName("/admin/page/user/user_manage");
		return mav;
	}
	
	
	@RequestMapping("/add")
	public ModelAndView add() throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("btn_text", "����");
		mav.addObject("save_url", "/admin/user/add.do");
		
		mav.setViewName("/admin/page/user/add_or_update");
		return mav;
	}
	
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam(value="id",required=false)String id
			,HttpServletResponse response
			,HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		User user = userService.findById(Integer.parseInt(id));
		
		mav.addObject("user", user);
		mav.addObject("btn_text", "�޸�");
		mav.addObject("save_url", "/admin/user/update.do?id="+id);
		
		mav.setViewName("/admin/page/user/add_or_update");
		return mav;
	}
	
	@RequestMapping("/setPersm")
	public ModelAndView setPersm(@RequestParam(value = "id", required = false) String id,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
		
		//���id��ֵ���� ���� ���û��ֵ  ��������
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId", id);
		mav.setViewName("admin/page/user/set_persm");
		return mav;
	}
	
	@RequestMapping("/setPassword")
	public ModelAndView setPassword(@RequestParam(value = "id", required = false) String id,
			HttpServletResponse response, HttpServletRequest request) throws Exception {
		//���id��ֵ���� ���� ���û��ֵ  ��������
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId", id);
		mav.addObject("save_url", "/admin/user/update?id="+id);
		mav.setViewName("admin/page/user/set_password");
		return mav;
	}
	
	
	
}

