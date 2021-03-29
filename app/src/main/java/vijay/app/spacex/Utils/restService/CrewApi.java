package vijay.app.spacex.Utils.restService;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import vijay.app.spacex.model.CrewMember;

public interface CrewApi {
    @GET("/v4/crew")
    Call<List<CrewMember>> getCrewMembers();

}
