//inheritance
public class Detailpesanan extends RMHMKN {
    //overriding
    public Detailpesanan(String nama, String kodepesanan){
        super(nama,kodepesanan);
    }
 
 public String getkodepesanan(){
     String kdpsnn = getKdpesanan().substring(0, 2);
     //seleksi if
      if(kdpsnn.equals("01")){
         return "Sup Buntut";
     } else if (kdpsnn.equals("02")) {
        return "Ayam Bakar";
     } else if (kdpsnn.equals("03")) {
        return "Sate Ayam ";
     } else if (kdpsnn.equals("04")) {
        return "Soto Banjar";
     } else if (kdpsnn.equals("05")) {
        return "Rawon";
     } else {
         return "Menu tidak ada";
     }
 }

 public String getnomorantrian(){
     String nomorantrian = getKdpesanan().substring(2, 4);
   
     switch(nomorantrian){
         case "01":
             return "01";
         case "02":
             return "02";
         case "03":
             return "03";
         case "04":
             return "04";
         case "05":
             return "05";
         case "06":
             return "06";
         case "07":
             return "07";
         default:
             return "Nomor tidak ada";
     }
 }
 public String getkodecabang(){
     String kodecabang = getKdpesanan().substring(4, 7);
       //seleksi switch
     switch(kodecabang){
         case "001":
             return "kotabaru";
         case "002":
             return "Banjarmasin";
         case "003":
             return "Palangkaraya";
         case "004":
             return "Banjarbaru";
         case "005":
             return "Samarinda";
         
         default:
             return "Cabang Tidak Tersedia";
        }
    }
 
 public int getNoruangan(){
        return Integer.parseInt(getKdpesanan().substring(7,9));
    }

    //polymorphism (overriding)
 
    @Override
 public String infopesanan(){
     return super.infopesanan()+
             "\nKode menu:"+getkodepesanan()+
             "\nNomor Antrian: "+getnomorantrian()+
             "\nKode Cabang:"+getkodecabang()+
             "\nNo Ruangan:"+getNoruangan();
             
    }
  
}