package enumeracion;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "5 billones"),
    ASIA(44, "10 billones"),
    AMERICA(34, "20 billones"),
    OCEANIA(14, "25 billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
