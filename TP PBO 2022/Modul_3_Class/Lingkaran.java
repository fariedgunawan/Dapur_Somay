public class Lingkaran {
    String warna;
    float jariJariFLOAT; // tipe data float harus ditambahin 'f' diakhir angkanya
    double jariJariDOUBLE;

    void printWarna(){
        System.out.println("Warna objek lingkarang adalah "+warna);
    }
    
    // ada 2 cara buat perhitungan floating point
    // kalau mau di masukkin ke variabel gini, enaknya pake float
    // double klo pembagian jadi aneh
    void printKeliling(){
        float pi = 22/7f;
        float keliling = 2*pi*jariJariFLOAT;
        System.out.println("Keliling objek lingkaran adalah "+keliling);
        // mesti merhatiin urutan perkalian, pi-nya mesti terakhir
        System.out.println("Keliling objek lingkaran adalah "+jariJariDOUBLE*2*22/7);
    }
    
    void printLuas(){
        float pi = 22/7f;
        float luas = pi * jariJariFLOAT * jariJariFLOAT;
        System.out.println("Luas objek lingkarang adalah "+luas);
        // mesti merhatiin urutan perkalian, pi-nya mesti terakhir
        System.out.println("Luas objek lingkarang adalah "+jariJariDOUBLE*jariJariDOUBLE*22/7);
    }


}
