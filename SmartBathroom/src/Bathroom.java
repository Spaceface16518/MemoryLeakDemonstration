import java.util.HashMap;
import java.util.Map;

// TODO: should use exceptions here, not a boolean return
public class Bathroom {
    private HashMap<StallNumber, Status> stalls;

    public Bathroom() {
        this.stalls = new HashMap<>();
    }

    public StallNumber findStall() {
        for (Map.Entry<StallNumber, Status> stall : stalls.entrySet()) {
            if (!stall.getValue().equals(Status.InUse)) {
                return stall.getKey();
            }
        }
        return null;
    }

    public Status checkStall(StallNumber stallNumber) {
        return stalls.get(stallNumber);
    }

    public boolean addStall(StallNumber stallNumber) {
        if (!stalls.containsKey(stallNumber)) {
            stalls.put(stallNumber, Status.Empty);
            return true;
        } else {
            return false;
        }
    }

    public boolean enterStall(StallNumber stallNumber) {
        Status stallStatus = stalls.get(stallNumber);
        if (stallStatus != null && stallStatus.equals(Status.InUse)) {
            return false;
        } else {
            stalls.put(stallNumber, Status.InUse);
            return true;
        }
    }

    public boolean exitStall(StallNumber stallNumber) {
        Status prevStatus = stalls.get(stallNumber);
        if (prevStatus != null && prevStatus.equals(Status.InUse)) {
            stalls.put(stallNumber, Status.Empty);
            return true;
        } else {
            return false;
        }
    }
}
