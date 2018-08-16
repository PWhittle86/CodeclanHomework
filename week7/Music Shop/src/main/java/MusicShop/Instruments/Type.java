package MusicShop.Instruments;

public enum Type {

    STRING("String"),
    WOODWIND("Woodwind"),
    BRASS("Brass"),
    KEYBOARD("Keyboard");

    private final String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
