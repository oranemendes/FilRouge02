package content.Header;

import content.StyleElement.Font;
import content.StyleElement.FontColor;
import content.StyleElement.TextAlign;
import content.StyleElement.TitleSize;

public class HeaderTitle {
    private TitleSize titleSize;
    private FontColor color;
    private Font font;
    private TextAlign textAlign;
    private String content;

    public HeaderTitle(TitleSize titleSize, FontColor color, Font font, TextAlign textAlign, String content) {
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
        HeaderTitle headerTitle = new HeaderTitle(TitleSize.QUATRE, FontColor.LIME, Font.ARIAL, TextAlign.CENTER, "Website title");
        System.out.println(headerTitle);
    }
}
