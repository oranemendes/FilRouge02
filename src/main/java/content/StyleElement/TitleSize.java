package content.StyleElement;

public enum TitleSize {

    UN("Titre de niveau 1", 1),
    DEUX("Titre de niveau 2", 2),
    TROIS("Titre de niveau 3", 3),
    QUATRE("Titre de niveau 4", 4),
    CINQ("Titre de niveau 5", 5),
    SIX("Titre de niveau 6", 6);

    private String titleSizeName;
    private final int titleSizeChoice;

    TitleSize(String titleSizeName, int titleSizeChoice){
        this.titleSizeName = titleSizeName;
        this.titleSizeChoice = titleSizeChoice;
    }

    public int getTitleSizeChoice(){
        return titleSizeChoice;
    }



    }
