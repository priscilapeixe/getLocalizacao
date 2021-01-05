package dell.ead;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txtLatitude;
    private TextView txtLogitude;
    private TextView txtCidade;
    private TextView txtEstado;
    private TextView txtPais;

    private Location location;
    private LocationManager locationManager;

    private Address endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitude =(TextView) findViewById(R.id.txtLatitude);
        txtLogitude =(TextView) findViewById(R.id.textLongitude);
        txtCidade =(TextView) findViewById(R.id.txtCidade);
        txtEstado =(TextView) findViewById(R.id.textEstado);
        txtPais =(TextView) findViewById(R.id.textPais);

        double latitude =0.0;
        double longitude =0.0;


    }

}