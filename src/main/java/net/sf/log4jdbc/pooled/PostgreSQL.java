package net.sf.log4jdbc.pooled;

public class PostgreSQL extends ConnectionPoolDataSourceSpy
{
	public PostgreSQL() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		super("org.postgresql.ds.PGConnectionPoolDataSource");
	}
}