package net.sf.log4jdbc.pooled;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;

import net.sf.log4jdbc.CommonDataSourceSpy;

public abstract class ConnectionPoolDataSourceSpy extends CommonDataSourceSpy implements ConnectionPoolDataSource
{
	private final ConnectionPoolDataSource realConnectionPoolDataSource;

	protected ConnectionPoolDataSourceSpy(final String realConnectionPoolDataSourceClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super(realConnectionPoolDataSourceClassName, ConnectionPoolDataSource.class);
		realConnectionPoolDataSource = (ConnectionPoolDataSource) super.getSpiedObject();
	}

	@Override
	public PooledConnection getPooledConnection() throws SQLException
	{
		return new PooledConnectionSpy(realConnectionPoolDataSource.getPooledConnection());
	}

	@Override
	public PooledConnection getPooledConnection(String user, String password) throws SQLException
	{
		return new PooledConnectionSpy(realConnectionPoolDataSource.getPooledConnection(user, password));
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException
	{
		return realConnectionPoolDataSource.getLogWriter();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException
	{
		realConnectionPoolDataSource.setLogWriter(out);
	}

	@Override
	public int getLoginTimeout() throws SQLException
	{
		return realConnectionPoolDataSource.getLoginTimeout();
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException
	{
		realConnectionPoolDataSource.setLoginTimeout(seconds);
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException
	{
		return realConnectionPoolDataSource.getParentLogger();
	}
}