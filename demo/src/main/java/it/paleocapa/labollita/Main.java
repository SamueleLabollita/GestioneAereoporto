package it.paleocapa.labollita;
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Labollita", "Samuele", "Italia", "Bergamo", "11/03/2005", "C001");
        Volo volo1 = new Volo("V001", "Bergamo", "Roma", "01/10/2023", "08:00", "10:00", 150, 120.0);

        // Modifica dati del cliente
        cliente1.setCognome("Loda");
        cliente1.setNome("Matilde");
        cliente1.setNazione("Italia");
        cliente1.setCitta("Brescia");
        cliente1.setDataNascita("30/07/2006");

        // Modifica dati del volo
        volo1.setAeroportoPartenza("Bergamo");
        volo1.setAeroportoArrivo("Napoli");
        volo1.setDataVolo("16/10/2023");
        volo1.setOraPartenza("09:00");
        volo1.setOraArrivo("11:00");
        volo1.setNumeroPosti(180);
        volo1.setCostoVolo(150.0);

        // Stampa dati del cliente e del volo
        System.out.println("Dati del cliente: " + cliente1.getNome() + " " + cliente1.getCognome());
        System.out.println("Dati del volo: " + volo1.getCodiceVolo() + " " + volo1.getAeroportoPartenza() + " - " + volo1.getAeroportoArrivo());
    }
}