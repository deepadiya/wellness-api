package com.wellness.api;

public class MoodLogger {

    public String logMood(String mood) {
        switch (mood.toLowerCase()) {
            case "happy":
            case "sad":
            case "angry":
            case "tired":
            case "stressed":
            case "excited":
                return "Mood '" + mood + "' logged successfully";
            default:
                return "Mood not recognized.";
        }
    }
}
