package com.springboot.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController
{
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add( int id)
	{
		System.out.println(8001+"add");
		return true;
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") Long id)
	{
		return "8001-get-id:"+id;
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public String list()
	{
		return "8001-list:";
	}

	
//	@Autowired
//	private DiscoveryClient client;
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery()
	{
		List<String> list = client.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}

}
