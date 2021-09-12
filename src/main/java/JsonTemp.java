import java.util.ArrayList;

public class JsonTemp {

    private String callType;
    ArrayList < String > mediaType=null;
    Requester RequesterObject;
    Participant ParticipantObject;

public ArrayList setMediaType(ArrayList<String> list){
    this.mediaType=list;
    return mediaType;
}
    // Getter Methods

    public String getCallType() {
        return callType;
    }

    public Requester getRequester() {
        return RequesterObject;
    }

    public Participant getParticipant() {
        return ParticipantObject;
    }

    // Setter Methods

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public void setRequester(Requester requesterObject) {
        this.RequesterObject = requesterObject;
    }

    public void setParticipant(Participant participantObject) {
        this.ParticipantObject = participantObject;
    }
}
class Participant {
    private String primaryUuid;


    // Getter Methods

    public String getPrimaryUuid() {
        return primaryUuid;
    }

    // Setter Methods

    public void setPrimaryUuid(String primaryUuid) {
        this.primaryUuid = primaryUuid;
    }
}
class Requester {
    private String primaryUuid;
    UserContext UserContextObject;


    // Getter Methods

    public String getPrimaryUuid() {
        return primaryUuid;
    }

    public UserContext getUserContext() {
        return UserContextObject;
    }

    // Setter Methods

    public void setPrimaryUuid(String primaryUuid) {
        this.primaryUuid = primaryUuid;
    }

    public void setUserContext(UserContext userContextObject) {
        this.UserContextObject = userContextObject;
    }
}
class UserContext {
    private String sessionTabId;


    // Getter Methods

    public String getSessionTabId() {
        return sessionTabId;
    }

    // Setter Methods

    public void setSessionTabId(String sessionTabId) {
        this.sessionTabId = sessionTabId;
    }

}

