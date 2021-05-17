package me.tuhin47.basicjavatest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PasswordStringVsByte {
    @Test
    public void testAsString() {
        String stringPassword = "password";
        System.out.print("Original String password value: ");
        System.out.println(stringPassword);
        System.out.println("Original String password hashCode: "
                + Integer.toHexString(stringPassword.hashCode()));

        String newString = "********";
        stringPassword.replace(stringPassword, newString);

        System.out.print("String password value after trying to replace it: ");
        System.out.println(stringPassword);
        System.out.println(
                "hashCode after trying to replace the original String: "
                        + Integer.toHexString(stringPassword.hashCode()));
    }

    @Test
    public void testForChar() {
        char[] charPassword = new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};

        System.out.print("Original char password value: ");
        System.out.println(charPassword);
        System.out.println(
                "Original char password hashCode: "
                        + Integer.toHexString(charPassword.hashCode()));

        Arrays.fill(charPassword, '*');

        System.out.print("Changed char password value: ");
        System.out.println(charPassword);
        System.out.println(
                "Changed char password hashCode: "
                        + Integer.toHexString(charPassword.hashCode()));
    }
}
