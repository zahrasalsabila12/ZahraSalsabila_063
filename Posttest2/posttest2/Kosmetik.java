package Posttest2.posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Kosmetik {
    private int id;
    private String nama;
    private String merk;
    private int harga;
    private int kuantitas;

    Kosmetik(int idKosmetik, String namaKosmetik, String merkKosmetik, int hargaKosmetik, int kuantitasKosmetik) {
        this.id = idKosmetik;
        this.nama = namaKosmetik;
        this.merk = merkKosmetik;
        this.harga = hargaKosmetik;
        this.kuantitas = kuantitasKosmetik;
    }

    //setter & getter id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //setter & getter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //setter & getter merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    //setter & getter harga
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //setter & getter kuantitas
    public int getKuantitas() {
        return kuantitas;
    }
    
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    ArrayList <Kosmetik> data = new ArrayList<>();

    BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));

    //membuat data
    void createData() throws IOException{
        System.out.println("""
================================================================
                       Tambah Data
================================================================""");
        System.out.print(" ID Kosmetik          : ");
        int ID = Integer.parseInt(baca.readLine());
        System.out.print(" Nama Kosmetik        : ");
        String nm = baca.readLine();
        System.out.print(" Merk Kosmetik        : ");
        String mrk = baca.readLine();
        System.out.print(" Harga Kosmetik       : ");
        int hrg = Integer.parseInt(baca.readLine());
        System.out.print(" Jumlah Stok Kosmetik : ");
        int ktts = Integer.parseInt(baca.readLine());
        System.out.println("================================================================");
        Kosmetik newData = new Kosmetik(ID, nm, mrk, hrg, ktts);
        data.add(newData);
        System.out.println(" Anda Berhasil Menambahkan Data");
    }

    //menampilkan data
    void readData(){
        if(data.isEmpty()){
            System.out.println("----------------------------------------------------------------");
            System.out.println(" Tidak Ada Data. Mohon Tambahkan Data Terlebih Dahulu!");
        }else{
            System.out.println("----------------------------------------------------------------");
            System.out.println("                       Data Kosmetik");
            System.out.println("----------------------------------------------------------------");
            for(int i=0; i<data.size(); i++){
                System.out.println("Data Ke -"+ (i+1));
                System.out.println("----------------------------------------------------------------");
                System.out.println(" Nama      : "+ data.get(i).nama);
                System.out.println(" Merk      : "+ data.get(i).merk);
                System.out.println(" Harga     : "+ data.get(i).harga);
                System.out.println(" Kuantitas : "+ data.get(i).kuantitas);
                System.out.println("----------------------------------------------------------------");
            }
        }
    }

    //mengubah data
    void updateData() throws IOException{
        readData();
        System.out.println("================================================================");
        System.out.println("                       UPDATE DATA");
        System.out.println("================================================================");
        System.out.print(" Masukkan Nama Kosmetik yang Ingin Diupdate : ");
        String nmKsmtk = baca.readLine();
        for(Kosmetik dataKosmetik : data){
            if(dataKosmetik.getNama().equals(nmKsmtk)){
                System.out.println("----------------------------------------------------------------");
                System.out.print(" Masukkan Nama Kosmetik Terbaru             : ");
                dataKosmetik.setNama(baca.readLine());
                System.out.print(" Masukkan Merk Kosmetik Terbaru             : ");
                dataKosmetik.setMerk(baca.readLine());
                System.out.print(" Masukkan Harga Kosmetik Terbaru            : ");
                dataKosmetik.setHarga(Integer.parseInt(baca.readLine()));
                System.out.print(" Masukkan Jumlah Stok Kosmetik Terbaru      : ");
                dataKosmetik.setKuantitas(Integer.parseInt(baca.readLine()));
                System.out.println("================================================================");
                System.out.println(" Anda Berhasil Mengubah Data");
            }
        }
    }
    
    //menghapus data
    void deleteData() throws IOException{
        readData();
        System.out.println("================================================================");
        System.out.println("                        HAPUS DATA");
        System.out.println("================================================================");
        System.out.println(" Masukkan Nama Kosmetik yang Ingin Dihapus : ");
        String nmHps = baca.readLine();
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).getNama().equals(nmHps)){
                data.remove(i);
                System.out.println("----------------------------------------------------------------");
                System.out.println(" Data Kosmetik Berhasil Dihapus");
            }
        }
    }

}
