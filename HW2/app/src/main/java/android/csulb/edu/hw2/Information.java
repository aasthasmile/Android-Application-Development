package android.csulb.edu.hw2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Information extends ActionBarActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        bt= (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Intent.ACTION_CALL, Uri.parse("tel:+91" + bt.getText().toString()));
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.custom_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.information: {
                Intent intent = new Intent(Information.this, Information.class);
                startActivity(intent);
                return true;
            }
            case R.id.uninstall: {
                Intent it = new Intent(Intent.ACTION_UNINSTALL_PACKAGE, Uri.parse("package:android.csulb.edu.hw2"));
                startActivity(it);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
