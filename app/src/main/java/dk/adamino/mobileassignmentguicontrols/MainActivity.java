package dk.adamino.mobileassignmentguicontrols;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupVideoView();

        Configuration config = getResources().getConfiguration();
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            ToggleButton playPause = findViewById(R.id.tbtnPlay);
            playPause.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked)
                        mVideoView.start();
                    else
                        mVideoView.pause();
                }
            });
        }
    }

    private void setupVideoView() {
        mVideoView = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.android);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
    }

    public void onRasmusClicked(View view) {
        Intent intent = HelloWorldActivity.newIntent(this);
        startActivity(intent);
    }

    public void onGreenClicked(View view) {
        // TODO Green!
    }

    /**
     * Start new activity from provided class
     * @param activityClass
     */
    private void startNewActivity(Class activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
