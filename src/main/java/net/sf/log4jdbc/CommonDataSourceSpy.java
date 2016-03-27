package net.sf.log4jdbc;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.CommonDataSource;

public abstract class CommonDataSourceSpy implements CommonDataSource
{
	private final CommonDataSource realCommonDataSource;

	protected <T extends CommonDataSource> CommonDataSourceSpy(final String className, final Class<? extends T> interfaceClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) Class.forName(className);
		if (!interfaceClass.isAssignableFrom(clazz))
		{
			throw new IllegalArgumentException("Class " + className + " does not implement " + interfaceClass.getCanonicalName());
		}

		realCommonDataSource = clazz.newInstance();
	}

	// TODO: Can object come from an abstract method declared in this class?
	protected <T> T invokeMethod(final String methodName, Object... objects)
	{
		Class<?>[] args = new Class<?>[objects.length];
		for (int i = 0; i < objects.length; i++)
		{
			args[i] = objects[i].getClass();
		}

		return invokeMethod(methodName, objects, args);
	}

	protected <T> T invokeMethod(final String methodName, Object[] objects, Class<?>[] types)
	{
		Object spiedObject = getSpiedObject();

		Method method;
		try
		{
			method = spiedObject.getClass().getMethod(methodName, types);
			final Object invokeMethodResult = method.invoke(spiedObject, objects);

			@SuppressWarnings("unchecked")
			T result = (T) invokeMethodResult;
			return result;
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	protected CommonDataSource getSpiedObject()
	{
		return realCommonDataSource;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException
	{
		return realCommonDataSource.getLogWriter();
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException
	{
		realCommonDataSource.setLogWriter(out);
	}

	@Override
	public int getLoginTimeout() throws SQLException
	{
		return realCommonDataSource.getLoginTimeout();
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException
	{
		realCommonDataSource.setLoginTimeout(seconds);
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException
	{
		return realCommonDataSource.getParentLogger();
	}
}