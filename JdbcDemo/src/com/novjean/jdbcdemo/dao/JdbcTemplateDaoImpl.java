package com.novjean.jdbcdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.novjean.jdbcdemo.model.Circle;

public class JdbcTemplateDaoImpl extends JdbcDaoSupport {
	
	
	public void insertCircle(Circle circle){
		String sql ="insert into circle(id, name) values(?,?)";
		this.getJdbcTemplate().update(sql, new Object[] {circle.getId(), circle.getName()});
	}
	
	public int getCircleCount(){
		String sql="select count(*) from circle";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}
	
	public String getCircleName(int circleId){
		String sql = "select name from circle where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, new Object[] {circleId}, String.class);
	}
	
	public Circle getCircleForId(int circleId){
		String sql = "select * from circle where id = ?";
		return this.getJdbcTemplate().queryForObject(sql, new Object[] {circleId}, new CircleMapper());
	}
	
	public List<Circle> getAllCircles(){
		String sql = "select * from circle";
		return this.getJdbcTemplate().query(sql, new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle>{

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("id"));
			circle.setName(resultSet.getString("name"));
			return circle;
		}
		
	}
	
	//DDL is very rare
	public void createTriangleTable(){
		String sql = "create table triangle (id INTEGER, name VARCHAR(50))";
		this.getJdbcTemplate().execute(sql);
	}
}
