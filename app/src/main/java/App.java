import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Mr.MJ on 2017/5/15.
 */

public class App  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
