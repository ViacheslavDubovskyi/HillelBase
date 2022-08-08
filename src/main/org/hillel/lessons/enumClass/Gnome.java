package org.hillel.lessons.enumClass;

import java.util.HashMap;
import java.util.Map;

public class Gnome extends Warrior implements Attackable, Defencable {

    private int hitPoints;

    public Gnome(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    @Override
    public int attack() {
        return forceLevel;
    }

    @Override
    public void defence(int attackPoints) {
        Map <String, Integer> points = new HashMap<>();
        points.put(ATTACK_POINTS, attackPoints);
        points.put(DEFENCE_LEVEL, defenceLevel);
        points.put(HIT_POINTS, hitPoints);

        Map<String, Integer> pointsMap = calculateHPAndHealth(points);
        hitPoints = pointsMap.get(HIT_POINTS);
        changeHealthState(hitPoints);
    }

    @Override
    public String toString() {
        return "Gnome{" +
                "healthState=" + healthState +
                ", hitPoints=" + hitPoints +
                ", defenceLevel=" + defenceLevel +
                ", forceLevel=" + forceLevel +
                '}';
    }
}