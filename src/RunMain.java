import Main.ManagerDocument;
import Modun.Document;
import Utils.Menu;
import Utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Document> documentList = new ArrayList<>();
        ManagerDocument mn = new ManagerDocument(documentList);
        int i;

        do {
            Menu.menu();
            do {
                i = Validate.getInt(scanner,"Choice: ");
                if ((i < 1) || (i > 5))
                    System.out.println("Enter a number from 1 to 6");
            } while ((i < 1) || (i > 5));

            switch (i) {
                case 1-> {
                    mn.addDocumnet();
                    System.out.println();
                }
                case 2 -> {
                    mn.showAllStudentList();
                    System.out.println();
                }
                case 3 -> {
                    String st ;
                    st = Validate.getString(scanner,"Enter Keyword: ");
                    mn.seachDocument(st);
                    System.out.println();
                }
                case 4 -> {
                    int ch;
                    ch = Validate.getInt(scanner,"Enter Keyword: ");
                    mn.delete(ch);
                    System.out.println();
                }
                case 5 -> System.out.println("Program is finished");
            }
        } while (i != 5);
    }

}
