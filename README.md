# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `RMHMKN`, `pesanan`, dan `Detailpesanan` adalah contoh dari class.

```bash
public class RMHMKN {
    ...
}

public class Detailpesanan extends RMHMKN {
    ...
}

public class pesanan {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` mkn[i] = new Detailpesanan(nama,kdpesanan);` adalah contoh pembuatan object.

```bash
 mkn[i] = new Detailpesanan(nama,kdpesanan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kdpesanan` adalah contoh atribut.

```bash
String nama;
String kdpesanan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `RMHMKN` dan `Detailpesanan`.

```bash
public RMHMKN(String nama, String kdpesanan) {
    this.nama = nama;
    this.kdpesanan = kdpesanan;
}

public Detailpesanan(String nama, String kodepesanan) {
    super(nama, kodepesanan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKodepesanan(String kdpesanan) {
    this.kdpesanan = kdpesanan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKdpesanan`, `getKodepesana`, `getnomorantrian`, `getkodecabang`, dan `getnoruangan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKdpesanan() {
    return kdpesanan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kdpesanan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kdpesanan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Detailpesanan` mewarisi `RMHMKN` dengan sintaks `extends`.

```bash
public class Detailpesanan extends RMHMKN {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Infopesanan(String)` di `RMHMKN` merupakan overloading method `infopesanan` dan `infopesanan` di `Detailpesanan` merupakan override dari method `infopesanan` di `RMHMKN`.

```bash
 public String infopesanan(String total){
       return infopesanan() + "\ntotal:"+total;
}

@Override
public String infopesanan() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getkodepesanan` sedangakan seleksi `switch` dalam method `getnomorantrian` dan 'getkodecabang'.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mkn.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
  System.out.print("Masukan Nama Pembeli " +(i+1)+": ");
  String nama = scanner.nextLine();
  System.out.print("Masukan Kode Pesanan " +(i+1)+": ");
  String kdpesanan = scanner.nextLine();
      
 System.out.println ("Detail pesanan:");
System.out.println(data.infopesanan());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Detailpesanan[] mkn = new Detailpesanan[2];` adalah contoh penggunaan array.

```bash

Detailpesanan[] mkn = new Detailpesanan[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch (NumberFormatException e){
         System.out.println("Kesalahan Format kode:"+e.getMessage());
       }catch (Exception e) {
      System.out.println("Kesalahan kode:"+e.getMessage());
       }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nabila Ayudya Lestari
NPM: 2110010309
