package com.java.test;

import java.util.ArrayList;

/**
 * @author Aiswarya
 *
 */


public class BubbleSort {
	
	private static ArrayList<String> fnameList = new ArrayList<String>();
	private static ArrayList<String> lnameList = new ArrayList<String>();

    /**
     * method to sort names by first name.
     * @param input
     * @return fnameList
     */
    public static ArrayList<String> sortByFirstName(String [] input) {
        String temp;
        for (int i=0; i< input.length; i++){
            for(int j= i; j< input.length-1; j++){
                char first = input[i].charAt(0);
                char sec = input[j +1].charAt(0);
                 if (first > sec)  {
                     temp = input[j +1];
                     input[j +1] = input[i];        
                     input[i] = temp;
                 }
             }
            fnameList.add(input[i]);
         }
        System.out.println("Sorted by first name - "+fnameList);
        return fnameList;
    }
    
    /**
     * method to sort names by last name.
     * @param input
     * @return lnameList
     */
    public static ArrayList<String> sortByLastName(String [] input) {
    	
        String temp=null;
        for (int i = 0; i < input.length; i++){
        	lnameList.add(input[i]);
          }
        for (int i=0; i< lnameList.size(); i++){
        	 	
            for(int j= i; j< lnameList.size(); j++){
            	
            	char first = (lnameList.get(i).split(" ")[1]).charAt(0);
            	char sec = (lnameList.get(j).split(" ")[1]).charAt(0);
                 if (first > sec)  {
                     temp = lnameList.get(i);
                     lnameList.set(i,lnameList.get(j));
                     lnameList.set(j,temp);
                 }
             }
         }
        System.out.println("Sorted by last name - "+lnameList);
        return lnameList;
    }
    
    /**
     * method to generate all the combinations of first name and last name.
     * @param input
     * @return permuteList
     */
    public static ArrayList<String> generatePermute(String [] input){
    	
    	 ArrayList<String> firstName = new ArrayList<String>();
    	 ArrayList<String> lastName = new ArrayList<String>();
    	 ArrayList<String> permuteList = new ArrayList<String>();

    	for (int i = 0; i < input.length; i++){
    		firstName.add(input[i].split(" ")[0]);
    		lastName.add(input[i].split(" ")[1]);
          }
    	for (String s1: firstName) {
    		 for (String s2 : lastName) {
    		   permuteList.add(s1 +" " +s2);
    		 }
    		}
    	System.out.println("List of dummy names - "+permuteList);
    	return permuteList;
    }

    
    public static void main(String[] args) {
        String name[] =  {"aish jan", "vish dudu" , "sish shudh", "tanu venu", "leksh minu"};
        sortByFirstName(name);
        sortByLastName(name);
        generatePermute(name);
    }
}


