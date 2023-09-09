package it.paleocapa.labollita;

import java.util.HashMap;

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

    public List<Volo> cercaVoliPerParametri(String data, String aeroportoPartenza, String aeroportoArrivo, String oraPartenza) {
        List<Volo> risultato = new ArrayList<>();
        for (Volo volo : voli.values()) {
            if (volo.getDataVolo().equals(data) &&
                volo.getAeroportoPartenza().equalsIgnoreCase(aeroportoPartenza) &&
                volo.getAeroportoArrivo().equalsIgnoreCase(aeroportoArrivo) &&
                volo.getOraPartenza().equals(oraPartenza)) {
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
