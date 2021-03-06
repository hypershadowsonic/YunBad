package tw.edu.yuntech.yunbad;

import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Super_000 on 12/16/2015.
 */

public class HotFm extends Fragment{
    public HotFm(){}

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

    /*@Nullable*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hot_list_cv, container,    false);
        C1Name = (TextView)rootView.findViewById(R.id.c1_name);
        C1Date = (TextView)rootView.findViewById(R.id.c1_date);
        C1St = (TextView)rootView.findViewById(R.id.c1_status);
        C1Lo = (TextView)rootView.findViewById(R.id.c1_locate);
        C1Photo = (ImageView)rootView.findViewById(R.id.c1_photo);


        C1Name.setText("飲水機");
        C1Date.setText("2015/03/21");
        C1St.setText("無法拱水");
        C1Lo.setText("活動中心地下室");
        C1Photo.setImageResource(R.drawable.water_cooler);


        C2Name = (TextView)rootView.findViewById(R.id.c2_name);
        C2Date = (TextView)rootView.findViewById(R.id.c2_date);
        C2St = (TextView)rootView.findViewById(R.id.c2_status);
        C2Lo = (TextView)rootView.findViewById(R.id.c2_locate);
        C2Photo = (ImageView)rootView.findViewById(R.id.c2_photo);

        C2Name.setText("電燈");
        C2Date.setText("2015/10/13");
        C2St.setText("破裂");
        C2Lo.setText("設計三館三樓");
        C2Photo.setImageResource(R.drawable.fluorescent);

        C3Name = (TextView)rootView.findViewById(R.id.c3_name);
        C3Date = (TextView)rootView.findViewById(R.id.c3_date);
        C3St = (TextView)rootView.findViewById(R.id.c3_status);
        C3Lo = (TextView)rootView.findViewById(R.id.c3_locate);
        C3Photo = (ImageView)rootView.findViewById(R.id.c3_photo);

        C3Name.setText("椅子");
        C3Date.setText("2015/11/02");
        C3St.setText("椅腳斷裂");
        C3Lo.setText("管理三館");
        C3Photo.setImageResource(R.drawable.chair);

        C1Plus = (ImageButton)rootView.findViewById(R.id.c1_plus);
        C1Plus.setImageResource(R.drawable.plusone_01);
        C2Plus = (ImageButton)rootView.findViewById(R.id.c2_plus);
        C2Plus.setImageResource(R.drawable.plusone_01);
        C3Plus = (ImageButton)rootView.findViewById(R.id.c3_plus);
        C3Plus.setImageResource(R.drawable.plusone_01);

        C1Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.plus, Toast.LENGTH_SHORT).show();
                //Toast.makeText(HotFm.this, R.string.success, Toast.LENGTH_SHORT).show();
            }
        });

        C2Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.plus, Toast.LENGTH_SHORT).show();
            }
        });

        C3Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.plus, Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }


}
