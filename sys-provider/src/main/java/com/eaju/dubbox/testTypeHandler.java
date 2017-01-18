package com.eaju.dubbox;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

import oracle.sql.CLOB;

public class testTypeHandler implements TypeHandler<Object>{
  /**
   * Logger for this class
   */
  private static final Logger logger = Logger.getLogger(testTypeHandler.class);
  
      @Override
      public Object getResult(ResultSet arg0, String arg1) throws SQLException {
          CLOB clob = (CLOB) arg0.getClob(arg1);
          return (clob == null || clob.length() == 0) ? null : clob.getSubString((long) 1, (int) clob.length());
      }
   
      @Override
      public Object getResult(ResultSet arg0, int arg1) throws SQLException {
          return null;
      }
   
      @Override
      public Object getResult(CallableStatement arg0, int arg1) throws SQLException {
          return null;
      }
   
      @Override
      public void setParameter(PreparedStatement arg0, int arg1, Object arg2, JdbcType arg3)  {
        try {
          CLOB clob = CLOB.empty_lob();
          clob.setString(1, (String) arg2);
          arg0.setClob(arg1, clob);
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        logger.error(e.getMessage());
        e.printStackTrace();
        
      }
          
      }
}