
package numeric_classes;

/**
 *
 * @author Geovane
 */
public enum QuantityName {
    COEFFICIENT_OF_FRICTION("coeficiente de atrito", "coefficient of friction", QuantityFamily.DIMENSIONLESS),
    EFFICIENCY("coeficiente de atrito", "coefficient of friction", QuantityFamily.DIMENSIONLESS),
    
    SIDE("lado", "side", QuantityFamily.LENGTH),
    PERIMETER("perímetro", "perimeter", QuantityFamily.LENGTH),
    DIAGONAL("diagonal", "diagonal", QuantityFamily.LENGTH),
    DISTANCE("distância", "distance", QuantityFamily.LENGTH),
    POSITION("posição", "position", QuantityFamily.LENGTH),
    DISPLACEMENT("deslocamento", "displacement", QuantityFamily.LENGTH),
    HEIGHT("altura", "height", QuantityFamily.LENGTH), 
    LENGTH("comprimento", "length", QuantityFamily.LENGTH), 
    WIDTH("largura", "width", QuantityFamily.LENGTH), 
    DEPTH("profundidade", "depth", QuantityFamily.LENGTH),
    AREA("área", "area", QuantityFamily.AREA),
    SURFACE("superfície", "surface", QuantityFamily.AREA),
    VOLUME("volume", "volume", QuantityFamily.VOLUME),
    
    INSTANT("instante", "instant", QuantityFamily.TIME),
    TIME_SPAN("intervalo", "time span", QuantityFamily.TIME), 
    
    SPEED("rapidez", "speed", QuantityFamily.VELOCITY),
    VELOCITY("velocidade", "velocity", QuantityFamily.VELOCITY),
    ACCELERATION("aceleração", "acceleration", QuantityFamily.ACCELERATION),
    
    MASS("massa", "mass", QuantityFamily.MASS),
    
    FORCE("força", "force", QuantityFamily.FORCE),
    FRICTION("atrito", "friction", QuantityFamily.FORCE),
    WEIGHT("peso", "weight", QuantityFamily.FORCE),
    ELASTIC_FORCE("força elástica", "elastic force", QuantityFamily.FORCE),
    SPRING_CONSTANT("constante elástica da mola", "spring constant", QuantityFamily.FORCE_BY_LENGTH),
    DRAG("arrasto", "drag", QuantityFamily.FORCE),
    BUOYANCY("empuxo", "buoyancy", QuantityFamily.FORCE),
    
    PRESSURE("pressão", "pressure", QuantityFamily.PRESSURE),
    
    WORK("trabalho", "work", QuantityFamily.ENERGY),
    KINETIC_ENERGY("energia cinética", "kinect energy", QuantityFamily.ENERGY),
    GRAVITATIONAL_ENERGY("energia potencial gravitacional", "gravitational energy", QuantityFamily.ENERGY),
    ELASTIC_ENERGY("energia potencial elástica", "elastic energy", QuantityFamily.ENERGY),
    HEAT("calor", "heat",QuantityFamily.ENERGY),
    ENTALPY("entalpia", "entalpy", QuantityFamily.ENERGY),
    
    CHARGE("carga", "charge", QuantityFamily.CHARGE),
    ;
    
    private final String portugueseWriting, englishWriting;
    private final QuantityFamily family;

    private QuantityName(String ptW, String enW, QuantityFamily family) {
        this.portugueseWriting = ptW;
        this.englishWriting = enW;
        this.family = family;
    }

    public String getPortugueseWriting() {return portugueseWriting;}
    public String getEnglishWriting() {return englishWriting;}
    public QuantityFamily getFamily() {return family;}
    
    
}
