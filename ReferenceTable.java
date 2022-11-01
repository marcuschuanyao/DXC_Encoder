import java.util.*;

public class ReferenceTable {
    
    
    private HashMap<Letter, Letter> referenceRecord;
    private HashMap<Letter, Letter> referenceOffSetRecord;

    private Letter offSetLtr;

    // Initialise all the reference table when it starts
    public ReferenceTable(Letter offSetLtr) {
        this.offSetLtr = offSetLtr;
      
        this.referenceRecord = new HashMap<Letter, Letter>();
        this.referenceOffSetRecord = new HashMap<Letter, Letter>();

        generateReferenceTable();
        
        
        HashMap<Letter, Letter> hm = referenceRecord;
        //System.out.println(referenceRecord.get(new Number('1')));
        for (Map.Entry<Letter, Letter> curr : hm.entrySet()) {
            //System.out.println(curr.getKey().getCharacter() +" and offset is "+curr.getValue().getCharacter());
        }
    }

    public Letter getOffSetLetterByLetter(Character c) {

        int val = c - 0;
        
        if (val >= 65 && val <= 90)
            return referenceRecord.get(new Alphabet(c));
        else if (val >= 48 && val <= 57)
            return referenceRecord.get(new Number(c));
        else if (val >= 40 && val <= 47)
            return referenceRecord.get(new SpecialSymbol(c));

        return null;
    }

    public Letter getLetterByOffSetLetter(Character c) {

        int val = c - 0;
        
        if (val >= 65 && val <= 90)
            return referenceOffSetRecord.get(new Alphabet(c));
        else if (val >= 48 && val <= 57)
            return referenceOffSetRecord.get(new Number(c));
        else if (val >= 40 && val <= 47)
            return referenceOffSetRecord.get(new SpecialSymbol(c));

        return null;
    }

    private void generateReferenceTable() {
            
        for (int i = 0; i < 44; i++) {

           
            int iOffSet = getOffSetCharacterByIdx(i);
            

            Letter letter = getLetterByIdx(i);
            Letter offsetLetter = getLetterByIdx(iOffSet);

            // Initialise the reference table
            referenceRecord.put(letter, offsetLetter);
            referenceOffSetRecord.put(offsetLetter, letter);
        }

        
    }

    
    private Letter getLetterByIdx(int i) {
        Letter result;
        if (i >= 0 && i < 26) {
            //System.out.println((char) (i + 65));
            result = new Alphabet((char) (i + 65));
            
        } else if (i >= 26 && i < 36) {
            //System.out.println((char) (i + 22));
            result =  new Number((char) (i + 22));
        } else {
            //System.out.println((char) (i + 4));
            result = new SpecialSymbol((char) (i + 4));
        }
        return result;
    }

   
    private int getOffSetCharacterByIdx(int i) {
        int currOffSetIdx = 0;

        int idx = offSetLtr.getCharacter() - 0;
        int offSetIdx = 0;
        if (idx >= 65 && idx <= 90) {
            offSetIdx = offSetLtr.getCharacter() - 65;
        } else if (idx >= 48 && idx <= 57) {
            offSetIdx = offSetLtr.getCharacter() - 22;
        } else if (idx >= 40 && idx <= 47) {
            offSetIdx = offSetLtr.getCharacter() - 4;
        }
        
        currOffSetIdx = (44 - (offSetIdx)) + i;
        
        // If the offset reaches out of bounds
        if (currOffSetIdx >= 44) {
            currOffSetIdx -= 44;
        }

        return currOffSetIdx;
    }

    
}
