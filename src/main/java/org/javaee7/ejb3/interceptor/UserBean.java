package org.javaee7.ejb3.interceptor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ejb.Stateless;


@Stateless
public class UserBean {
	
	private List<String> userList = Stream.of("Antoine","Bernard","Hery","Nicolas","Baptiste").collect(Collectors.toList());
	
	public boolean isPresent(final String user) {
		return  userList.contains(user);
	}

}
