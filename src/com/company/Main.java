package com.company;

import java.util.ArrayList;
import java.util.List;

// Given a list of strings, return a list where each string has "*" added at its end.
public class Main {
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
    return strings;
    }


    public static void main(String[] args) {
	List<String> strings = new ArrayList<>(List.of("a", "bahaha", "agda"));
	addStar(strings);
	for(String a : strings){
	    System.out.println(a);
    }
    }
}
