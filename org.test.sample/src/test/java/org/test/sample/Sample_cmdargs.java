package org.test.sample;

public class Sample_cmdargs {
	public void cmdargs() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		
		System.out.println("URL is="+URL);
		System.out.println("BROWSER is="+BROWSER);
		
	}

}
