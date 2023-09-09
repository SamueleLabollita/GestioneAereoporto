package it.paleocapa.labollita;
class Cliente {
    private String cognome;
    private String nome;
    private String nazioneDiNascita;
    private String cittaDiNascita;
    private String dataDiNascita;
    private String codiceCliente;

    public Cliente(String cognome, String nome, String nazioneDiNascita, String cittaDiNascita, String dataDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.nazioneDiNascita = nazioneDiNascita;
        this.cittaDiNascita = cittaDiNascita;
        this.dataDiNascita = dataDiNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getNazioneDiNascita() {
        return nazioneDiNascita;
    }

    public String getCittaDiNascita() {
        return cittaDiNascita;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
    
    private String generaCodiceCliente() {
        
        String inizialiCognome = cognome.substring(0, 2).toUpperCase();
        String inizialiNome = nome.substring(0, 2).toUpperCase();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dataNascitaCod = sdf.substring(6, 7);

        Random random = new Random();
        int numeroCasuale = random.nextInt(900) + 100;

        codiceCliente = inizialiCognome + inizialiNome + dataNascitaCod  + numeroCasuale;

        return codiceCliente;
    }

    public void modificaDati(String cognome, String nome, String nazioneDiNascita, String cittaDiNascita, String dataDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.nazioneDiNascita = nazioneDiNascita;
        this.cittaDiNascita = cittaDiNascita;
        this.dataDiNascita = dataDiNascita;
    }
}