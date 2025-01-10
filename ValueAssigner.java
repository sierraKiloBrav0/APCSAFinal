public class ValueAssigner {
    // instantiate a file reader 
    FileReader lists = new Filereader(); 
    private ArrayList<String> friendshipPosValues;
    private ArrayList<String> friendshipNegValues;
    friendshipPosValues = lists.getContent("positive.txt");
    friendshipNegValues = lists.getContent("negative.txt");

    public static double getFriendshipValue(String userInput) {
        for (int i = 0; i < friendshipPosValues.size(); i++) {
            String currentLine = friendshipPosValues.get(i);
            if (userInput.contains(currentLine)) {
                return 1.0;
            }
            else {
                for (int j = 0; j < friendshipNegValues.size(); j++) {
                    String currentLine2 = friendshipNegValues.get(j);
                    if (userInput.contains(currentLine2)) {
                        return -1.0;
                    }

                }
            }
        }
        return 0;

    }
}
