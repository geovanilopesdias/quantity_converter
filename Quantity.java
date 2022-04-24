package numeric_classes;

import java.text.DecimalFormat;

/**
 * @author      Geovani Lopes Dias <geovani.phy.dias @ gmail.com>
 * @version     1.0
 * @since       1.0
 * @abstraction Physical quantities for problem solving purposes.
 */
public class Quantity { // How to deal with 2D vector calculation?
    private double value;
    private Unit unit;
    private final QuantityName name;
    private final QuantityFamily family;
    private final boolean vector;
    
    // Exception classes:
    private class ConflictingQuantityFamiliesException extends RuntimeException{
        public ConflictingQuantityFamiliesException() {super("Unit and name families shall be the same.");}
    }
    private class ImproperConvertionException extends RuntimeException {
        public ImproperConvertionException() {super("There's no meaning in to convert a dimensionless quantity.");}
    }
    
    // Constructors and Static Factory Methods:
    public Quantity(double value, Unit unit, QuantityName name, boolean vector) {
        this.value = value;
        this.name = name;
        this.unit = unit;
        this.family = unit.getFamily();
        this.vector = vector;
        if (name.getFamily() != unit.getFamily()){throw new ConflictingQuantityFamiliesException();}
    }
    // Physics constants:
    public static Quantity AsScalarGravity(){return new Quantity(9.81, Unit.METER_PER_SECOND_SQUARED, QuantityName.ACCELERATION, false);}
    public static Quantity AsVectorialGravity(){return new Quantity(-9.81, Unit.METER_PER_SECOND_SQUARED, QuantityName.ACCELERATION, true);}
    public static Quantity AsAtmosphericPressure(){return new Quantity(101325, Unit.PASCAL, QuantityName.PRESSURE, false);}
    
    public static Quantity AsTheElectronCharge(){return new Quantity(1.602177e-19, Unit.COULOMB, QuantityName.CHARGE, false);}
    public static Quantity AsTheElectronMass(){return new Quantity(9.109384e-31, Unit.KILOGRAM, QuantityName.MASS, false);}
    
    // Scalar constructors
    public static Quantity AsSide(double value){return new Quantity(value, Unit.METER, QuantityName.SIDE, false);}
    public static Quantity AsPerimeter(double value){return new Quantity(value, Unit.METER, QuantityName.PERIMETER, false);}
    public static Quantity AsDiagonal(double value){return new Quantity(value, Unit.METER, QuantityName.DIAGONAL, false);}
    public static Quantity AsDistance(double value){return new Quantity(value, Unit.METER, QuantityName.DISTANCE, false);}
    public static Quantity AsScalarDisplacement(double value){return new Quantity(value, Unit.METER, QuantityName.DISPLACEMENT, false);}
    public static Quantity AsTimeSpan(double value){return new Quantity(value, Unit.SECOND, QuantityName.TIME_SPAN, false);}
    public static Quantity AsTimeInstant(double value){return new Quantity(value, Unit.SECOND, QuantityName.INSTANT, false);}
    public static Quantity AsSpeed(double value){return new Quantity(value, Unit.METER_PER_SECOND, QuantityName.SPEED, false);}
    public static Quantity AsMass(double value){return new Quantity(value, Unit.KILOGRAM, QuantityName.MASS, false);}
    public static Quantity AsSpringConstant(double value){return new Quantity(value, Unit.NEWTON_PER_METER, QuantityName.SPRING_CONSTANT, false);}
    public static Quantity AsFrictionConstant(double value){return new Quantity(value, Unit.DIMENSIONLESS, QuantityName.COEFFICIENT_OF_FRICTION, false);}
    public static Quantity AsEfficiencyNotPercentage(double value){
        if (0 <= value || value <= 1) {return new Quantity(value, Unit.DIMENSIONLESS, QuantityName.EFFICIENCY, false);}
        else {throw new ArithmeticException("Efficiency e should be so as 0 <= e <= 1. For percentage, consider the other factory method.");}
    }
    public static Quantity AsEfficiencyAsPercentage(double value){
        if (0 <= value || value <= 100) {return new Quantity(value, Unit.PERCENTAGE, QuantityName.EFFICIENCY, false);}
        else {throw new ArithmeticException("Efficiency e should be so as 0 <= e <= 100%. For the non-percentage form, consider the other factory method.");}
    }
    
    // 2D and 3D scalars:
    public static Quantity AsArea(double value){return new Quantity(value, Unit.SQUARE_METER, QuantityName.AREA, false);}
    public static Quantity AsVolume(double value){return new Quantity(value, Unit.CUBIC_METER, QuantityName.VOLUME, false);}
    
    // Vectorial constructors:
    public static Quantity AsVelocity(double value){return new Quantity(value, Unit.METER_PER_SECOND, QuantityName.VELOCITY, true);}
    public static Quantity AsForce(double value){return new Quantity(value, Unit.NEWTON, QuantityName.FORCE, true);}
    public static Quantity AsWeight(double value){return new Quantity(value, Unit.NEWTON, QuantityName.WEIGHT, true);}
    // ...
    
    
    // Getters, setters and toString:
    public double getValue() {return value;}
    public Unit getUnit() {return unit;}
    public String getUnitSymbol() {return unit.getSymbol();}
    public String getPTName() {return name.getPortugueseWriting();}
    public String getENName() {return name.getEnglishWriting();}
    public boolean isVector() {return vector;}
    
    public void setUnit(Unit unit) {this.unit = unit;}
    public void setValue(double value){
        if (value < 0 & !this.isVector()){
            throw new ArithmeticException("A scalar quantity shouldn't be negative");}
        else {this.value = value;}}
    
    @Override
    public String toString() {return new DecimalFormat("#.#").format(value) + " " + unit.getSymbol();}
    
    
    /**
    * Converts a Quantity instance to a certain unit.
    * <p>
    * Received an instance, identifies its Unit attribute.
    * Thereafter, it sets its value by multiplying (and/or dividing) it
    * according to the unit needed.
    * Finally, the instance Unit attribute is setted as the unitNeeded parameter.
    * 
    * @param unitNeeded: the Unit object according to the Quantity
    * instance need to be converted.
    */
    public void convertUnitTo(Unit unitNeeded) throws RuntimeException{
        if (this.getUnit() == unitNeeded){return;} // No conversion needed
        if (this.getUnit().getFamily() != unitNeeded.getFamily())
            {throw new ConflictingQuantityFamiliesException();}
        if (this.getUnit() == Unit.DIMENSIONLESS)
            {throw new ImproperConvertionException();}
        
        // Conditions of conversion:
        boolean needToConvert_AnySystem_ToSIStandard = (
                    this.getUnit().getSystem() != Unit.UnitSystem.International_Standard &&
                    unitNeeded.getSystem() == Unit.UnitSystem.International_Standard),
                needToConvert_ASIStandard_ToAnyOtherUnit = (
                    this.getUnit().getSystem() == Unit.UnitSystem.International_Standard &&
                    unitNeeded.getSystem() != Unit.UnitSystem.International_Standard);
        
        // Conversion according to conditions:
        if (needToConvert_AnySystem_ToSIStandard){this.setValue(this.getValue()*this.getUnit().getConversionFactor());}
        else if (needToConvert_ASIStandard_ToAnyOtherUnit){this.setValue(this.getValue()/unitNeeded.getConversionFactor());}
        else {this.setValue(this.getValue()*this.getUnit().getConversionFactor()/unitNeeded.getConversionFactor());}
        this.setUnit(unitNeeded);}
    

} // Quantity class closure =====================================================