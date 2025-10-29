package thigk1.nguyenquockhanh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class VatLieuActivity extends AppCompatActivity {
    ListView lv_vatlieu;
    ArrayList<String> dsVatlieu = new ArrayList<>();
    ArrayAdapter<String> adapter;

    MaterialButton bt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vat_lieu);
        lv_vatlieu = findViewById(R.id.lv_vatlieu);
        dsVatlieu = getData();
        adapter =new ArrayAdapter<>(
                this,
                R.layout.item_vatlieu,
                dsVatlieu
        );

        lv_vatlieu.setAdapter(adapter);

        lv_vatlieu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String VatLieuDuocChon = adapter.getItem(position).toString();
                Toast.makeText(VatLieuActivity.this, VatLieuDuocChon,Toast.LENGTH_LONG).show();
            }
        });
        bt_back = findViewById(R.id.bt_back2);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(VatLieuActivity.this, MainActivity.class);
                startActivity(iBack);
            }
        });
    }
    ArrayList<String> getData()
    {
        ArrayList<String> dsTam = new ArrayList<String>();
        dsTam.add("Xi măng");
        dsTam.add("Gạch");
        dsTam.add("Đá ốp lát");
        dsTam.add("Ống nhựa");
        dsTam.add("Sơn chống thấm");
        return dsTam;
    }
}