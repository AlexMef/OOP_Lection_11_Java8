import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> arrayList = new ArrayList<>();
        WorkerFixed worker1 = new WorkerFixed("Peter", 1300, 100);
        WorkerHourly worker2 = new WorkerHourly("Serge", 5, 50);
        arrayList.add(worker1);
        arrayList.add(worker2);
        File file = new File("sometext.txt");
        boolean isEmpty = !file.exists() || file.length() == 0;
        if (!isEmpty) file.delete();
        for (Worker worker : arrayList) {
            System.out.println(worker.toString());
            fileWriter(worker);
        }
        try {
            FileReader reader = new FileReader("sometext.txt");
            StringBuilder builder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char) c);
            }
            System.out.println("String bilda mafaka!!!");
            System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileWriter(Worker worker){
        try {
            FileWriter writer = new FileWriter("sometext.txt", true);
            writer.append(worker.toString()).append("\n");
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
