package net.sf.log4jdbc.xa;

import java.util.Properties;

public class Oracle extends XADataSourceSpy
{
	public Oracle() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("oracle.jdbc.xa.client.OracleXADataSource");
	}

	public boolean getNativeXA()
	{
		return invokeMethod("getNativeXA");
	}

	public void setNativeXA(boolean nativeXA)
	{
		invokeMethod("setNativeXA", new Object[] { nativeXA }, new Class<?>[] { boolean.class });
	}

	public String getConnectionCacheName()
	{
		return invokeMethod("getConnectionCacheName");
	}

	public void setConnectionCacheName(String connectionCacheName)
	{
		invokeMethod("setConnectionCacheName", connectionCacheName);
	}

	public Properties getConnectionCacheProperties()
	{
		return invokeMethod("getConnectionCacheProperties");
	}

	public void setConnectionCacheProperties(Properties connectionCacheProperties)
	{
		invokeMethod("setConnectionCacheProperties", connectionCacheProperties);
	}

	public boolean getConnectionCachingEnabled()
	{
		return invokeMethod("getConnectionCachingEnabled");
	}

	public void setConnectionCachingEnabled(boolean connectionCachingEnabled)
	{
		invokeMethod("setConnectionCachingEnabled", new Object[] { connectionCachingEnabled }, new Class<?>[] { boolean.class });
	}

	public Properties getConnectionProperties()
	{
		return invokeMethod("getConnectionProperties");
	}

	public void setConnectionProperties(Properties connectionProperties)
	{
		invokeMethod("setConnectionProperties", connectionProperties);
	}

	public String getDatabaseName()
	{
		return invokeMethod("getDatabaseName");
	}

	public void setDatabaseName(String databaseName)
	{
		invokeMethod("setDatabaseName", databaseName);
	}

	public String getDataSourceName()
	{
		return invokeMethod("getDataSourceName");
	}

	public void setDataSourceName(String dataSourceName)
	{
		invokeMethod("setDataSourceName", dataSourceName);
	}

	public String getDescription()
	{
		return invokeMethod("getDescription");
	}

	public void setDescription(String description)
	{
		invokeMethod("setDescription", description);
	}

	public String getDriverType()
	{
		return invokeMethod("getDriverType");
	}

	public void setDriverType(String driverType)
	{
		invokeMethod("setDriverType", driverType);
	}

	public boolean getExplicitCachingEnabled()
	{
		return invokeMethod("getExplicitCachingEnabled");
	}

	public void setExplicitCachingEnabled(boolean explicitCachingEnabled)
	{
		invokeMethod("setExplicitCachingEnabled", new Object[] { explicitCachingEnabled }, new Class<?>[] { boolean.class });
	}

	public boolean getFastConnectionFailoverEnabled()
	{
		return invokeMethod("getFastConnectionFailoverEnabled");
	}

	public void setFastConnectionFailoverEnabled(boolean fastConnectionFailoverEnabled)
	{
		invokeMethod("setFastConnectionFailoverEnabled", new Object[] { fastConnectionFailoverEnabled }, new Class<?>[] { boolean.class });
	}

	public boolean getImplicitCachingEnabled()
	{
		return invokeMethod("getImplicitCachingEnabled");
	}

	public void setImplicitCachingEnabled(boolean implicitCachingEnabled)
	{
		invokeMethod("setImplicitCachingEnabled", new Object[] { implicitCachingEnabled }, new Class<?>[] { boolean.class });
	}

	public int getMaxStatements()
	{
		return invokeMethod("getMaxStatements");
	}

	public void setMaxStatements(int maxStatements)
	{
		invokeMethod("setMaxStatements", new Object[] { maxStatements }, new Class<?>[] { int.class });
	}

	public String getNetworkProtocol()
	{
		return invokeMethod("getNetworkProtocol");
	}

	public void setNetworkProtocol(String networkProtocol)
	{
		invokeMethod("setNetworkProtocol", networkProtocol);
	}

	public String getONSConfiguration()
	{
		return invokeMethod("getONSConfiguration");
	}

	public void setONSConfiguration(String onsConfiguration)
	{
		invokeMethod("setONSConfiguration", onsConfiguration);
	}

	public int getPortNumber()
	{
		return invokeMethod("getPortNumber");
	}

	public void setPortNumber(int portNumber)
	{
		invokeMethod("setPortNumber", new Object[] { portNumber }, new Class<?>[] { int.class });
	}

	public void setPassword(String password)
	{
		invokeMethod("setPassword", password);
	}

	public String getServerName()
	{
		return invokeMethod("getServerName");
	}

	public void setServerName(String serverName)
	{
		invokeMethod("setServerName", serverName);
	}

	public String getServiceName()
	{
		return invokeMethod("getServiceName");
	}

	public void setServiceName(String serviceName)
	{
		invokeMethod("setServiceName", serviceName);
	}

	public String getTNSEntryName()
	{
		return invokeMethod("getTNSEntryName");
	}

	public void setTNSEntryName(String tnsEntryName)
	{
		invokeMethod("setTNSEntryName", tnsEntryName);
	}

	public String getURL()
	{
		return invokeMethod("getURL");
	}

	public void setURL(String url)
	{
		invokeMethod("setURL", url);
	}

	public String getUser()
	{
		return invokeMethod("getUser");
	}

	public void setUser(String user)
	{
		invokeMethod("setUser", user);
	}
}