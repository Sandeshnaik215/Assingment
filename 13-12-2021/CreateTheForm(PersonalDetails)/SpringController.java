package com.techno.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techno.mvc.beans.UserDetails;

@Controller
public class SpringController {
	@RequestMapping(path="/home")
	public String demo() {
		return "home";
	}
	@RequestMapping(path="/home1")
	public String DisplayData(ModelMap modelm) {
		modelm.addAttribute("name","sandesh");
		modelm.addAttribute("name2","siddu");
		return "home1";
	}
	@RequestMapping(path="/home2")
	public String getData(Model model) {
		model.addAttribute("name","sandesh");
		model.addAttribute("name2","siddu");
		return "homeByModelMap";
	}
	
	@RequestMapping(path="/home3")
	public ModelAndView getData1(ModelAndView model) {
		model.addObject("name","sandesh");
		model.setViewName("M&V");
		return model;
	
		
	}
	@RequestMapping(path="/login")
	public String login() {

		return "login";
	
		
	}

	
	@RequestMapping(path="/form")
	public String getForm(HttpServletRequest request,HttpServletResponse response,ModelMap map) {
 String parameter = request.getParameter("name");
 String parameter2 = request.getParameter("password");
 map.addAttribute("name","parameter");
 map.addAttribute("pass","parameter2");
 return "PrintLogin";
 
		
	
		
	}
	//@RequestMapping(path="/login1")
	@GetMapping(path = "/login1")
	public String login2() {

		return "loginDetails";
	
		
	}
	//@RequestMapping(path="/form1")
	@PostMapping(path = "/login1")
	public String getForm1(HttpServletRequest request,HttpServletResponse response,ModelMap map) {
 String fname = request.getParameter("fname");
 String lname = request.getParameter("lname");
 String age = request.getParameter("age");
 String email = request.getParameter("email");
 String phone = request.getParameter("phone");
 String address = request.getParameter("add");
 String gender = request.getParameter("g");
 map.addAttribute("fname","fname");
 map.addAttribute("lname","lname");
 map.addAttribute("age","age");
 map.addAttribute("email","email");
 map.addAttribute("phone","phone");
 map.addAttribute("add","add");
 map.addAttribute("g","g");
 
 return "Show1";	
		
	}
	
//===========================================================================================================
	
	@RequestMapping(path="/login2")
	public String login3() {

		return "Education";
	
		
	}
	@RequestMapping(path="/form2")
	public String getForm2(HttpServletRequest request,ModelMap map) {
		 String fname = request.getParameter("fname");
 String sname = request.getParameter("sname");
 String pname = request.getParameter("pname");
 String dname = request.getParameter("dname");
 String ys = request.getParameter("ys");
 String yp = request.getParameter("yp");
 String yd = request.getParameter("yd");
 String ps = request.getParameter("ps");
 String pp = request.getParameter("pp");
 String pd = request.getParameter("pd");
 map.addAttribute("fname","fname");
 map.addAttribute("sname","sname");
 map.addAttribute("pname","pname");
 map.addAttribute("dname","dname");
 map.addAttribute("ys","ys");
 map.addAttribute("yp","yp");
 map.addAttribute("yd","yd");
 map.addAttribute("ps","ps");
 map.addAttribute("pp","pp");
 map.addAttribute("pd","pd");

 
 return "Show2";	
		
	}
	@RequestMapping(path="/login3")
	public String login4() {

		return "Health";
	
	
	}
	@RequestMapping(path="/form3")
	public String getForm3(HttpServletRequest request,ModelMap map) {
		 String fname = request.getParameter("fname");
		 System.out.println(fname);
		 String lname = request.getParameter("lname");
		 String age = request.getParameter("age");
		 String email = request.getParameter("email");
		 String phone = request.getParameter("phone");
		 String address = request.getParameter("add");
		 String gender = request.getParameter("g");
		 
		 String t = request.getParameter("t");
		 String rr = request.getParameter("rr");
		 String f = request.getParameter("f");
		 String d = request.getParameter("d");
		 String n = request.getParameter("n");
		 String sore = request.getParameter("sore");
		 String body = request.getParameter("body");
		 String none = request.getParameter("none");
		 
		 map.addAttribute("fname",fname);
		 map.addAttribute("lname","lname");
		 map.addAttribute("age","age");
		 map.addAttribute("email","email");
		 map.addAttribute("phone","phone");
		 map.addAttribute("add","add");
		 map.addAttribute("g","g");
		 
		 map.addAttribute("t","t");
		 map.addAttribute("rr","rr");
		 map.addAttribute("f","f");
		 map.addAttribute("d","d");
		 map.addAttribute("n","n");
		 map.addAttribute("sore","sore");
		 map.addAttribute("body","body");
		 map.addAttribute("none","none");
		 
		 return "Show3";	
		
	}
	@RequestMapping(path="/login4")
	public String login5() {

		return "FirstPage";
	
	
	}
	@GetMapping(path = "/sign")
	public String login6() {

		return "signup";
	
		
	}
	//2nd way
	//@PostMapping(path = "/sign")
	//@RequestMapping(path = "/signform")
	public String login7(ModelMap map,@RequestParam("name") String fname,@RequestParam("password") String lname) {
		
  map.addAttribute("fname",fname);
  map.addAttribute("lname",lname);
		return "fetch";
	
	
	}
	//3rd
	//@PostMapping(path = "/sign")

	public String login8(ModelMap map,@RequestParam String fname,@RequestParam String lname) {
		
  map.addAttribute("fname",fname);
  map.addAttribute("lname",lname);
		return "fetch";
	
	
	}
	//4th
	//@PostMapping(path = "/sign")

	public String login9(ModelMap map,String name,String password) {
		
  map.addAttribute("fname",name);
  map.addAttribute("lname",password);
		return "fetch";
	
	
	}
	//5th
	@PostMapping(path = "/sign")

	public String login10(ModelMap map,UserDetails userDetails) {
		
  map.addAttribute("name",userDetails);
  
		return "formD";
	
	
	}
	@GetMapping(path = "/forward")
	public String login11() {

		return "forward:/login";
	
		
	}
	@GetMapping(path = "/re")
	public String login12() {

		return "redirect:http://www.google.com";
	
		
	}
}
//@PostMapping(path = "/login")
//@GetMapping(path = "/login")