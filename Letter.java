import java.util.Objects;

public class Letter  {
    
    // Encapsulation OOP concepts
    private char character;
    private int hashCode;

    public Letter(char c) {
    
        this.character = c;
        this.hashCode = Objects.hash(c);
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
            Letter that = (Letter) o;
        return character == that.character;
    }

    @Override
    public int hashCode() {
        return this.character;
    }
}
