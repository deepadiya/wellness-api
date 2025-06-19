package com.wellness.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WellnessApiTests {

    @Test
    void testValidMoodHappy() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("happy");
        assertEquals("Mood 'happy' logged successfully", response);
    }

    @Test
    void testValidMoodSad() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("sad");
        assertEquals("Mood 'sad' logged successfully", response);
    }

    @Test
    void testInvalidMood() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("confused");
        assertEquals("Mood not recognized. Please enter a valid emotion.", response);
    }
}
