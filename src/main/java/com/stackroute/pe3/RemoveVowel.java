package com.stackroute.pe3;

public class RemoveVowel {
    public String[] removeVowel(String vowelString[]) {
        for (int i = 0; i < vowelString.length; i++)
            vowelString[i] = vowelString[i].replaceAll("[aeiou]", "");
        return vowelString;
    }

}
