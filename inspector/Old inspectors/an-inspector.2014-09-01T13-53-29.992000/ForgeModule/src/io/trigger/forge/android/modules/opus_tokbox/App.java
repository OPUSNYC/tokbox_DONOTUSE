package io.trigger.forge.android.modules.opus_tokbox;

import android.app.Application;

import com.quickblox.module.chat.smack.SmackAndroid;
import com.quickblox.module.users.model.QBUser;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SmackAndroid.init(this);
    }
}
