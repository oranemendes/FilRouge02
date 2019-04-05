package content.Article;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArticleDatetime {
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public ArticleDatetime() {
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Date date = new Date();
        sb.append(this.sdf.format(date));
        return sb.toString();
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
}
