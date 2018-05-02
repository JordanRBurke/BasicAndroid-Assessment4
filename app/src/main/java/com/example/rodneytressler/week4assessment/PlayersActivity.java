package com.example.rodneytressler.week4assessment;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayersActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    protected RecyclerView recyclerView;

    private List<Player> playerList;

    private PlayerAdapter adapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        ButterKnife.bind(this);
        populateRecyclerView();



//        playerList.equals(getPa)
    }

    private void populateRecyclerView() {
//        playerList.equals(adapter);
//        playerList.contains(adapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
