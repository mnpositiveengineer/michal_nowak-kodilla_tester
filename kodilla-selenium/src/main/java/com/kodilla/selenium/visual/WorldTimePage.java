package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.WebDriver;

// KLASA REPREZENTUJĄCA STRONĘ INTERNETOWĄ WG PAGE OBJECT MODEL
@Snap("WorldTime.png")
public class WorldTimePage {

    private static final String pageURL = "https://www.worldtimeserver.com/current_time_in_AW.aspx";

    private WebDriver webDriver;

    public WorldTimePage (WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(pageURL);
    }

    public void close(){
        webDriver.quit();
    }

    public void compare() {
        Ocular.snapshot()
                .from(this)
                .sample().using(webDriver)
                .compare();
    }
}
