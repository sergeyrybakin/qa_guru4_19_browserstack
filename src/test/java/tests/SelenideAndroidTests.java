package tests;

import drivers.BrowserstackMobileDriver;
import io.appium.java_client.MobileBy;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.MobileBy.AccessibilityId;

@Tag("android")
public class SelenideAndroidTests {

    @Test
    void searchTest() {
        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;

        open();
        $(AccessibilityId("Search Wikipedia")).click();
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

}
