package work.shaggy.gridviewpicasso.model;

/**
 * Created by shaggy on 12/23/16.
 */

public class Photo {
    private String url;
    private String title;

    public Photo(String title, String url) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }
}
