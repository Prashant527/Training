import java.util.Scanner;
class TaxAmount{
    public double calculateTaxAmount(int ctc){
        if(ctc>0 && ctc<=180000){
            return (ctc*0);
        }
        else if(ctc>=181001 && ctc<=300000){
            return (ctc*0.1);
        }
        else if(ctc>=300001 && ctc<=500000){
            return (ctc*0.2);
        }
        else{
            return (ctc*0.3);
        }
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int ctc=sc.nextInt();
        TaxAmount obj=new TaxAmount();
        System.out.println(obj.calculateTaxAmount(ctc));
    }
}