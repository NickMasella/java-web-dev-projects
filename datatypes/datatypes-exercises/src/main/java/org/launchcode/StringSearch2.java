package org.launchcode;

import java.util.Scanner;

public class StringSearch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceFirstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        System.out.println("Input a term you would like to search for:");
        String query = input.nextLine();
        input.close();
        Integer index = aliceFirstSentence.indexOf(query);
        Integer length = query.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is "
                + length + " characters long.");
        String modifiedSentence = aliceFirstSentence.replace(query, "");
        System.out.println(modifiedSentence);
    }
}
