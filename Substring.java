public class Substring {
    private ArrayList<String> friendshipPosValues;
    private ArrayList<String> friendshipNegValues;
    friendshipPosValues = FileReader.toStringList("positive.txt");
    friendshipNegValues = FileReader.toStringList("negative.txt");

    public double getFriendshipValue(String userInput) {
        for (int i = 0; i < friendshipPosValues.size(); i++) {
            String currentLine = friendshipPosValues.get(i);
            int location = currentLine.indexOf(",");
            String sub = currentLine.substring(0, location);
            if (userInput.contains(sub)) {
                return 1.0;
            }
            else{
                for (int j = 0; j < friendshipNegValues.size(); j++) {
                    String currentLine2 = friendshipNegValues.get(j);
                    int location2 = currentLine2.indexOf(",");
                    String sub2 = currentLine2.substring(0, location2);
                    if (userInput.contains(sub2)) {
                        return -1.0;
                    }

                }
            }
        }
        return 0;

    }
}
