package Modun;

import Inteface.IDocument;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class NewsPaper extends Document implements IDocument {
    private String releaseDate;
    public NewsPaper(){}

    public NewsPaper(int ID, String name, int releaseNumber, String releaseDate) {
        super(ID, name, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void inputNewsPaper(List<Document> documentList){
        Scanner scanner = new Scanner(System.in);
        super.inputDocument(documentList);
        this.releaseDate = Validate.getDay(scanner, "Enter releas day: ");

    }

    @Override
    public void display() {
        super.display();
        System.out.println(
                " Release date : " + this.releaseDate + "\n");
    }
}
