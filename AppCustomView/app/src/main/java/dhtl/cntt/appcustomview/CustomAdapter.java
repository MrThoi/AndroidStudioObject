package dhtl.cntt.appcustomview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

import dhtl.cntt.appcustomview.Model.SinhVien;

public class CustomAdapter extends ArrayAdapter<SinhVien> {
    private ArrayList<SinhVien> arrsv;
    private final Activity context;
    public CustomAdapter(Activity context, ArrayList<SinhVien> arrsv) {
        super(context, R.layout.item_sv,arrsv);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.arrsv=arrsv;

    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item_sv, null, true);
        SinhVien sv = arrsv.get(position);
        Log.d("masv", sv.getMasv());
        TextView txtMaSv = (TextView) rowView.findViewById(R.id.edMaSv);
        TextView txtTenSv = (TextView)rowView.findViewById(R.id.edTenSv);
        TextView txtGtSv = (TextView)rowView.findViewById(R.id.edGt);
        ImageView imgSv = (ImageView) rowView.findViewById(R.id.imgSv);
        txtMaSv.setText(arrsv.get(position).getMasv());
        txtTenSv.setText(arrsv.get(position).getTensv());
        txtGtSv.setText(arrsv.get(position).getGt());
        imgSv.setImageResource(sv.getHinhanh());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("POSITION", "" + position);
            }
        });
        return rowView;
    }
}
