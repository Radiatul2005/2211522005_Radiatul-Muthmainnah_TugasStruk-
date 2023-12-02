import java.util.Scanner;

public class Barang extends Tranksaksi implements DetailTranksaksi 
{
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;
    private double totalHarga;
    private String kodeBarang;

    public Barang() 
    {
        masukkanDetails();
        calculateTotal();
    }

    @Override
    public void masukkanDetails() 
    {
        System.out.println("---------------------");
        System.out.println("Data Barang");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kode Barang ");
        this.kodeBarang = scanner.nextLine();
        System.out.println("Nama Barang: ");
        this.namaBarang = scanner.nextLine();
        boolean harga = false;
        while (!harga) 
        {
            try //Exception
            {
                    System.out.println("Harga Barang: ");
                    this.hargaBarang = Double.parseDouble(scanner.nextLine());
                    if (hargaBarang <= 0) throw new Exception();
                    harga = true;
            }
            catch (Exception e) 
            {
                System.out.println("Input Harga Salah");
            }
        }
        boolean jumlah = false;
        while (!jumlah) 
        {
            try //Exception
            {
                    System.out.println("Jumlah Beli: ");
                    this.jumlahBarang = scanner.nextInt();
                    if (jumlahBarang <= 0 || jumlahBarang>1000) throw new Exception();
                    jumlah = true;
            }
            catch (Exception e) 
            {
                System.out.println("Input Jumlah Salah");
            }
        }
    }

    private void calculateTotal()
    {
        this.totalHarga = hargaBarang * jumlahBarang;
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Barang:");
        System.out.println("-----------------------------");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total : " + totalHarga);
        System.out.println("+++++++++++++++++++++++++++++++");
    }    
}
