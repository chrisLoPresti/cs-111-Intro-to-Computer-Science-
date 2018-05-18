public class Compress {

    public static void main(String[] args) {

        System.out.println("Please enter a string");

        String input = IO.readString();

        IO.outputStringAnswer(compress(input));

    }// end of main

    public static String compress(String original) {
        
        StringBuilder compressed = new StringBuilder();
        
        char letter='q';
        
        int count = 1;
        
        if(letter == original.charAt(0)){
            
            count--;
            
        }
        
        
        
        for (int i = 0; i < original.length(); i++) {
            
            if (letter == original.charAt(i)) {
                
                count++;
                
            } else {
                
                compressed = count != 1 ? compressed.append(count) : compressed;
                
                compressed.append(letter);
                
                System.out.println(compressed);
                
                letter = original.charAt(i);
                
                count = 1;
            }
        }

        compressed = count != 1 ? compressed.append(count) : compressed;
        
        compressed.append(letter);
        
        String result= compressed.toString();
        
        letter='q';
        
        if(letter == original.charAt(0)){
            
            return result;
            
        }else{
        
            return result.substring(1);
        
        }
    }

}// end of class