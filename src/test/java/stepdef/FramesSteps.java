package stepdef;

import com.microsoft.playwright.Locator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Base.PlaywrightFactory.page;

public class FramesSteps {
    @When("I switch to frame")
    public void i_switch_to_frame() throws InterruptedException {
//        Thread.sleep(2000);
        page.frameLocator("[id='iframeResult']").locator("button[onclick='myFunction()']").click(new Locator.ClickOptions().setTimeout(3000));;
        Locator allFrames=page.locator("iframe");
        int frameCount=allFrames.count();
        System.out.println("Total frames are: "+frameCount);
        for (int i = 0; i <frameCount ; i++) {
            System.out.println(allFrames.nth(i).getAttribute("id"));

        }     // Write code here that turns the phrase above into concrete actions

    }
    @When("I handle Tab and Popup")
    public void i_handle_tab_and_popup() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
