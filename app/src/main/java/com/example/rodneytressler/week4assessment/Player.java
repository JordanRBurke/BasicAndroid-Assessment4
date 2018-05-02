package com.example.rodneytressler.week4assessment;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rodneytressler on 12/17/17.
 */

public class Player implements Parcelable{

    private String playerName;
    private String playerNumber;
    private String playerTeam;

    protected Player(Parcel in) {
        playerName = in.readString();
        playerNumber = in.readString();
        playerTeam = in.readString();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    public Player(String playerName, String playerNumber, String playerTeam) {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(playerName);
        parcel.writeString(playerNumber);
        parcel.writeString(playerTeam);
    }
}
