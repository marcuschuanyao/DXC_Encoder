import java.util.*;

class Main {


    final Letter lt = new Letter('B');

    public static void main(String[] args) {
        
        Main main = new Main();
        ReferenceTable rt = new ReferenceTable(main.lt);
        /* 
        rt.generateReferenceTable();
        rt.generateOffSetReferenceTable();

        
        HashMap<Integer, ReferenceRow> hm = rt.getReferenceRows();
        for (Map.Entry<Integer, ReferenceRow> curr : hm.entrySet()) {
            System.out.println(curr.getKey() +" and "+curr.getValue().getLtr().getCharacter() +" and offset is "+curr.getValue().getOffsetLtr().getCharacter());
        }
*/
        
        System.out.println(main.encodingText("HELLO WORLD"));
    }
    
    public String encodingText(String plainText) {
        ReferenceTable rt = new ReferenceTable(lt);
        String result = "";
        for (Character c : plainText.toCharArray()) {

            
            // Convert the character to index code
            int i = rt.convertCharacterToIdx(new Letter(c));
            result += rt.convertIdxToOffSetLetter(i).getCharacter();

        }
        
        return result;
    }
}