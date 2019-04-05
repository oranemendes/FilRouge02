package content.Article;

import content.StyleElement.Font;
import content.StyleElement.FontColor;
import content.StyleElement.TextAlign;
import content.StyleElement.TitleSize;

public class ArticleTitle {
    private TitleSize titleSize;
    private FontColor color;
    private Font font;
    private TextAlign textAlign;
    private String content;

    public ArticleTitle(TitleSize titleSize, FontColor color, Font font, TextAlign textAlign, String content) {
        this.titleSize = titleSize;
        this.color = color;
        this.font = font;
        this.textAlign = textAlign;
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<h").append(this.titleSize.getTitleSizeChoice());
        sb.append(" style=\"font-family:").append(this.font.getFontCode());
        sb.append("; color:").append(this.color.getColorCode());
        sb.append("; text-align:").append(this.textAlign.getTextAlignChoice());
        sb.append("\">").append(this.content);
        sb.append("</h").append(this.titleSize.getTitleSizeChoice());
        sb.append(">");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArticleTitle articleTitle = new ArticleTitle(TitleSize.TROIS, FontColor.FUCHSIA, Font.COMICSANSMS, TextAlign.RIGHT, "Article Title right here");
        System.out.println(articleTitle);
    }



}
