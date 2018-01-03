package com.company;

/**
 * Created by duncan.macleod on 1/2/18.
 */
public class Team<T extends Sport> implements Comparable<Team<T>> {
    private String name;
    private int ranking;

    public Team(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRanking() > team.getRanking()){
            return 1;
        } else if (this.getRanking() < team.getRanking()) {
            return -1;
        } else{
            return 0;
        }
    }
}
