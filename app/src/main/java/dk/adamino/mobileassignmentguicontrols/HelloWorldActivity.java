package dk.adamino.mobileassignmentguicontrols;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.ToggleButton;

public class HelloWorldActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private RadioButton mRadioButtonOne, mRadioButtonTwo, mRadioButtonThree;
    private ToggleButton mToggleButtonOne, mToggleButtonTwo, mToggleButtonThree;


    public static Intent newIntent(Context packageContext){
        Intent intent = new Intent(packageContext, HelloWorldActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        initializeButtons();
    }

    private void initializeButtons(){
        mProgressBar = findViewById(R.id.pbProgress);

        mRadioButtonOne = findViewById(R.id.rbtnValueOne);
        mRadioButtonTwo = findViewById(R.id.rbtnValueTwo);
        mRadioButtonThree = findViewById(R.id.rbtnValueThree);

        mToggleButtonOne = findViewById(R.id.tbtnValueOne);
        mToggleButtonTwo = findViewById(R.id.tbtnValueTwo);
        mToggleButtonThree = findViewById(R.id.tbtnValueThree);
    }
}
