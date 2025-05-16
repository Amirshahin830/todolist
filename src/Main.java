import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


class Job{
    private String title;
    private boolean checkout;
    private String crateat;
    Job(String title){
        this.title = title;
        this.checkout = false;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        crateat = now.format(formatter);
    }
    void setCheckout(){
        this.checkout = true;
    }
    boolean isCheckout(){
        return this.checkout;
    }
    String getCrateat(){
        return this.crateat;
    }
    String getTitle(){
        return this.title;
    }
}

class ToDoList{
    private ArrayList<Job> job_list = new ArrayList<>();

    void addJob(String title){
        job_list.add(new Job(title));
    }
    void subjob(int index){
        job_list.remove(index);
    }
    void done(int index){
        job_list.get(index).setCheckout();
    }
    void printList(){
        int i = 0;
        for (Job lists : job_list) {

            System.out.println( i + " : " + (lists.isCheckout() ? "[✓]" : "[ ]") + " " + lists.getTitle() + " " + lists.getCrateat() );
            i+=1;
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ToDoList list = new ToDoList();
        while (true) {
            for (int i=0; i<5; i++) {
                System.out.println();
            }
            System.out.println(" <<<<<<   Hello To Do List :)   >>>>>> \n There are List of jobs of you to do it : ");
            list.printList();
            System.out.println("Enter Your Choice: 1=>add , 2=>sub , 3=>done ,4=>exit");
            int choice = Integer.parseInt(cin.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter Job name: ");
                    list.addJob(cin.nextLine());
                    break;
                case 2:
                    System.out.println("Enter Job index: ");
                    list.subjob(Integer.parseInt(cin.nextLine()));
                    break;
                case 3:
                    System.out.println("Enter Job index: ");
                    list.done(Integer.parseInt(cin.nextLine()));
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }


        }
    }
}