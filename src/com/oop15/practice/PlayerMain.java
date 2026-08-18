package com.oop15.practice;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println(name);
    }
}


class Team {
    private Player[] players;

    public Team(Player[] players) {
        this.players = players;
    }

    public void showPlayer() {
        for(Player p : players) {
            p.showInfo();
        }
    }
}


public class PlayerMain {
    public static void main(String[] args) {
        Player p1 = new Player("손흥민");
        Player p2 = new Player("이강인");
        Player[] players = {p1 , p2};
        Team t = new Team(players);
        t.showPlayer();


    }
}
