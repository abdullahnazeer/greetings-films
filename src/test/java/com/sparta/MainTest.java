package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/*
Three stages of JUnit testing - Arrange, Act, Assert
*/

class MainTest {

    @Test
    @DisplayName("Given a time of 21 hours, greeting returns Good Evening!")
    public void GivenTime21_GreetingReturnsGoodEvening() {
        // Arrange
        int hours = 21;
        String expectedGreeting = "Good Evening!";
        // Act
        String result = Main.greeting(hours);
        // Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("Good Evening!", Main.greeting(21));
    }

    @Test
    @DisplayName("Given a time of 14 hours, greeting returns Good Afternoon!")
    public void GivenTime14_GreetingReturnsGoodAfternoon() {
        // Arrange
        int hours = 14;
        String expectedGreeting = "Good Afternoon!";
        // Act
        String result = Main.greeting(hours);
        // Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("Good Afternoon!", Main.greeting(14));
    }

    @Test
    @DisplayName("Given a time of 7 hours, greeting returns Good Morning!")
    public void GivenTime7_GreetingReturnsGoodMorning() {
        // Arrange
        int hours = 7;
        String expectedGreeting = "Good Morning!";
        // Act
        String result = Main.greeting(hours);
        // Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("Good Morning!", Main.greeting(7));
    }

    // Test a list of multiple values

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given a time between 0 and 11 hours, greeting returns Good Morning!")
    public void GivenTimeBetween5And11_GreetingReturnsGoodMorning(int time) {
        String expectedGreeting = "Good Morning!";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 15, 17})
    @DisplayName("Given a time between 12 and 17 hours, greeting returns Good Afternoon!")
    public void GivenTimeBetween12And18_GreetingReturnsGoodAfternoon(int time) {
        String expectedGreeting = "Good Afternoon!";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 21, 23})
    @DisplayName("Given a time between 18 and 23 hours, greeting returns Good Evening!")
    public void GivenTimeBetween18And24_GreetingReturnsGoodEvening(int time) {
        String expectedGreeting = "Good Evening!";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

//    @ParameterizedTest
//    @ValueSource(ints = {-3, 43, 124})
//    @DisplayName("Given a time between outside range, greeting returns Incorrect Time!")
//    public void GivenTimeOutsideRange_GreetingReturnsIncorrectTime(int time){
//        String expectedGreeting = "Incorrect Time!";
//        String result = Main.greeting(time);
//        assertEquals(expectedGreeting, result);
//    }

}