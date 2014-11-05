package com.ls.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.ls.exception.ConfigurationException;
import com.ls.vo.Orders;

public interface AuthanAutomationService {
	
	public Orders grabSingleOrders(String start, String end);
	
	public List<Orders> grabOrders(String start, String end) throws ConfigurationException;
	
	public String postDataToWebService(String start, String end) throws ConfigurationException, UnsupportedEncodingException, ClientProtocolException, IOException;
}
