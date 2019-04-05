package content.Article;

public enum ArticleCategory {

    CATEGORIE1("www.google.com", "Google"),
    CATEGORIE2("www.yahoo.fr", "Yahoo"),
    CATEGORIE3("www.ecosia.org", "Ecosia");

    protected String categoryLink;
    protected String categoryName;

    ArticleCategory(String categoryLink, String categoryName) {
        this.categoryLink = categoryLink;
        this.categoryName = categoryName;
    }

    public String getCategoryLink() {
        return categoryLink;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<a href='").append(this.categoryLink).append("'>");
        sb.append(this.categoryName).append("</a>");
        return sb.toString();
    }
}
