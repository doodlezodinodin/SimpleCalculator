package ua.nure.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View v) {
        EditText editFirst = findViewById(R.id.et_firstNum);
        EditText editSecond = findViewById(R.id.et_secondNum);
        TextView textResult = findViewById(R.id.tv_result);

        int a = Integer.parseInt(editFirst.getText().toString());
        int b = Integer.parseInt(editSecond.getText().toString());
        int res = a + b;

        textResult.setText("");
        textResult.setText(textResult.getText() + Integer.toString(res));
    }

    public void subtraction(View v) {
        EditText editFirst = findViewById(R.id.et_firstNum);
        EditText editSecond = findViewById(R.id.et_secondNum);
        TextView textResult = findViewById(R.id.tv_result);

        int a = Integer.parseInt(editFirst.getText().toString());
        int b = Integer.parseInt(editSecond.getText().toString());
        int res = a - b;

        textResult.setText("");
        textResult.setText(textResult.getText() + Integer.toString(res));
    }

    public void multiplication(View v) {
        EditText editFirst = findViewById(R.id.et_firstNum);
        EditText editSecond = findViewById(R.id.et_secondNum);
        TextView textResult = findViewById(R.id.tv_result);

        int a = Integer.parseInt(editFirst.getText().toString());
        int b = Integer.parseInt(editSecond.getText().toString());
        int res = a * b;

        textResult.setText("");
        textResult.setText(textResult.getText() + Integer.toString(res));
    }

    public void division(View v) {
        EditText editFirst = findViewById(R.id.et_firstNum);
        EditText editSecond = findViewById(R.id.et_secondNum);
        TextView textResult = findViewById(R.id.tv_result);

        int a = Integer.parseInt(editFirst.getText().toString());
        int b = Integer.parseInt(editSecond.getText().toString());
        int res = a / b;

        textResult.setText("");
        textResult.setText(textResult.getText() + Integer.toString(res));
    }
}
