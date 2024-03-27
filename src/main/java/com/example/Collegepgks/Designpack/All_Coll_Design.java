package com.example.Collegepgks.Designpack;

import java.util.List;

import com.example.Collegepgks.Bptl_Coll.Data.Data_pack;

public interface All_Coll_Design {
	
	Data_pack Save(Data_pack data_pack);
	List<Data_pack> Fetch();
	Data_pack Update(Data_pack data_pack);
	Data_pack Delete(String Rollno);
	

}
