package it.paleocapa.labollita;

import java.text.SimpleDateFormat;
import java.util.Random;

class Cliente {
    private String cognome;
    private String nome;
    private String nazioneNascita;
    private String cittaNascita;
    private String dataNascita;
    private String codiceCliente;

    public Cliente(String cognome, String nome, String nazioneNascita, String cittaNascita, String dataNascita, String codiceCliente) {
        this.cognome = cognome;
        this.nome = nome;
        this.nazioneNascita = nazioneNascita;
        this.cittaNascita = cittaNascita;
        this.dataNascita = dataNascita;
        this.codiceCliente = codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getnazioneNascita() {
        return nazioneNascita;
    }

    public String getcittaNascita() {
        return cittaNascita;
    }

    public String getdataNascita() {
        return dataNascita;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setnazioneNascita(String nazioneNascita) {
        this.nazioneNascita = nazioneNascita;
    }

    public void setcittaNascita(String cittaNascita) {
        this.cittaNascita = cittaNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setcodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }
    
    /*public String generaCodiceCliente() {
        
        String inizialiNome = nome.substring(0, 2).toUpperCase();
        String inizialiCognome = cognome.substring(0, 2).toUpperCase();

        String sdf = new SimpleDateFormat("ddMMyyyy").format(dataNascita);
        String dataNascitaCod = sdf.substring(0, 2);

        Random random = new Random();
        int numeroCasuale = random.nextInt(900) + 100;

        codiceCliente = inizialiCognome + inizialiNome + dataNascitaCod  + numeroCasuale;

        return codiceCliente;
    }*/

    public void modificaDati(String cognome, String nome, String nazioneNascita, String cittaNascita, String dataNascita, String codiceCliente) {
        this.cognome = cognome;
        this.nome = nome;
        this.nazioneNascita = nazioneNascita;
        this.cittaNascita = cittaNascita;
        this.dataNascita = dataNascita;
        this.codiceCliente = codiceCliente;
    }
}