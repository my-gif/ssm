package com.my.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;




/**
 * ʹ��Spring����ģ���ṩ�Ĳ��������ܣ�����curd�������ȷ��
 * Spring4���Ե�ʱ����Ҫservlet3.0��֧��
 * @author lfy
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","springmvc.xml"})
public class MvcTest {
	// ����Springmvc��ioc
	@Autowired
	WebApplicationContext context;
	// ����mvc���󣬻�ȡ����������
	MockMvc mockMvc;

	@Before
	public void initMokcMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testPage() throws Exception {
		System.out.println("aaa");
		//ģ�������õ�����ֵ
		MvcResult result = (MvcResult) mockMvc.perform(MockMvcRequestBuilders.get("show"));
		
		//����ɹ��Ժ��������л���pageInfo�����ǿ���ȡ��pageInfo������֤
		MockHttpServletRequest request = result.getRequest();
		System.out.println(request);
	}

}
