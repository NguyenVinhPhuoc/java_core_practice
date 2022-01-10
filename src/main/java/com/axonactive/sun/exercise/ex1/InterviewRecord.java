package com.axonactive.sun.exercise.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRecord {
    int programmingScore;
    int essayWritingScore;
    int interviewScore;

    public String classifySelectionResult() {

        double average;
        try {
            average = average();
        } catch (IOException e) {
           e.printStackTrace();
           return e.getMessage();
        }
        if(average > 89) return "A";
        if(average > 79) return "B";
        if(average > 69) return "C";
        if(average > 59) return "D";
        return "F";
    }

    public double average() throws IOException{
        falsyScoreInput(programmingScore);
        falsyScoreInput(essayWritingScore);
        falsyScoreInput(interviewScore);
       return (programmingScore + essayWritingScore + interviewScore)/3;
    }

    private void falsyScoreInput(int score) throws IOException{
        if(score < 0 || score > 100) throw new IOException("All score must be greater than 0 or smaller 100");
    }
}
