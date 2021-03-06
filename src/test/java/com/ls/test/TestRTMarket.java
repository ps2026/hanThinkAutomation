package com.ls.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ls.entity.AutomaticJob;
import com.ls.repository.AutomaticJobRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.util.XinXinConstants;
import com.ls.vo.ResponseVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestRTMarket {

	@Resource(name = "RTMarketAutomationService")
	private AuthanAutomationService rtmarketAutomationService;

	@Autowired
	private AutomaticJobRepository automaticJobRepository;

	@Test
	public void testGrabOrders() throws Exception {

		//AutomaticJob automaticJob = automaticJobRepository.findOne(34);
		AutomaticJob automaticJob = automaticJobRepository.findOne(23);
		rtmarketAutomationService.grabOrders("2015-01-01", "2015-01-13", automaticJob);
	}
	
	@Test
	public void testGrabStorage() throws Exception {

		AutomaticJob automaticJob = automaticJobRepository.findOne(34);
		//AutomaticJob automaticJob = automaticJobRepository.findOne(23);
		rtmarketAutomationService.grabStorageInformation("2015-01-01", "2015-01-13", automaticJob);
		
	}


	@Test
	public void testWholeProcess() throws Exception {

		//AutomaticJob automaticJob = automaticJobRepository.findOne(34);

		AutomaticJob automaticJob = automaticJobRepository.findOne(23);
		ResponseVo responseVo = rtmarketAutomationService.postDataToWebService("2015-01-01", "2015-01-13", automaticJob);

		System.out.println(responseVo.toString());
	}
}
