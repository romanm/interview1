package org.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlHsr {
	/**
	 * Request permanent Statement
	 */
	private Statement requestStatement = null;
	/**
	 * Get request permanent Statement. Dangerous by loop of Statement.
	 * 
	 * @return request permanent Statement
	 * @throws SQLException
	 */
	public Statement getStatement() throws SQLException {
		if (requestStatement == null) requestStatement = getConnection().createStatement();
		return requestStatement;
	}
	private Connection getConnection() {
		return connection;
	}
	Connection connection;
}
