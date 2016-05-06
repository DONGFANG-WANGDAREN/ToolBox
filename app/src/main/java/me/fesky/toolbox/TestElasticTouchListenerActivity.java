package me.fesky.toolbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.fesky.library.listener.ElasticTouchListener;

public class TestElasticTouchListenerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = getLayoutInflater().inflate(R.layout.activity_test_elastic_touch_listener, null);
        view.setOnTouchListener(new ElasticTouchListener());
        setContentView(view);
    }
}
