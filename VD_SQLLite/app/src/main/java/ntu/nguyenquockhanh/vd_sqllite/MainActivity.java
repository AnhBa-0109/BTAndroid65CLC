package ntu.nguyenquockhanh.vd_sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tạo CSDL
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
        //Tạo bảng book
        String sqlXoaBang = "DROP TABLE IF EXISTS BOOKS";
        String sqlTaoBang = "CREATE TABLE BOOKS(BookID interger PRIMARY KEY, BookName text, Page interger, Price Float, Description text)";

        db.execSQL(sqlXoaBang);
        db.execSQL(sqlTaoBang);

        db.close();
    }
}