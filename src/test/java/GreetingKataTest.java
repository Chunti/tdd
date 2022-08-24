import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingKataTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void requirement1(){
        System.out.println("First test");
        String name = "Mogens";
        String actual = new GreetingKata().greet(name);
        String expected = "Hello Mogens";
        assertEquals(expected,actual);
    }


    @Test
    void requirement2(){
        System.out.println("2.nd test");
        String actual = new GreetingKata().greet(null);
        String expected = "Hello my friend";
        assertEquals(expected,actual);
    }

    @Test
    void requirement3(){
        System.out.println("3rd test");
        String name = "MOGENS";
        String actual = new GreetingKata().greet(name);
        String expected = "HELLO MOGENS";
        assertEquals(expected,actual);
    }

    @Test
    void requirement4(){
        System.out.println("4th test");
        String[] names = {"Mogens", "Gunner"};
        String actual = new GreetingKata().greet(names);
        String expected = "Hello Mogens and Gunner";
        assertEquals(expected,actual);
    }



}
