package com.example.less02krfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView taskApp;
    EditText textRead;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskApp = findViewById(R.id.tv_task_app);
        textRead = findViewById(R.id.et_text_listener);
        button = findViewById(R.id.b_button);
        result = findViewById(R.id.tv_result);

        TransformData transform = new TransformData();
        Logic logic = new Logic();
        View.OnClickListener listener = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    Entity entity = transform.stringToInts(textRead.getText().toString());
                    result.setText(logic.howManyRootsHaveEquation(entity));
                } catch (ArithmeticException e) {
                    textRead.setText("неправильный формат");
                } catch (IndexOutOfBoundsException e) {
                    textRead.setText("Неверное количество переменных");
                }catch (NumberFormatException e){textRead.setText("NumberFormatException");}
            }
        };
        button.setOnClickListener(listener);
    }
}