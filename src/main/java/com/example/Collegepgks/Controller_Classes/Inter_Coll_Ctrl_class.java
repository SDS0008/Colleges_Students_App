package com.example.Collegepgks.Controller_Classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Collegepgks.Bptl_Coll.Data.Data_pack;
import com.example.Collegepgks.Service_Classes.Inter_Coll_Service_Class;

@RestController
public class Inter_Coll_Ctrl_class {
	
	@Autowired
	Data_pack data_pack;
	
	@Autowired
	Inter_Coll_Service_Class inter_Coll_Service_Class;
	
	
	@RequestMapping("inter_data")
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
		
	inter_Coll_Service_Class.Save(data_pack);
		
	return "<center><a href=Inter_Fetch_page>DATA FETCH</a><center/>";
		
	}
	
	
	@RequestMapping("Inter_Fetch_page")
	public ModelAndView fetching() {
		List<Data_pack> in = inter_Coll_Service_Class.Fetch();
		return new ModelAndView("Inter_Fetch_page","inter",in);
		//inter_Fetch_page is frontend page name.
		//inter is table name.
		//in is list object.
		
	}
	
	
	
	
	@RequestMapping("inter_update_data")
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
		
		inter_Coll_Service_Class.Update(data_pack);
		
		return "<center><a href=Inter_Fetch_page>DATA FETCH</a><center/>";
		
	}
	
	@RequestMapping("inter_delete_data")
	public String delete(@RequestParam String Rollno) {
		
		data_pack.setRollno(Rollno);
		
		
		inter_Coll_Service_Class.Delete(Rollno);
		
		return "<center><a href=Inter_Fetch_page>DATA FETCH</a><center/>";
		
	}
	
}
