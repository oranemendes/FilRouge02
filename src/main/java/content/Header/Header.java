package content.Header;

import content.StyleElement.Font;
import content.StyleElement.FontColor;
import content.StyleElement.TextAlign;
import content.StyleElement.TitleSize;

public class Header {

    private HeaderImage headerImage;
    private HeaderTitle headerTitle;

    public Header(HeaderImage headerImage, HeaderTitle headerTitle) {
        this.headerImage = headerImage;
        this.headerTitle = headerTitle;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(headerImage.toString());
        sb.append("<br />");
        sb.append(headerTitle.toString());

        return sb.toString();
    }

    public static void main(String[] args) {
        HeaderImage headerImage = new HeaderImage("https://i.ytimg.com/vi/3hRGPLFwS3c/maxresdefault.jpg", "Accueil");
        HeaderTitle headerTitle = new HeaderTitle(TitleSize.DEUX, FontColor.PURPLE, Font.IMPACT, TextAlign.CENTER, "Website title");
        Header header = new Header(headerImage, headerTitle);
        System.out.println(header.toString());
    }
}
