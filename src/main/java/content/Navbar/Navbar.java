package content.Navbar;

import java.util.ArrayList;

public class Navbar{

    ArrayList<NavbarLink> navbarLinks = new ArrayList<NavbarLink>();


    public Navbar() {
    }


    public void addLink(NavbarLink l){
        this.navbarLinks.add(l);
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<div>");
        sb.append("<nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">");
        sb.append("<a class=\"navbar-brand\" href=\"#\">Menu</a>");
        sb.append("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
        sb.append("<span class=\"navbar-toggler-icon\"></span>");
        sb.append("</button>");

        sb.append("<div class=\"collapse navbar-collapse\" id=\"navbarColor01\">");
        sb.append("<ul class=\"navbar-nav mr-auto\">");

        for (int i = 0; i< this.navbarLinks.size(); i++){
            NavbarLink l = this.navbarLinks.get(i);
            sb.append("<li class=\"nav-item\">").append(l.toString()).append("</li>");
        }

        sb.append("</ul>");
        sb.append("</div>");
        sb.append("</nav>");
        sb.append("</div>");


        return sb.toString();
    }


    public static void main(String[] args) {
        Navbar nav = new Navbar();
        nav.addLink(new NavbarLink("www.google.com", "Google"));
        nav.addLink(new NavbarLink("www.twitter.com", "Twitter"));
        nav.addLink(new NavbarLink("www.facebook.com", "Facebook"));
        System.out.println(nav.toString());
    }

}
