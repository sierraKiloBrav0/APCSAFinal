public class Substring {
    private String[] friendshipPosValues;
    private String[] friendshipNegValues;
    friendshipPosValues = FileReader.toStringArray("positive.txt");
    friendshipNegValues = FileReader.toStringArray("negative.txt");

    public double getFriendshipValue(String userInput) {
        for (int i = 0; i < friendshipPosValues.length; i++) {
            String currentLine = friendshipPosValues.get(i);
            int location = currentLine.indexOf(",");
            String sub = currentLine.substring(0, location);
            if (userInput.contains(sub)) {
                return 1.0;
            }
            else{
                for (int j = 0; j < friendshipNegValues.length; j++) {
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
