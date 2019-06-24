import java.util.HashMap;
import java.util.Map;

public class RoleMonitor {

    private Map<String, Integer> roles = new HashMap<>();

    public void addRole(String role) {
        int count = 0;
        if (roles.containsKey(role)) {
            count = roles.get(role);
        }
        roles.put(role,++count);
    }

    public String out() {
        String s = "";
        for (Map.Entry<String, Integer> entry : roles.entrySet()) {
            s += entry.getKey() + " " + entry.getValue().toString() + "\n";
        }
        return s;
    }

}
