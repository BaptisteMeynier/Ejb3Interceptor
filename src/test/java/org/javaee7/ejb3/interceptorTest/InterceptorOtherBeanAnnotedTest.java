package org.javaee7.ejb3.interceptorTest;

import javax.ejb.EJB;

import org.javaee7.ejb3.interceptor.OtherBean;
import org.javaee7.ejb3.interceptor.interceptor.TracingInterceptor;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class InterceptorOtherBeanAnnotedTest {
	@EJB
	private OtherBean otherBean;


	@Deployment
	public static JavaArchive deploy() {
		return ShrinkWrap
				.create(JavaArchive.class)
				.addClass(TracingInterceptor.class)
				.addClass(OtherBean.class);
	}

	@Test
	public void shouldCallInterceptor() {
		otherBean.printHello();
	}
	
	@Test
	public void shouldCallInterceptor2() {
		otherBean.printHello();
	}

}
