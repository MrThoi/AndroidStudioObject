package dhtl.cntt.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Common extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_test);

    }

    public static String PTB1(double A, double B){

        if (A == 0){
            if (B == 0) {
                return "PTVSN";
            }

            else {
                return "PTVN";
            }
        }
            return "x= "+ (-B/A);
    }
    public  static String PTB2(double A, double B, double C)
    {

        if (A == 0){
            PTB1(B, C);
        }
            double d = (B*B) - (4*A*C);
            double delta = Math.sqrt(d);

            if (d == 0.0){
                return "PT co nghiem kep: x1=x2=" + (-B/(2*A));

            }
            else if(d < 0){
                return "PTVN";
            }

                double x1 = (-B + delta) / (2 * A);
                double x2 = (-B - delta) / (2 * A);
                return "x1= "+ x1 + "   x2= "+ x2;

    }
    public static String XuliCong(double A, double B){
        return "" + (A+B);
    }
    public static String XuliTru(double A, double B){
        return "" + (A-B);
    }
    public static String XuliNhan(double A, double B){
        return "" + (A*B);
    }
    public static String XuliChia(double A, double B){
        return "" + (A/B);
    }

}