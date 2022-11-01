import java.util.*;

class Main {


    /*
     * CHANGE THE WORDS HERE
     */
    final Letter lt = new Letter('B'); // Constraints -> Must be a character within the referenced table
    static final String words = new String("HELLO WORLD"); // -> Any characters should work
    /*
     * END OF CHANGE THE WORDS HERE
     */


    public static void main(String[] args) {
        
        Main main = new Main();

        String encoded = main.encode(words);

        System.out.println(encoded);
        System.out.println(main.decode(encoded));
        
    }
    
    public String encode(String plainText) {
        ReferenceTable rt = new ReferenceTable(lt);
        
        String result = "";
        for (Character c : plainText.toCharArray()) {
   
            Letter currentLetter = rt.getOffSetLetterByLetter(c);

            if (currentLetter != null)
                result += currentLetter.getCharacter();
            else
                result += c;
            
        }
        
        return result;
    }

    public String decode(String encodedText) {
        ReferenceTable rt = new ReferenceTable(lt);
        
        String result = "";
        for (Character c : encodedText.toCharArray()) {
   
            Letter currentLetter = rt.getLetterByOffSetLetter(c);

            if (currentLetter != null)
                result += currentLetter.getCharacter();
            else
                result += c;
            
        }
        
        return result;
    }
}