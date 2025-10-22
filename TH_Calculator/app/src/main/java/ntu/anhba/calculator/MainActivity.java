package ntu.anhba.calculator;

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
    EditText edit1, edit2;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        tvKetQua = findViewById(R.id.tvKetqua);
    }
    public void HamTinhTong(View view)
    {
        String strSoA = edit1.getText().toString();
        String strSoB = edit2.getText().toString();

        double SoA = Double.parseDouble(strSoA);
        double SoB = Double.parseDouble(strSoB);

        double Tong = SoA + SoB;

        String strTong = String.valueOf(Tong);

        tvKetQua.setText(strTong);
    }

    public void HamTinhTru(View view)
    {
        String strSoA = edit1.getText().toString();
        String strSoB = edit2.getText().toString();

        double SoA = Double.parseDouble(strSoA);
        double SoB = Double.parseDouble(strSoB);

        double Tong = SoA - SoB;

        String strTong = String.valueOf(Tong);

        tvKetQua.setText(strTong);
    }

    public void HamTinhNhan(View view)
    {
        String strSoA = edit1.getText().toString();
        String strSoB = edit2.getText().toString();

        double SoA = Double.parseDouble(strSoA);
        double SoB = Double.parseDouble(strSoB);

        double Tong = SoA * SoB;

        String strTong = String.valueOf(Tong);

        tvKetQua.setText(strTong);
    }

    public void HamTinhChia(View view)
    {
        String strSoA = edit1.getText().toString();
        String strSoB = edit2.getText().toString();

        double SoA = Double.parseDouble(strSoA);
        double SoB = Double.parseDouble(strSoB);

        double Tong = SoA / SoB;

        String strTong = String.valueOf(Tong);

        tvKetQua.setText(strTong);
    }
}