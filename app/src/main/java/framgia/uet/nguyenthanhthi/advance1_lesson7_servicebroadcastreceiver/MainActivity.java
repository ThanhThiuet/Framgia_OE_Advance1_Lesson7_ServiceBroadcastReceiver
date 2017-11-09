package framgia.uet.nguyenthanhthi.advance1_lesson7_servicebroadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonStart, mButtonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Service Demo");

        initView();
    }

    private void initView() {
        mButtonStart = (Button) findViewById(R.id.button_start);
        mButtonStop = (Button) findViewById(R.id.button_stop);

        mButtonStart.setOnClickListener(this);
        mButtonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_start:
                Intent startIntent = new Intent(MainActivity.this, MusicService.class);
                startService(startIntent);
                break;
            case R.id.button_stop:
                Intent stopIntent = new Intent(MainActivity.this, MusicService.class);
                stopService(stopIntent);
                break;
            default:
                break;
        }
    }
}
