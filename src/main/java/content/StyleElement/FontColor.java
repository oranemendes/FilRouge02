package content.StyleElement;

public enum FontColor {
    WHITE("White", "white"),
    SILVER("Silver", "silver"),
    GRAY("Gray", "gray"),
    BLACK("Black", "black"),
    RED("Red", "red"),
    MAROON("Maroon", "maroon"),
    YELLOW("Yellow", "yellow"),
    OLIVE("Olive", "olive"),
    LIME("Lime", "lime"),
    GREEN("Green", "green"),
    AQUA("Aqua", "aqua"),
    TEAL("Teal", "teal"),
    BLUE("Blue", "blue"),
    NAVY("Navy", "navy"),
    FUCHSIA("Fuchsia", "fuchsia"),
    PURPLE("Purple", "purple");

    private String colorName;
    private String colorCode;

    FontColor(String colorName, String colorCode){
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public String getColorCode() {
        return colorCode;
    }
}
