package com.stackroute.pe3;

public class StudentMarks {
    public String checkStudentsMarks(int stuGrades[], int numOfStudents) {
        String result="";
        if(numOfStudents>0){
        for (int i = 0; i < numOfStudents; i++)

            if (stuGrades[i] < 0)  {
                result="enter marks greater than 0";
            }
        else if(stuGrades[i]>100){
            result="enter marks less than 100";
            }
           else {
                return "All marks are correct";
            }}
        else{
            result="please enter valid value";
        }
           return result;
    }
        }