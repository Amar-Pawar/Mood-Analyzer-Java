package com.moodAnalyzer;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
public class MoodAnalyserTests 
{

    @Test
    public void testMoodAnalyzer_anyMOod_shouldReturn_Happy()
    {
    	String mood=moodanalyzer.analyseMood("I am in Any Mood");
	System.out.println(mood);
        assertEquals("HAPPY",mood);
    }
}


