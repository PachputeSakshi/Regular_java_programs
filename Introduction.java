public class Introduction {
    public static void main(String[] args) {
        String Name= "Pachpute Sakshi Ramesh";
       
        String Hobbies= " -Learning \n \t -listening krishna bhajans \n \t -Constructing poems  \n \t -Drawing sketches";
        
         display(Name,Hobbies);
    }  
    private static void display(String Name,String... Hobbies) 
    {
        int maxLength = Name.length();

        // Find the maximum length among lines
        for (String line : Hobbies) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        // Top border
        for (int i = 0; i < maxLength ; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("| Name = "+ Name + " |");
        System.out.println();
        
        for (String line : Hobbies) {
            System.out.println(" Hobbies = \n\t" + line +  " "  );
        }

        // Bottom border
        for (int i = 0; i < maxLength ; i++) {
            System.out.print("-");
        }
        System.out.println();
    
    }
}
