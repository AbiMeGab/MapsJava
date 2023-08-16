import java.util.Map;

public class Printer {
    private Map<String, Integer> count;

    public Printer(Map<String, Integer> count) {
        this.count = count;
    }

    public void printCount() {
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
