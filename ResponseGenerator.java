import java.util.Random;
import java.util.ArrayList;

public class ResponseGenerator { 
    // construct a file reader 
    FileReader in = new FileReader(); 
    // variable declaration 
    private ArrayList<String> positiveResponses = in.getContent("positiveResponses.txt"); // list of all positive responses to randomly select from 
    private ArrayList<String> negativeResponses = in.getContent("negativeResponses.txt"); // list of all negative responses to randomly select from 
    private ArrayList<String> neutralResponses = in.getContent("neutralResponses.txt"); // list of all neutral responses to randomly select from

    private double sentenceValue = 0.0; // sentimental value of the input to be reset at the start of each loop 
    private int linePulled = 0; // random index to take a line from in a text file based on the size of the file 

    public String getResponse(int personalityValue){
        // logic to choose whether to give a positive, negative, or neutral response 
        if ((personalityValue > -25.0 ) && (personalityValue < -10.0)){ 
            // call getNegativeResponse
            return getNegativeResponse();
        } else if ((personalityValue > -10.0) && (personalityValue < 10.0)) { 
            // call getNeutralResponse
            return getNeutralResponse();
        } else if (personalityValue > 10.0) { 
            // call getPositiveResponse
            return getPositiveResponse();
        } else { 
            return "I will never talk to you again, you insignificant wretch! Get out of my sight!"; 
        }
    }

    // call a positive response 
    public String getPositiveResponse() { 
        Random rand = new Random();
        linePulled = rand.nextInt(positiveResponses.size() - 0 + 1) + 0;
        return positiveResponses.get(linePulled);
    }

    // call a negative response 
    public String getNegativeResponse() { 
        // filler 
        Random rand = new Random();
        linePulled = rand.nextInt(negativeResponses.size() - 0 + 1) + 0;
        return negativeResponses.get(linePulled);
    }

    //call a neutral response 
    public String getNeutralResponse() {
        Random rand = new Random();
        linePulled = rand.nextInt(neutralResponses.size() - 0 + 1) + 0;
        return neutralResponses.get(linePulled);
    }

}
