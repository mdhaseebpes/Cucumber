package awsomecucumber.hooks;

import io.cucumber.java.*;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("\n In Before All - introduced Cucumber 7.0 \n");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("\n In After All - introduced Cucumber 7.0 \n");
    }


    @Before(order =1)
    public  void beforeOrder1(Scenario scenario){
        System.out.println("\n In Before Hook - Ordered 1 \n");
        System.out.println("SCENARIO NAME = " + scenario.getName());
        System.out.println("SCENARIO LINE = " + scenario.getLine());
        System.out.println("SCENARIO TAGS = " + scenario.getSourceTagNames());
        System.out.println("SCENARIO STATUS = " + scenario.getStatus());
        System.out.println("SCENARIO URI = " + scenario.getUri());
        System.out.println("SCENARIO IsFAILED = " + scenario.isFailed() + "\n");
    }

    @BeforeStep
    public void beforeStep(Scenario scenario){
        System.out.println("\n Before Step \n");
    }


    @AfterStep
    public void afterStep(Scenario scenario){
        System.out.println("\n After Step \n");
    }

    @Before(order =0)
    public  void beforeOrder0(Scenario scenario){
        System.out.println("\n In Before Hook - Ordered 0  \n");
    }

    @After(order=1)
    public  void afterOrder1(Scenario scenario){

        System.out.println("\n In After Hook  - Ordered 1 \n");
        System.out.println("SCENARIO NAME = " + scenario.getName());
        System.out.println("SCENARIO LINE = " + scenario.getLine());
        System.out.println("SCENARIO TAGS = " + scenario.getSourceTagNames());
        System.out.println("SCENARIO STATUS = " + scenario.getStatus());
        System.out.println("SCENARIO URI = " + scenario.getUri());
        System.out.println("SCENARIO IsFAILED = " + scenario.isFailed() + "\n");
    }

    @After(order=0)
    public  void afterOrder0(Scenario scenario){
        System.out.println("\n In After Hook  - Ordered 0 \n");
    }
}
