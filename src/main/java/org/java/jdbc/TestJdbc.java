package org.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashMap;

import org.w3c.dom.Element;
public class TestJdbc {
	
	private HashMap<String,Element> hmIdElement= new HashMap<String,Element>();
	
	void testResaultSet(Connection conn, int iddoc) throws SQLException{
		String  sql="select * from tree,history where id=idhistory and iddoc="+iddoc;
		Statement stmt = conn.createStatement();
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String idHistory =rs.getString("idHistory");
				Element elTask = hmIdElement.get(idHistory);
				Timestamp timestamp = rs.getTimestamp("mdate");
				setAttribute(elTask,"mdate",ISODate.toString(timestamp));
				setAttribute(elTask,"msec",""+timestamp.getTime());
				setAttribute(elTask,"idauthor",rs.getString("idauthor"));
				setAttribute(elTask,"idhpatient",rs.getString("idhpatient"));
			}
		} finally { Sql.close(stmt);}

	}
	private static void setAttribute(Element mtlE, String colName, String value) {
		if(value!=null && !value.equals("")) mtlE.setAttribute(colName, value);
	}
}
