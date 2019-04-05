package content.Article;

import content.StyleElement.Font;
import content.StyleElement.FontColor;
import content.StyleElement.TextAlign;
import content.StyleElement.TitleSize;

import java.util.ArrayList;

public class Article {

    private ArticleTitle articleTitle;
    private ArticleAuthor articleAuthor;
    private ArticleCategory articleCategory;
    ArrayList<ArticleImage> articleImages = new ArrayList<ArticleImage>();
    private ArticleContent articleContent;
    private ArticleDatetime articleDatetime;

    public Article(ArticleTitle articleTitle, ArticleAuthor articleAuthor, ArticleCategory articleCategory, ArrayList<ArticleImage> articleImages, ArticleContent articleContent, ArticleDatetime articleDatetime) {
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleCategory = articleCategory;
        this.articleImages = articleImages;
        this.articleContent = articleContent;
        this.articleDatetime = articleDatetime;
    }

    public void addArticleImage(ArticleImage ai){
        this.articleImages.add(ai);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(articleTitle.toString());
        sb.append("<p> written by ").append(articleAuthor.getAuthor());
        sb.append(" in category ").append(articleCategory.toString());
        sb.append(" - ").append(articleDatetime.toString());
        sb.append("</p><br />");

        for(int i=0; i<this.articleImages.size(); i++){
            ArticleImage ai = this.articleImages.get(i);
            sb.append(ai.toString()).append("<br />");
        }

        sb.append("<br />");
        sb.append(this.articleContent.toString());

        return sb.toString();
    }

    public static void main(String[] args) {
        ArticleTitle articleTitle = new ArticleTitle(TitleSize.TROIS, FontColor.FUCHSIA, Font.GEORGIA, TextAlign.CENTER, "Titre bidon d'un article bidon");
        ArticleAuthor articleAuthor = new ArticleAuthor("Ornicar");
        ArticleCategory articleCategory = ArticleCategory.CATEGORIE1;
        ArticleContent articleContent = new ArticleContent("BLABLABLA", Font.ARIAL, FontColor.BLUE);
        ArticleDatetime articleDatetime = new ArticleDatetime();

        ArrayList<ArticleImage> articleImage = new ArrayList<>();

        Article article = new Article(articleTitle, articleAuthor, articleCategory, articleImage, articleContent, articleDatetime);
        article.addArticleImage(new ArticleImage("https://images-na.ssl-images-amazon.com/images/I/51yQeNJ42qL._SX348_BO1,204,203,200_.jpg", "Unicorn"));
                article.addArticleImage(new ArticleImage("https://images-na.ssl-images-amazon.com/images/I/617Z4tn40wL._SX425_.jpg", "Unicorn"));
                article.addArticleImage(new ArticleImage("https://ih1.redbubble.net/image.426960612.8982/flat,550x550,075,f.u1.jpg", "Unicorn"));
                article.addArticleImage(new ArticleImage("https://ih1.redbubble.net/image.512314315.0935/flat,550x550,075,f.jpg", "Unicorn"));

        System.out.println(article.toString());
    }
}
