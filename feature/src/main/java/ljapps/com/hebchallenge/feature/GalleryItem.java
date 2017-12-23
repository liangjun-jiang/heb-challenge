package ljapps.com.hebchallenge.feature;

/**
 * Created by liangjunjiang on 12/23/17.
 */

public class GalleryItem {
    private String title;
    private String id;
    private String url_s;


    @Override
    public String toString() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url_s;
    }

    public String getTitle() {return title; }
}
