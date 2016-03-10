package net.sf.log4jdbc;

import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.transaction.xa.XAResource;

public class XAConnectionSpy extends PooledConnectionSpy implements XAConnection
{
	/**
	 * The real XA connection that this XAConnectionSpy wraps.
	 */
	protected XAConnection realXAConnection;

	public XAConnectionSpy(XAConnection realXAConnection)
	{
		super(realXAConnection);
		this.realXAConnection = realXAConnection;
	}

	@Override
	public XAResource getXAResource() throws SQLException
	{
		return realXAConnection.getXAResource();
	}
}