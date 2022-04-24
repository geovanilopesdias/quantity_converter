package numeric_classes;

import java.util.Arrays;

/**
 * The set of quantity families. 
 * @author Geovane
 */
public enum QuantityFamily {
    DIMENSIONLESS,
    TIME, LENGTH, AREA, VOLUME,
    MASS, TEMPERATURE, DENSITY,
    VELOCITY, ACCELERATION, JERK,
    FORCE_BY_LENGTH,
    MOMENTUM, FORCE, PRESSURE, FIELD, ENERGY, POWER,
    CHARGE, CURRENT, VOLTAGE, RESISTANCE, RESISTIVITY
    ;
    
    public static boolean areFamiliesTheSame(QuantityFamily[] qf1, QuantityFamily[] qf2){ // Is a generic and overloaded solution needed?
        Arrays.sort(qf1); Arrays.sort(qf2); return Arrays.equals(qf1, qf2);}
}
