package thigk2.nguyenquockhanh.ontapgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class TinhTBActivity extends AppCompatActivity {
    Button bt_tinh, bt_back;
    TextInputLayout input_gk, input_ck, output_kq;
    void TimDK()
    {
        bt_tinh = findViewById(R.id.bt_tinh);
        input_ck = findViewById(R.id.input_ck);
        input_gk = findViewById(R.id.input_gk);
        output_kq = findViewById(R.id.input_kq);
        bt_back =findViewById(R.id.bt_back);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinhtb);
        TimDK();
        bt_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strGK = input_gk.getEditText().getText().toString();
                String strCK = input_ck.getEditText().getText().toString();

                Double DiemGK = Double.parseDouble(strGK);
                Double DiemCK = Double.parseDouble(strCK);

                Double kq = (DiemGK*0.5) + (DiemCK*0.5);

                String strkq = String.format("%.2f",kq);

                output_kq.getEditText().setText(strkq);
            }
        });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(TinhTBActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });

    }
}