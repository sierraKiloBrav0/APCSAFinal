public class MainBot {

    private int personalityValue = -20; //starting personality
    private final int PERSONALITY_MODIFIER = 5; //how much personality is changed by

    ValueAssigner valueA = new ValueAssigner();
    ResponseGenerator respGen = new ResponseGenerator();


    public static void main(String[]args){

    }
    //this will contain the main loop that will prompt the user for input and return 
    public void userloop(){
        
    }
    //This method will take the user message, pass it to ValueAssigner, and find out if the setence had a net negative or a net positive value
    public void updatePersonality(String message){
        String[] messageStrings = message.split(" ");
        double[] sentenceValues = new double[messageStrings.length];

        //get array with the +,-,0 values
        for(int i = 0; i < messageStrings.length; i++){
            sentenceValues[i] = valueA.getFriendshipValue(messageStrings[i]);
        }

        double sum;
        double average = 0;
        //find average
        for(int i = 0; i < sentenceValues.length; i++){
            sum =+ sentenceValues[i];
            average = sum/sentenceValues.length;
        }

        //update personality
        if(average < 0){
            personalityValue =- PERSONALITY_MODIFIER;
        }
        else if(average > 0){
            personalityValue =+ PERSONALITY_MODIFIER;
        }

    }
}
