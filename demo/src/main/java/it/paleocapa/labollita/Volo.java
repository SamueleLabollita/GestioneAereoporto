package it.paleocapa.labollita;

class Volo {
    private String codiceVolo;
    private String aeroportoPartenza;
    private String aeroportoArrivo;
    private String dataVolo;
    private String oraPartenza;
    private String oraArrivo;
    private int numeroPosti;
    private double costoVolo;

    public Volo(String codiceVolo, String aeroportoPartenza, String aeroportoArrivo, String dataVolo, String oraPartenza, String oraArrivo, int numeroPosti, double costoVolo) {
        this.codiceVolo = codiceVolo;
        this.aeroportoPartenza = aeroportoPartenza;
        this.aeroportoArrivo = aeroportoArrivo;
        this.dataVolo = dataVolo;
        this.oraPartenza = oraPartenza;
        this.oraArrivo = oraArrivo;
        this.numeroPosti = numeroPosti;
        this.costoVolo = costoVolo;
    }

    public String getCodiceVolo() {
        return codiceVolo;
    }

    public String getAeroportoPartenza() {
        return aeroportoPartenza;
    }

    public String getAeroportoArrivo() {
        return aeroportoArrivo;
    }

    public String getDataVolo() {
        return dataVolo;
    }

    public String getOraPartenza() {
        return oraPartenza;
    }

    public String getOraArrivo() {
        return oraArrivo;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public double getCostoVolo() {
        return costoVolo;
    }

    public void setAeroportoPartenza(String aeroportoPartenza) {
        this.aeroportoPartenza = aeroportoPartenza;
    }

    public void setAeroportoArrivo(String aeroportoArrivo) {
        this.aeroportoArrivo = aeroportoArrivo;
    }

    public void setDataVolo(String dataVolo) {
        this.dataVolo = dataVolo;
    }

    public void setOraPartenza(String oraPartenza) {
        this.oraPartenza = oraPartenza;
    }

    public void setOraArrivo(String oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public void setCostoVolo(double costoVolo) {
        this.costoVolo = costoVolo;
    }
    
    public void modificaDati(String aeroportoPartenza, String aeroportoArrivo, String dataVolo, String oraPartenza, String oraArrivo, int numeroPosti, double costoVolo) {
        this.aeroportoPartenza = aeroportoPartenza;
        this.aeroportoArrivo = aeroportoArrivo;
        this.dataVolo = dataVolo;
        this.oraPartenza = oraPartenza;
        this.oraArrivo = oraArrivo;
        this.numeroPosti = numeroPosti;
        this.costoVolo = costoVolo;
    }
}