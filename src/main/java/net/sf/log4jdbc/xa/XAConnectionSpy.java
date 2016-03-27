package net.sf.log4jdbc.xa;

import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.transaction.xa.XAResource;

import net.sf.log4jdbc.pooled.PooledConnectionSpy;

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