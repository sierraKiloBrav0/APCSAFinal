import java.util.Random;

public class ResponseGenerator { 
    // construct a file reader 
    FileReader in = new FileReader(); 
    // variable declaration 
    private String[] positiveResponses = in.getContent("positiveResponses.txt"); // list of all positive responses to randomly select from 
    private String[] negativeResponses = in.getContent("negativeResponses.txt"); // list of all negative responses to randomly select from 
    private String[] neutralResponses = in.getContent("neutralResponses.txt"); // list of all neutral responses to randomly select from
    private double personalityValue = -20.0; // intial personality value 
    private double sentenceValue = 0.0; // sentimental value of the input to be reset at the start of each loop 
    private int linePulled = 0; // random index to take a line from in a text file based on the size of the file 

    public static void main(String[]args){
        ResponseGenerator bleh = new ResponseGenerator();
        // logic to choose whether to give a positive, negative, or neutral response 
        if ((bleh.personalityValue > -25.0 ) && (bleh.personalityValue < -10.0)){ 
            // call getNegativeResponse
            bleh.getNegativeResponse();
        } else if ((bleh.personalityValue > -10.0) && (bleh.personalityValue < 10.0)) { 
            // call getNeutralResponse
            bleh.getNeutralResponse();
        } else if (bleh.personalityValue > 10.0) { 
            // call getPositiveResponse
            bleh.getPositiveResponse();
        } else { 
            System.out.println("I will never talk to you again, you insignificant wretch! Get out of my sight!"); 
        }
    }

    // call a positive response 
    public String getPositiveResponse() { 
        Random rand = new Random();
        linePulled = rand.nextInt(positiveResponses.length - 0 + 1) + 0;
        System.out.println(positiveResponses[linePulled]);
    }

    // call a negative response 
    public String getNegativeResponse() { 
        // filler 
        Random rand = new Random();
        linePulled = rand.nextInt(negativeResponses.length - 0 + 1) + 0;
        System.out.println(negativeResponses[linePulled]);
    }

    //call a neutral response 
    public String getNeutralResponse() {
        Random rand = new Random();
        linePulled = rand.nextInt(neutralResponses.length - 0 + 1) + 0;
        System.out.println(neutralResponses[linePulled]);
    }

}
