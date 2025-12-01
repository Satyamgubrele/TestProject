package stepdef;

import com.microsoft.playwright.Locator;
import io.cucumber.java.en.Given;

import static Base.PlaywrightFactory.page;

public class LoginSteps {
    public Locator button1=page.locator("button[onclick='jsAlert()']");
    Locator linkClick=page.locator("a[target='_blank']");

    @Given("I open {string} in playwright")
    public void Login(String url) throws InterruptedException {

        page.navigate(url);
//        Thread.sleep(5000);
//       page.click("button[onclick='jsConfirm()']");
//       linkClick.click();
//       Thread.sleep(5000);
//
//       page.onDialog(dialog -> {
//            System.out.println("Dialog message: " + dialog.message());
//            dialog.dismiss();
//        });
    }

}
