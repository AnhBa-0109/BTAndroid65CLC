package ntu.anhba.viduchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    Button bt_Back;
    TextView tv_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Nhận về Intent
        Intent iNhanDuoc = getIntent();
        // Bóc ra
        Intent htNhanDuoc = iNhanDuoc.getStringExtra("ht");
        // Xử lý


        //Nút Back
        bt_Back = findViewById(R.id.bt_back);
        bt_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iQuayBack = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(iQuayBack);
            }
        });
    }
}