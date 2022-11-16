package Modun;

import Inteface.IDocument;
import Utils.Validate;

import java.util.List;
import java.util.Scanner;

public class Magazine extends Document implements IDocument {
    private int issueNumber;
    private int releaseMonth;

    public Magazine(){}

    public Magazine(int ID, String name, int releaseNumber, int issueNumber, int releaseMonth) {
        super(ID, name, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public void inputMagazine(List<Document> documentList){
        Scanner scanner = new Scanner(System.in);
        super.inputDocument(documentList);
        this.issueNumber = Validate.getInt(scanner,"Enter issue number: ");

        boolean checkMonth = true;
       do{
           this.releaseMonth = Validate.getInt(scanner, "Enter releas Month: ");
           if(getReleaseMonth() < 1 || getReleaseMonth() > 12)
               checkMonth = false;
       }while (!checkMonth);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(
                " Issue number : " + this.issueNumber + "\t"
                        +"Release month: " + this.releaseMonth + "\n");
    }
}
