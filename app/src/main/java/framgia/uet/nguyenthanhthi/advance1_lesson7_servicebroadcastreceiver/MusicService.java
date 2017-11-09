package framgia.uet.nguyenthanhthi.advance1_lesson7_servicebroadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service {

    private MediaPlayer mPlayer;

    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.myheartwillgoon);
        Toast.makeText(getApplicationContext(), "Playing music", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mPlayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        mPlayer.release();
        Toast.makeText(getApplicationContext(), "Stop playing music", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
