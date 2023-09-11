package it.paleocapa.labollita;

import java.text.SimpleDateFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Labollita", "Samuele", "Italia", "Bergamo", "11/03/2005", "C001");
        Volo volo = new Volo("V001", "Bergamo", "Roma", "01/10/2023", "08:00", "10:00", 150, 120.0);

        cliente.setCognome("Loda");
        cliente.setNome("Matilde");
        cliente.setnazioneNascita("Italia");
        cliente.setcittaNascita("Brescia");
        cliente.setDataNascita("30/07/2006");

        volo.setaeroportoP("Bergamo");
        volo.setaeroportoA("Napoli");
        volo.setDataVolo("16/10/2023");
        volo.setoraP("09:00");
        volo.setoraA("11:00");
        volo.setNumeroPosti(180);
        volo.setCostoVolo(150.0);

        System.out.println("Dati del cliente: " + cliente.getNome() + " " + cliente.getCognome());
        System.out.println("Dati del volo: " + volo.getCodiceVolo() + " " + volo.getaeroportoP() + " - " + volo.getaeroportoA());
    }

    /*public static String generaCodiceCliente(Cliente cliente) {
        
        String nome = cliente.getNome();
        String cognome = cliente.getCognome();
        String dataNascita = cliente.getdataNascita();

        String inizialiNome = nome.substring(0, 2).toUpperCase();
        String inizialiCognome = cognome.substring(0, 2).toUpperCase();

        String sdf = new SimpleDateFormat("ddMMyyyy").format(dataNascita);
        String dataNascitaCod = sdf.substring(0, 2);

        Random random = new Random();
        int numeroCasuale = random.nextInt(900) + 100;

        String codiceCliente = inizialiCognome + inizialiNome + dataNascitaCod  + numeroCasuale;

        return codiceCliente;
    }*/
}