package sg.edu.rp.c346.id20040654.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();

        tvCode.setText(String.format("Module Code: %s", intentReceived.getStringExtra("code")));
        tvName.setText(String.format("Module Name: %s", intentReceived.getStringExtra("name")));
        tvYear.setText(String.format("Academic Year: %d", intentReceived.getIntExtra("year", 2021)));
        tvSemester.setText("Semester: 1");
        tvCredit.setText(String.format("Module Credit: %d", intentReceived.getIntExtra("credit", 1)));
        tvVenue.setText(String.format("Venue: %s", intentReceived.getStringExtra("venue")));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}