package content.Article;

import content.StyleElement.Font;
import content.StyleElement.FontColor;

public class ArticleContent {
    private String content;
    private Font font;
    private FontColor fontColor;

    public ArticleContent(String content, Font font, FontColor fontColor) {
        this.content = content;
        this.font = font;
        this.fontColor = fontColor;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<p style=\"font-family:");
        sb.append(this.font.getFontCode());
        sb.append(", color:");
        sb.append(this.fontColor.getColorCode());
        sb.append("\">");
        sb.append(this.content);
        sb.append("</p>");

        return sb.toString();
    }
}
