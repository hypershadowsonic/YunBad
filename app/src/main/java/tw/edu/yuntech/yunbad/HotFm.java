package tw.edu.yuntech.yunbad;

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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Super_000 on 12/16/2015.
 */

/*
class Case{
    String name;
    String date;
    int photoId;

    Case(String name, String date, int photoId){
        this.name = name;
        this.date = date;
        this.photoId = photoId;
    }

    private List<Case> Cases;

    private  void initializeDate() {
        Cases = new ArrayList<>();
        Cases.add(new Case("飲水機", "2015/10/23", R.drawable.water_cooler));
        Cases.add(new Case("桌子", "2015/09/11", R.drawable.water_cooler));
        Cases.add(new Case("電燈", "2015/12/09", R.drawable.water_cooler));
    }
}


public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CaseViewHolder> {

    public static class CaseViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView CaseName;
        TextView CaseDate;
        ImageView CasePhoto;

        CaseViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            CaseName = (TextView)itemView.findViewById(R.id.case_name);
            CaseDate = (TextView)itemView.findViewById(R.id.case_date);
            CasePhoto = (ImageView)itemView.findViewById(R.id.case_photo);
        }
    }
}
*/

public class HotFm extends Fragment{
    public HotFm(){}

    TextView CaseName;
    TextView CaseDate;
    ImageView CasePhoto;

    /*@Nullable*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.hot_list_cv, container, false);
        View rootView = inflater.inflate(R.layout.hot_list_cv, container,    false);
        CaseName = (TextView)rootView.findViewById(R.id.case_name);
        CaseDate = (TextView)rootView.findViewById(R.id.case_date);
        CasePhoto = (ImageView)rootView.findViewById(R.id.case_photo);


        CaseName.setText("飲水機");
        CaseDate.setText("2015/10/21");
        CasePhoto.setImageResource(R.drawable.water_cooler);
        return rootView;
    }

    /*RecyclerView rv = (RecyclerView) getView().findViewById(R.id.rv);
    LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.hot_list_cv, container, false);
    }*/
}
