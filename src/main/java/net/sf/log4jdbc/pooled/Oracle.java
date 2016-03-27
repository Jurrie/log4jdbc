package net.sf.log4jdbc.pooled;

public class Oracle extends ConnectionPoolDataSourceSpy
{
	public Oracle() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		super("oracle.jdbc.pool.OracleConnectionPoolDataSource");
	}
}