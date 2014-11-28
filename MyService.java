package com.holy.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.holy.service.IMyService")
public class MyService implements IMyService{
	@Override
	public String sayHi(String name) {
		return "hi," + name;
	}
}
