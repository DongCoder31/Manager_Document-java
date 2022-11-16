package Modun;

import Inteface.IDocument;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;


public class Document implements IDocument {
    private int ID;
    private String name;
    private int releaseNumber;

    public Document(){
        super();
    }

    public Document(int ID, String name, int releaseNumber) {
        super();
        this.ID = ID;
        this.name = name;
        this.releaseNumber = releaseNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public void display() {
        System.out.print("ID : " + this.ID + "\t"
                +"Name: " + this.name + "\t"
                + "Release number: " + this.releaseNumber +"\t");

    }

    public void inputDocument(List<Document> documentList){
        Scanner scanner = new Scanner(System.in);
        this.ID = (documentList.size() > 0) ? (documentList.size() + 1) : 1;
        this.name = Validate.getString(scanner, "Enter  name document: ");
        this.releaseNumber = Validate.getInt(scanner,"Enter release number:");

    }

}
