package main.utills;

/**
 * Enum class for declaring different types
 *  of armies and player respectively
 *
 */
public class EnumHandler {
    //UnitType is used in UnitModel class to store army data
    public enum UnitType {
        INFANTRY, CAVALRY, ARTILLERY
    }

    public enum Color {
        BLACK, BLUE, GREEN, PINK, RED, YELLOW
    }
}