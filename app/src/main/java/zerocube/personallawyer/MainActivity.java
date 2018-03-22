package zerocube.personallawyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		//Toast here...
        int b=3;
        Toast.makeText(this, "B:"+b, Toast.LENGTH_SHORT).show();
    }
}
