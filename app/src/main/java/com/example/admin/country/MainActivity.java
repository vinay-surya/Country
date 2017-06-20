package com.example.admin.country;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    String[] countryNames={ "India(+91)","Australia(+61)", "Bangladesh(+880)", "Belgium(+32)", "Brazil(+55)",
            "Cannada(+1)", "China(+86)", "Costarica(+506)", "Denmark(+45)", "Egypt(+20)",
                            "France(+33)", "Germany(+49)","Hongkong(+852)", "Japan(+81)","New Zealand(+64)",
            "Russia(+7)", "Singapore(+65)",
                           "SouthAfrica(+27)", "SouthKorea(+82)", "Switzerland(+41)", "UK(+44)", "USA(+1)"};
    int flags[] = { R.drawable.india, R.drawable.australia, R.drawable.bangladesh, R.drawable.belgium, R.drawable.brazil, R.drawable.canada,
           R.drawable.costarica, R.drawable.denmark, R.drawable.egypt, R.drawable.france,
            R.drawable.germany, R.drawable.hongkong, R.drawable.japan, R.drawable.newzealand,
            R.drawable.russia, R.drawable.singapore, R.drawable.southafrica, R.drawable.southkorea, R.drawable.switzerland,
            R.drawable.uk, R.drawable.usa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.simpleSpinner);
        spin.setOnItemSelectedListener(this);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),flags,countryNames);
        spin.setAdapter(customAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
