package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void onOperationClick(View view) {
        double bil1 = Double.parseDouble(editText1.getText().toString());
        double bil2 = Double.parseDouble(editText2.getText().toString());
        double result = 0;

        switch (view.getId()) {
            case R.id.buttonTambah:
                result = bil1 + bil2;
                break;
            case R.id.buttonKurang:
                result = bil1 - bil2;
                break;
            case R.id.buttonKali:
                result = bil1 * bil2;
                break;
            case R.id.buttonBagi:
                result = bil1 / bil2;
                break;
        }

        resultTextView.setText(String.valueOf(result));
    }
}
