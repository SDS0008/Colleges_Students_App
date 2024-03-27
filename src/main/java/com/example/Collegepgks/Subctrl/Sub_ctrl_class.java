package com.example.Collegepgks.Subctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sub_ctrl_class {
	
	//====================================================================================
	
	
	@RequestMapping("Home_page")
	public ModelAndView All_Home_pages()
	{
		ModelAndView m1 = new ModelAndView("Home_page");
		return m1;
		
	}
	
	//====================================================================================
	
	
	@RequestMapping("Engg_Home_page")
	public ModelAndView Allpages1()
	{
		ModelAndView m1 = new ModelAndView("Engg_Home_page");
		return m1;
		
	}
	
	
	@RequestMapping("Engg_Reg_page")
	public ModelAndView Save1()
	{
		ModelAndView m1 = new ModelAndView("Engg_Reg_page");
		return m1;
		
	}
	@RequestMapping("Engg_Upd_page")
	public ModelAndView Update1()
	{
		ModelAndView m1 = new ModelAndView("Engg_Upd_page");
		return m1;
		
	}
	@RequestMapping("Engg_Del_page")
	public ModelAndView Delete1()
	{
		ModelAndView m1 = new ModelAndView("Engg_Del_page");
		return m1;
		
	}
	
	//====================================================================================
	
	@RequestMapping("Inter_Home_page")
	public ModelAndView Allpages2()
	{
		ModelAndView m1 = new ModelAndView("Inter_Home_page");
		return m1;
		
	}
	
	@RequestMapping("Inter_Reg_page")
	public ModelAndView Save2()
	{
		ModelAndView m1 = new ModelAndView("Inter_Reg_page");
		return m1;
		}
	
	@RequestMapping("Inter_Upd_page")
	public ModelAndView update2()
	{
		ModelAndView m1 = new ModelAndView("Inter_Upd_page");
		return m1;
		}

	@RequestMapping("Inter_Del_page")
	public ModelAndView delete2()
	{
		ModelAndView m1 = new ModelAndView("Inter_Del_page");
		return m1;
		}
	
	//====================================================================================
	

	@RequestMapping("School_Home_page")
	public ModelAndView Allpages3()
	{
		ModelAndView m1 = new ModelAndView("School_Home_page");
		return m1;
		
	}
	
	
	@RequestMapping("School_Reg_page")
	public ModelAndView Save3()
	{
		ModelAndView m1 = new ModelAndView("School_Reg_page");
		return m1;
		
	}

	@RequestMapping("School_Upd_page")
	public ModelAndView update3()
	{
		ModelAndView m1 = new ModelAndView("School_Upd_page");
		return m1;
		}

	@RequestMapping("School_Del_page")
	public ModelAndView delete3()
	{
		ModelAndView m1 = new ModelAndView("School_Del_page");
		return m1;
		}
	//====================================================================================
	
}
