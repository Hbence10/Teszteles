package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuggvenyekTest {

    @Test
    void middle_paros() {
        String expected = "lm";
        String actual = Fuggvenyek.middle("alma");

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void middle_paratlan() {
        String expected = "s";
        String actual = Fuggvenyek.middle("hatsune");

        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void vowelTest1(){
        int expected = 2;
        int actual = Fuggvenyek.vowels("alma");
        assertEquals(expected, actual);
    }

    @Test
    void vowelTest2(){
        int expected = 0;
        int actual = Fuggvenyek.vowels("dgg");
        assertEquals(expected, actual);
    }

//    @Test
//    void vowelTest3(){
//        int expected = 7;
//        int actual = Fuggvenyek.vowels("Hatsune Miku");
//        assertEquals(expected, actual);
//    }

    @Test
    void checkYear1(){
        boolean expected = true;
        boolean actual = Fuggvenyek.checkLoopYear(1988);
        assertEquals(expected, actual);
    }

    @Test
    void checkYear2(){
        boolean expected = true;
        boolean actual = Fuggvenyek.checkLoopYear(2000);
        assertEquals(expected, actual);
    }

    @Test
    void checkYear3(){
        boolean expected = false;
        boolean actual = Fuggvenyek.checkLoopYear(1700);
        assertEquals(expected, actual);
    }

    @Test
    void passwordCheck1(){
        boolean expected = false;
        boolean actual = Fuggvenyek.passwordValidate("asdasd12}}");
        assertEquals(expected, actual);
    }

    @Test
    void passwordCheck2(){
        boolean expected = true;
        boolean actual = Fuggvenyek.passwordValidate("asdasdasd12");
        assertEquals(expected, actual);
    }

    @Test
    void triangleAreaTest1(){
        double expected = 6.0;
        double actaul = Fuggvenyek.triangleArea(3.0, 4.0, 5.0);

        assertEquals(expected, actaul);
    }
}