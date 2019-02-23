package com.phserv.converter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class IntegerToBooleanConverter extends BaseTypeHandler<Boolean>{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		if(parameter) {
			ps.setInt(i, 1);
		}else {
			ps.setInt(i, 0);
		}
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		return rs.getInt(columnName)==1;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return rs.getInt(columnIndex)==1;
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return cs.getInt(columnIndex)==1;
	}

	
	
	
}
