import java.util.*;

public class InsertNamesIntoQuery {
    //need to add an option for adding questions for the categories.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[5000];
        int i = 0;
        System.out.println("Enter the names in separate rows: ");

        for (; scanner.hasNextLine(); i++){
            names[i] = scanner.nextLine();
        }
        for (int j = 0; j<i; j++){
            System.out.println("\"" + names[j] + "\" ");
        }
    }
}