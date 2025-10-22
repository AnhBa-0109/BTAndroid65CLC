package ntu.anhba.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText unit1, unit2;
    Button btn_convert;

    void link(){
        unit1 = findViewById(R.id.et_unit1);
        unit2 = findViewById(R.id.et_unit2);
        btn_convert = findViewById(R.id.btn_convert);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link();
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUnit1 = unit1.getText().toString();

                double money1 = Double.parseDouble(strUnit1);

                double result = money1 * 25000;

                String strResult = String.valueOf(result);
                unit2.setText(strResult);
            }
        });

    }
}