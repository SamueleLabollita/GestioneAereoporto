package it.paleocapa.labollita;

import java.io.*;
import java.util.*;
import java.util.List;

public class ContenitoreVoli {
    private HashMap<String, Volo> voli = new HashMap<>();

    public void aggiungiVolo(Volo volo) {
        voli.put(volo.getCodiceVolo(), volo);
    }

    public void eliminaVolo(String codiceVolo) {
        voli.remove(codiceVolo);
    }

    public Volo cercaVoloPerCodice(String codiceVolo) {
        return voli.get(codiceVolo);
    }

    public int size() {
        return voli.size();
    }
    
    public List<Volo> cercaVoliPerParametri(String data, String aeroportoP, String aeroportoA, String oraP) {
        List<Volo> risultato = new ArrayList<>();
        for (Volo volo : voli.values()) {
            if (volo.getDataVolo().equals(data) &&
                volo.getaeroportoP().equalsIgnoreCase(aeroportoP) &&
                volo.getaeroportoA().equalsIgnoreCase(aeroportoA) &&
                volo.getoraP().equals(oraP)) {
                risultato.add(volo);
            }
        }
        return risultato;
    }

    public void salvaSuFile(String nomeFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
            oos.writeObject(voli);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
