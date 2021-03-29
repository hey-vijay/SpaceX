package vijay.app.spacex.database.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import vijay.app.spacex.model.CrewMember;

@Dao
public interface AppDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertMembers(List<CrewMember> crewMembers);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertMember(CrewMember crewMember);

    @Query("DELETE FROM crew_member")
    void deleteAll();

    @Query("SELECT * FROM crew_member")
    LiveData<List<CrewMember>> getAllCrewMember();

}
