package oracle.jdbc.pool;

import net.sf.log4jdbc.ConnectionPoolDataSourceSpy;

public class OraclePooledConnectionSpy extends ConnectionPoolDataSourceSpy
{
	public OraclePooledConnectionSpy() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		super("oracle.jdbc.pool.OracleConnectionPoolDataSource");
	}
}