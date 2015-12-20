package tw.edu.yuntech.yunbad;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Super_000 on 12/16/2015.
 */

public class MapListAct extends AppCompatActivity{

    TextView C1Name;
    TextView C1Date;
    TextView C1St;
    TextView C1Lo;
    ImageView C1Photo;
    ImageButton C1Plus;

    TextView C2Name;
    TextView C2Date;
    TextView C2St;
    TextView C2Lo;
    ImageView C2Photo;
    ImageButton C2Plus;

    TextView C3Name;
    TextView C3Date;
    TextView C3St;
    TextView C3Lo;
    ImageView C3Photo;
    ImageButton C3Plus;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maplistcv);
        C1Name = (TextView)findViewById(R.id.mc1_name);
        C1Date = (TextView)findViewById(R.id.mc1_date);
        C1St = (TextView)findViewById(R.id.mc1_status);
        C1Lo = (TextView)findViewById(R.id.mc1_locate);
        C1Photo = (ImageView)findViewById(R.id.mc1_photo);


        C1Name.setText("飲水機");
        C1Date.setText("2015/03/21");
        C1St.setText("無法拱水");
        C1Lo.setText("設計三館三樓");
        C1Photo.setImageResource(R.drawable.water_cooler);


        C2Name = (TextView)findViewById(R.id.mc2_name);
        C2Date = (TextView)findViewById(R.id.mc2_date);
        C2St = (TextView)findViewById(R.id.mc2_status);
        C2Lo = (TextView)findViewById(R.id.mc2_locate);
        C2Photo = (ImageView)findViewById(R.id.mc2_photo);

        C2Name.setText("電燈");
        C2Date.setText("2015/10/13");
        C2St.setText("破裂");
        C2Lo.setText("設計三館三樓");
        C2Photo.setImageResource(R.drawable.fluorescent);

        C3Name = (TextView)findViewById(R.id.mc3_name);
        C3Date = (TextView)findViewById(R.id.mc3_date);
        C3St = (TextView)findViewById(R.id.mc3_status);
        C3Lo = (TextView)findViewById(R.id.mc3_locate);
        C3Photo = (ImageView)findViewById(R.id.mc3_photo);

        C3Name.setText("椅子");
        C3Date.setText("2015/11/02");
        C3St.setText("椅腳斷裂");
        C3Lo.setText("設計三館");
        C3Photo.setImageResource(R.drawable.chair);

        C1Plus = (ImageButton)findViewById(R.id.mc1_plus);
        C1Plus.setImageResource(R.drawable.plusone_01);
        C2Plus = (ImageButton)findViewById(R.id.mc2_plus);
        C2Plus.setImageResource(R.drawable.plusone_01);
        C3Plus = (ImageButton)findViewById(R.id.mc3_plus);
        C3Plus.setImageResource(R.drawable.plusone_01);

        C1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MapListAct.this, R.string.plus, Toast.LENGTH_SHORT).show();
                //Toast.makeText(HotFm.this, R.string.success, Toast.LENGTH_SHORT).show();
            }
        });

        C2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MapListAct.this, R.string.plus, Toast.LENGTH_SHORT).show();
            }
        });

        C3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MapListAct.this, R.string.plus, Toast.LENGTH_SHORT).show();
            }
        });
    }




}
