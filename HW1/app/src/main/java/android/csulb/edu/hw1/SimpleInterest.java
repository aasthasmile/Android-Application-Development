package android.csulb.edu.hw1;

import android.content.SyncStatusObserver;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class SimpleInterest extends ActionBarActivity {

    EditText amount_borrow;
    SeekBar sb_RateOfInterest;
    RadioGroup rg;
    RadioButton rb,rb2,rb3;
    Button bt;
    TextView tv;
    int RateofInterest=0;
    int loan_term=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
        amount_borrow= (EditText) findViewById(R.id.editText);
        tv= (TextView) findViewById(R.id.FifteenYears);
        rg= (RadioGroup) findViewById(R.id.group);
        rb= (RadioButton) findViewById(R.id.radioButton);
        rb2= (RadioButton) findViewById(R.id.radioButton2);
        rb3= (RadioButton) findViewById(R.id.radioButton3);
        bt= (Button) findViewById(R.id.button);

        sb_RateOfInterest= (SeekBar) findViewById(R.id.seekBar);
        sb_RateOfInterest.setProgress(10);

        sb_RateOfInterest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                RateofInterest = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton)
                    loan_term = 15;
                else if (checkedId == R.id.radioButton2)
                    loan_term = 20;
                else if (checkedId == R.id.radioButton3)
                    loan_term = 30;
            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Checking for empty Textboxes or Radiobutton
                StringBuffer sb=new StringBuffer();
                if(amount_borrow.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), sb.append("\nPlease enter loan amount"), Toast.LENGTH_LONG).show();
                }
                else if(rg.getCheckedRadioButtonId()==-1){
                    Toast.makeText(getApplicationContext(), sb.append("\nPlease select loan term(years)"), Toast.LENGTH_LONG).show();
                }

                else {
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);

                    double LoanAmount = Double.parseDouble(amount_borrow.getText().toString());
                    double monthly_interest = RateofInterest / 1200.0;
                    double taxes_insurance = (double) (0.1 * LoanAmount / 100);
                    double monthly_payment = 0;

                    if (RateofInterest != 0) {
                        if (!checkBox.isChecked())
                            taxes_insurance = 0;
                        monthly_payment = formula(LoanAmount, monthly_interest, loan_term) + taxes_insurance;
                        //Toast.makeText(getApplicationContext(), "Loan Amount: " + LoanAmount + "\nRate of Interest: " + monthly_interest + "\nLoan-Term :"
                        //        + loan_term + "\nMonthly_payment :" + monthly_payment, Toast.LENGTH_LONG).show();
                    } else {
                        if (!checkBox.isChecked())
                            taxes_insurance = 0;

                        monthly_payment = (double) (LoanAmount / loan_term * 12) + taxes_insurance;
                        //Toast.makeText(getApplicationContext(), "Loan Amount: " + LoanAmount + "\nRate of Interest: " + monthly_interest + "\nLoan-Term :"
                        //        + loan_term + "\nMonthly_payment :" + monthly_payment, Toast.LENGTH_LONG).show();

                    }
                    float installments = Float.valueOf(String.valueOf(monthly_payment));
                    tv.setText(installments + "");
                }
            }
        });
    }

    public double formula(double loanAmount,double monthly_interest,int loan_term){
        int n= loan_term*12; //number of months
        double p=loanAmount;
        double j=monthly_interest;
        double denominator=1 - Math.pow(1 + j, (-1) * n);

        return (p * (j /denominator) );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_interest, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
