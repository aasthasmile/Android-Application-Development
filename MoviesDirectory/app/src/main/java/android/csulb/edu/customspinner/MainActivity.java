package android.csulb.edu.customspinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    RadioGroup rg;
    RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= (RadioGroup) findViewById(R.id.radioGroup);
        r1= (RadioButton) findViewById(R.id.radioButton);
        r2= (RadioButton) findViewById(R.id.radioButton2);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent it=new Intent(MainActivity.this,Actress.class);
                String id=null;
                if(checkedId==R.id.radioButton)
                    id=r1.getText().toString();
                else
                   id=r2.getText().toString();

                it.putExtra("id",id);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
