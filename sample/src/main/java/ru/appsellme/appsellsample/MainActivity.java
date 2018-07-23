package ru.appsellme.appsellsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ru.appsellme.appsellme.AppSellMe;
import ru.appsellme.appsellme.data.ResponseStateListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AppSellMe.sendEvent("event_name", new ResponseStateListener() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure() {
                        Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onException(Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, "Exception", Toast.LENGTH_SHORT).show();
                    }
                });

                /*
                    Or simple without listener: AppSellMe.sendEvent("event_name");
                */

            }
        });

    }
}
