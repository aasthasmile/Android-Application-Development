package android.csulb.edu.customspinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Actress extends ActionBarActivity {

    Spinner sp;
    TextView tv;
    CustomerAdapter cs;
    int[] actressimage={R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.deepika,R.drawable.aishwarya,R.drawable.aliya};
    String[] actressNames={"-select-","Deepika Padukone","Aishwarya Rai Bachhan","Aliya Bhatt"};

    int[] actorimage={R.drawable.abc_btn_check_to_on_mtrl_015,R.drawable.ranbir,R.drawable.salman,R.drawable.hrithik};
    String[] actorName={"-select-","Ranbir Kapoor","Salman Khan" ,"Hrithik Roshan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actress);
        tv= (TextView) findViewById(R.id.textView4);
        sp= (Spinner) findViewById(R.id.spinner);

        Bundle bi=this.getIntent().getExtras();
        final String actorOrActress=bi.getString("id");

        tv.setText(actorOrActress);

        if(actorOrActress.equals("Select Actress"))
            cs= new CustomerAdapter(this, actressimage, actressNames);
        else
            cs= new CustomerAdapter(this, actorimage, actorName);

        sp.setAdapter(cs);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {
                    //Toast.makeText(getApplicationContext(), "Position"+position, Toast.LENGTH_LONG).show();
                    Intent it=new Intent(Actress.this,Movies.class);
                    it.putExtra("item",position);
                    it.putExtra("id",actorOrActress);
                    startActivity(it);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actress, menu);
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
