//Class 
public class RMHMKN {
//atribut & encapsulation
   private String nama,kdpesanan;
   
//constructor
    public RMHMKN (String nama, String kdpesanan){
        this.nama = nama;
        this.kdpesanan = kdpesanan;
        
    }
//mutator

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodepesanan(String kdpesanan) {
        this.kdpesanan = kdpesanan;
    }
    
    
    //accesor
    public String getNama(){
       return nama;
    }

    public String getKdpesanan() {
        return kdpesanan;
    }

    
    
    public String infopesanan() {
        return "Nama:"+getNama()+"\nKodepesanan:"+getKdpesanan();
    }
    //polymorphism overloading
    public String infopesanan(String total){
       return infopesanan() + "\ntotal:"+total;
             
}

   
}
