package hooks;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	@Before
	public void setup(Scenario sceanrio) {
		
		System.out.println("**Execution started for scenario - "+ sceanrio.getName());
		System.out.println("++ Browser got launched and mazimized ++ ");
		System.out.println("++ Application URL got opened in the browser");
	}

	@After
	public void tearDown(Scenario sceanrio) {
		
		System.out.println("-- Loggedout from the application --");
		System.out.println("-- Browser got closed -- ");
		System.out.println("** Execution ended for scenario "+sceanrio.getName());
	}
}
