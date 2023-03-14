package Posttest2.posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));

        Kosmetik data = new Kosmetik(1, "Emina Bright", "Emina", 35000, 100);

        int pilihan = 0;
        do {
            System.out.print("""
****************************************************************
                           Beauty Shop
================================================================
                            Main Menu 
================================================================
1. Tambah Data Kosmetik
2. Lihat Data Kosmetik    
3. Ubah Data Kosmetik
4. Hapus Data Kosmetik
5. Keluar
================================================================
 Pilihan Anda [1-5]:  """);
            pilihan = Integer.parseInt(baca.readLine());

            switch (pilihan) {
                case 1:
                    //Tambah data
                    data.createData();
                    break;
                case 2:
                    //Lihat data
                    data.readData();
                    break;
                case 3:
                    //Ubah data
                    data.updateData();
                    break;
                case 4:
                    //hapus data
                    data.deleteData();
                    break;
                case 5:
                    //keluar
                    System.exit(0);
                default:
                System.out.println("================================================================");
                System.out.println(" Inputan tidak ditemukan, mohon coba kembali!");
                    break;
            }
        } while (pilihan != 5);
    }
}
