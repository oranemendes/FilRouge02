package content.Footer;

import content.StyleElement.Font;
import content.StyleElement.FontColor;

public class Footer {

    FooterImage footerImage;
    FooterContent footerContent;

    public Footer(FooterImage footerImage, FooterContent footerContent) {
        this.footerImage = footerImage;
        this.footerContent = footerContent;
    }

    public FooterImage getFooterImage() {
        return footerImage;
    }

    public FooterContent getFooterContent() {
        return footerContent;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(footerContent.toString());
        sb.append(footerImage.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        FooterContent footerContent = new FooterContent(Font.COURIER, FontColor.MAROON, "Footer random content");
        FooterImage footerImage = new FooterImage("https://images-na.ssl-images-amazon.com/images/I/51QOIG0RnmL._SX258_BO1,204,203,200_.jpg", "Footer Image");
        Footer footer = new Footer(footerImage, footerContent);
        System.out.println(footer);
    }
}
