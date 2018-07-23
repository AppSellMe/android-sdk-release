package ru.appsellme.appsellsample;

import android.app.Application;

import ru.appsellme.appsellme.AppSellMe;
import ru.appsellme.appsellme.data.ReferrerStateListener;

public class SampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppSellMe.init(this, "your_app_id", new ReferrerStateListener() {
            @Override
            public void onReferrerExist() {

            }

            @Override
            public void onEmptyReferrer() {

            }

            @Override
            public void onFeatureNotSupported() {

            }

            @Override
            public void onServiceUnavailable() {

            }
        });

        /*
            Or simple without listener: AppSellMe.init(this, "your_app_id");
        */

    }
}
