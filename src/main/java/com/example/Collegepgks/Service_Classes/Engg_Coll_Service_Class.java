package com.example.Collegepgks.Service_Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.Collegepgks.Bptl_Coll.Data.Data_pack;
import com.example.Collegepgks.Designpack.All_Coll_Design;

@Service
public class Engg_Coll_Service_Class implements All_Coll_Design {

	
	@Autowired
	JdbcTemplate jdbctemplate;
	

	@Autowired
	Data_pack data_pack;
	
	
	@Override
	public Data_pack Save(Data_pack data_pack) {
		// TODO Auto-generated method stub
		
		String Sql = "insert into engineering values(?,?,?,?,?)";
		
		jdbctemplate.update(Sql,data_pack.getRollno(),data_pack.getFullname(),data_pack.getEmailid(),data_pack.getDistrict(),data_pack.getContact());
		
	
		return data_pack;
	}

	@Override
	public List<Data_pack> Fetch() {
		// TODO Auto-generated method stub
		String Sql2 ="select * from engineering";
		
		return jdbctemplate.query(Sql2, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Data_pack data = new Data_pack();
				data.setRollno(rs.getString("Rollno"));
				data.setFullname(rs.getString("Fullname"));
				data.setEmailid(rs.getString("Emailid"));
				data.setDistrict(rs.getString("District"));
				data.setContact(rs.getLong("contact"));
				return data;
			}
		});
		
		
	}

	@Override
	public Data_pack Update(Data_pack data_pack) {
		// TODO Auto-generated method stub
		
		String Sql3 = "update engineering set Fullname=?,Emailid=?,District=?,contact=? where  Rollno=?";
		
		jdbctemplate.update(Sql3,data_pack.getFullname(),data_pack.getEmailid(),data_pack.getDistrict(),data_pack.getContact(),data_pack.getRollno());
		
		return data_pack;
	}

	@Override
	public Data_pack Delete(String Rollno) {
		// TODO Auto-generated method stub
		
		String Sql4 = "delete from engineering where Rollno=? ";
		jdbctemplate.update(Sql4,data_pack.getRollno());
		return data_pack;
	}

}
