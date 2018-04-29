package org.javaee7.ejb3.interceptor;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import org.javaee7.ejb3.interceptor.interceptor.TracingInterceptor;

@Stateless
@Interceptors ({TracingInterceptor.class})
public class OtherBean {
	
	public void printHello() {
		System.out.println("HELLO");
	}

}
