package dhtl.cntt.firstapplication;

import static android.content.ContentValues.TAG;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import dhtl.cntt.firstapplication.Model.DataItem;

public class MainListViewArrayObject extends AppCompatActivity {
    ListView lvObject;
    List<DataItem> list;
    //Position of item in ListView
    int i = 0 ;
    /**
     * The view is not scrolling. Note navigating the list using the trackball counts as
     * being in the idle state since these transitions are not animated.
     */
    public static int SCROLL_STATE_IDLE = 0;

    /**
     * The user is scrolling using touch, and their finger is still on the screen
     */
    public static int SCROLL_STATE_TOUCH_SCROLL = 1;

    /**
     * The user had previously been scrolling using touch and had performed a fling. The
     * animation is now coasting to a stop
     */
    public static int SCROLL_STATE_FLING = 2;
    ArrayAdapter<DataItem> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_list_view_array_object);
        lvObject = findViewById(R.id.lvObject);

        //Tạo một danh sách để lưu các thông tin item của ListView
        list = new ArrayList<>();
        list.add(new DataItem("ax2 + bx + c = 0"));
        list.add(new DataItem("Phép toán"));
        list.add(new DataItem("Bảng cửu chương 1"));
        list.add(new DataItem("Bảng cửu chương 2"));
        list.add(new DataItem("Bảng cửu chương 3"));
        list.add(new DataItem("Bảng cửu chương 4"));
        list.add(new DataItem("Bảng cửu chương 5"));
        list.add(new DataItem("Bảng cửu chương 6"));
        list.add(new DataItem("Bảng cửu chương 7"));
        list.add(new DataItem("Bảng cửu chương 8"));
        list.add(new DataItem("Bảng cửu chương 9"));
        list.add(new DataItem("Bảng cửu chương 10"));
        list.add(new DataItem("Bảng cửu chương 11"));
        list.add(new DataItem("Bảng cửu chương 12"));
        list.add(new DataItem("Bảng cửu chương 13"));
        list.add(new DataItem("Bảng cửu chương 14"));
        list.add(new DataItem("Bảng cửu chương 15"));
        list.add(new DataItem("Bảng cửu chương 16"));
        list.add(new DataItem("Bảng cửu chương 17"));
        list.add(new DataItem("Bảng cửu chương 18"));
        list.add(new DataItem("Bảng cửu chương 19"));
        list.add(new DataItem("Bảng cửu chương 20"));


        // Gắn mảng vào adapter
        adapter = new ArrayAdapter<DataItem>(this,
                android.R.layout.simple_list_item_1, list);
        lvObject.setAdapter(adapter);

        lvObject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Intent in = new Intent(getApplicationContext(), PTToanHoc.class);
                    startActivity(in);
                }
                else if(position == 1){
                    Intent in = new Intent(getApplicationContext(), PhepToan.class);
                    startActivity(in);
                }
            }



        });
        lvObject.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                showDialogconfirm(list.get(position).getName(), position);
                return false;
            }
        });
        //Lístener cung cấp các thông tin cuộn Listview
        lvObject.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

                Log.e(TAG, "onScrollStateChanged: " + scrollState);
                if(scrollState == 1){
                    list.add(new DataItem(""+i));
                    i++;
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                Log.e(TAG, "onScroll: " + "firstVisibleItem: " + firstVisibleItem + ", visibleItemCount: " + visibleItemCount + ", totalCount: " + totalItemCount);
            }
        });
    }
    private void showDialogconfirm(String s, int position){
        //Tạo đối tượng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
//Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý xóa mục  "+s+" này không ?");
// Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                list.remove(position);
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