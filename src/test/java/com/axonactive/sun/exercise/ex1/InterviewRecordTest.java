package com.axonactive.sun.exercise.ex1;

import com.axonactive.sun.exercise.ex1.InterviewRecord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class InterviewRecordTest {
    @Test
    @DisplayName("Test with all 0 score should return F ")
    public void classifySelectionResult_All0Score_ShouldReturnF(){
        //Arrange
        var interviewRecord = new InterviewRecord(0,0,0);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("F",result);
    }

    @Test
    @DisplayName("Test with all null score should return F ")
    public void classifySelectionResult_AllNullScore_ShouldReturnF(){
        //Arrange
        var interviewRecord = new InterviewRecord();
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("F",result);
    }

    @Test
    @DisplayName("Test with all 91 score should return A ")
    public void classifySelectionResult_All91Score_ShouldReturnA(){
        //Arrange
        var interviewRecord = new InterviewRecord(90,90,90);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("A",result);
    }

    @Test
    @DisplayName("Test with all 81 score should return B ")
    public void classifySelectionResult_All81Score_ShouldReturnB(){
        //Arrange
        var interviewRecord = new InterviewRecord(80,80,80);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("B",result);
    }

    @Test
    @DisplayName("Test with all 71 score should return C ")
    public void classifySelectionResult_All71Score_ShouldReturnC(){
        //Arrange
        var interviewRecord = new InterviewRecord(70,70,70);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("C",result);
    }

    @Test
    @DisplayName("Test with all 61 score should return D ")
    public void classifySelectionResult_All61Score_ShouldReturnD(){
        //Arrange
        var interviewRecord = new InterviewRecord(60,60,60);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("D",result);
    }

    @Test
    @DisplayName("Score not in range 0-100 should return IOException")
    public void average_ScoresSmallerThan0OrGreaterThan100_ShouldReturnIOException(){
        //Arrange
        var interviewRecord = new InterviewRecord(-20,20,20);
        //Act
        var thrown = assertThrows(IOException.class, interviewRecord::average);
        //Assert
        assertEquals(thrown.getMessage(),"All score must be greater than 0 or smaller 100");
    }


    @Test
    @DisplayName("Score not in range 0-100 should return IOException")
    public void classifySelectionResult_ScoresSmallerThan0OrGreaterThan100_ShouldReturnIOException(){
        //Arrange
        var interviewRecord = new InterviewRecord(-20,20,20);
        //Act
        var result = interviewRecord.classifySelectionResult();
        //Assert
        assertEquals("All score must be greater than 0 or smaller 100",result);
    }
}