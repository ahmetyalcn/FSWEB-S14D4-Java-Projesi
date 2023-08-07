package com.workintech.abstraction.main;

import com.workintech.abstraction.rpg.Monster;
import com.workintech.abstraction.rpg.Troll;
import com.workintech.abstraction.rpg.Werewolf;

public class Test {
    public static void main(String[] args) {
        Monster troll = new Troll("monster x", 500,50);
        System.out.println(troll.attack());
        Monster wereWolf = new Werewolf("monster y", 600,50);
        System.out.println(wereWolf.attack());
    }
}
