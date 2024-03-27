package com.example.Collegepgks.Controller_Classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Collegepgks.Bptl_Coll.Data.Data_pack;
import com.example.Collegepgks.Service_Classes.Engg_Coll_Service_Class;

@RestController
public class Engg_Coll_Ctrl_Class {

	
	@Autowired
	Data_pack data_pack;
	
	@Autowired
	Engg_Coll_Service_Class engg_coll_service_class;
	
	
	@RequestMapping("engineering_Save_data")
	public String Save(@RequestParam String Rollno,
					      @RequestParam String Fullname,
						     @RequestParam String Emailid,
							     @RequestParam String District,
								    @RequestParam Long   contact
															     ) {
		
		data_pack.setRollno(Rollno);
		data_pack.setFullname(Fullname);
		data_pack.setEmailid(Emailid);
		data_pack.setDistrict(District);
		data_pack.setContact(contact);
		
		engg_coll_service_class.Save(data_pack);
		
		return "<center><a href=Engg_Fetch_page>DATA FETCH</a><center/>";
		
	}
	
	
	
	
	@RequestMapping("Engg_Fetch_page")
	public ModelAndView fetching() {
		List<Data_pack> engineer = engg_coll_service_class.Fetch();
		return new ModelAndView("Engg_Fetch_page","engineering",engineer);
		//Engg_Fetch_page is frontend page name.
		//engineering is table name.
		//engineer is list object.
		
	}
	
	
	
	
	
	
	
	
	@RequestMapping("engineering_update_data")
	public String update(@RequestParam String Rollno,
					      @RequestParam String Fullname,
						     @RequestParam String Emailid,
							     @RequestParam String District,
								    @RequestParam Long   contact
															     ) {
		
		data_pack.setRollno(Rollno);
		data_pack.setFullname(Fullname);
		data_pack.setEmailid(Emailid);
		data_pack.setDistrict(District);
		data_pack.setContact(contact);
		
		engg_coll_service_class.Update(data_pack);
		
		return "<center><a href=Engg_Fetch_page>DATA FETCH</a><center/>";
	}
	
	@RequestMapping("engineering_delete_data")
	public String delete(@RequestParam String Rollno) {
		
		data_pack.setRollno(Rollno);
		
		
		engg_coll_service_class.Delete(Rollno);
		
		return "<center><a href=Engg_Fetch_page>DATA FETCH</a><center/>";
		
	}
}
