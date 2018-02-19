package dk.adamino.mobileassignmentguicontrols;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Mathias on 19/02/2018.
 */

public class GreenActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2, spinner3;
    private NumberPicker numberPicker1, numberPicker2, numberPicker3;
    private Button btnSolve;
    private TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        setupSpinners();
        setupNumberPickers();
        setupResult();
    }

    private void setupResult() {
        btnSolve = findViewById(R.id.btnSolve);
        txtResult = findViewById(R.id.txtResult);
    }

    private void setupNumberPickers() {
        numberPicker1 = findViewById(R.id.numberPicker1);
        numberPicker2 = findViewById(R.id.numberPicker2);
        numberPicker3 = findViewById(R.id.numberPicker3);
    }

    private void setupSpinners() {
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);

    }


}
