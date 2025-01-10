public class ResponseGenerator { 
    // construct a file reader 
    FileReader in = new FileReader(); 
    // variable declaration 
    private String[] positiveResponses = in.getContent(main\\positiveResponses.txt); // list of all positive responses to randomly select from 
    private String[] negativeResponses = in.getContent(main\\negativeResponses.txt); // list of all negative responses to randomly select from 
    private String[] neutralResponses = in.getContent(main\\neutralResponses.txt); // list of all neutral responses to randomly select from
    private double personalityValue = -20.0; // intial personality value 
    private double sentenceValue = 0.0; // sentimental value of the input to be reset at the start of each loop 
    private int linePulled = 0; // random index to take a line from in a text file based on the size of the file 

    // call a positive response 
    public String getPositiveResponse() { 
        // filler
        String line = positiveResponses.nextLine();
        String parse = line.split(" ");
        linePulled = new Random().nextInt(parse.length);
        System.out.println(parse[linePulled]);
    }

    // call a negative response 
    public String getNegativeResponse() { 
        // filler 
        String line = negativeResponses.nextLine();
        String parse = line.split(" ");
        linePulled = new Random().nextInt(parse.length);
        System.out.println(parse[linePulled]);
    }

    //call a neutral response 
    public String getNeutralResponse() {
        String line = neutralResponses.nextLine();
        String parse = line.split(" ");
        linePulled = new Random().nextInt(parse.length);
        System.out.println(parse[linePulled]);
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
