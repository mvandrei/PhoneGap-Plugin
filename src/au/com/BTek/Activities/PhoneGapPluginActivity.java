package au.com.BTek.Activities;

import android.os.Bundle;
import org.apache.cordova.*;

public class PhoneGapPluginActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 380000);         
        super.loadUrl("file:///android_asset/www/index.html");
    }
}