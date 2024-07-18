package com.duckrace;

import java.util.ArrayList;

public class DuckRacer {
    // fields or instance variables
    private final int id;
    private final String name;
    private Collection<Rewards> rewards = new ArrayList<>();

    // constructors creating the getters and toString and manually setting your getters
    public DuckRacer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // action methods: things that duckracers do--how would you add the reward into the collection
    public void win(Reward reward) {
        rewards.add(reward);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
// a derived property-- it is derived from the size of the collection
    public int getWin() {
        return rewards.size();
    }
    // Note: we are returning a direct reference to
    public Collection<Rewards> getRewards() {

        return rewards;
    }


    @Override
    public String toString() {
        return String.format("s: id=%s, name=%s, wins%s, rewards=%s"
        getClass().getSimpleName(), getId(), getName(), getWins(), getRewards());

    }
}
