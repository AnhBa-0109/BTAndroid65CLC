package thigk1.nguyenquockhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class TinhDTActivity extends AppCompatActivity {
    Button bt_tinh, bt_back;
    TextInputLayout input_cr, input_cd, output_kq;
    void TimDK()
    {
        bt_tinh = findViewById(R.id.bt_tinh);
        bt_back = findViewById(R.id.bt_back);
        input_cr = findViewById(R.id.input_cr);
        input_cd = findViewById(R.id.input_cd);
        output_kq = findViewById(R.id.input_kq);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_dtactivity);
        TimDK();
        bt_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strCR = input_cr.getEditText().getText().toString();
                String strCD = input_cd.getEditText().getText().toString();

                Double ChieuRong = Double.parseDouble(strCR);
                Double ChieuDai = Double.parseDouble(strCD);

                Double kq = ChieuDai * ChieuRong;

                String strkq = String.format("%.2f",kq);

                output_kq.getEditText().setText(strkq);
            }
        });
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(TinhDTActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }
}