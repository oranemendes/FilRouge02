package content;

import content.Article.*;
import content.Footer.Footer;
import content.Footer.FooterContent;
import content.Footer.FooterImage;
import content.Header.Header;
import content.Header.HeaderImage;
import content.Header.HeaderTitle;
import content.Navbar.Navbar;
import content.Navbar.NavbarLink;
import content.StyleElement.Font;
import content.StyleElement.FontColor;
import content.StyleElement.TextAlign;
import content.StyleElement.TitleSize;

import java.util.ArrayList;

public class Page {
    private Header header;
    private Navbar navbar;
    private Article article;
    private Footer footer;

    public Page(Header header, Navbar navbar, Article article, Footer footer) {
        this.header = header;
        this.navbar = navbar;
        this.article = article;
        this.footer = footer;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(header.toString());
        sb.append(navbar.toString());
        sb.append(article.toString());
        sb.append(footer.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        HeaderImage headerImage = new HeaderImage("https://i.ytimg.com/vi/3hRGPLFwS3c/maxresdefault.jpg", "Accueil");
        HeaderTitle headerTitle = new HeaderTitle(TitleSize.DEUX, FontColor.PURPLE, Font.IMPACT, TextAlign.CENTER, "Website title");
        Header header = new Header(headerImage, headerTitle);
        Navbar nav = new Navbar();
        nav.addLink(new NavbarLink("www.google.com", "Google"));
        nav.addLink(new NavbarLink("www.twitter.com", "Twitter"));
        nav.addLink(new NavbarLink("www.facebook.com", "Facebook"));
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

        FooterContent footerContent = new FooterContent(Font.COURIER, FontColor.MAROON, "Footer random content");
        FooterImage footerImage = new FooterImage("https://images-na.ssl-images-amazon.com/images/I/51QOIG0RnmL._SX258_BO1,204,203,200_.jpg", "Footer Image");
        Footer footer = new Footer(footerImage, footerContent);
        Page page = new Page(header, nav, article, footer);
        System.out.println(page);
    }
}
