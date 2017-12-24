package ljapps.com.hebchallenge.feature;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void galleryItem_parser_isCorrect() throws Exception {
        String jsonString = "{\"id\":\"24386132377\",\"owner\":\"69983208@N08\",\"secret\":\"89b4b9e7ef\",\"server\":\"4589\",\"farm\":5,\"title\":\"party_enders_island_rosally_kaplan_photography-17\",\"ispublic\":1,\"isfriend\":0,\"isfamily\":0,\"url_s\":\"https:\\/\\/farm5.staticflickr.com\\/4589\\/24386132377_89b4b9e7ef_m.jpg\",\"height_s\":\"160\",\"width_s\":\"240\"}";
        Gson gson = new Gson();
        GalleryItem item = gson.fromJson(jsonString, GalleryItem.class);
        assertEquals(item.getTitle(), "party_enders_island_rosally_kaplan_photography-17");
        assertEquals(item.getUrl(), "https://farm5.staticflickr.com/4589/24386132377_89b4b9e7ef_m.jpg");
    }
}


