public class MainBot {

    ValueAssigner valueA = new ValueAssigner();
    public static void main(String[]args){

    }
    //this will contain the main loop that will prompt the user for input and return 
    public void userloop(){
        
    }
    //
    public void splitInput(String message){
        String[] messageStrings = message.split(" ");
        double[] sentencevalues = new double[messageStrings.length];

        for(int i = 0; i < messageStrings.length; i++){
            sentencevalues[i] = valueA.getFriendshipValue(messageStrings[i]);
        }
    }
}
