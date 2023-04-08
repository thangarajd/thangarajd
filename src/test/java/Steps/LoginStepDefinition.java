package Steps;

import Base.BaseClass;
import Hooks.HookClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition extends BaseClass{
	
	@Before(order=0)
	@Given("user launch the web site")
	public void user_launch_the_web_site() {
		
		System.out.println("order First Given Statement"+ Thread.currentThread().getId() );
		
	}
	
	@Then("user verify the launched right site")
	public void user_verify_the_launched_right_site() {
		
		System.out.println("order First Then Statement"+Thread.currentThread().getId());
	}
	
	
	@Given("user launch aging the web site")
	public void user_launch_aging_the_web_site() {
		System.out.println("Second Given Statement"+Thread.currentThread().getId());
	}

	@Then("user verify newly launched right site")
	public void user_verify_newly_launched_right_site() {
		
		System.out.println("Second Then Statement"+Thread.currentThread().getId());
	}
	
	@Given("user validating Background")
	public void user_validating_background() {
		
		System.out.println("Background Statement");
	  
	}

}
