import java.util.Scanner;

public class pesanan {



    public static void main(String[] args) {
        //object
       // RMHMKN mkn = new RMHMKN("","0103");
        
       //System.out.println(mkn.infopesanan());
       //System.out.println("-----------------------");
       //System.out.println(mkn.infopesanan("90.000"));
       
       //error handling
       try{
           //io sederhana
       Scanner scanner = new Scanner(System.in);
       
       //array
      Detailpesanan[] mkn = new Detailpesanan[2];
      
      //perulangan
      for (int i=0; i<mkn.length; i++){
      System.out.print("Masukan Nama Pembeli " +(i+1)+": ");
      String nama = scanner.nextLine();
      System.out.print("Masukan Kode Pesanan " +(i+1)+": ");
      String kdpesanan = scanner.nextLine();
      
      //object
      mkn[i] = new Detailpesanan(nama,kdpesanan);
      }
      //perulangan
      for(Detailpesanan data:mkn){
      System.out.println("----------------------------");
      System.out.println ("Detail pesanan:");
      System.out.println(data.infopesanan());
      }
       }catch (NumberFormatException e){
         System.out.println("Kesalahan Format kode:"+e.getMessage());
       }catch (Exception e) {
      System.out.println("Kesalahan kode:"+e.getMessage());
       }
    }
           
       }
           
      
       
      
      
      
   
    

 