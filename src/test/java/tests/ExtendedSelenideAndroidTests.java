package tests;

import drivers.BrowserstackMobileDriver;
import io.appium.java_client.MobileBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class ExtendedSelenideAndroidTests extends TestBase {

    @Test
    @Tag("smoke")
    @DisplayName("Successful search in Wiki Android app")
    void searchTest() {
        step("Type search", ()-> {
            $(AccessibilityId("Search Wikipedia")).click();
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Verify content found", ()->
                $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                        .shouldHave(CollectionCondition.sizeGreaterThan(0)));
    }

}
