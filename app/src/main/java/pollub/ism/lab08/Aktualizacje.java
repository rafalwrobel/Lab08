package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "AktualizacjeZmianProduktow")
public class Aktualizacje {

    @PrimaryKey(autoGenerate = true)
    public int _id;
    public int _id_warzywa;
    public String data;
    public String czas;
    public int staraIlosc;
    public int nowaIlosc;

}