<%@ page import="content.Article.*" %>
<%@ page import="content.StyleElement.TitleSize" %>
<%@ page import="content.StyleElement.FontColor" %>
<%@ page import="content.StyleElement.Font" %>
<%@ page import="content.StyleElement.TextAlign" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="content.Header.HeaderImage" %>
<%@ page import="content.Header.HeaderTitle" %>
<%@ page import="content.Header.Header" %>
<%@ page import="content.Navbar.Navbar" %>
<%@ page import="content.Navbar.NavbarLink" %>
<%@ page import="content.Footer.FooterContent" %>
<%@ page import="content.Footer.FooterImage" %>
<%@ page import="content.Footer.Footer" %>
<%@ page import="content.Page" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fil Rouge 402 - Main Page</title>
    <link href="/css/index.css" rel="stylesheet" />
</head>

<body>

    <%
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

        %>

    <%= header %>

    <%= nav %>

     <p><%= articleTitle %> written by
        <%= articleAuthor.getAuthor() %> in category
        <%= articleCategory %> -
        <%= articleDatetime %>
     <p/><br />

    <%= articleImage %>

    <%= articleContent %>

    <%= footer %>

</body>
</html>
