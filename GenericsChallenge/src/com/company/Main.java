package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Team> teams;
        //Collections.sort(teams)

        Team<Rugby> berkeleyHobos = new Team<>("Hobos", 1);
        Team<Rugby> siliconValley = new Team<>("Silicon Valley", 3);
        Team<Rugby> napa = new Team<>("Napa", 2);
        ArrayList<Team<Rugby>> rugbyTeams = new ArrayList<>();
        rugbyTeams.add(berkeleyHobos);
        rugbyTeams.add(siliconValley);
        rugbyTeams.add(napa);

        League<Rugby> norCal = new League<>(rugbyTeams, "norCal Rugby League");
        norCal.viewRankings();

        Team<Football> denverBroncos = new Team<>("Denver Broncos", 1);
//        rugbyTeams.add(denverBroncos);
//        norCal.addTeam(denverBroncos);
        Team<Football> raiders = new Team<>("Oakland Raiders", 3);
        ArrayList<Team<Football>> nflTeams= new ArrayList<>();
        nflTeams.add(denverBroncos);
        nflTeams.add(raiders);

        League<Football> nfl = new League<>(nflTeams, "NFL");
        nfl.viewRankings();

        Team<Football> ravens = new Team<>("Baltimore Ravens", 2);

        nfl.addTeam(ravens);
        nfl.viewRankings();

    }
}
