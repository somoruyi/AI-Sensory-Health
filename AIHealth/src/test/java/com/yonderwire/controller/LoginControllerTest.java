package com.yonderwire.controller;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.controller.LoginController;
import com.revature.exception.AIExceptions;
import com.revature.service.AutenticationService;

public class LoginControllerTest {
	
	private LoginController controller;
	private AutenticationService service;
	
	@Before
	public void setup() throws Exception{
		controller = new LoginController();
		service = Mockito.mock(AutenticationService.class);
	}

	@Test
	public void testService() {
		Mockito.when(service.autenticate("tom", "password")).thenReturn(true);
		
		String viewPath = controller.service("tom", "password");
		
		Assert.assertNotNull(viewPath);
		Assert.assertEquals("/home", viewPath);
		
	}

}
