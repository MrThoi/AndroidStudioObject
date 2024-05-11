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

public class PhepToan extends AppCompatActivity {
    Button btnCong, btnTru, btnNhan, btnChia;
    EditText edNumA, edNumB, edNumKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pheptoan);
        edNumA = findViewById(R.id.edNumA);
        edNumB = findViewById(R.id.edNumB);
        edNumKq = findViewById(R.id.edNumKq);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        edNumKq.setEnabled(false);
    }
    public void PhepCong(View view){
        float soA = Float.parseFloat(edNumA.getText().toString());
        float soB = Float.parseFloat(edNumB.getText().toString());
        String result = Common.XuliCong(soA, soB);
        edNumKq.setText(result);
    }
    public void PhepTru(View view){
        float soA = Float.parseFloat(edNumA.getText().toString());
        float soB = Float.parseFloat(edNumB.getText().toString());
        String result = Common.XuliTru(soA, soB);
        edNumKq.setText(result);
    }
    public void PhepNhan(View view){
        float soA = Float.parseFloat(edNumA.getText().toString());
        float soB = Float.parseFloat(edNumB.getText().toString());
        String result = Common.XuliNhan(soA, soB);
        edNumKq.setText(result);
    }
    public void PhepChia(View view){
        float soA = Float.parseFloat(edNumA.getText().toString());
        float soB = Float.parseFloat(edNumB.getText().toString());
        String result = Common.XuliChia(soA, soB);
        edNumKq.setText(result);
    }
}