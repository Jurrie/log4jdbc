package org.postgresql.xa;

import net.sf.log4jdbc.XADataSourceSpy;

public class PGXADataSourceSpy extends XADataSourceSpy
{
	public PGXADataSourceSpy() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("org.postgresql.xa.PGXADataSource");
	}

	public String getDatabaseName()
	{
		return (String) invokeMethod("getDatabaseName");
	}

	public void setDatabaseName(String databaseName)
	{
		invokeMethod("setDatabaseName", databaseName);
	}

	public int getPortNumber()
	{
		return (Integer) invokeMethod("getPortNumber");
	}

	public void setPortNumber(int portNumber)
	{
		invokeMethod("setPortNumber", new Object[] { portNumber }, new Class<?>[] { int.class });
	}

	public String getServerName()
	{
		return (String) invokeMethod("getServerName");
	}

	public void setServerName(String serverName)
	{
		invokeMethod("setServerName", serverName);
	}
}