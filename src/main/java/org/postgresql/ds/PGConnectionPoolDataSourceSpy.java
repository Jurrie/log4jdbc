package org.postgresql.ds;

import net.sf.log4jdbc.ConnectionPoolDataSourceSpy;

public class PGConnectionPoolDataSourceSpy extends ConnectionPoolDataSourceSpy
{
	public PGConnectionPoolDataSourceSpy() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		super("org.postgresql.ds.PGConnectionPoolDataSource");
	}
}