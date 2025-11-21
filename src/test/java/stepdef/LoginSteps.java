package stepdef;



import io.cucumber.java.en.Given;
import Base.PlaywrightFactory;

public class LoginSteps {

    @Given("I open google in playwright")
    public void openGoogle() {
        PlaywrightFactory.page.navigate("https://google.com");
    }
}
