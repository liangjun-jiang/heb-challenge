package ljapps.com.hebchallenge.feature;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by liangjunjiang on 12/23/17.
 */

public class FullsizePhotoActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context) {
        return new Intent(context, PhotoGalleryActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return FullsizePhotoFragment.newInstance();
    }
}
