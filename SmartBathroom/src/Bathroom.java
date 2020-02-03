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

    public void addStall(StallNumber stallNumber) {
        if (!stalls.containsKey(stallNumber)) {
            stalls.put(stallNumber, Status.Empty);
        }
    }

    public void enterStall(StallNumber stallNumber) {
        Status stallStatus = stalls.get(stallNumber);
        // guess it's a magic bathroom too
        if (stallStatus == null || stallStatus.equals(Status.Empty)) {
            stalls.put(stallNumber, Status.InUse);
        }
    }

    public void exitStall(StallNumber stallNumber) {
        Status prevStatus = stalls.get(stallNumber);
        if (prevStatus != null && prevStatus.equals(Status.InUse)) {
            stalls.put(stallNumber, Status.Empty);
        }
    }
}
