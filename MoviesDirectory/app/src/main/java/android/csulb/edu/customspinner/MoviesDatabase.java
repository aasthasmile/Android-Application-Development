package android.csulb.edu.customspinner;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MoviesDatabase extends ActionBarActivity {

    TextView tv;
    ImageView iv;
    TextView et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_database);
        tv= (TextView) findViewById(R.id.textView5);
        iv= (ImageView) findViewById(R.id.imageView3);
        et= (TextView) findViewById(R.id.textView7);
        Bundle bi=this.getIntent().getExtras();

        int actorId=bi.getInt("actorId");
        int pos=bi.getInt("position");

        String movieName=null;
        int imageId=0;
        String movieInfo=null;

       // Toast.makeText(getApplicationContext(), "Position" + actorId+"pos "+pos, Toast.LENGTH_LONG).show();

       if(actorId==1){
           switch (pos){
               case 0: {
                   movieName="Tamasha";
                   imageId=R.drawable.tamasha;
                   movieInfo="Ved and Tara meet in Corsica, where their mingling on the condition of anonymity makes cupid strike. Once back in Delhi, Tara must deal with a new Ved who embarks on a journey to find his true self.";
                   break;
               }
               case 1: {
                   movieName="Yeh_Jawaani_Hai_Deewani";
                   imageId=R.drawable.yjhd;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Bajirao_Mastani";
                   imageId=R.drawable.bm;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Goliyon_ki_Rasleela_Ramleela";
                   imageId=R.drawable.gkr;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Piku";
                   imageId=R.drawable.piku;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }
        else if(actorId==2){
           switch (pos){
               case 0: {
                   movieName="Ae dil Hai Mushkil";
                   imageId=R.drawable.adhm;
                   movieInfo="Ved and Tara meet in Corsica, where their mingling on the condition of anonymity makes cupid strike. Once back in Delhi, Tara must deal with a new Ved who embarks on a journey to find his true self.";
                   break;
               }
               case 1: {
                   movieName="Jazba";
                   imageId=R.drawable.jazba;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Devdas";
                   imageId=R.drawable.devdas;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Sarabjit";
                   imageId=R.drawable.sarabjit;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Hum Dil De Chuke Sanam";
                   imageId=R.drawable.hddcs;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }
        else if(actorId==3){
           switch (pos){
               case 0: {
                   movieName="Dear Zindagi";
                   imageId=R.drawable.dearzindagi;
                   movieInfo="Ved and Tara meet in Corsica, where their mingling on the condition of anonymity makes cupid strike. Once back in Delhi, Tara must deal with a new Ved who embarks on a journey to find his true self.";
                   break;
               }
               case 1: {
                   movieName="student of the year";
                   imageId=R.drawable.studentoftheyear;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Kapoor and Sons";
                   imageId=R.drawable.kapoorandsons;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Humpty Sharma ki Dulhania";
                   imageId=R.drawable.hskd;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Piku";
                   imageId=R.drawable.shaandar;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }
        else if(actorId==4){
           switch (pos){
               case 0: {
                   movieName="Ae Dil Hai Mushkil";
                   imageId=R.drawable.adhm;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 1: {
                   movieName="Yeh_Jawaani_Hai_Deewani";
                   imageId=R.drawable.yjhd;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Tamasha";
                   imageId=R.drawable.tamasha;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Humpty Sharma ki Dulhania";
                   imageId=R.drawable.hskd;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Shaandar";
                   imageId=R.drawable.shaandar;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }
        else if (actorId==5){
           switch (pos){
               case 0: {
                   movieName="Hum Dil De Chuke Sanam";
                   imageId=R.drawable.hddcs;
                   movieInfo="Ved and Tara meet in Corsica, where their mingling on the condition of anonymity makes cupid strike. Once back in Delhi, Tara must deal with a new Ved who embarks on a journey to find his true self.";
                   break;
               }
               case 1: {
                   movieName="Student of the year";
                   imageId=R.drawable.studentoftheyear;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Bajirao_Mastani";
                   imageId=R.drawable.bm;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Goliyon_ki_Rasleela_Ramleela";
                   imageId=R.drawable.gkr;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Piku";
                   imageId=R.drawable.piku;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }
        else if(actorId==6){
           switch (pos){
               case 0: {
                   movieName="Tamasha";
                   imageId=R.drawable.tamasha;
                   movieInfo="Ved and Tara meet in Corsica, where their mingling on the condition of anonymity makes cupid strike. Once back in Delhi, Tara must deal with a new Ved who embarks on a journey to find his true self.";
                   break;
               }
               case 1: {
                   movieName="Yeh_Jawaani_Hai_Deewani";
                   imageId=R.drawable.yjhd;
                   movieInfo="Kabir and Naina bond during a trekking trip. Before Naina can express herself, Kabir leaves India to pursue his career. They meet again years later, but he still cherishes his dreams more than bonds.";
                   break;
               }
               case 2: {
                   movieName="Bajirao_Mastani";
                   imageId=R.drawable.bm;
                   movieInfo="The heroic Peshwa Bajirao, married to Kashibai, falls in love with Mastani, a warrior princess in distress. They struggle to make their love triumph amid opposition from his conservative family.";
                   break;
               }
               case 3: {
                   movieName="Goliyon_ki_Rasleela_Ramleela";
                   imageId=R.drawable.gkr;
                   movieInfo="Ram and Leela, passionately in love with each other, realize that the only way to stop the bloodshed between their respective clans, Rajari and Sanera, is to sacrifice their own lives";
                   break;
               }
               case 4: {
                   movieName="Piku";
                   imageId=R.drawable.piku;
                   movieInfo="Om, a junior film artist, is smitten by Shantipriya, a renowned actress. But he is killed while trying to save her from a fire. Thirty years later, he is reborn and sets out to avenge her death.";
                   break;
               }
               default:
                   break;
           }
       }

        tv.setText(movieName);
        iv.setImageResource(imageId);
        et.setText(movieInfo);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies_database, menu);
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
