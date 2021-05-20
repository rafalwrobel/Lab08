package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface AktualizacjeDAO {

    // Wstawienie rekordu
    @Insert
    public void insert(Aktualizacje aktualizacje);

    @Query("SELECT * FROM AktualizacjeZmianProduktow WHERE _id_warzywa = :idWybranegoWarzywa")
    Aktualizacje[] pobierzHistorieZmianWarzywa(int idWybranegoWarzywa);

}