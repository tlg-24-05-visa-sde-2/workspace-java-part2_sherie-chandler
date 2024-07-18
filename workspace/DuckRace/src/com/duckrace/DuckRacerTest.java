package com.duckrace;

import java.util.Collection;

public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer = new DuckRacer(1, "Bullen");

        System.out.println(racer); // toString() automatically called

        racer.win(Reward.PRIZES);
        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT_CARD);

        System.out.println(racer);
        System.out.println();

        // fetch the collection from this existing DuckRacer object
        Collection<Reward> rewards = racer.getRewards();
        System.out.println();

        // Cheat! By simply adding rewards to this collection
        rewards.add(Reward.DEBIT_CARD);
        System.out.println(rewards);

        System.out.println(racer);
    }
}
