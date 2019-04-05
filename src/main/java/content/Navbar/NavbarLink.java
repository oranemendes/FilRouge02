package content.Navbar;

public class NavbarLink {
    private String link;
    private String name;

    public NavbarLink(String link, String name) {
        this.link = link;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("<a href='").append(this.link).append("'>").append(this.name).append("</a>");
        return sb.toString();
    }

    public static void main(String[] args) {
        NavbarLink navbarLink = new NavbarLink("www.google.com", "Google");
        System.out.println(navbarLink);
    }

}
