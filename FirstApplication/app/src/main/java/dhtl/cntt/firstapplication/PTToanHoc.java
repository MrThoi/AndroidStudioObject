package dhtl.cntt.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PTToanHoc extends AppCompatActivity {
    EditText edNumA, edNumB, edNumC, edNumKq, edNumDelta;
    Button btnTinh, btnSua, btnXoa, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_test);
        edNumA = findViewById(R.id.edNumA);
        edNumB = findViewById(R.id.edNumB);
        edNumC = findViewById(R.id.edNumC);
        edNumKq = findViewById(R.id.edNumKq);
        edNumDelta = findViewById(R.id.edNumDelta);
        btnTinh = findViewById(R.id.btnTinh);
        btnSua = findViewById(R.id.btnSua);
        btnXoa = findViewById(R.id.btnLamLai);
        btnThoat = findViewById(R.id.btnThoat);
        edNumKq.setEnabled(false);
    }

    public void XuLiPtB2(View view){
        double heSoA = Double.parseDouble(edNumA.getText().toString());
        double heSoB = Double.parseDouble(edNumB.getText().toString());
        double heSoC = Double.parseDouble(edNumC.getText().toString());
        double delta = (heSoB*heSoB) - (4*heSoA*heSoC) ;
        String result = Common.PTB2(heSoA, heSoB, heSoC);
//        edNumDelta.setText(""+delta);
        edNumKq.setText(result);
    }
    public void XuliLamLai(View view){
        edNumA.setText("");
        edNumB.setText("");
        edNumC.setText("");
        edNumKq.setText("");
        edNumA.requestFocus();
    }

}