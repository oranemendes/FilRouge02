package content.StyleElement;

public enum Font {
    ARIAL("Arial","Arial"),
    ARIALBLACK("Arial Black", "Arial Black"),
    BOOKMANOLDSTYLE("Bookman Old Style", "Bookman Old Style"),
    COMICSANSMS("Comic Sans MS", "Comic Sans MS"),
    COURIER("Courier", "Courier"),
    COURIERNEW("Courier New", "Courier New"),
    GARAMOND("Garamond", "Garamond"),
    GEORGIA("Georgia", "Georgia"),
    IMPACT("Impact", "Impact"),
    LUCIDACONSOLE("Lucida Console", "Lucida Console"),
    LUCISASANSUNICODE("Lucida Sans Unicode", "Lucida Sans Unicode"),
    MSSANSSERIF("MS Sans Serif", "MS Sans Serif"),
    MSSERIF("MS Serif", "MS Serif"),
    PALATINOLINOTYPE("Palatino Linotype", "Palatino Linotype"),
    SYMBOL("Symbol", "Symbol"),
    TAHOMA("Tahoma", "Tahoma"),
    TIMESNEWROMAN("Times New Roman", "Times New Roman"),
    TREBUCHETMS("Trebuchet Sans MS", "Trebuchet Sans MS"),
    VERDANA("Verdana", "Verdana"),
    WEBDINGS("Webdings", "Webdings"),
    WINGDINGS("Wingdings", "Wingdings");

    private String fontName;
    private String fontCode;

    Font(String fontName, String fontCode){
        this.fontName = fontName;
        this.fontCode = fontCode;
    }

    public String getFontName(){
        return fontName;
    }

    public String getFontCode(){
        return fontCode;
    }

}
