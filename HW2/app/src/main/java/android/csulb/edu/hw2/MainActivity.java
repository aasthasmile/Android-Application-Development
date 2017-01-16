package android.csulb.edu.hw2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ListView lv;
    int pos=0;

   // TypedArray images=getResources().obtainTypedArray(R.array.images);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.listView);

//        int img[]=new int[images.length()];
//        for(int i=0;i<images.length();i++)
//             img[i]=images.getResourceId(i,-1);
//        images.rec

        int img[]={R.drawable.giraffe,R.drawable.parrot,R.drawable.peacock,R.drawable.sumatratiger,R.drawable.turtle};
        String animals[]=getResources().getStringArray(R.array.animals);
        final int len=animals.length-1;
        CustomerAdapter cs=new CustomerAdapter(this,img,animals);
        lv.setAdapter(cs);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == len) {
                    pos = position;
                    alertDialog(position);
                } else {
                    // Toast.makeText(getApplicationContext(),"pos"+pos,Toast.LENGTH_LONG).show();
                    Intent ii = new Intent(MainActivity.this, InfoAnimal.class);
                    ii.putExtra("pos", position);
                    startActivity(ii);
                }
            }
        });
    }

    public void alertDialog(int position){
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("ALERT !!!!");
        alert.setIcon(R.drawable.abc_btn_check_to_on_mtrl_015);
        alert.setMessage("Do you want to proceed?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent it=new Intent(MainActivity.this,InfoAnimal.class);
                        it.putExtra("pos", pos);
                        Toast.makeText(getApplicationContext(),"pos"+pos,Toast.LENGTH_LONG).show();
                        startActivity(it);
                    }

                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog dialog= alert.create();
        dialog.show();
    }



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
                Intent intent = new Intent(MainActivity.this, Information.class);
                startActivity(intent);
                return true;
            }
            case R.id.uninstall: {
                Intent it = new Intent(Intent.ACTION_UNINSTALL_PACKAGE,Uri.parse("package:android.csulb.edu.hw2"));
                startActivity(it);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
