package dk.adamino.mobileassignmentguicontrols;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupVideoView();
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
