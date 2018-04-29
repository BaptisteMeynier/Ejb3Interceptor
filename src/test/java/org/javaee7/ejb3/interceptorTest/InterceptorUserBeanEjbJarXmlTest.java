package org.javaee7.ejb3.interceptorTest;

import java.io.File;

import javax.ejb.EJB;

import org.javaee7.ejb3.interceptor.UserBean;
import org.javaee7.ejb3.interceptor.interceptor.TracingInterceptor;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class InterceptorUserBeanEjbJarXmlTest {

	@EJB
	private UserBean userBean;


	@Deployment
	public static WebArchive deploy() {
		return ShrinkWrap
				.create(WebArchive.class)
				.addClass(TracingInterceptor.class)
				.addClass(UserBean.class)
				.addAsWebInfResource(new File("src/test/resources","META-INF/ejb-jar.xml"));
	}

	@Test
	public void shouldCallInterceptor() {
		userBean.isPresent("Baptiste");
	}
	
	@Test
	public void shouldCallInterceptor2() {
		userBean.isPresent("UnKnow");
	}

}
