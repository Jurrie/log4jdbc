package net.sf.log4jdbc;

import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.sql.XADataSource;

public abstract class XADataSourceSpy extends CommonDataSourceSpy implements XADataSource
{
	private final XADataSource realXADataSource;

	protected XADataSourceSpy(final String realXADataSourceClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		super(realXADataSourceClassName, XADataSource.class);
		realXADataSource = (XADataSource) super.getSpiedObject();
	}

	@Override
	public XAConnection getXAConnection() throws SQLException
	{
		return new XAConnectionSpy(realXADataSource.getXAConnection());
	}

	@Override
	public XAConnection getXAConnection(String user, String password) throws SQLException
	{
		return new XAConnectionSpy(realXADataSource.getXAConnection(user, password));
	}
}