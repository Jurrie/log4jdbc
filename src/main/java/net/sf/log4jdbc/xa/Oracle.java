package net.sf.log4jdbc.xa;

public class Oracle extends XADataSourceSpy
{
	public Oracle() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("oracle.jdbc.xa.client.OracleXADataSource");
	}

	public synchronized String getURL()
	{
		return invokeMethod("getURL");
	}

	public synchronized void setURL(String url)
	{
		invokeMethod("setURL", url);
	}
}