package net.sf.log4jdbc.xa;

import java.sql.SQLException;

import javax.sql.XAConnection;
import javax.sql.XADataSource;

import net.sf.log4jdbc.CommonDataSourceSpy;

public abstract class XADataSourceSpy extends CommonDataSourceSpy implements XADataSource
{
	private final XADataSource realXADataSource;

	XADataSourceSpy(final String realXADataSourceClassName) throws ClassNotFoundException, InstantiationException, IllegalAccessException
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