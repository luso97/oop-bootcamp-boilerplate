package oop.greet;

public class Greet {
    public static String greet(String name) {
        String trimmedName = name.trim();
        return "Hello " + trimmedName.substring(0,1).toUpperCase() + trimmedName.substring(1);
    }
}
