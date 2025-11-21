package Base;


import com.microsoft.playwright.*;

public class PlaywrightFactory {

    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static void initBrowser() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
        );

        context = browser.newContext();
        page = context.newPage();
    }

    public static void closeBrowser() {
        context.close();
        browser.close();
        playwright.close();
    }
}

