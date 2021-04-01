package com.company.Lesson12;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {
    Application application = null;
    int[] arr;

    List<Human> humans;

    @Before
    public void init() {
        System.out.println("All items is inited");
        application = new Application();
        arr = new int[]{23, 34, 54, 76, 37};
        humans = new ArrayList<>();
        humans.add(new Human(1, "Alex"));
        humans.add(new Human(2, "Ivan"));
        humans.add(new Human(3, "Andrey"));
        humans.add(new Human(4, "Max"));
    }

    @Test
    public void listTest() {
        List<Human> expect = new ArrayList<>();
        List<Human> actual = application.filter(humans);
        expect.add(new Human(1, "Alex"));
        expect.add(new Human(3, "Andrey"));

        if(actual.size()!=expect.size()){
            Assert.fail();
        }else {

        }
    }


    @Test(expected = NullPointerException.class)
    public void testMethodTest() {
        int res = application.testMethod(12, 21);
//        if(res != 33 ){
//            System.out.println("Test error");
//        }else {
//            System.out.println("Test passed");
//        }
        Assert.assertEquals("Test error!!!!!!", 33, res);
    }

    @Test
    public void sumArrTest() {
        int sum = application.sumArr(arr);
        Assert.assertEquals(224, sum);
    }


    @Ignore
    @Test(timeout = 500)
    public void sleep() throws InterruptedException {
        System.out.println("My sleep test");
        Thread.sleep(400);
    }

    @After
    public void close() {
        System.out.println("Close all");
    }

}