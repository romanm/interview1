package org.java.jdbc;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class ISODate extends GregorianCalendar implements Serializable {
	static final SimpleDateFormat dfTime
	= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	public static String toString(java.sql.Timestamp t){
		return dfTime.format(t);
	}
}