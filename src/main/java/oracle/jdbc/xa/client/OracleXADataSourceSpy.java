package oracle.jdbc.xa.client;

import java.sql.SQLException;

import net.sf.log4jdbc.XADataSourceSpy;

public class OracleXADataSourceSpy extends XADataSourceSpy
{
	public OracleXADataSourceSpy() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super("oracle.jdbc.xa.client.OracleXADataSource");
	}
}