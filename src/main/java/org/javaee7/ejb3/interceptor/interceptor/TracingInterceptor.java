package org.javaee7.ejb3.interceptor.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TracingInterceptor {
	@AroundInvoke
	public Object intercept(InvocationContext ctx) throws Exception
	{
		System.out.println("*** INTERCEPT ");
		System.out.println("*** Intercepting call to "+ctx.getMethod());
		return ctx.proceed();
	}

}
