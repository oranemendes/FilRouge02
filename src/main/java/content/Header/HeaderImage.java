package content.Header;

public class HeaderImage {
    private String link;
    private String alt;

    public HeaderImage(String link, String alt) {
        this.link = link;
        this.alt = alt;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<img src='").append(this.link).append("' alt='");
        sb.append(this.alt).append("' />");
        return sb.toString();
    }

    public static void main(String[] args) {
        HeaderImage headerImage = new HeaderImage("https://i.ytimg.com/vi/3hRGPLFwS3c/maxresdefault.jpg", "header image");
        System.out.println(headerImage);
    }
}
