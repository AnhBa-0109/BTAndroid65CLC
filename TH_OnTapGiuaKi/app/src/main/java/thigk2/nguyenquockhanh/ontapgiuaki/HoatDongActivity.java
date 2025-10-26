package thigk2.nguyenquockhanh.ontapgiuaki;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HoatDongActivity extends AppCompatActivity {
    HoatDongAdapter hoatdongAdapter;
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
    }

    ArrayList<HoatDong> getData(){
        ArrayList<HoatDong> dsDuLieu = new ArrayList<>();
        HoatDong hoatdong1 = new HoatDong("Hoạt động 1", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong2 = new HoatDong("Hoạt động 2", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong3 = new HoatDong("Hoạt động 3", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong4 = new HoatDong("Hoạt động 4", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        HoatDong hoatdong5 = new HoatDong("Hoạt động 5", "logo", "Intents - Fragments - RecylerView-Viewpager-Tablayout");
        dsDuLieu.add(hoatdong1);
        dsDuLieu.add(hoatdong2);
        dsDuLieu.add(hoatdong3);
        dsDuLieu.add(hoatdong4);
        dsDuLieu.add(hoatdong5);
        return dsDuLieu;
    }
}