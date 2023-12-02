public class App {
    public static void main(String[] args) {
        DetailTranksaksi transaksi1 = new Pelanggan(); // Objek Barang sebagai DetailTransaksi menggunakan polimorfisme
        DetailTranksaksi transaksi2 = new Barang(); // Memanggil metode sesuai dengan perilaku yang bervariasi
        DetailTranksaksi tranksaksi3 = new Head();
        DetailTranksaksi tranksaksi4 = new Kasir();

        tranksaksi3.tampilkanDetails();
        transaksi1.tampilkanDetails(); 
        transaksi2.tampilkanDetails(); 
        tranksaksi4.tampilkanDetails();
    }
}
