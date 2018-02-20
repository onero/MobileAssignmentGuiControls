package dk.adamino.mobileassignmentguicontrols;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;

import dk.adamino.mobileassignmentguicontrols.bll.GreenBLL;
import dk.adamino.mobileassignmentguicontrols.model.GreenModel;

/**
 * Created by Mathias on 19/02/2018.
 */

public class GreenActivity extends AppCompatActivity {

    private GreenModel model;
    private GreenBLL bll;

    private Spinner spinner1, spinner2, spinner3;
    private NumberPicker numberPicker1, numberPicker2, numberPicker3;
    private Button btnSolve;
    private TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green);

        instantiateExternalClasses();

        setupSpinners();
        setupNumberPickers();
        setupResult();
    }

    private void instantiateExternalClasses() {
        model = new GreenModel();
        bll = new GreenBLL();
    }

    private void setupResult() {
        btnSolve = findViewById(R.id.btnSolve);
        btnSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resultValue1 = spinner1.getSelectedItem().toString();
                String resultValue2 = spinner2.getSelectedItem().toString();
                String resultValue3 = spinner3.getSelectedItem().toString();
                int resultValue4 = numberPicker1.getValue();
                int resultValue5 = numberPicker2.getValue();
                int resultValue6 = numberPicker3.getValue();

                boolean result = bll.getAnswer(resultValue1, resultValue2, resultValue3, resultValue4, resultValue5, resultValue6);
                if (result) {
                    txtResult.setText("Correct!");
                    txtResult.setBackgroundResource(R.color.adaminoGreen);
                } else {
                    txtResult.setText("False!");
                    txtResult.setBackgroundResource(R.color.adaminoRed);
                }
            }
        });
        txtResult = findViewById(R.id.txtResult);
    }

    private void setupNumberPickers() {
        numberPicker1 = findViewById(R.id.numberPicker1);
        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(9);
        numberPicker2 = findViewById(R.id.numberPicker2);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(9);
        numberPicker3 = findViewById(R.id.numberPicker3);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(9);
    }

    private void setupSpinners() {
        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, model.getWeekDayList());
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, model.getMonthList());
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, model.getYearList());
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
    }


}
