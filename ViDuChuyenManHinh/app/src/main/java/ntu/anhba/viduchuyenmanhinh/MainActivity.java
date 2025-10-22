package ntu.anhba.viduchuyenmanhinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button buttonSend;
    EditText et_Input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSend = findViewById(R.id.bt_send);
        et_Input = findViewById(R.id.et_input);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code chuyển màn hình
                //Tạo Intent
                Intent iChuyen2 = new Intent(MainActivity.this, SecondActivity.class);
                String data = et_Input.getText().toString();
                if(data.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Vui Lòng Nhập Name", Toast.LENGTH_LONG).show();
                }
                else
                {
                    //Gói dữ liệu vào iChuyen2, dùng put`Extra(key,value)
                    iChuyen2.putExtra("ht", data);
                    //Kích hoạt màn hình 2
                    startActivity(iChuyen2);
                }

            }
        });
    }
}