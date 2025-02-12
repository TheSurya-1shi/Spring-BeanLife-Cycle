package com.in.akshay.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix ="ODR";
		String suffix ="";
		try {
			Connection obtainConnection = session.getJdbcConnectionAccess().obtainConnection();
			String sql = "select id from order_seq";
			 Statement statement = obtainConnection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				int seq = rs.getInt(1);
				//suffix=seq.replaceAll("ODR", "");
				
				suffix = String.valueOf(seq);	
			}else {
				suffix=String.valueOf(1005);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return prefix+suffix;
	}

}
