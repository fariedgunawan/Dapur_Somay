public class Lingkaran {
    String warna;
    float jariJari; // tipe data float harus ditambahin 'f' diakhir angkanya

    void printWarna(){
        System.out.println("Warna objek lingkarang adalah "+warna);
    }
    
    void printKeliling(){
        float pi = 22/7f;
        float keliling = 2*pi*jariJari;
        System.out.println("Keliling objek lingkaran adalah "+keliling);
    }
    
    void printLuas(){
        float pi = 22/7f;
        float luas = pi * jariJari * jariJari;
        System.out.println("Luas objek lingkarang adalah "+luas);
    }
}
