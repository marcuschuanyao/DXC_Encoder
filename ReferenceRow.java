public class ReferenceRow {

    private ReferenceTable referenceTable;
    private int idx;
    private Letter ltr;
    private Letter offsetLtr;

    public ReferenceRow(ReferenceTable referenceTable) {
        this.referenceTable = referenceTable;
    }

    public ReferenceRow(ReferenceTable referenceTable, int idx, Letter ltr) {
        this.referenceTable = referenceTable;
        this.idx = idx;
        this.ltr = ltr;
        this.offsetLtr = null;
    }

    public ReferenceRow(ReferenceTable referenceTable, int idx, Letter ltr, Letter offsetLtr) {
        this.referenceTable = referenceTable;
        this.idx = idx;
        this.ltr = ltr;
        this.offsetLtr = offsetLtr;
    }

    public Letter getLtr() {
        return ltr;
    }

    public Letter getOffsetLtr() {
        return offsetLtr;
    }

    public int getIdx() {
        return idx;
    }

    public void setOffsetLtr(Letter offsetLtr) {
        this.offsetLtr = offsetLtr;
    }
}
