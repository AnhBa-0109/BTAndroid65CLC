package thigk2.nguyenquockhanh.ontapgiuaki;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class DanhSachActivity extends AppCompatActivity {
    ListView lv_dsMon;
    ArrayList<String> dsMon = new ArrayList<String>();
    ArrayAdapter<String> dsAdapter;
    MaterialButton tv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach);
        lv_dsMon = findViewById(R.id.lv_dsMon);

        dsMon = getData();

        dsAdapter = new ArrayAdapter<>(
                this,
                R.layout.item_monhoc,
                dsMon
        );

        lv_dsMon.setAdapter(dsAdapter);

        lv_dsMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String MonDuocChon = dsAdapter.getItem(position).toString();
                Toast.makeText(DanhSachActivity.this,"Môn được chọn: " +MonDuocChon,Toast.LENGTH_LONG).show();
            }
        });
        tv_back = findViewById(R.id.tv_back2);

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(DanhSachActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }
    ArrayList<String> getData()
    {
        ArrayList<String> dsTam = new ArrayList<String>();
        dsTam.add("Tin học đại cương");
        dsTam.add("Lập trình Java");
        dsTam.add("Phát triển Ứng dụng Web 1");
        dsTam.add("Phát triển Ứng dụng Web 2");
        dsTam.add("Khai phá dữ liệu lớn");
        dsTam.add("Kinh tế chính trị");
        dsTam.add("Lập trình thiết bị di động");
        dsTam.add("Quản lý dự án phần mềm");
        dsTam.add("Tư tưởng Hồ Chí Minh");
        return dsTam;
    }
}
