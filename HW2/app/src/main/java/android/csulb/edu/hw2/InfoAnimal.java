package android.csulb.edu.hw2;

import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


public class InfoAnimal extends ActionBarActivity {

    TextView tv3;
    ImageView iv;
    EditText tv5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_animal);
        tv3= (TextView) findViewById(R.id.textView3);
        tv5= (EditText) findViewById(R.id.edittext5);
        iv= (ImageView) findViewById(R.id.imageView2);

        Bundle bi=this.getIntent().getExtras();
        int pos=bi.getInt("pos");
        String animals[]=getResources().getStringArray(R.array.animals);
        String information[]=getResources().getStringArray(R.array.infoanimal);
        TypedArray images=getResources().obtainTypedArray(R.array.images);

        tv3.setText(animals[pos].toString());
        iv.setImageResource(images.getResourceId(pos,-1));
        tv5.setText(information[pos].toString());


    }

//    public void openZooInformation(){
//        Intent intent=new Intent(InfoAnimal.this,Information.class);
//        startActivity(intent);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.custom_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.information: {
                Intent intent = new Intent(InfoAnimal.this, Information.class);
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
