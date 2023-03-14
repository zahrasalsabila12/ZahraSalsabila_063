//Nama : Zahra Salsabila
//NIM  : 2109106063

package Posttest1.posttest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Kosmetik{
    int id;
    String nama;
    String merk;
    int harga;
    int kuantitas;

    Kosmetik(int idKosmetik, String namaKosmetik, String merkKosmetik, int hargaKosmetik, int kuantitasKosmetik) {
        this.id = idKosmetik;
        this.nama = namaKosmetik;
        this.merk = merkKosmetik;
        this.harga = hargaKosmetik;
        this.kuantitas = kuantitasKosmetik;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setKuantitas(int kuantitas){
        this.kuantitas = kuantitas;
    }

    public void read(){
        System.out.println("Nama      : "+ this.nama);
        System.out.println("Merk      : "+ this.merk);
        System.out.println("Harga     : "+ this.harga);
        System.out.println("Kuantitas : "+ this.kuantitas);
    }
    
}

public class Main {
    //arraylist 
    static ArrayList <Kosmetik> data = new ArrayList<>();

    //Membuat Data
    public static void createData(ArrayList<Kosmetik> data, Kosmetik dataKosmetik){
        data.add(dataKosmetik);
        System.out.println(" Anda Berhasil Menambahkan Data");
    }

    //Melihat Data
    public static void readData (ArrayList<Kosmetik> data){
        if(data.isEmpty()){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Tidak Ada Data. Mohon Tambahkan Data Terlebih Dahulu!");
        }else{
            System.out.println("----------------------------------------------------------------");
            for(int i=0; i<data.size(); i++){
                System.out.println("Data Ke -"+ (i+1));
                System.out.println("----------------------------------------------------------------");
                data.get(i).read();;
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    //Mengupdate Data
    public static void updateData()throws IOException{
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        readData(data);
        System.out.println("================================================================");
        System.out.println("                       UPDATE DATA");
        System.out.println("================================================================");
        System.out.print(" Masukkan Nomor Data yang Ingin Diupdate : ");
        int index = Integer.parseInt(br.readLine());
        index--;
        System.out.println("----------------------------------------------------------------");
        System.out.print(" Masukkan Nama Kosmetik Terbaru             : ");
        String nm = br.readLine();
        System.out.print(" Masukkan Merk Kosmetik Terbaru             : ");
        String mrk = br.readLine();
        System.out.print(" Masukkan Harga Kosmetik Terbaru            : ");
        int hrg = Integer.parseInt(br.readLine());
        System.out.print(" Masukkan Jumlah Stok Kosmetik Terbaru      : ");
        int ktts = Integer.parseInt(br.readLine());
        System.out.println("================================================================");
        System.out.println(" Anda Berhasil Mengubah Data");
        
        data.get(index).nama = nm;
        data.get(index).merk = mrk;
        data.get(index).harga = hrg;
        data.get(index).kuantitas = ktts;
    }
    // public static void updateData()throws IOException{
    //     InputStreamReader isr = new InputStreamReader (System.in);
    //     BufferedReader br = new BufferedReader (isr);
    //     readData(data);
        // System.out.println("================================================================");
        // System.out.println("                       UPDATE DATA");
        // System.out.println("================================================================");
        // System.out.print(" Masukkan Nama Kosmetik yang Ingin Diupdate : ");
        // String nmKsmtk = br.readLine();
        // for(Kosmetik dataKosmetik : data){
        //     if(dataKosmetik.getNama().equals(nmKsmtk)){
        //         System.out.println("----------------------------------------------------------------");
        //         System.out.print(" Masukkan Nama Kosmetik Terbaru             : ");
        //         dataKosmetik.setNama(br.readLine());
        //         System.out.print(" Masukkan Merk Kosmetik Terbaru             : ");
        //         dataKosmetik.setMerk(br.readLine());
        //         System.out.print(" Masukkan Harga Kosmetik Terbaru            : ");
        //         dataKosmetik.setHarga(Integer.parseInt(br.readLine()));
        //         System.out.print(" Masukkan Jumlah Stok Kosmetik Terbaru      : ");
        //         dataKosmetik.setKuantitas(Integer.parseInt(br.readLine()));
        //         System.out.println("================================================================");
        //         System.out.println(" Anda Berhasil Mengubah Data");
        //     }
        // }
    // }

    //menghapus data
    public static void removeToy(ArrayList<Kosmetik> data, int noData){
        noData--;
        for(int i=0; i< data.size(); i++){
            if(data.get(i) == data.get(noData)){
                data.remove(i);
                System.out.println("----------------------------------------------------------------");
                System.out.println(" Data Kosmetik Berhasil Dihapus");
                return;
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println(" Data Kosmetik Tidak Ditemukan. Mohon Coba Kembali");
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        
        int pilihan = 0;
        int ID, hrg, ktts; 
        String nm, mrk;
        
        do {
            System.out.println("""
****************************************************************
                           Beauty Shop
================================================================
                            Main Menu 
================================================================
1. Create Data
2. Read Data    
3. Update Data
4. Delete Data
5. Exit program
================================================================
""");
        System.out.print("  Your Choice (1-5) :  ");
        pilihan = Integer.parseInt(baca.readLine());
        switch (pilihan) {
            case 1:
            //Menambahkan Data
            System.out.println("================================================================");
            System.out.print(" ID Kosmetik          : ");
            ID = Integer.parseInt(baca.readLine());
            System.out.print(" Nama Kosmetik        : ");
            nm = baca.readLine();
            System.out.print(" Merk Kosmetik        : ");
            mrk = baca.readLine();
            System.out.print(" Harga Kosmetik       : ");
            hrg = Integer.parseInt(baca.readLine());
            System.out.print(" Jumlah Stok Kosmetik : ");
            ktts = Integer.parseInt(baca.readLine());
            System.out.println("================================================================");
            createData(data, new Kosmetik (ID, nm, mrk, hrg, ktts));
            break;
            case 2:
            //Melihat Data
            readData(data);
            break;
            case 3:
            //Mengupdate Data
            updateData();
            break;
            case 4:
            //Menghapus Data
            readData(data);
            System.out.println("================================================================");
            System.out.print(" Masukkan Nomor Kosmetik yang Ingin Dihapus : ");
            int noData = Integer.parseInt(baca.readLine());
            removeToy(data, noData);
            break;
            case 5:
            //Exit Program
            System.exit(0);
            break;
            default:
            System.out.println("================================================================");
            System.out.println(" Invalid input. Please try again!");
            break;
            }
        } while (pilihan != 5);
    
    }

}
