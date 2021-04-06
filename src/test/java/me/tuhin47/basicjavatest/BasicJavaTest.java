package me.tuhin47.basicjavatest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BasicJavaTest {

    @Test
    void stringListTest() {
        List<String> list = Arrays.asList(
                "asdf", "sdf", "1", "0", "2", "10"
        );
        Collections.sort(list);
        System.out.println(list);


    }

    @Test
    void stringConcatPassByValue(){
        String var = "hello";
        print(var);
        var+="world!";
        print(var);
    }

    private void print(String var) {
        System.out.println(var);
        var+=" ";
    }
    @Test
    void xorAndOr(){
        int i1 = 1, i2 = 2;
        System.out.println(i1 ^ i2);
        System.out.println(i1 | i2);
        System.out.println(print(1));

    }
    Exception print(int i){
        if (i>0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }

}
