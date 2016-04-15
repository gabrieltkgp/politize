package br.com.politize.politize;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by GabrielPacheco on 20/01/2015.
 */
public class SplashActivity extends AppCompatActivity implements Runnable {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        Typeface myTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/SnackerComic_PerosnalUseOnly.ttf");
//        TextView textViewSplash = (TextView) findViewById(R.id.texViewSplash);
//        textViewSplash.setTypeface(myTypeface);

        Handler handler = new Handler();
        handler.postDelayed(this, 5000);
    }

    @Override
    public void run() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
