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

public class SendActivity extends AppCompatActivity {
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        send = (Button)findViewById(R.id.btn_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(getApplicationContext(),FinalActivity.class);
                startActivity(send);
            }
        });
    }
}
