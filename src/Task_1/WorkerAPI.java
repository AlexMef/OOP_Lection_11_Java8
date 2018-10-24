package Task_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WorkerAPI implements Comparable<Worker> {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        WorkerFixed worker1 = new WorkerFixed(1, "Peter", 1300, 100);
        WorkerHourly worker2 = new WorkerHourly(2, "Serge", 25);
        workers.add(worker1);
        workers.add(worker2);
        workers.add(new WorkerFixed(3, "Bogdan", 3400, 200));
        File file = new File("sometext.txt");
        boolean isEmpty = !file.exists() || file.length() == 0;
        if (!isEmpty) file.delete();
        for (Worker worker : workers) {
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
            System.out.println("String builder");
            System.out.println(builder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Double> listOfPayments = new ArrayList<>();
        for (Worker wrk:workers) {
            listOfPayments.add(wrk.getPayment());
        }
        Collections.sort(listOfPayments);

        for (double d: listOfPayments) {
            System.out.println(d);
        }
    }

    private static void fileWriter(Worker worker) {
        try {
            FileWriter writer = new FileWriter("sometext.txt", true);
            writer.append(worker.toString()).append("\n");
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // FIXME: 23.10.2018 implement sorting of arraylist of workers
    private static void sortArray(ArrayList<Worker> arrayList){
        double min_payment = 0;
        for (Worker wrk:arrayList) {
            if (min_payment == 0){
                min_payment = wrk.getPayment();
            }
            if (min_payment < wrk.getPayment()){
                min_payment = wrk.getPayment();
            }
        }
    }


    @Override
    public int compareTo(Worker o) {
        return toString().compareTo(o.toString());
    }


}
