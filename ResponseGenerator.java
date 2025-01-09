public class ResponseGenerator { 
    // variable declaration 
    private String[] positiveResponses; // list of all positive responses to randomly select from 
    private String[] negativeResponses; // list of all negative responses to randomly select from 
    private String[] neutralResponses; // list of all neutral responses to randomly select from
    private double personalityValue = -20.0; // intial personality value 
    private double sentenceValue; // sentimental value of the input to be reset at the start of each loop 

    // call a positive response 
    public String getPositiveResponse() { 
        // filler
    }

    // call a negative response 
    public String getNegativeResponse() { 
        // filler 
    }

    //call a neutral response 
    public String getNeutralResponse() {

    }
    // logic to choose whether to give a positive, negative, or neutral response 
    if ((personalityValue > -25.0 ) && (personalityValue < -10.0)){ 
        // call getNegativeResponse
        getNegativeResponse();
    } else if ((personalityValue > -10.0) && (personalityValue < 10.0)) { 
        // call getNeutralResponse
        getNeutralResponse();
    } else if (personalityValue > 10.0) { 
        // call getPositiveResponse
        getPositiveResponse();
    } else { 
        System.out.println("I will never talk to you again, you insignificant wretch! Get out of my sight!"); 
    }
}
