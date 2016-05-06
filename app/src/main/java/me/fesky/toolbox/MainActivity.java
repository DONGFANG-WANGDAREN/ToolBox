package me.fesky.toolbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testElasticListener(View view) {
        startAct(TestElasticTouchListenerActivity.class);
    }

    public void testIosDialog(View view) {
        startAct(TestIosDialogActivity.class);
    }

    private void startAct(Class clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }
}