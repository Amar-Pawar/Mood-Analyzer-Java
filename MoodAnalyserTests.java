package com.moodAnalyzer;
import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
public class MoodAnalyserTests 
{

   	@Test

	public void testMoodAnalyzer_Constructor_NullMessage_shouldReturn_Happy()
        {	
		String mood=MoodAnalyzer.MoodAnalyzer(null);
		System.out.println(mood);
		mood=MoodAnalyzer.MoodAnalyzer();
		System.out.println(mood);
        assertEquals("HAPPY",mood);
    }
    
}


