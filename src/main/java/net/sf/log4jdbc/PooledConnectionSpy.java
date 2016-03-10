package net.sf.log4jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.ConnectionEventListener;
import javax.sql.PooledConnection;
import javax.sql.StatementEventListener;

public class PooledConnectionSpy implements PooledConnection
{
	/**
	 * The real pooled connection that this PooledConnectionSpy wraps.
	 */
	protected PooledConnection realPooledConnection;

	public PooledConnectionSpy(PooledConnection realPooledConnection)
	{
		if (realPooledConnection == null)
		{
			throw new IllegalArgumentException("Must pass in a non null real PooledConnection");
		}

		this.realPooledConnection = realPooledConnection;
	}

	@Override
	public Connection getConnection() throws SQLException
	{
		return new ConnectionSpy(realPooledConnection.getConnection());
	}

	@Override
	public void close() throws SQLException
	{
		realPooledConnection.close();
	}

	@Override
	public void addConnectionEventListener(ConnectionEventListener connectionEventListener)
	{
		realPooledConnection.addConnectionEventListener(connectionEventListener);
	}

	@Override
	public void removeConnectionEventListener(ConnectionEventListener connectionEventListener)
	{
		realPooledConnection.removeConnectionEventListener(connectionEventListener);
	}

	@Override
	public void addStatementEventListener(StatementEventListener statementEventListener)
	{
		realPooledConnection.addStatementEventListener(statementEventListener);
	}

	@Override
	public void removeStatementEventListener(StatementEventListener statementEventListener)
	{
		realPooledConnection.removeStatementEventListener(statementEventListener);
	}
}