import java.util.*;

public class ReferenceTable {
    
    private HashMap<Integer, ReferenceRow> referenceRows;

    private Letter offSetLtr;

    // Initialise all the reference table when it starts
    public ReferenceTable(Letter offSetLtr) {
        this.offSetLtr = offSetLtr;
        this.referenceRows = new HashMap<Integer, ReferenceRow>();

        generateReferenceTable();
        generateOffSetReferenceTable();
    }

    public HashMap<Integer, ReferenceRow> getReferenceRows() {
        return referenceRows;
    }

    private void generateReferenceTable() {
            
        for (int i = 0; i < 44; i++) {

            ReferenceRow rr;
            if (i >= 0 && i < 26) {
                //System.out.println((char) (i + 65));
                rr = new ReferenceRow(this, i, new Alphabet((char) (i + 65)));
            } else if (i >= 26 && i < 36) {
                //System.out.println((char) (i + 22));
                rr = new ReferenceRow(this, i, new Number((char) (i + 22)));
            } else {
                //System.out.println((char) (i + 4));
                rr = new ReferenceRow(this, i, new SpecialSymbol((char) (i + 4)));
            }

            // Initialise the reference table
            referenceRows.put(i, rr);
        }
    }

    private void generateOffSetReferenceTable() {
        //System.out.println(OffSet.getCharacter() - 65);

        for (int i = 0; i < 44; i++) {

            // Formula to create the offset
            int currOffSetIdx = convertCharacterToIdx(i);

            // Get the current reference row value
            ReferenceRow currentRR = referenceRows.get(i);

            // Get the offset value
            ReferenceRow offSetRR = referenceRows.get(currOffSetIdx);
            currentRR.setOffsetLtr(offSetRR.getLtr());

            // Update the hashmap
            referenceRows.put(i, currentRR);

            System.out.println(currOffSetIdx);
        }
    }
    
    public Letter convertIdxToOffSetLetter(Integer i) {
        return referenceRows.get(i).getOffsetLtr();
    }
    public int convertCharacterToIdx(Letter c) {
        return helper(c, 0);
    }

    public int convertCharacterToIdx(int i) {
        return helper(null, i);
    }

    private int helper(Letter c, int i) {
        
        int currOffSetIdx = 0;

        if (c == null)
            currOffSetIdx = (44 - (offSetLtr.getCharacter() - 65)) + i;
        else {
            //System.out.println(c.getCharacter() -0);
            currOffSetIdx = (44 - (offSetLtr.getCharacter() - (c.getCharacter() - 0))) + i;
        }
        // If the offset reaches out of bounds
        if (currOffSetIdx >= 44) {
            currOffSetIdx -= 44;
        }

        return currOffSetIdx;
    }

}
