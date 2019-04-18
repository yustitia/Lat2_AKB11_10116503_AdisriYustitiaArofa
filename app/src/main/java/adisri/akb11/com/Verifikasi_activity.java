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

public class Verifikasi_activity extends AppCompatActivity {
    private Button verikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi_activity);
        verikasi = (Button) findViewById(R.id.btn_masukverifikasi);
        verikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verikasi =new Intent(getApplicationContext(),SendActivity.class);
                startActivity(verikasi);
            }
        });
    }
}
