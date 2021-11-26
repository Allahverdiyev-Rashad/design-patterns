package structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WorkerUtil {
    public static List<Worker> getWorkerList() {
        Worker james = new Worker("James", "123", false);
        Worker john = new Worker("John", "1234", false);
        Worker veronica = new Worker("Veronica", "12345", true);

        List<Worker> workers = new ArrayList<>();
        workers.add(james);
        workers.add(john);
        workers.add(veronica);

        return workers;
    }

    public static Map<String, Worker> getUserNameWorkerMap() {
        List<Worker> workers = getWorkerList();

        Map<String, Worker> map = new LinkedHashMap<>();
        for (Worker worker : workers) {
            map.put(worker.getName(), worker);
        }

        return map;
    }

    public static Worker getWorkerByUserName(String userName) {
        Map<String, Worker> map = getUserNameWorkerMap();
        return map.get(userName);
    }

    public static boolean isUserValid(String name, String password) {

        boolean isUserValid = false;
        Worker worker = getWorkerByUserName(name);

        if (worker != null) {
            isUserValid = worker.getPassword().equals(password);
        }
        return isUserValid;
    }
}
