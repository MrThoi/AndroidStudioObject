package dhtl.cntt.appcustomview;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import dhtl.cntt.appcustomview.Model.SinhVien;

public class MainActivity extends AppCompatActivity {
    ListView lvSV;
    Integer[] imgId = {
            R.drawable.avt1,
            R.drawable.avt2,
            R.drawable.avt3,
            R.drawable.avt4,
            R.drawable.avt5
    };
    ArrayList<SinhVien> arrSv;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lvSV = findViewById(R.id.lvSv);
        arrSv = new ArrayList<>();
        arrSv.add(new SinhVien( "0001", "Thoai1", "Nam", imgId[0]));
        arrSv.add(new SinhVien("0002", "Thoai2", "Nam", imgId[1]));
        arrSv.add(new SinhVien("0003", "Thoai3", "Nam", imgId[2]));
        arrSv.add(new SinhVien("0004", "Thoai4", "Nam", imgId[3]));
        arrSv.add(new SinhVien("0005", "Thoai5", "Nam", imgId[4]));
        adapter = new CustomAdapter(this, arrSv);
        lvSV.setAdapter(adapter);

        lvSV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.d("MainActivityPOSITION", "" + position);
            }
        });
        lvSV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                showDialogconfirm(arrSv.get(position).getMasv(), position);
                return false;
            }
        });

    }
    private void showDialogconfirm(String s, int position){
        //Tạo đối tượng
        androidx.appcompat.app.AlertDialog.Builder b = new androidx.appcompat.app.AlertDialog.Builder(this);
//Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý xóa mục với mã  "+s+" này không ?");
// Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                arrSv.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
//Nút Cancel
        b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
//Tạo dialog
        AlertDialog al = b.create();
//Hiển thị
        al.show();
    }
}