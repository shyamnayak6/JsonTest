import java.util.ArrayList;

import com.google.gson.Gson;
public class App {

    public static void main(String[] args) {

        JsonTemp jsonTemp= getJsonData();
        System.out.println(new Gson().toJson(jsonTemp));


    }

    private static JsonTemp getJsonData() {

        JsonTemp jsonTemp= new JsonTemp();
        Participant participant= new Participant();
        Requester requester = new Requester();
        UserContext userContext = new UserContext();
        ArrayList<String> mediaList= new ArrayList<String >();
        mediaList.add("CDF");
        mediaList.add("VIDeO");
        jsonTemp.setMediaType(mediaList);

        participant.setPrimaryUuid("87a13b16-68ba-4492-9eae-3532ab1d0b51");
        userContext.setSessionTabId("@loginResponse.sessionId1");
        requester.setUserContext(userContext);
        requester.setPrimaryUuid("fed3b526-6bf2-4033-bb91-74a279c8e77e");
        jsonTemp.setParticipant(participant);
        jsonTemp.setRequester(requester);
        jsonTemp.setCallType("INAPP_CALL");

return jsonTemp;
    }
}
