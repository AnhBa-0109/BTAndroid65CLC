package thigk2.nguyenquockhanh.ontapgiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class HoatDongActivity extends AppCompatActivity {
    HoatDongAdapter hoatdongAdapter;
    MaterialButton tv_back;
    ArrayList<HoatDong> listHoatDong;
    RecyclerView RecyclerViewHoatDong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoat_dong);
        listHoatDong = getData();
        RecyclerViewHoatDong = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        RecyclerViewHoatDong.setLayoutManager(layoutLinear);
        hoatdongAdapter = new HoatDongAdapter(this, listHoatDong);
        RecyclerViewHoatDong.setAdapter(hoatdongAdapter);

        tv_back = findViewById(R.id.tv_back3);

        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(HoatDongActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }

    ArrayList<HoatDong> getData(){
        ArrayList<HoatDong> dsDuLieu = new ArrayList<>();
        HoatDong hoatdong1 = new HoatDong("Tham gia chuyến đi Ấn Độ", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong2 = new HoatDong("Hoạt động 2", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong3 = new HoatDong("Hoạt động 3", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong4 = new HoatDong("Hoạt động 4", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong5 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong6 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong7 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong8 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong9 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong10 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        dsDuLieu.add(hoatdong1);
        dsDuLieu.add(hoatdong2);
        dsDuLieu.add(hoatdong3);
        dsDuLieu.add(hoatdong4);
        dsDuLieu.add(hoatdong5);
        dsDuLieu.add(hoatdong6);
        dsDuLieu.add(hoatdong7);
        dsDuLieu.add(hoatdong8);
        dsDuLieu.add(hoatdong9);
        dsDuLieu.add(hoatdong10);
        return dsDuLieu;
    }
}