class FileReader { 

    public FileReader () { 
    } 
    
    ArrayList<String> lines; 
    public int currentIndex; 
    private String filePath; 

    public ArrayList<String> getContent(String filePath){ 
        this.filePath = filePath; // store the file path 

        lines = new ArrayList<>(); 
        currentIndex = 0; 

        try (Scanner in = new Scanner(new File (filePath))) { 
            // read the file 
            while (in.hasNextLine()){ 
                // add lines to ArrayList 
                String line = in.nextLine(); 
                lines.add(line); 
                currentIndex += 1; 
            }  
        }
        return lines; 
    }
}
