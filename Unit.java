package numeric_classes;

/**
 * A enum class for quantity units.
 * @author      Geovani Lopes Dias <geovani.phy.dias @ gmail.com>
 */
public enum Unit {
    DIMENSIONLESS(QuantityFamily.DIMENSIONLESS, "", "", UnitSystem.Others, 1),
    PERCENTAGE(QuantityFamily.DIMENSIONLESS, "", "%", UnitSystem.Others, 1),

    // Length units:
    METER(QuantityFamily.LENGTH, "meter", "m", UnitSystem.International_Standard, 1),
    DECIMETER(QuantityFamily.LENGTH, "decimeter", "dm", UnitSystem.International_Submultiple, 1e-1),
    CENTIMETER(QuantityFamily.LENGTH, "centimeter", "cm", UnitSystem.International_Submultiple, 1e-2),
    MILIMETER(QuantityFamily.LENGTH, "milimeter", "mm", UnitSystem.International_Submultiple, 1e-3),
    DECAMETER(QuantityFamily.LENGTH, "decameter", "dam", UnitSystem.International_Multiple, 10),
    HECTOMETER(QuantityFamily.LENGTH, "hectometer", "hm", UnitSystem.International_Multiple, 100),
    KILOMETER(QuantityFamily.LENGTH, "kilometer", "km", UnitSystem.International_Multiple, 1000),
    
    INCH(QuantityFamily.LENGTH, "inch", "in", UnitSystem.Imperial, 0.0254),
    FOOT(QuantityFamily.LENGTH, "foot", "ft", UnitSystem.Imperial, 0.3048),
    YARD(QuantityFamily.LENGTH, "yard", "yd", UnitSystem.Imperial, 0.9144),
    MILE(QuantityFamily.LENGTH, "mile", "mi", UnitSystem.Imperial, 1609.34),
    
    ASTRO_UNIT(QuantityFamily.LENGTH, "astronomic unit", "AS", UnitSystem.Others, 6.6846e-12),
    LIGHT_YEAR(QuantityFamily.LENGTH, "light-year", "ly", UnitSystem.Others, 1.057e-16),
    PARSEC(QuantityFamily.LENGTH, "parsec", "pc", UnitSystem.Others, 3.24078e-17),
    
    // Time units:
    SECOND(QuantityFamily.TIME, "second", "s", UnitSystem.International_Standard, 1),
    MINUTE(QuantityFamily.TIME, "minute", "min", UnitSystem.International_Accepted, 60),
    HOUR(QuantityFamily.TIME, "hour", "h", UnitSystem.International_Accepted, 3600),
    DAY(QuantityFamily.TIME, "day", "d", UnitSystem.International_Accepted, 86400),
    
    // Mass units:
    KILOGRAM(QuantityFamily.MASS, "kilogram", "kg", UnitSystem.International_Standard, 1),
    GRAM(QuantityFamily.MASS, "gram", "g", UnitSystem.International_Fundamental, 1e-3),
    DECIGRAM(QuantityFamily.MASS, "decigram", "dg", UnitSystem.International_Submultiple, 1e-4),
    CENTIGRAM(QuantityFamily.MASS, "centigram", "cg", UnitSystem.International_Submultiple, 1e-5),
    MILIGRAM(QuantityFamily.MASS, "miligram", "mg", UnitSystem.International_Submultiple, 1e-6),
    DECAGRAM(QuantityFamily.MASS, "decagram", "dag", UnitSystem.International_Multiple, 1e-2),
    HECTOGRAM(QuantityFamily.MASS, "hectogram", "hg", UnitSystem.International_Multiple, 1e-1),
    
    OUNCE(QuantityFamily.MASS, "ounce", "oz", UnitSystem.Imperial, 10.028349),
    POUND(QuantityFamily.MASS, "pound", "lb", UnitSystem.Imperial, 0.453592),
    TONNE(QuantityFamily.MASS, "tonne", "t", UnitSystem.Others, 1000),
    EARTH_MASS(QuantityFamily.MASS, "earth's mass", "M\u2295", UnitSystem.Others, 5.972e24),
    SOLAR_MASS(QuantityFamily.MASS, "solar mass", "M\u2299", UnitSystem.Others, 1.989e30),
    
    // Speed and acceleration units:
    METER_PER_SECOND(QuantityFamily.VELOCITY, "meter per second", "m/s", UnitSystem.International_Standard, 1),
    KILOMETER_PER_HOUR(QuantityFamily.VELOCITY, "kilometer per hour", "km/h", UnitSystem.International_Accepted, 0.277778),
    MILE_PER_HOUR(QuantityFamily.VELOCITY, "mile per hour", "mi/h", UnitSystem.Imperial, 0.44704),
    KNOT_PT(QuantityFamily.VELOCITY, "knot", "nó", UnitSystem.International_Accepted, 0.514444),
    KNOT_EN(QuantityFamily.VELOCITY, "knot", "knot", UnitSystem.International_Accepted, 0.514444),
    MACH(QuantityFamily.VELOCITY, "Mach", "Mach", UnitSystem.Others, 0.002915),
    
    METER_PER_SECOND_SQUARED(QuantityFamily.ACCELERATION, "meter per second squared", "m/s²", UnitSystem.International_Standard, 1),
    G(QuantityFamily.ACCELERATION, "g", "g", UnitSystem.Others, 9.80665),
    KILOMETER_PER_HOUR_PER_SECOND(QuantityFamily.ACCELERATION, "kilometer per hour per second", "km/(h\u2219s)", UnitSystem.Others, 0.277777),
    MILE_PER_HOUR_PER_SECOND(QuantityFamily.ACCELERATION, "mile per hour per second", "mi/(h\u2219s)", UnitSystem.Others, 0.447047),

    // Area and Volume units:
    SQUARE_METER(QuantityFamily.AREA, "square meter", "m²", UnitSystem.International_Standard, 1),
    SQUARE_CENTIMETER(QuantityFamily.AREA, "square centimeter", "cm²", UnitSystem.International_Submultiple, 1e-4),
    SQUARE_MILIMETER(QuantityFamily.AREA, "square milimeter", "mm²", UnitSystem.International_Submultiple, 1e-6),
    SQUARE_KILOMETER(QuantityFamily.AREA, "square kilometer", "km²", UnitSystem.International_Submultiple, 1e6),
    HECTARE(QuantityFamily.AREA, "hectare", "ha", UnitSystem.Others, 10000),
    SQUARE_INCH(QuantityFamily.AREA, "square inch", "in²", UnitSystem.Imperial, 0.000645),
    SQUARE_FEET(QuantityFamily.AREA, "square feet", "ft²", UnitSystem.Imperial, 0.092903),
    
    CUBIC_METER(QuantityFamily.VOLUME, "cubic meter", "m³", UnitSystem.International_Standard, 1),
    LITER(QuantityFamily.VOLUME, "liter", "L", UnitSystem.International_Accepted, 0.001),
    FLUID_OUNCE(QuantityFamily.VOLUME, "fluid ounce", "fl oz", UnitSystem.Imperial, 2.84131e-5),
    GALLON_IMPERIAL(QuantityFamily.VOLUME, "imperial gallon", "gal (imp)", UnitSystem.Imperial, 0.004546),
    GALLON_US(QuantityFamily.VOLUME, "US gallon", "gal (US)", UnitSystem.Imperial, 0.003785),
    
    // Density, force and pressure units:
    KILOGRAM_PER_CUBIC_METER(QuantityFamily.DENSITY, "kilogram per cubic meter", "kg/m³", UnitSystem.International_Standard, 1),
    GRAM_PER_CUBIC_CENTIMETER(QuantityFamily.DENSITY, "gram per cubic centimeter", "g/cm³", UnitSystem.Others, 1000),

    NEWTON(QuantityFamily.FORCE, "newton", "N", UnitSystem.International_Standard, 1),
    DYNE(QuantityFamily.FORCE, "dyne", "dyn", UnitSystem.Others, 1e-5),
    KGF(QuantityFamily.FORCE, "quilogram-force", "kgf", UnitSystem.Others, 9.80665),
    
    NEWTON_PER_METER(QuantityFamily.FORCE_BY_LENGTH, "newton per meter", "N/m", UnitSystem.International_Standard, 1),
    
    PASCAL(QuantityFamily.PRESSURE, "pascal", "Pa", UnitSystem.International_Standard, 1),
    BAR(QuantityFamily.PRESSURE, "bar", "bar", UnitSystem.International_Accepted, 100000),
    PSI(QuantityFamily.PRESSURE, "pound per square inch", "psi", UnitSystem.Imperial, 6894.76),
    MM_HG(QuantityFamily.PRESSURE, "milimiters of mercury", "mmHg", UnitSystem.Others, 133.322),
    ATMOSPHERE(QuantityFamily.PRESSURE, "atmosphere", "atm", UnitSystem.Others, 101325),
    
    // Energy and power units:
    JOULE(QuantityFamily.ENERGY, "joule", "J", UnitSystem.International_Standard, 1),
    BTU(QuantityFamily.ENERGY, "british thermal unit", "BTU", UnitSystem.Imperial, 1055.06),
    KILOWATT_HOUR(QuantityFamily.ENERGY, "quilowatt-hour", "kWh", UnitSystem.Others, 3.6e6),
    ERG(QuantityFamily.ENERGY, "erg", "erg", UnitSystem.Others, 1e-7),
    ELECTRON_VOLT(QuantityFamily.ENERGY, "electron-volt", "eV", UnitSystem.Others, 1.60218e-19),
    
    WATT(QuantityFamily.POWER, "watt", "W", UnitSystem.International_Standard, 1),
    KILOWATT(QuantityFamily.POWER, "kilowatt", "kW", UnitSystem.International_Multiple, 1000),
    HORSE_POWER(QuantityFamily.POWER, "horse-power", "hp", UnitSystem.Others, 745.7),
    BTU_PER_HOUR(QuantityFamily.POWER, "BTU per hour", "BTU/h", UnitSystem.Imperial, 0.293071),
    
    // Charge, current and voltage units:
    AMPERE(QuantityFamily.CURRENT, "ampère", "A", UnitSystem.International_Standard, 1),
    MILIAMPERE(QuantityFamily.CURRENT, "miliampère", "mA", UnitSystem.International_Standard, 1e-3),
    
    COULOMB(QuantityFamily.CHARGE, "coulomb", "C", UnitSystem.International_Standard, 1),
    // ...
    ;
    
    // Attributes
    /**
    * Unit systems and relation of a unit to its respective system.
    * <p>
    * See https://physics.nist.gov/cuu/Units/index.html for more info.
    * The relation are as follows:</p>
    * <ul><li>Standard: The base (or derived) system unit.</li>
    * <li>Multiple: A unit with a standard prefix, whose factor is a multiple of ten.</li>
    * <li>Submultiple: A unit with a standard prefix, whose factor is a submultiple of ten.</li>
    * <li>Fundamental: A unit without prefix, but not a standard (gram is the unique case).</li>
    * <li>Accepted: A unit accepted by the system, but it is/has no preffix (as minute, hour and knots).</li>
    * </ul>
    */
    public enum UnitSystem {
        International_Standard, International_Multiple, International_Submultiple,
        International_Fundamental, International_Accepted,
        Imperial,
        Others
    };
    
    private final QuantityFamily family;
    private final String name;
    private final String symbol;
    private final UnitSystem system;
    private final double conversionFactor; // One to multiply and get SI

    // Constructor and getters:
    private Unit(QuantityFamily family, String name, String symbol, UnitSystem system, double conversionFactor) {
        this.family = family;
        this.name = name;
        this.symbol = symbol;
        this.system = system;
        this.conversionFactor = conversionFactor;
    }

    public QuantityFamily getFamily() {return family;}
    public String getName() {return name;}
    public String getSymbol() {return symbol;}
    public double getConversionFactor() {return conversionFactor;}
    public UnitSystem getSystem() {return system;}
    
    
    // Random static factory methods:
    public static Unit DrewForVehicleDistanceFromAnySystem(){
        Unit[] longDistanceUnits = {Unit.MILE, Unit.KILOMETER};
        int drewUnit = NumericProcessors.randomInt(0, longDistanceUnits.length);
        return longDistanceUnits[drewUnit];
    }
    
    public static Unit DrewForAstronomicDistanceFromAnySystem(){
        Unit[] astronomicDistances = {Unit.KILOMETER, Unit.ASTRO_UNIT, Unit.PARSEC};
        int drewUnit = NumericProcessors.randomInt(0, astronomicDistances.length);
        return astronomicDistances[drewUnit];
    }
    
    public static Unit DrewForVehicleMassFromAnySystem(){
        Unit[] astronomicDistances = {Unit.KILOGRAM, Unit.POUND, Unit.TONNE};
        int drewUnit = NumericProcessors.randomInt(0, astronomicDistances.length);
        return astronomicDistances[drewUnit];
    }
    
    public static Unit DrewForSmallAreas(){
        Unit[] genericAreas = {Unit.SQUARE_METER, Unit.SQUARE_CENTIMETER, Unit.SQUARE_MILIMETER, Unit.SQUARE_FEET, Unit.SQUARE_INCH};
        int drewUnit = NumericProcessors.randomInt(0, genericAreas.length);
        return genericAreas[drewUnit];
    }
    
    public static Unit DrewForSmallLengths(){
        Unit[] genericAreas = {Unit.METER, Unit.CENTIMETER, Unit.MILIMETER, Unit.FOOT, Unit.INCH, Unit.YARD};
        int drewUnit = NumericProcessors.randomInt(0, genericAreas.length);
        return genericAreas[drewUnit];
    }
}