package cl.vicentepc.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PasswordCallBack{

    private EditText inputEt;
    private TextView passTv;
    private Button resultBtn;
    private TextView validationTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEt = findViewById(R.id.inputEt);
        passTv = findViewById(R.id.passTv);
        resultBtn = findViewById(R.id.resultBtn);
        validationTv = findViewById(R.id.validationTv);

        resultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = inputEt.getText().toString();

                new PasswordValidator(MainActivity.this).validation(value);
            }
        });

    }

    @Override
    public void blankInput() {
        Toast.makeText(MainActivity.this, "CAMPO PASSWORD ESTÁ VACÍO", Toast.LENGTH_LONG).show();
    }

    @Override
    public void success(String value) {
        validationTv.setText(value);
    }

    @Override
    public void error(String value) {
        validationTv.setText(value);
    }
}
