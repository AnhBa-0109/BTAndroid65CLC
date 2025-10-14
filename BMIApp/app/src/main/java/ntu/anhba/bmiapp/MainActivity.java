package ntu.anhba.bmiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    TextView tv_result, tv_status;
    Button btn_calcu;

    void Link(){
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        tv_result = findViewById(R.id.tv_result);
        tv_status = findViewById(R.id.tv_status);
        btn_calcu = findViewById(R.id.btn_calcu);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Link();
        btn_calcu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double result;
                String strWeight = weight.getText().toString();
                String strHeight = height.getText().toString();

                double NWeight = Double.parseDouble(strWeight);
                double NHeight = Double.parseDouble(strHeight);


                result = NWeight / (convert(NHeight) * convert(NHeight));

                String strResult = String.format("%.2f", result);
                String strStatus = printResult(result);
                tv_status.setText(strStatus);
                tv_result.setText(strResult);
            }
        });
    }

    double convert(double num){
        return num * 0.01;
    }
    String printResult(double num)
    {
        String status = "";
        if(num < 18.5) status = "Gầy";
        else if(18.5 <= num && num < 25 ) status = "Bình thường";
        else if (25 <= num && num < 30) status = "Thừa cân";
        else status = "Béo phì";
        return status;
    }

}