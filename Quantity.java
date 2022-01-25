package numeric_classes;

/**
 * @author      Geovani Lopes Dias <geovani.phy.dias @ gmail.com>
 * @version     1.0
 * @since       1.0
 */

public class Quantity {
    private double value;
    private String symbol, type, unit;
    private boolean vector, unknown;
    
    
    // Constant auxiliary arrays and attribute tests
    
    /**
     * A 3D-matrix to work with quantity units.
     * <p>
     * [t][u][f]=> t: type array | u=0: type type | u=1: SI symbol
     * id = 0: name | id = 1: SI value | id = 2: SI unit.
     * f: multiplication factor relative to SI
     */
    public static final String[][][] UNITS = {
        {{"length"},
            {"m", "meter", "SI", "1"},
            {"cm", "centimeter", "SI", "100"},
            {"km", "kilometer", "SI", "0.001"},
            {"in", "inch", "BR", "39.3701"},
            {"yd", "yard", "BR", "1.09361"},
            {"ft", "feet", "BR", "3.28084"},
            {"mi", "mile", "BR", "1/1609.34"},
            {"AU", "astronomic unit", "AS", "6.6846e-12"},
            {"ly", "light-year", "AS", "1.057e-16"},
            {"pc", "parsec", "AS", "3.24078e-17"}},
        {{"time"},
            {"s", "second", "SI", "1"},
            {"min", "minute", "..", "1/60"},
            {"h", "hour", "..", "1/3600"}},
        {{"velocity"},
            {"m/s", "meter per second", "SI", "1"},
            {"km/h", "kilometer per hour", "MT", "3.6"},
            {"mi/h", "mile per hour", "BR", "2.2369"},
            {"knot", "knot", "NA", "1.94384"},
            {"mach", "sound speed", "AE", "1/343"}},
        {{"acceleration"},
            {"m/s²", "meter per second squared", "SI", "1"},
            {"g", "mean gravity acceeration", "..", "3.6"},
            {"km/hs", "kilometer per hour per second", "MT", "3.6"},
            {"mi/hs", "mile per hour per second", "BR", "2.2369"}},
        {{"mass"},
            {"kg", "kilogram", "SI", "1"},
            {"g", "gram", "MT", "1000"},
            {"oz", "ounce", "BR", "35.274"},
            {"lb", "pound", "BR", "2.2046"},
            {"M\u2295", "earth mass", "AS", "1.6744e-25"},
            {"M\u2299", "solar mass", "AS", "5.0279e-31"}},
        {{"volume"},
            {"m³", "cubic meter", "SI", "1"},
            {"L", "liter", "MT", "1000"},
            {"fl oz", "fluid ounce", "BR", "33814"},
            {"in³", "cubic inch", "BR", "61023.7"},
            {"ft³", "cubic feet", "BR", "35.3147"},
            {"yd³", "cubic yard", "BR", "1.308"},
            {"gal (imp)", "imperial gallon", "BR", "219.9692"},
            {"gal (US)", "US gallon", "US", "264.172"}},
        {{"density"},
            {"kg/m³", "quilogram per cubic meter", "SI", "1"},
            {"g/cm³", "gram per cubic centimeter", "SI", "0.001"}},
        {{"force"},
            {"N", "newton", "SI", "1"},
            {"kgf", "quilogram-force", "MT", "1/9.8067"},
            {"sm", "solar mass", "AS", "5.0279e-31"}},
        {{"pressure"},
            {"Pa", "pascal", "SI", "1"},
            {"bar", "bar", "MT", "1e-5"},
            {"psi", "pound per square inch", "BR", "1/6894.7573"},
            {"mmHg", "milimeter of mercury", "..", "1/133.322"},
            {"atm", "atmosphere", "..", "1/101325"}},
        {{"energy"},
            {"J", "joule", "SI", "1"},
            {"kWh", "quilowatt-hour", "..", "1/3600000"},
            {"erg", "erg", "AS", "1e7"},
            {"eV", "electron-volt", "..", "6.2415e18"}},
        {{"power"},
            {"W", "watt", "SI", "1"},
            {"kW", "quilowatt", "..", "0.001"},
            {"hp", "horse-power", "BR", "1/745.7"},
            {"BTU/h", "BTU per hour", "BR", "3.412141"}},
        {{"dimensionless"}, // for ratios as efficiency and friction coefficient
            {"", "", "", "1"}},
        {{"constant"}, // for universal constants
            {"", "", "", ""}}
    };
    
    /**
     * A 2D-matrix to access Physics constants.
     * <p>
     * [i][id]=> i: constant index | id: data index.
     * id = 0: Constant name | id = 1: SI value | id = 2: SI unit.
     */
    public static final String[][] PHYSICS_CONSTANTS = {
        {"gravitational acceleration", "9.81", "m/s²"},
        {"average sea level gravitational field", "9.81", "N/kg"},
        {"average sea level atmospheric pressure", "101325", "Pa"}
    };
    
    private boolean typeTest(String typeToTest)
        {for (int i = 0; i < UNITS.length; i++){
            if (typeToTest.equals(UNITS[i][0][0])){return true;}}
        return false;}
    
    
    //Constructors, getters, setters, toString and toArray
    
    // Full constructor (for known variables)
    public Quantity(String type, boolean vector, boolean unknown,
            String symbol, double value, String unit){
        if (typeTest(type)){this.type = type;}
        else{System.out.println("Raise app. Exception: type not registered");}
        this.vector = vector; this.unknown = unknown;
        this.symbol = symbol; this.value = value; this.unit = unit;}
    
    // Simple constructor (for unknown variables)
    public Quantity(String type, String symbol, boolean vector, boolean unknown){
        if (typeTest(type)){this.type = type;}
//        else{throw IllegalArgumentException;} Ver como fazer
        this.symbol = symbol; this.vector = vector; this.unknown = unknown;}
    
    public double getValue() {return value;}
    public void setValue(double value) { // Estabelecer um valor 
        if (value < 0 & !this.isVector()){
            System.out.println("Raise ap. exception: "
                    + "scalar quantities can't have negative values");}
        else {this.value = value;}}

    public String getSymbol() {return symbol;}
    public void setSymbol(String symbol) {this.symbol = symbol;}
    
    public String getUnit() {return unit;}
    public void setUnit(String unit) {this.unit = unit;}

    public String getType() {return type;}
    public void setType(String type){
        if (typeTest(type) == true){this.type = type;}
        else{System.out.println("Raise app. Exception: type not registered");}}

    public boolean isVector() {return vector;}
    public void setVector(boolean vector) {this.vector = vector;}
    
    public boolean isUnknown() {return unknown;}
//    public void setUnknown(boolean unknown) {this.unknown = unknown;} || Maybe it's unsafe n' useless

    public String toString(boolean forTest) {
        if (!forTest){return value + " " + unit;}
        else{return "Type: "+type
                +" | Is vector: "+vector
                +" | Unknown: "+unknown
                +" | Symbol: " +symbol
                +" | Value: "+value+" "+unit;}}
    
    /**
    * Converts a Quantity instance to certain a unit.
    * <p>
    * Received an instance, identifies its type attribute by iterating the
    * constant UNITS, which contains a small base of different types of
    * quantities and their main units. Thereafter, it defines the factor of
    * conversion according to the argument and the instance unit attribute.
    * Finally, the instance value and unit are reseted.
    * 
    * @param unitNeeded: the unit the instance unit need to be reseted.
    */
    public void converter(String unitNeeded){
        // Searching for unit type:
        if (this.getUnit().equals(unitNeeded)){return;} // No conversion needed
        if (this.getType().equals("constant"))
            {System.out.println("Throw proper exception: constant may not be converted");
            return;}
        
        String siUnit = "";
        int thisTypeIndex = UNITS.length;
        for (int i = 0; i < UNITS.length; i++){
            if (this.getType().equals(UNITS[i][0][0])){
                thisTypeIndex = i; siUnit = UNITS[thisTypeIndex][1][0];
                break;}
        }
        if (thisTypeIndex == UNITS.length) {System.out.println("Error");}
        
        double factor;
        
        // Search for quantity unit symbol and setting the object value:
        if (this.getUnit().equals(siUnit)){ // Object unit is from SI
            for (int unitIndex = 2; unitIndex < UNITS[thisTypeIndex].length; unitIndex++){
                if (unitNeeded.equals(UNITS[thisTypeIndex][unitIndex][0]))
                    {factor = Numeric.fractionParseDouble(UNITS[thisTypeIndex][unitIndex][3]);
                    this.setValue(this.getValue()*factor); }}}
        
        else if (unitNeeded.equals(siUnit)){ // Unit needed from SI
            for (int unitIndex = 2; unitIndex < UNITS[thisTypeIndex].length; unitIndex++){
                if (this.getUnit().equals(UNITS[thisTypeIndex][unitIndex][0])){
                    factor = Numeric.fractionParseDouble(UNITS[thisTypeIndex][unitIndex][3]);
                    this.setValue(this.getValue()/factor);}}}
        
        else { // Both unit needed and object unit aren't from SI
            double factorToSI=0, factorToNeeded=0;
            for (int unitIndex = 2; unitIndex < UNITS[thisTypeIndex].length; unitIndex++){
                if (this.getUnit().equals(UNITS[thisTypeIndex][unitIndex][0])){
                    factorToSI = Numeric.fractionParseDouble(UNITS[thisTypeIndex][unitIndex][3]);
                    break;}}
                //"Raise index exception: unit symbol isn't valid.");
            for (int symbolIndex = 2; symbolIndex < UNITS[thisTypeIndex].length; symbolIndex++){
                if (unitNeeded.equals(UNITS[thisTypeIndex][symbolIndex][0])){
                    factorToNeeded = Numeric.fractionParseDouble(UNITS[thisTypeIndex][symbolIndex][3]);
                    break;}}
                //"Raise index exception: unit symbol isn't valid.");
            factor = ((1/factorToSI)*factorToNeeded);
            this.setValue(this.getValue()*factor); this.setUnit(unitNeeded);}
    
        this.setUnit(unitNeeded);}
    
    /**
    * Set a Quantity instance value if it is unknown in a problem.
    * <p>
    * Received an instance, identifies its type attribute by iterating the
    * constant UNITS, which contains a small base of different types of
    * quantities and their main units. Finally, the instance value and unit are
    * reseted according to the argument.
    * 
    * @param unit: the unit the instance unit need to be reseted.
    */
    public void unkValueUnitSetting(String unit){
        if (!this.isUnknown())
            {System.out.println("Throw proper exception: shall be used only on unkwon values!");}
        else {
            byte i;
            for (i = 0; i < Quantity.UNITS.length; i++)
                {if(this.getType().equals(Quantity.UNITS[i][0][0])){break;}}

            this.setUnit(Quantity.UNITS[i][1][0]);
            if (!unit.equals(Quantity.UNITS[i][1][0])){this.converter(unit);}
        }}
}