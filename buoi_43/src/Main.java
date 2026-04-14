public class Main {

    public static void main(String[] args) throws Exception {

        Task task = new Task();
        task.showDataset();

        System.out.println("Test result:");
        Task.print(task.B10());

    }

}