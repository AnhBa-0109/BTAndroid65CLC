package ntu.nguyenquockhanh.vd_sqllite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
        ArrayList<String> dsTenSach = getBookName();
        //Hiện lên listView
        ListView listView = findViewById(R.id.lvDanhSachTenSach);
        ArrayAdapter<String> adapterTenSach = new ArrayAdapter<String>(MainActivity.this
                , android.R.layout.simple_list_item_1
                , dsTenSach);
        listView.setAdapter(adapterTenSach);

        Button bThem = findViewById(R.id.btnThemSach);
        bThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lấy dữ liệu
                EditText edTenSach = findViewById(R.id.edtTenSach);
                String tenSach = edTenSach.getText().toString();

                EditText edGiaBan = findViewById(R.id.edtGiaBan);
                String sGia = edGiaBan.getText().toString().trim();
                if (sGia.isEmpty()) {
                    edGiaBan.setError("Bạn chưa nhập giá");
                    return;
                }
                float giaBan = Float.parseFloat(sGia);
                //Thêm vào DB
                ContentValues row = new ContentValues();
                row.put("BookName", tenSach);
                row.put("Price", giaBan);
                db.insert("BOOKS", null, row);
                //refresh lại ListView
                dsTenSach.add(tenSach);
                adapterTenSach.notifyDataSetChanged();
            }
        });
    }
    ArrayList<BOOKS> getBookData()
    {
        //Truy vấn
        String sqlSelectAll = "SELECT * FROM BOOKS";
        Cursor resultSet = db.rawQuery(sqlSelectAll, null);
        ArrayList<BOOKS> dsSach = new ArrayList<BOOKS>();
        resultSet.moveToFirst();
        while(true)
        {
            //Lấy dữ liệu của dòng/bản ghi hiện tại, trỏ bởi resultSet
            int maSach = resultSet.getInt(0);
            String tenSach = resultSet.getString(1);
            int soTrang = resultSet.getInt(2);
            float giaBan = resultSet.getFloat(3);
            String moTa = resultSet.getString(4);
            //Gói vào 1 đối tượng ==> tạo một lớp
            BOOKS book = new BOOKS(maSach,tenSach,soTrang,giaBan,moTa);
            //Thêm vào biến danh sách
            //Dùng ArrayList để chứa tên Sách
            dsSach.add(book);
            //Di chuyển đến bản ghi tiếp theo, nếu đã hết thì thoát khỏi vòng lặp
            if (resultSet.moveToNext() == false) break;
        }
        return dsSach;
    }
    ArrayList<String> getBookName()
    {
        String sqlSelectAll = "SELECT * FROM BOOKS";
        Cursor resultSet = db.rawQuery(sqlSelectAll, null);
        ArrayList<String> dsTenSach = new ArrayList<String>();
        resultSet.moveToFirst();
        while(true)
        {
            int maSach = resultSet.getInt(0);
            String tenSach = resultSet.getString(1);
            dsTenSach.add(tenSach);
            if (resultSet.moveToNext() == false) break;
        }
        //Test
        return dsTenSach;
    }
}