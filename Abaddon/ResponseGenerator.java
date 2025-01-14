import java.util.Random;
import java.util.ArrayList;

/**
* Grabs the three response text files and depending on personality value, calles one of the methods to print a response.
*
* @author Team
* @version 1.0
* date: 1/13/2025
*/

public class ResponseGenerator { 
    // construct a file reader 
    FileReader in = new FileReader(); 
    // variable declaration 
    private ArrayList<String> positiveResponses = in.getContent("positiveResponses.txt"); // list of all positive responses to randomly select from 
    private ArrayList<String> negativeResponses = in.getContent("negativeResponses.txt"); // list of all negative responses to randomly select from 
    private ArrayList<String> neutralResponses = in.getContent("neutralResponses.txt"); // list of all neutral responses to randomly select from

    private int linePulled = 0; // random index to take a line from in a text file based on the size of the file 

    public String getResponse(int personalityValue){
        // logic to choose whether to give a positive, negative, or neutral response 
        if ((personalityValue >= -50.0) && (personalityValue <= -20.0)){ 
            // call getNegativeResponse
            return getNegativeResponse();
        } else if ((personalityValue >= -19.0) && (personalityValue <= 20.0)) { 
            // call getNeutralResponse
            return getNeutralResponse();
        } else if (personalityValue >= 21.0) { 
            // call getPositiveResponse
            return getPositiveResponse();
        } else { 
            return "I will never talk to you again, you insignificant wretch! Get out of my sight!"; 
        }
    }

    // call a positive response 
    public String getPositiveResponse() { 
        Random rand = new Random();
        linePulled = rand.nextInt(positiveResponses.size());
        return positiveResponses.get(linePulled);
    }

    // call a negative response 
    public String getNegativeResponse() { 
        // filler 
        Random rand = new Random();
        linePulled = rand.nextInt(negativeResponses.size());
        return negativeResponses.get(linePulled);
    }

    //call a neutral response 
    public String getNeutralResponse() {
        Random rand = new Random();
        linePulled = rand.nextInt(neutralResponses.size());
        return neutralResponses.get(linePulled);
    }

}
