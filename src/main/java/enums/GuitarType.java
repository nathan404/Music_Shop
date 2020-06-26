package enums;

public enum GuitarType {
    ACOUSTIC(19),
    CLASSICAL(19),
    JAZZ(19),
    ELECTRIC(24);

    private final int fretNumber;

    GuitarType(int fretNumber){
        this.fretNumber = fretNumber;
    }

    public int getFretNumber(){
        return fretNumber;
    }
}
