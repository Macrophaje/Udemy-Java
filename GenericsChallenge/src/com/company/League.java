package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by duncan.macleod on 1/2/18.
 */
public class League<T extends Sport> {

    private ArrayList<Team<T>> teams;
    private String name;

    public League(ArrayList<Team<T>> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public boolean addTeam(Team<T> team){
        if(teams.contains(team)){
            System.out.println("Team already in league");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void viewRankings(){
        Collections.sort(this.teams);
        for (Team team : this.teams) {
            System.out.println(team.getName());
        }
    }
}
