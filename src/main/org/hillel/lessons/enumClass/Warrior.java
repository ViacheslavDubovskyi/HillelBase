package org.hillel.lessons.enumClass;

import java.util.Random;

public abstract class Warrior {

    public static final String HIT_POINTS = "HIT_POINTS";

    public static final String DEFENCE_LEVEL = "DEFENCE_LEVEL";

    public static final String ATTACK_POINTS = "ATTACK_POINTS";

    protected HealthState healthState = HealthState.GOOD;

    protected int defenceLevel;

    protected int forceLevel;

    public HealthState getHealthState() {
        return healthState;
    }

    public void initDefenceLevel (){
        this.defenceLevel = new Random().nextInt(100);
    }

    public void initForceLevel(){
        this.forceLevel = new Random().nextInt(100);
    }

    protected void changeHealthState(int hitPoints) {
        HealthState[] values = HealthState.values();
        for (HealthState value : values) {
            if (hitPoints >= value.getMinLevel() && hitPoints <= value.getMaxLevel())
                healthState = value;
        }
    }
}
