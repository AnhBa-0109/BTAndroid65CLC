package ntu.anhba.tinhtong2so;

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
    EditText edSo1, edSo2;
    TextView tvKetQua;
    Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2 Link biến java với id tương ứng
        edSo1 = findViewById(R.id.edit1);
        edSo2 = findViewById(R.id.edit2);
        tvKetQua = findViewById(R.id.tvKetqua);
        btnTinh = findViewById(R.id.btnTinh);
    }
    public void HamTinhTong(View v)
    {
        String strSo1 = edSo1.getText().toString();
        String strSo2 = edSo2.getText().toString();
        int soA = Integer.parseInt(strSo1);
        int soB = Integer.parseInt(strSo2);

        int Tong = soA + soB;

        String strTong = String.valueOf(Tong);
        
        tvKetQua.setText(strTong);
    }
}