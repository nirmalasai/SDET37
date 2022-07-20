package org.test.sample;

import org.testng.annotations.Test;

public class Sample_cmdargsTest {
	@Test
	public void cmdargs() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		
		System.out.println("URL is="+URL);
		System.out.println("BROWSER is="+BROWSER);
		//add to repo
	}

}
