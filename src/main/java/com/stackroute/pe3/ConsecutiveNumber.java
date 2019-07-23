package com.stackroute.pe3;

public class ConsecutiveNumber {
    boolean result = false;

    public boolean checkConsecutive(String consecutiveValues) {
        String[] consecutiveData = consecutiveValues.split(",");
        for (int i = 0; i < consecutiveData.length - 1; i++) {
            int difference = Integer.parseInt(consecutiveData[i + 1]) - Integer.parseInt(consecutiveData[i]);
            System.out.println(difference);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
