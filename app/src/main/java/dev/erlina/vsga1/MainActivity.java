package dev.erlina.vsga1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String name = null;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu_logout){
            finish();
        } else if (item.getItemId()==R.id.menu_settings) {
            startActivity(new Intent(this, DetailActivity.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputOne = findViewById(R.id.inputOne);
        EditText inputTwo = findViewById(R.id.inputTwo);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonBersihkan = findViewById(R.id.buttonBersihkan);

        TextView tvHasil = findViewById(R.id.tvHasil);


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputTwo.getText().toString().equals("") && !inputOne.getText().toString().equals("")) {
                    int angkaPertama = Integer.parseInt(inputOne.getText().toString());
                    int angkaKedua = Integer.parseInt(inputTwo.getText().toString());

                    int hasil = angkaPertama + angkaKedua;

                    tvHasil.setText(String.format("%d", hasil));
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputTwo.getText().toString().equals("") && !inputOne.getText().toString().equals("")) {
                    int angkaPertama = Integer.parseInt(inputOne.getText().toString());
                    int angkaKedua = Integer.parseInt(inputTwo.getText().toString());

                    int hasil = angkaPertama - angkaKedua;

                    tvHasil.setText(String.format("%d", hasil));
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputTwo.getText().toString().equals("") && !inputOne.getText().toString().equals("")) {
                    int angkaPertama = Integer.parseInt(inputOne.getText().toString());
                    int angkaKedua = Integer.parseInt(inputTwo.getText().toString());

                    int hasil = angkaPertama / angkaKedua;

                    tvHasil.setText(String.format("%d", hasil));
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputTwo.getText().toString().equals("") && !inputOne.getText().toString().equals("")) {
                    int angkaPertama = Integer.parseInt(inputOne.getText().toString());
                    int angkaKedua = Integer.parseInt(inputTwo.getText().toString());

                    int hasil = angkaPertama * angkaKedua;

                    tvHasil.setText(String.format("%d", hasil));
                }
            }
        });

        buttonBersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTwo.setText("");
                inputOne.setText("");
            }
        });
    }


}