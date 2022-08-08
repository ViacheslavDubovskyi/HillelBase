package org.hillel.lessons.enumClass;

public enum HealthState {

    GOOD (100, 71),
    AVERAGE (70, 31),
    POOR(30, 1),
    DEAD(0, 0);

    private final int maxLevel;
    private final int minLevel;

    HealthState(int maxLevel, int minLevel) {
        this.maxLevel = maxLevel;
        this.minLevel = minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getMinLevel() {
        return minLevel;
    }
}