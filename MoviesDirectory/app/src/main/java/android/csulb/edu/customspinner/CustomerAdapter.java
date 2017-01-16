package android.csulb.edu.customspinner;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Aastha Jain on 1/11/2017.
 */
public class CustomerAdapter extends BaseAdapter {

    Context con;
    int[] image;
    String[] actressName;
    LayoutInflater inflater;

    public CustomerAdapter(Context con,int[] image,String[] actressName){
        this.con=con;
        this.image=image;
        this.actressName=actressName;
        inflater=LayoutInflater.from(con);

    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.custom_spinner,null);
        ImageView img= (ImageView) convertView.findViewById(R.id.imageView);
        TextView tv= (TextView) convertView.findViewById(R.id.textView2);
        img.setImageResource(image[position]);
        tv.setText(actressName[position]);
        return convertView;
    }
}
