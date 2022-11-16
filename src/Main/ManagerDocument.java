package Main;

import Modun.Book;
import Modun.Document;
import Modun.Magazine;
import Modun.NewsPaper;
import Utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerDocument {
    private static List<Document> documentList = new ArrayList<>();

    public ManagerDocument(List<Document> documentList) {
    }

    public static List<Document> getDocumentList() {
        return documentList;
    }

    public static void setDocumentList(List<Document> documentList) {
        ManagerDocument.documentList = documentList;
    }

    //Handle

    public void addDocumnet() {
        Scanner scanner = new Scanner(System.in);
        Book book;
        Magazine magazine;
        NewsPaper newsPaper;
        int ch;
        System.out.println("Select document:\n(0) Book.\n (1) Magazine. \n (2) NewsPaper");
        ch = Validate.getInt(scanner, "Enter select: ");
        if(ch == 0){
            System.out.println("Enter Information Book:");
            book = new Book();
            book.inputBook(documentList);
            documentList.add(book);
        }else if (ch == 1){
            System.out.println("Enter Information Magazine:");
            magazine = new Magazine();
            magazine.inputMagazine(documentList);
            documentList.add(magazine);
        }else {
            System.out.println("Enter Information NewsPaper:");
            newsPaper = new NewsPaper();
            newsPaper.inputNewsPaper(documentList);
            documentList.add(newsPaper);
        }
    }

    public void showAllStudentList() {
        System.out.println("Show All Employ List:");
        for (Document doc : documentList) {
            doc.display();
        }
    }

    public void delete(int índex ){
        int d = 0;
        System.out.println("List after deletion");
        for (int i = 0; i < documentList.size(); i++){
            if(documentList.get(i).getID() == índex)
            {
                documentList.remove(i);
                d++;
            }
        }
        if(d==0)
            System.out.println("No data index.");
        else {
            System.out.println("Delete successful.");
            showAllStudentList();
        }
    }

    public void seachDocument(String st) {
        System.out.println("Show All Employ List:");
        for (Document doc : documentList) {
            if (st.equalsIgnoreCase("book")) {
                if (doc instanceof Book)
                    doc.display();
            }
            else if (st.equalsIgnoreCase("magazine")) {
                if (doc instanceof Magazine)
                    doc.display();
            }
            else if (st.equalsIgnoreCase("newspaper")) {
                if (doc instanceof NewsPaper)
                    doc.display();
            }else{
                System.out.println("No data");
            }
        }
    }
}
