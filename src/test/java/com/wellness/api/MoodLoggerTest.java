package com.wellness.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoodLoggerTest {

    @Test
    public void testHappyMood() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("happy");
        assertEquals("Mood 'happy' logged successfully", response);
    }

    @Test
    public void testUnknownMood() {
        MoodLogger logger = new MoodLogger();
        String response = logger.logMood("meh");
        assertEquals("Mood not recognized.", response);
    }
}
