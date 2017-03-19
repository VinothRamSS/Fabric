package com.example.vinothramss.fabric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "SNw8tLo9LHrDREtWvIoJOyI9P";
    private static final String TWITTER_SECRET = "F0UOoO5uPb917XGFGuJa0vWbAc7UEQ0jvQ6y22IJJLp9aRzaYE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits.Builder().build());
        setContentView(R.layout.activity_main);
    }
}
