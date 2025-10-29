package thigk1.nguyenquockhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class CongTrinhActivity extends AppCompatActivity {
CongTrinhAdapter congtrinhAdapter;
MaterialButton bt_back;
ArrayList<CongTrinh>listCongTrinh;
RecyclerView RecyclerviewCongTrinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_trinh);
        listCongTrinh = getData();
        RecyclerviewCongTrinh = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        RecyclerviewCongTrinh.setLayoutManager(layoutLinear);
        congtrinhAdapter = new CongTrinhAdapter(this, listCongTrinh);
        RecyclerviewCongTrinh.setAdapter(congtrinhAdapter);

        bt_back = findViewById(R.id.bt_back3);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(CongTrinhActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }
    ArrayList<CongTrinh> getData(){
        ArrayList<CongTrinh> dsDuLieu = new ArrayList<>();
        CongTrinh congtrinh1 = new CongTrinh("Công Trình 1", "29/10/2025", "pic");
        CongTrinh congtrinh2 = new CongTrinh("Công Trình 2", "29/10/2025", "pic2");
        CongTrinh congtrinh3 = new CongTrinh("Công Trình 3", "29/10/2025", "pic3");
        CongTrinh congtrinh4 = new CongTrinh("Công Trình 4", "29/10/2025", "pic4");
        CongTrinh congtrinh5 = new CongTrinh("Công Trình 5", "29/10/2025", "pic5");
        CongTrinh congtrinh6 = new CongTrinh("Công Trình 5", "29/10/2025", "pic6");
        dsDuLieu.add(congtrinh1);
        dsDuLieu.add(congtrinh2);
        dsDuLieu.add(congtrinh3);
        dsDuLieu.add(congtrinh4);
        dsDuLieu.add(congtrinh5);
        dsDuLieu.add(congtrinh6);
        return dsDuLieu;
    }
}
