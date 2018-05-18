public class StringRec {
    
    
       public static String decompress(String compressedText){

           char start;

           String decompressed="";

           if(compressedText.length()<=1)

           return compressedText;

          


           start=compressedText.charAt(0);


           if(Character.isDigit(start))  {

           if(start!='0'){
               start--;
               
               String letter="";
               
               letter = compressedText.substring(1,2);
               
               decompressed=decompressed+letter+decompress(start+compressedText.substring(1));  }  

         

           else{
               decompressed=decompressed+decompress(compressedText.substring(2));

           }

           }

       

           else  {

            String letter="";
            
            letter = compressedText.substring(0,1);
            
           decompressed=decompressed+letter+decompress(compressedText.substring(1));

           }

        

           return decompressed;

       }

    }

