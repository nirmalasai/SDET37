package org.test.sample;

import org.testng.annotations.Test;

public class Sample_cmdargsTest {
	@Test
	public void cmdargs() {
		
		
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		System.out.println("URL is="+URL);
		System.out.println("BROWSER is="+BROWSER);
		System.out.println("URL is="+URL);
		//add to repo
	}

}
