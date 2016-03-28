package net.sf.log4jdbc.xa;

public class PostgreSQL extends XADataSourceSpy
{
	public PostgreSQL() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("org.postgresql.xa.PGXADataSource");
	}

	public String getApplicationName()
	{
		return invokeMethod("getApplicationName");
	}

	public void setApplicationName(String applicationName)
	{
		invokeMethod("setApplicationName", applicationName);
	}

	public boolean getBinaryTransfer()
	{
		return invokeMethod("getBinaryTransfer");
	}

	public void setBinaryTransfer(boolean binaryTransfer)
	{
		invokeMethod("setBinaryTransfer", new Object[] { binaryTransfer }, new Class<?>[] { boolean.class });
	}

	public String getBinaryTransferDisable()
	{
		return invokeMethod("getBinaryTransferDisable");
	}

	public void setBinaryTransferDisable(String binaryTransferDisable)
	{
		invokeMethod("setBinaryTransferDisable", binaryTransferDisable);
	}

	public String getBinaryTransferEnable()
	{
		return invokeMethod("getBinaryTransferEnable");
	}

	public void setBinaryTransferEnable(String binaryTransferEnable)
	{
		invokeMethod("setBinaryTransferEnable", binaryTransferEnable);
	}

	public String getCompatible()
	{
		return invokeMethod("getCompatible");
	}

	public void setCompatible(String compatible)
	{
		invokeMethod("setCompatible", compatible);
	}

	public String getDatabaseName()
	{
		return invokeMethod("getDatabaseName");
	}

	public void setDatabaseName(String databaseName)
	{
		invokeMethod("setDatabaseName", databaseName);
	}

	public String getDescription()
	{
		return invokeMethod("getDescription");
	}

	public boolean isColumnSanitiserDisabled()
	{
		return invokeMethod("isColumnSanitiserDisabled");
	}

	public void setDisableColumnSanitiser(boolean disableColumnSanitiser)
	{
		invokeMethod("setDisableColumnSanitiser", new Object[] { disableColumnSanitiser }, new Class<?>[] { int.class });
	}

	public int getLogLevel()
	{
		return invokeMethod("getLogLevel");
	}

	public void setLogLevel(int logLevel)
	{
		invokeMethod("setLogLevel", new Object[] { logLevel }, new Class<?>[] { int.class });
	}

	public String getPassword()
	{
		return invokeMethod("getPassword");
	}

	public void setPassword(String password)
	{
		invokeMethod("setPassword", password);
	}

	public int getPortNumber()
	{
		return invokeMethod("getPortNumber");
	}

	public void setPortNumber(int portNumber)
	{
		invokeMethod("setPortNumber", new Object[] { portNumber }, new Class<?>[] { int.class });
	}

	public int getPrepareThreshold()
	{
		return invokeMethod("getPrepareThreshold");
	}

	public void setPrepareThreshold(int prepareThreshold)
	{
		invokeMethod("setPrepareThreshold", new Object[] { prepareThreshold }, new Class<?>[] { int.class });
	}

	public int getProtocolVersion()
	{
		return invokeMethod("getProtocolVersion");
	}

	public void setProtocolVersion(int protocolVersion)
	{
		invokeMethod("setProtocolVersion", new Object[] { protocolVersion }, new Class<?>[] { int.class });
	}

	public int getReceiveBufferSize()
	{
		return invokeMethod("getReceiveBufferSize");
	}

	public void setReceiveBufferSize(int receiveBufferSize)
	{
		invokeMethod("setReceiveBufferSize", new Object[] { receiveBufferSize }, new Class<?>[] { int.class });
	}

	public int getSendBufferSize()
	{
		return invokeMethod("getSendBufferSize");
	}

	public void setSendBufferSize(int sendBufferSize)
	{
		invokeMethod("setSendBufferSize", new Object[] { sendBufferSize }, new Class<?>[] { int.class });
	}

	public String getServerName()
	{
		return invokeMethod("getServerName");
	}

	public void setServerName(String serverName)
	{
		invokeMethod("setServerName", serverName);
	}

	public int getSocketTimeout()
	{
		return invokeMethod("getSocketTimeout");
	}

	public void setSocketTimeout(int socketTimeout)
	{
		invokeMethod("setSocketTimeout", new Object[] { socketTimeout }, new Class<?>[] { int.class });
	}

	public boolean getSsl()
	{
		return invokeMethod("getSsl");
	}

	public void setSsl(boolean ssl)
	{
		invokeMethod("setSsl", new Object[] { ssl }, new Class<?>[] { boolean.class });
	}

	public String getSslfactory()
	{
		return invokeMethod("getSslfactory");
	}

	public void setSslfactory(String sslfactory)
	{
		invokeMethod("setSslfactory", sslfactory);
	}

	public String getStringType()
	{
		return invokeMethod("getStringType");
	}

	public void setStringType(String stringType)
	{
		invokeMethod("setStringType", stringType);
	}

	public boolean getTcpKeepAlive()
	{
		return invokeMethod("getTcpKeepAlive");
	}

	public void setTcpKeepAlive(boolean tcpKeepAlive)
	{
		invokeMethod("setTcpKeepAlive", new Object[] { tcpKeepAlive }, new Class<?>[] { boolean.class });
	}

	public int getUnknownLength()
	{
		return invokeMethod("getUnknownLength");
	}

	public void setUnknownLength(int unknownLength)
	{
		invokeMethod("setUnknownLength", new Object[] { unknownLength }, new Class<?>[] { int.class });
	}

	public String getUrl()
	{
		return invokeMethod("getUrl");
	}

	public void setUrl(String url)
	{
		invokeMethod("setUrl", url);
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