package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {
    @Before(order = -3)
    public void setup(){
        System.out.println("----- Before Hook -----");
    }

    @Before(order = 2)
    public void setup2(){
        System.out.println("----- Before Hook 2 -----");
    }

    @After
    public void tearDown(){
        System.out.println("----- After Hook -----");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("----- BeforeStep Hook -----");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("----- AfterStep Hook -----");
    }
}
