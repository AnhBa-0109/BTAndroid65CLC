package thigk2.nguyenquockhanh.ontapgiuaki;

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
    Button bt_TinhTB, bt_DsMon, bt_hdTruong, bt_Aboutme;
    void TimDk()
    {
        bt_TinhTB = findViewById(R.id.bt_tinhTB);
        bt_DsMon = findViewById(R.id.bt_dsMon);
        bt_hdTruong = findViewById(R.id.bt_hdTruong);
        bt_Aboutme = findViewById(R.id.bt_aboutMe);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDk();
        bt_TinhTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iTinhTB = new Intent(MainActivity.this, TinhTBActivity.class);
                startActivity(iTinhTB);
            }
        });
    }
}