package android.csulb.edu.customspinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class Movies extends ActionBarActivity {

    ListView lv;
    TextView tv;
    CustomerAdapter cs;

    String ar1[]={"Tamasha" ,"Yeh Jawaani Hai Deewani","Bajirao Mastani","Goliyon ki Rasleela Ramleela",
            "Piku","Cocktail","Chennai Express","Happy New Year","Love Aaj Kal","Om Shanti Om"};
    int images1[]={R.drawable.tamasha,R.drawable.yjhd,R.drawable.bm,R.drawable.gkr,
            R.drawable.piku,R.drawable.cocktail,R.drawable.chennaiexpress,R.drawable.hny,R.drawable.loveaajkal,R.drawable.oso};

    String ar2[]={"Ae dil Hai Mushkil" ,"Jazbaa","Devdas","Sarabjit","Hum Dil De Chuke Sanam"};
    int images2[]={R.drawable.adhm,R.drawable.jazba,R.drawable.devdas,R.drawable.sarabjit,R.drawable.hddcs};

    String ar3[]={"Dear Zindagi" ,"Student of the Year","Kapoor and Sons","Humpty Sharma ki Dulhania","Shaandar"};
    int images3[]={R.drawable.dearzindagi,R.drawable.studentoftheyear,R.drawable.kapoorandsons,R.drawable.hskd,
            R.drawable.shaandar};

    String ar4[]={"Ae dil Hai Mushkil" ,"Yeh Jawaani Hai Deewani","Tamasha","Humpty Sharma ki Dulhania","Shaandar"};
    int images4[]={R.drawable.adhm,R.drawable.yjhd,R.drawable.tamasha,R.drawable.hskd,
            R.drawable.shaandar};

    String ar5[]={"Hum Dil De Chuke Sanam" ,"Student of the Year","Kapoor and Sons","Humpty Sharma ki Dulhania","Shaandar"};
    int images5[]={R.drawable.hddcs,R.drawable.studentoftheyear,R.drawable.kapoorandsons,R.drawable.hskd,
            R.drawable.shaandar};

    String ar6[]={"Dear Zindagi" ,"Student of the Year","Kapoor and Sons","Humpty Sharma ki Dulhania","Shaandar"};
    int images6[]={R.drawable.dearzindagi,R.drawable.studentoftheyear,R.drawable.kapoorandsons,R.drawable.hskd,
            R.drawable.shaandar};
    int actorId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        tv = (TextView) findViewById(R.id.actressName);
        lv = (ListView) findViewById(R.id.listTop10);
        Bundle bi = this.getIntent().getExtras();
        int pos = bi.getInt("item");
        String actorOrActress = bi.getString("id");

        if (actorOrActress.equals("Select Actress")) {
            if (pos == 1) {
                tv.setText("Actress is Deepika Padukone");
                actorId=1;
                cs = new CustomerAdapter(this, images1, ar1);
            } else if (pos == 2) {
                tv.setText("Actress is Aishwarya Rai Bachhan");
                actorId=2;
                cs = new CustomerAdapter(this, images2, ar2);
            } else if (pos == 3) {
                tv.setText("Actress is Aliya Bhatt");
                actorId=3;
                cs = new CustomerAdapter(this, images3, ar3);
            }
            lv.setAdapter(cs);
        } else {
            if (pos == 1) {
                tv.setText("Actor is Ranbir Kapoor");
                actorId=4;
               cs = new CustomerAdapter(this, images4, ar4);
            } else if (pos == 2) {
                tv.setText("Actor is Salman Khan");
                actorId=5;
                cs = new CustomerAdapter(this, images5, ar5);
            } else if (pos == 3) {
                tv.setText("Actress is Hrithik Roshan");
                actorId=6;
                cs = new CustomerAdapter(this, images6, ar6);
            }
            lv.setAdapter(cs);
        }

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it=new Intent(Movies.this,MoviesDatabase.class);
                it.putExtra("actorId",actorId);
                it.putExtra("position",position);
                startActivity(it);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies, menu);
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
