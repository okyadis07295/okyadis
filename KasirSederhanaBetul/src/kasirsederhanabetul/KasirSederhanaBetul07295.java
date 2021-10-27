package kasirsederhanabetul;
import java.util.Scanner;

public class KasirSederhanaBetul07295 {

    public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan banyak Customer = ");
        int banyak=scan.nextInt();
        
        String[] nama= new String[banyak];
        int[] harga07295=new int[banyak];
        int diskon07295;
        
        System.out.println("Menghitung sisa dari diskon");
        for(int i=0;i<banyak;i++){
        
            System.out.println("Masukan data ke- "+(i+1));
            System.out.print("Nama  = ");
            nama[i]=scan.next();
            System.out.print("Harga  = ");
            harga07295[i]=scan.nextInt(); 
        }

        
        for( int i=0;i<banyak;i++){

        if (harga07295[i]>=500000){
        diskon07295=harga07295[i]*40/100;
        harga07295[i]= harga07295[i]-diskon07295;                
        }
        
        else if (harga07295[i]>=350000){
        diskon07295=harga07295[i]*25/100;
        harga07295[i]= harga07295[i]-diskon07295;               
        }
                
        else if(harga07295[i]>=200000){
        diskon07295=harga07295[i]*20/100;
        harga07295[i]= harga07295[i]-diskon07295;
    }
        }
        
        
        System.out.println("========");
        System.out.println("\nOUTPUT");
        System.out.println("========");
            for(int i=0;i<banyak;i++){
            System.out.println("Masukan data ke- "+(i+1));
            System.out.println("Nama  = "+nama[i]);
            System.out.println("Sisa  = "+harga07295[i]);
        }
    }
    
}

