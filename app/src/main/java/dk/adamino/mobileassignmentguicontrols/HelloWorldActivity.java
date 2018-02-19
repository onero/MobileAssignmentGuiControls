package dk.adamino.mobileassignmentguicontrols;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import dk.adamino.mobileassignmentguicontrols.bll.ColorService;
import dk.adamino.mobileassignmentguicontrols.bll.IColorService;

public class HelloWorldActivity extends AppCompatActivity {

    private TextView mDisplayTextView;
    private ProgressBar mProgressBar;
    private RadioButton mRadioButtonOne, mRadioButtonTwo, mRadioButtonThree;
    private ToggleButton mRedToggleButton, mYellowToggleButton, mBlueToggleButton;
    private RadioGroup mRadioGroup;

    private IColorService mColorService;


    public static Intent newIntent(Context packageContext){
        Intent intent = new Intent(packageContext, HelloWorldActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        mColorService = new ColorService();
        initializeWidgets();
    }

    private void initializeWidgets(){
        mDisplayTextView = findViewById(R.id.txtDisplayOne);

        mProgressBar = findViewById(R.id.pbProgress);

        mRadioButtonOne = findViewById(R.id.rbtnValueOne);
        mRadioButtonTwo = findViewById(R.id.rbtnValueTwo);
        mRadioButtonThree = findViewById(R.id.rbtnValueThree);

        CompoundButton.OnCheckedChangeListener occl = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateDisplay();
            }
        };

        mRedToggleButton = findViewById(R.id.tbtnRed);
        mRedToggleButton.setOnCheckedChangeListener(occl);
        mYellowToggleButton = findViewById(R.id.tbtnYellow);
        mBlueToggleButton = findViewById(R.id.tbtnBlue);
    }

    private void updateDisplay(){
        if(mRedToggleButton.isChecked())
            mDisplayTextView.setBackgroundColor(Color.RED);
        else
            mDisplayTextView.setBackgroundColor(Color.WHITE);
    }
}
