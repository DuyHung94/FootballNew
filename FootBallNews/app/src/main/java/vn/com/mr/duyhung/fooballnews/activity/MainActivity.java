package vn.com.mr.duyhung.fooballnews.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import vn.com.mr.duyhung.fooballnews.R;
import vn.com.mr.duyhung.fooballnews.adapter.GridViewAdapter;

public class MainActivity extends BaseActivityAbs {

    private GridView mGvtournaments;
    private GridViewAdapter adapter;
    String[] web = {"Premier League", "La Liga", "Serie A", "Bundesliga", "Ligue 1", "J1 League"};
    int[] imageId = {R.drawable.lg_premierleage,
            R.drawable.lg_laliga,
            R.drawable.lg_seriea,
            R.drawable.lg_bundesliga,
            R.drawable.lg_legue1,
            R.drawable.lg_jleague};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }

    private void initUI() {
        mGvtournaments = (GridView) findViewById(R.id.gv_tournaments);
        adapter = new GridViewAdapter(MainActivity.this, web, imageId);
        mGvtournaments.setAdapter(adapter);
        mGvtournaments.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
