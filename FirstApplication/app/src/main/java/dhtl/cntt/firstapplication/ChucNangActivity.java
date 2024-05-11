package dhtl.cntt.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNangActivity extends AppCompatActivity {
    ImageView imgPhepToan, imgPTB2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang);

        imgPhepToan = findViewById((R.id.phepToanPhoThong));
        imgPTB2 = findViewById(R.id.PTB2);
        //Xử lý sự kiện nút bấm vào hình ảnh phép toán cộng tr nhân chia cơ bản để dẫn tới
        // giao diện của <activity_pheptoan>
        imgPhepToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), PhepToan.class);
                startActivity(in);
            }
        });
        //Xử lý sự kiện nút bấm vào hình ảnh giải phương trình bậc 2 để dẫn tới
        // giao diện của <activity_test>
        imgPTB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), PTToanHoc.class);
                startActivity(in);
            }
        });

    }
}