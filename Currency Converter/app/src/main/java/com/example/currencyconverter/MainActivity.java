package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText txt_Amount,txt_Value;
    Button btn_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.cb_dev1);
        sp2 = findViewById(R.id.cb_dev2);
        txt_Amount = findViewById(R.id.t_montant);
        txt_Value = findViewById(R.id.t_val);
        btn_val = findViewById(R.id.b_convertire);

        String[] cur = {"USD","EUR","MAD"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,cur);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);

        btn_val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tot;

                double amount = Double.parseDouble(txt_Amount.getText().toString());

                if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("EUR")){
                    tot = amount * 0.85;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("MAD")){
                    tot = amount * 9.55;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("USD")){
                    tot = amount * 1.18;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("MAD")){
                    tot = amount * 11.32;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("MAD") && sp2.getSelectedItem().toString().equals("USD")){
                    tot = amount * 0.10;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("MAD") && sp2.getSelectedItem().toString().equals("EUR")){
                    tot = amount * 0.09;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("MAD") && sp2.getSelectedItem().toString().equals("MAD")){
                    tot = amount * 1;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("USD") && sp2.getSelectedItem().toString().equals("USD")){
                    tot = amount * 1;
                    txt_Value.setText(String.valueOf(tot));
                }
                else if (sp1.getSelectedItem().toString().equals("EUR") && sp2.getSelectedItem().toString().equals("EUR")){
                    tot = amount * 1;
                    txt_Value.setText(String.valueOf(tot));
                }
            }
        });
    }
}