package org.ce1103.driverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.StringReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//
//import javax.net.ssl.HttpsURLConnection;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//import javax.xml.ws.WebServiceProvider;


public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

//        RadioButton btnTEC = (RadioButton) findViewById(R.id.btn_ITCR);
//        RadioButton btn_0 = (RadioButton) findViewById (R.id.btn_0);
//        RadioButton btn_1 = (RadioButton) findViewById (R.id.btn_1);
//        RadioButton btn_2 = (RadioButton) findViewById (R.id.btn_2);
//        RadioButton btn_3 = (RadioButton) findViewById (R.id.btn_3);
//        RadioButton btn_4 = (RadioButton) findViewById (R.id.btn_4);
//        RadioButton btn_5 = (RadioButton) findViewById (R.id.btn_5);
//        RadioButton btn_6 = (RadioButton) findViewById (R.id.btn_6);
//        RadioButton btn_7 = (RadioButton) findViewById (R.id.btn_7);
//        RadioButton btn_8 = (RadioButton) findViewById (R.id.btn_8);
//        RadioButton btn_9 = (RadioButton) findViewById (R.id.btn_9);
//        RadioButton btn_10 = (RadioButton) findViewById (R.id.btn_10);
//        RadioButton btn_11 = (RadioButton) findViewById (R.id.btn_11);
//        RadioButton btn_12 = (RadioButton) findViewById (R.id.btn_12);
//        RadioButton btn_13 = (RadioButton) findViewById (R.id.btn_13);
//        RadioButton btn_14 = (RadioButton) findViewById (R.id.btn_14);
//        RadioButton btn_15 = (RadioButton) findViewById (R.id.btn_15);
//        RadioButton btn_16 = (RadioButton) findViewById (R.id.btn_16);
//        RadioButton btn_17 = (RadioButton) findViewById (R.id.btn_17);
//        RadioButton btn_18 = (RadioButton) findViewById (R.id.btn_18);
//        RadioButton btn_19 = (RadioButton) findViewById (R.id.btn_19);
//        RadioButton btn_20 = (RadioButton) findViewById (R.id.btn_20);
//        RadioButton btn_21 = (RadioButton) findViewById (R.id.btn_21);
//        RadioButton btn_22 = (RadioButton) findViewById (R.id.btn_22);
//        RadioButton btn_23 = (RadioButton) findViewById (R.id.btn_23);
//        RadioButton btn_24 = (RadioButton) findViewById (R.id.btn_24);
//        RadioButton btn_25 = (RadioButton) findViewById (R.id.btn_25);
//        RadioButton btn_26 = (RadioButton) findViewById (R.id.btn_26);
//        RadioButton btn_27 = (RadioButton) findViewById (R.id.btn_27);
//        RadioButton btn_28 = (RadioButton) findViewById (R.id.btn_28);
//        RadioButton btn_29 = (RadioButton) findViewById (R.id.btn_29);
//        RadioButton btn_30 = (RadioButton) findViewById (R.id.btn_30);



    }

    public void portList(){

    }
    public void getSortedList(){

    }
    public void clientSort(){

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.btn_0:
                if (checked)
                    Toast.makeText(this, "Pasó por Cartago", Toast.LENGTH_LONG).show();
                    break;
            case R.id.btn_1:
                if (checked)
                    Toast.makeText(this, "Pasó por Santa María", Toast.LENGTH_LONG).show();
                    break;
        }
    }

}
