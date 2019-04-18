package adisri.akb11.com;
/*
 * tanggal : 17 april 2019
 * 10116503
 * Adisri Yustitia Arofa
 * AKB-11/IF-11
 *
 *
 * */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class daftar_activity extends AppCompatActivity {
    private Button daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_activity);
        daftar =(Button) findViewById(R.id.btn_masukverifikasi);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(getApplicationContext(),Verifikasi_activity.class);
                startActivity(daftar);
            }
        });
    }
}
