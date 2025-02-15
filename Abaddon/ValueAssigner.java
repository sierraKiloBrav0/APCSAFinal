import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
* Program grabs positive and negative words and if positive, then add one to value and if negative then remove 1. Then calculate the average.
* 
* @author Team
* @version 1.0
* date: 1/13/2025
*/
public class ValueAssigner {

    private ArrayList<String> friendshipPosValues;
    private ArrayList<String> friendshipNegValues;

    public ValueAssigner() {
        FileReader fileReader = new FileReader();
        this.friendshipPosValues = fileReader.getContent("positive.txt");
        this.friendshipNegValues = fileReader.getContent("negative.txt");
    }

    public int getFriendshipValue(String userInput) {
        if (userInput == null || userInput.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }

        // Split the input into individual words
        String[] words = userInput.toLowerCase().split("\\W+"); // this confusing stuff in the parameter is just to identify a word! 
        int totalValue = 0;

        for (String word : words) {
            if (friendshipPosValues.contains(word)) {
                totalValue += 1;
            } else if (friendshipNegValues.contains(word)) {
                totalValue -= 1;
            }
        }

        // Calculate the average value and round to the nearest integer
        double average = (double) totalValue / words.length;
        return (int) Math.round(average);
    }
}
