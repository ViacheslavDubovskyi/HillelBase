package org.hillel.lessons.enumClass;

import java.util.Map;

public interface Defencable {

    void defence(int attackPoint);

    default Map<String, Integer> calculateHPAndHealth(Map<String, Integer> points) {

        Integer attackPoints = points.get("ATTACK_POINTS");
        Integer defenceLevel = points.get("DEFENCE_LEVEL");
        Integer hitPoints = points.get("HIT_POINTS");

        if (attackPoints <= defenceLevel) {
            defenceLevel = defenceLevel - attackPoints;
            points.put("DEFENCE_LEVEL", defenceLevel);
        } else {
            int rest = attackPoints - defenceLevel;
            defenceLevel = 0;
            hitPoints = Math.max(hitPoints - rest, 0);
        }

        points.put("DEFENCE_LEVEL", defenceLevel);
        points.put("HIT_POINTS", hitPoints);

        return points;
    }
}

//    default int [] calculateHPAndHealth (int attackPoints, int defenceLevel, int hitPoints){
//        if (attackPoints <= defenceLevel) {
//            defenceLevel = defenceLevel - attackPoints;
//        } else {
//            int rest = attackPoints - defenceLevel;
//            defenceLevel = 0;
//            hitPoints = Math.max(hitPoints - rest, 0);
//        }
//        return new int []{defenceLevel,hitPoints};
//    }