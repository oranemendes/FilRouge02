package content.Footer;

public class FooterImage {
    private String imageLink;
    private String imageAlt;

    public FooterImage(String imageLink, String imageAlt) {
        this.imageLink = imageLink;
        this.imageAlt = imageAlt;
    }

    public String getImageLink() {
        return imageLink;
    }

    public String getImageAlt() {
        return imageAlt;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<img src='").append(this.imageLink);
        sb.append("' alt='").append(this.imageAlt);
        sb.append("' />");
        return sb.toString();
    }
}
