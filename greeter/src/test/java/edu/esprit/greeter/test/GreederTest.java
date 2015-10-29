package edu.esprit.greeter.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import edu.esprit.greeter.Greeter;
public class GreederTest {
	Greeter greeter;
	
	@Before
	public void setUp(){
		greeter=new Greeter();
	}
	@Test 
	public void itShouldSayHelloWorld(){
		
		String result=greeter.sayHello("world");
		Assert.assertEquals("helloworld",result);
		
	}
	@Test 
	public void itShouldSayHelloWorld1(){
		
		String result=greeter.sayHello("world");
		Assert.assertEquals("helloworld1",result);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void itShouldRaiseException(){
		String param="MAN";
		greeter.sayHello(param);
	}
	@After
	public void tearDown(){
		greeter=null;
	}
	

}
