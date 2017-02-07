package css.cis3334.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBill;
    EditText etNumberPeople;
    TextView tvTotalTip;
    TextView tvTipPerPerson;
    CheckBox cbService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBill = (EditText)findViewById(R.id.editTextBill);
        etNumberPeople = (EditText) findViewById(R.id.editTextNumberPeople);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTotalTip);
        cbService = (CheckBox) findViewById(R.id.checkBoxService);


    }


    public void onClickButtonCalc(View view) {
        Double bill = Double.parseDouble(etBill.getText().toString());
        Double numPeople = Double.parseDouble(etNumberPeople.getText().toString());
        Double totalTip;                //have to declare outside if-than

        if (cbService.isChecked()) {
            totalTip = bill * 0.2;
        }else {

            totalTip = bill * 0.1;

        }
        Double tipPerPerson = totalTip / numPeople;

        tvTipPerPerson.setText("Tip Per Person: "+ tipPerPerson.toString());
        tvTotalTip.setText("Total Bill: "+ etBill.getText());
    }
}
