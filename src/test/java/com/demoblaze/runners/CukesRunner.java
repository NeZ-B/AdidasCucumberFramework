package com.demoblaze.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features", //my sceanarios are in this directory.Use them.business layer
        glue = "com/demoblaze/step_definitions", //coding layer. my codes are here. use them.
        dryRun = false, //true=not running test cases,to get snippets(unimplemented step definitions)  false=running the test
        tags = "@wip" //which sceario you gonna run
)
public class CukesRunner {
}

//Runner class holding this informaiton: Business Layer; defines feature file and scearios
//Coding Language. Tecnical Layer defines our steps

//