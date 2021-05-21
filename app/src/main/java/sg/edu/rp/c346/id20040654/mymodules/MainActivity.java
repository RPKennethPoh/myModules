package sg.edu.rp.c346.id20040654.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnModule1;
    Button btnModule2;
    Button btnModule3;
    Button btnModule4;
    Button btnModule5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModule1 = findViewById(R.id.buttonModule1);
        btnModule2 = findViewById(R.id.buttonModule2);
        btnModule3 = findViewById(R.id.buttonModule3);
        btnModule4 = findViewById(R.id.buttonModule4);
        btnModule5 = findViewById(R.id.buttonModule5);


        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("year", 2021);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67L");
                startActivity(intent);
            }
        });

        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2021);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67L");
                startActivity(intent);
            }
        });

        btnModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", 2021);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W64G");
                startActivity(intent);
            }
        });

        btnModule4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2021);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "W67L");
                startActivity(intent);
            }
        });

        btnModule5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", 2021);
                intent.putExtra("credit", 4);
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });
    }
}