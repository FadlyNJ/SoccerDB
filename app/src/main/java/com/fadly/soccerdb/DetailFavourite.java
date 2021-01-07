package com.fadly.soccerdb;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;

import io.realm.Realm;

public class DetailFavourite extends AppCompatActivity {

    Realm realm;
    com.fadly.soccerdb.RealmHelper realmHelper;
    ModelRealm teamModel;

    Bundle extras;
    String team;
    String alternate;
    String league;
    String stadium;
    String badge;
    String description;
    String location;
    String id;

    TextView tvname;
    TextView tvalternate;
    TextView tvleague;
    TextView tvstadium;
    TextView tvlocation;
    TextView tvdesc;
    ImageView ivposter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_favourite);
        setTitle("Detail Team");
        extras = getIntent().getExtras();
        tvname = (TextView)findViewById(R.id.tvname);
        tvalternate = (TextView)findViewById(R.id.tvalternate);
        tvleague = (TextView)findViewById(R.id.tvleague);
        tvstadium = (TextView)findViewById(R.id.tvstadium);
        tvlocation = (TextView)findViewById(R.id.tvlocation);
        tvdesc = (TextView)findViewById(R.id.tvdesc);
        ivposter = (ImageView) findViewById(R.id.ivposter);

        if (extras != null) {
            id = extras.getString("id");
            team = extras.getString("team");
            alternate = extras.getString("alternate");
            league = extras.getString("league");
            stadium = extras.getString("stadium");
            location = extras.getString("location");
            description = extras.getString("description");
            badge = extras.getString("badge");

            tvname.setText(team);
            tvalternate.setText(alternate);
            tvleague.setText(league);
            tvstadium.setText(stadium);
            tvlocation.setText(location);
            tvdesc.setText(description);
            Glide.with(com.fadly.soccerdb.DetailFavourite.this)
                    .load(badge)
                    .override(Target.SIZE_ORIGINAL)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(ivposter);
            // and get whatever type user account id is
        }
    }
}