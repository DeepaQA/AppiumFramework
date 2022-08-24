package DeepaAndroid.Appium;

import java.net.MalformedURLException;
import java.net.URL;


import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class RealdeviceTry {
	
	//public AppiumDriverLocalService service;
	
		public AndroidDriver driver;
		
		@Test
		public void ConfigureAppium() throws MalformedURLException
		{
		
		 /*service=new AppiumServiceBuilder().withAppiumJS(new File("C://Users//deepa//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();*/
		
			UiAutomator2Options options=new UiAutomator2Options();
			options.setDeviceName("Samsung");
			options.setApp("E://Rahul Shetty//Appium//src//test//java//resources//SampleApplication.apk");
			options.setPlatformName("Android");
			//options.setPlatformVersion("12");
			//options.setAutomationName("appium");
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
			driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]")).click();
		}
			

		public void tearDown()
		{
		driver.quit();
		//service.stop();
		}
	

}
