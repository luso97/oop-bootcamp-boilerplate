package oop.greet;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    public void greeterShouldReturnNameWithHello() {
        String name = "Test";
        String actual = Greet.greet(name);
        assertEquals("Hello Test", actual);
    }

    @Test
    public void greeterShouldReturnTrimmedNameWithHello() {
        String notTrimmedName = "  Test  ";
        String actual = Greet.greet(notTrimmedName);
        assertEquals("Hello Test",  actual);
    }

    @Test
    public void greeterShouldReturnCapitalizedNameWithHello(){
        String notCapitalizedName = "test";
        String actual = Greet.greet(notCapitalizedName);
        assertEquals("Hello Test", actual);
    }

    @Test
    public void greeterShouldReturnGoodMorningWhenTimeIs6To12(){
        LocalDateTime localDateTime = new LocalDateTime.of()
    }
}
