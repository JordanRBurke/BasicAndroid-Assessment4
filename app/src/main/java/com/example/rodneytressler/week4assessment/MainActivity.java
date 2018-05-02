package com.example.rodneytressler.week4assessment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_team)
    protected EditText teamInput;

    @BindView(R.id.input_number)
    protected EditText numberInput;

    @BindView(R.id.input_name)
    protected EditText nameInput;

    @BindView(R.id.button_add_player)
    protected Button addPlayerButton;

    @BindView(R.id.button_view_players)
    protected Button viewPlayersButton;



    private List<Player> playerList;

    public static final String TAG = "PLAYER_LIST_TAG";

    @OnClick(R.id.button_add_player)
    protected void onAddPlayerButtonClicked() {
        String playerName = nameInput.getText().toString();
        String numberName = numberInput.getText().toString();
        String playerTeam = teamInput.getText().toString();
        Player player = new Player(playerName, numberName, playerTeam
                );
        playerList.add(player);
        errorHandling();
    }



    @OnClick(R.id.button_view_players)
    protected void onViewPlayersButtonClicked() {

        if (playerList.isEmpty()) {
            toastMessage("There Are No Players Listed");
        } else  {
            toastMessage("Showing List...");
            Intent intent = new Intent(this, PlayersActivity.class);
            intent.putParcelableArrayListExtra(TAG, (ArrayList<? extends Parcelable>) playerList);
            startActivity(intent);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        playerList = new ArrayList<>();
    }

    private void errorHandling() {

        if (teamInput.getText().toString().isEmpty() || numberInput.getText().toString().isEmpty() ||
                nameInput.getText().toString().isEmpty()){
            toastMessage("Text Fields Are Not Filled");

        } else {
            toastMessage("Fields Entered!");
        }
    }


    private String toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        return message;

    }


    
}
