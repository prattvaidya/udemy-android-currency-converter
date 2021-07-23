package ttt.prattvaidya.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleConvert(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String amountInCAD = editText.getText().toString();
        double amtCAD = Double.parseDouble(amountInCAD);
        double amtUSD = amtCAD * 0.8;
//        String amountInUSD = Double.toString(amtUSD);
        String amountInUSD = String.format("%.2f",amtUSD);
        Toast.makeText(this, "Amount in USD: " + amountInUSD, Toast.LENGTH_SHORT).show();
        Log.i("action", "Amount in USD: " + amountInUSD);
    }
}