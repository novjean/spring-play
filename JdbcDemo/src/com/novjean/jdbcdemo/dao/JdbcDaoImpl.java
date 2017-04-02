package com.novjean.jdbcdemo.dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

//import com.novjean.jdbcdemo.model.Circle;

@Component
public class JdbcDaoImpl {
	
//	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
//		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource); //would only use either one of them
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

/////////////////////////////////////////

//public int getCircleCount(){
//String sql="select count(*) from circle";
////jdbcTemplate.setDataSource(getDataSource());
//return jdbcTemplate.queryForObject(sql, Integer.class);
//}

//public String getCircleName(int circleId){
//String sql = "select name from circle where id = ?";
//return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
//}
//
//public Circle getCircleForId(int circleId){
//String sql = "select * from circle where id = ?";
//return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
//}
//
//public List<Circle> getAllCircles(){
//String sql = "select * from circle";
//return jdbcTemplate.query(sql, new CircleMapper());
//}
//
//private static final class CircleMapper implements RowMapper<Circle>{
//
//@Override
//public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
//	Circle circle = new Circle();
//	circle.setId(resultSet.getInt("id"));
//	circle.setName(resultSet.getString("name"));
//	return circle;
//}
//
//}

//public void insertCircle(Circle circle){
//String sql ="insert into circle(id, name) values(?,?)";
//jdbcTemplate.update(sql, new Object[] {circle.getId(), circle.getName()});
//}

//
////DDL is very rare
//public void createTriangleTable(){
//	String sql = "create table triangle (id INTEGER, name VARCHAR(50))";
//	jdbcTemplate.execute(sql);
//}

//private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//public void insertCircle(Circle circle){
//	String sql ="insert into circle(id, name) values(:id,:name)";
//	SqlParameterSource namedParameters = new MapSqlParameterSource("id", circle.getId())
//			.addValue("name", circle.getName());
//	namedParameterJdbcTemplate.update(sql, namedParameters);
//}

////////////

//String driver = "org.apache.derby.jdbc.ClientDriver";
//Class.forName(driver).newInstance();
//conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db");

//public Circle getCircle(int circleId){
//
//Connection conn=null;
//
//try{
//
//	conn = dataSource.getConnection();
//	
//	PreparedStatement ps = conn.prepareStatement("SELECT * FROM circle WHERE id = ?");
//	ps.setInt(1, circleId);
//	
//	Circle circle=null;
//	ResultSet rs = ps.executeQuery();
//	if(rs.next()){
//		circle = new Circle(circleId, rs.getString("name"));
//	}
//	rs.close();
//	ps.close();
//	return circle;
//}
//catch (Exception e){
//	throw new RuntimeException();
//}
//finally{
//	try {
//		conn.close();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//}
//}