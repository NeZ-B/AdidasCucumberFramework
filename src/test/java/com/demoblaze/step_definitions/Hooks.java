package com.demoblaze.step_definitions;

import com.demoblaze.utilities.Driver;
import org.junit.After;

public class Hooks {


    //Hooks for: to handle to close the driver.
    //we can add beforemehtod: to maximize the window but now we put it in to the Driver class

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
