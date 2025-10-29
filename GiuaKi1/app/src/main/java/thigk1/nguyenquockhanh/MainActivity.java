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

public class MainActivity extends AppCompatActivity {
    Button bt_TinhDT, bt_Vatlieu, bt_CongTrinh, bt_GioiThieu;
    void TimDK()
    {
        bt_TinhDT = findViewById(R.id.bt_tinhDT);
        bt_Vatlieu = findViewById(R.id.bt_Vatlieu);
        bt_CongTrinh = findViewById(R.id.bt_Congtrinh);
        bt_GioiThieu = findViewById(R.id.bt_Gioithieu);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();
        bt_TinhDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTinhDT = new Intent(MainActivity.this, TinhDTActivity.class);
                startActivity(iTinhDT);
            }
        });

    }
}