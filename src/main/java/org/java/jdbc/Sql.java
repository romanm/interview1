package org.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
	public static void close(Statement stmt) {
		if(stmt!=null) try{stmt.close();}catch(SQLException e){ // OK, was sonst ?
				//log.log(Level.SEVERE,"", e);
		}
	}
	/**
	 * Schliesst Connection, falls != null, behandelt evtl. SQLException 
	 * @param conn
	 */
	public static void close(Connection conn) {
		if(conn!=null)
		try{
			conn.rollback();
			conn.close();
			conn=null; //verhindert zweimaliges schließen
		}catch(SQLException e){ // OK, was sonst ?
//			log.error("", e);
		} 
	}
	/**
	 * gibt den Tabellennamen des Eintrages mit ID = id in der Tree-Tabelle zurueck
	 * @param id
	 * @param mHsr
	 * @return
	 * @throws SQLException
	 */
	public static String getTabName(int id, MtlHsr mHsr) throws SQLException {
		String tab_name = null;
		ResultSet rs = mHsr.sql.getStatement().executeQuery("select tab_name from TREE where id = " + id);
		rs.next();
		tab_name = rs.getString("TAB_NAME");
		return tab_name;
	}
}
