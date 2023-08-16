import java.util.LinkedHashMap;
import java.util.Map;

public class Counter {
    private String[] datas;
    private Map<String, Integer> count;

    public Counter(String[] datas) {
        this.datas = datas;
        this.count = new LinkedHashMap<>();
    }
    public void countData() {
        for (String data : datas) {
            /*String dataCount = data.toLowerCase(); Dejo este código porque, esta línea haría que se cuente cada palabra repetida sin distinguir
            * capitalización, por ejemplo Esta esta = esta, 2. */
            count.put(data, count.getOrDefault(data, 0) + 1);
        }
    }

    public Map<String, Integer> getCount() {
        return count;
    }
}