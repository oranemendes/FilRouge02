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
        sb.append("<nav><ul>");

        for (int i = 0; i< this.navbarLinks.size(); i++){
            NavbarLink l = this.navbarLinks.get(i);
            sb.append("<li>").append(l.toString()).append("</li>");
        }

        sb.append("</ul></nav>");

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
