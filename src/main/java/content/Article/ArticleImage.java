package content.Article;

public class ArticleImage {
    private String imageLink;
    private String imageAlt;

    public ArticleImage(String imageLink, String imageAlt) {
        this.imageLink = imageLink;
        this.imageAlt = imageAlt;
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
