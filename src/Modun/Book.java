package Modun;

import Inteface.IDocument;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class Book extends Document implements IDocument {
    private String author;
    private int numPage;
    public Book(){
    }
    public Book(int ID, String name, int releaseNumber, String author, int numPage) {
        super(ID, name, releaseNumber);
        this.author = author;
        this.numPage = numPage;
    }

    public void inputBook(List<Document> documentList){
        Scanner scanner = new Scanner(System.in);
        super.inputDocument(documentList);
        this.numPage = Validate.getInt(scanner,"Enter num page: ");
        this.author = Validate.getString(scanner, "Enter author: ");
    }

    @Override
    public void display() {
        super.display();
        System.out.print(
                " Author : " + this.author + "\t"
                +"Num page: " + this.numPage + "\n");
    }
}
