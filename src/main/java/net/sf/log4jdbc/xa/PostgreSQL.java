package net.sf.log4jdbc.xa;

public class PostgreSQL extends XADataSourceSpy
{
	public PostgreSQL() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("org.postgresql.xa.PGXADataSource");
	}

	public String getDatabaseName()
	{
		return invokeMethod("getDatabaseName");
	}

	public void setDatabaseName(String databaseName)
	{
		invokeMethod("setDatabaseName", databaseName);
	}

	public int getPortNumber()
	{
		return invokeMethod("getPortNumber");
	}

	public void setPortNumber(int portNumber)
	{
		invokeMethod("setPortNumber", new Object[] { portNumber }, new Class<?>[] { int.class });
	}

	public String getServerName()
	{
		return invokeMethod("getServerName");
	}

	public void setServerName(String serverName)
	{
		invokeMethod("setServerName", serverName);
	}
}