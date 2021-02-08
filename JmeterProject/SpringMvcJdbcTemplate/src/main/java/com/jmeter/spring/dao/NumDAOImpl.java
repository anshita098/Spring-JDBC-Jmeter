package com.jmeter.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jmeter.spring.model.NumClass;

/**
 * An implementation of the NumDAO interface.
 */
public class NumDAOImpl implements NumDAO {

	private JdbcTemplate jdbcTemplate;
	
	public NumDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * This method is responsible to increment pointer by 1 and return current value in list
	 */	
	 public List<NumClass> list() {
		 
	  String sql = "UPDATE number SET pointer = pointer+1 WHERE id=1";
      jdbcTemplate.update(sql);
      
	  String sql1 = "SELECT * FROM number";
	  
	  List<NumClass> numList = jdbcTemplate.query(sql1, new RowMapper<NumClass>() {
		  
	        @Override
	        public NumClass mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	NumClass num = new NumClass();
	 
	            num.setId(rs.getInt("id"));
	            num.setPointer(rs.getInt("pointer"));
               
	            return num;
	        }
	 
	    });
	 
	    return numList;
	  }	
}
