package dk.adamino.mobileassignmentguicontrols;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import dk.adamino.mobileassignmentguicontrols.bll.ColorService;
import dk.adamino.mobileassignmentguicontrols.bll.IColorService;

public class HelloWorldActivity extends AppCompatActivity {

    private final int SQUARE_IMAGE_RES_ID = android.R.drawable.alert_light_frame;
    private final int BAR_IMAGE_RES_ID = android.R.drawable.bottom_bar;
    private final int STAR_RES_ID = android.R.drawable.star_big_off;

    private ProgressBar mProgressBar;
    private RadioButton mSquareRadioButton, mBarRadioButton, mStarRadioButton;
    private ToggleButton mRedToggleButton, mYellowToggleButton, mBlueToggleButton;
    private ImageView mDisplayImageView;

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
        initializeRadioButtons();
        initializeToggleButtons();
        updateDisplay();
    }

    private void initializeWidgets(){
        mDisplayImageView = findViewById(R.id.ivDisplay);

        mProgressBar = findViewById(R.id.pbProgress);
    }

    private void initializeRadioButtons(){
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setImageResId(v);
            }
        };

        mSquareRadioButton = findViewById(R.id.rbtnSquare);
        mSquareRadioButton.setOnClickListener(ocl);

        mBarRadioButton = findViewById(R.id.rbtnBar);
        mBarRadioButton.setOnClickListener(ocl);

        mStarRadioButton = findViewById(R.id.rbtnStar);
        mStarRadioButton.setOnClickListener(ocl);
    }

    private void initializeToggleButtons(){
        CompoundButton.OnCheckedChangeListener occl = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateDisplay();
            }
        };

        mRedToggleButton = findViewById(R.id.tbtnRed);
        mRedToggleButton.setOnCheckedChangeListener(occl);

        mYellowToggleButton = findViewById(R.id.tbtnYellow);
        mYellowToggleButton.setOnCheckedChangeListener(occl);

        mBlueToggleButton = findViewById(R.id.tbtnBlue);
        mBlueToggleButton.setOnCheckedChangeListener(occl);
    }

    private void updateDisplay(){
        int color = getResources().getColor(mColorService.getColor(
                mRedToggleButton.isChecked(),
                mYellowToggleButton.isChecked(),
                mBlueToggleButton.isChecked()));
        mDisplayImageView.setColorFilter(color);
    }

    private void setImageResId(View view){
        RadioButton radio = (RadioButton) view;
        int id = radio.getId();
        switch (id){
            case R.id.rbtnSquare:{
                mDisplayImageView.setImageResource(SQUARE_IMAGE_RES_ID);
                break;
            }
            case R.id.rbtnBar:{
                mDisplayImageView.setImageResource(BAR_IMAGE_RES_ID);
                break;
            }
            case R.id.rbtnStar:{
                mDisplayImageView.setImageResource(STAR_RES_ID);
                break;
            }
        }
    }
}
