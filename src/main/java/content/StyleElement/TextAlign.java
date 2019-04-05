package content.StyleElement;

public enum TextAlign {

    RIGHT("Right", "right"),
    CENTER("Center", "center"),
    LEFT("Left", "left"),
    JUSTIFY("Justify", "justify");

    private String textAlignName;
    private String textAlignChoice;

    TextAlign(String textAlignName, String textAlignChoice) {
        this.textAlignName = textAlignName;
        this.textAlignChoice = textAlignChoice;
    }

    public String getTextAlignChoice() {
        return textAlignChoice;
    }
}
