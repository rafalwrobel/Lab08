package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PozycjaMagazynowaDAO {

    @Insert  //Automatyczna kwerenda wystarczy
    public void insert(pollub.ism.lab08.PozycjaMagazynowa pozycja);

    @Update //Automatyczna kwerenda wystarczy
    void update(pollub.ism.lab08.PozycjaMagazynowa pozycja);

    @Query("SELECT QUANTITY FROM Warzywniak WHERE NAME= :wybraneWarzywoNazwa") //Nasza kwerenda
    int findQuantityByName(String wybraneWarzywoNazwa);

    @Query("UPDATE Warzywniak SET QUANTITY = :wybraneWarzywoNowaIlosc WHERE NAME= :wybraneWarzywoNazwa")
    void updateQuantityByName(String wybraneWarzywoNazwa, int wybraneWarzywoNowaIlosc);

    @Query("SELECT COUNT(*) FROM Warzywniak") //Ile jest rekordów w tabeli
    int size();

    // Pobranie id konkretnego warzywa
    @Query("SELECT _id FROM Warzywniak WHERE NAME= :wybraneWarzywoNazwa")
    int idWarzywaPoNazwie(String wybraneWarzywoNazwa);
}