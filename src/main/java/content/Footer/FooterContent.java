package content.Footer;

import content.StyleElement.Font;
import content.StyleElement.FontColor;

public class FooterContent {
    private Font font;
    private FontColor fontColor;
    private String content;

    public FooterContent(Font font, FontColor fontColor, String content) {
        this.font = font;
        this.fontColor = fontColor;
        this.content = content;
    }

    public Font getFont() {
        return font;
    }

    public FontColor getFontColor() {
        return fontColor;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<p style=\"font-family:").append(this.font);
        sb.append(", color:").append(this.fontColor);
        sb.append("\">").append(this.content);
        sb.append("</p>");
        return sb.toString();
        }
    }
