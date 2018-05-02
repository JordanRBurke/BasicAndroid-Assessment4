package com.example.rodneytressler.week4assessment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rodneytressler on 12/17/17.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewholder> {

    private List<Player> playerList;
//    @BindView(R.id.text_player_name)
//    private TextView playerNameView;
//    @BindView(R.id.text_player_number)
//    protected TextView playerNumberVoew;
//    @BindView(R.id.text_player_team)
//    protected TextView playerTeamView;



    public PlayerAdapter(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public PlayerViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new PlayerViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(PlayerViewholder holder, int position) {
        holder.bindPlayer(playerList.get(position));
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public class PlayerViewholder extends RecyclerView.ViewHolder {

        @BindView(R.id.text_player_team)
        protected TextView playerTeam;

        @BindView(R.id.text_player_number)
        protected TextView playerNumber;

        @BindView(R.id.text_player_name)
        protected TextView playerName;

        public PlayerViewholder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindPlayer(Player player) {
            playerName.setText(playerList.get(0).toString());
            playerNumber.setText(playerList.get(1).toString());
            playerTeam.setText(playerList.get(2).toString());

        }
    }
}
