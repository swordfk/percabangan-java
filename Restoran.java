import java.util.Scanner;

public class Restoran
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU MAKANAN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Rawon");
        System.out.println("3. Nasi Gudeg");
        System.out.println("4. Jus Jeruk");
        System.out.println("___________________________________________________________________");
        System.out.println("5. Hitung Total");
        System.out.println("6. Keluar");
        System.out.println("");

        int harga = 0;
        int h1 = 15000, h2 = 15000, h3 = 15000, h4 = 4000;
        String menu;

        boolean hitung=true;
        while(hitung)
        {
        System.out.println("___________________________________________________________________");
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.println("___________________________________________________________________");
        if (inNomor == 1)
        {
            menu = " Nasi Goreng";
            System.out.println("Menu yang di pilih adalah : "+ menu);
            harga = harga + h1;
        }
            else if (inNomor == 2)
            {
                menu = " Nasi Rawon";
                System.out.println("Menu yang di pilih adalah : "+ menu);
                harga = harga + h2;
            }
                else if (inNomor == 3)
                {
                    menu = " Nasi Gudeg";
                    System.out.println("Menu yang di pilih adalah : "+ menu);
                    harga = harga + h3;
                }else if (inNomor == 4)
                {
                    menu = " Nasi Gudeg";
                    System.out.println("Menu yang di pilih adalah : "+ menu);
                    harga = harga + h4;
                }else if (inNomor == 5 ){
                    System.out.println("___________________________________________________________________");
                    System.out.println("Total pembayaran sebesar : " +harga);
                    System.out.println("___________________________________________________________________");
                    boolean bayar = true;
                    while(bayar){
                        System.out.print("Uang yang dibayarkan : ");
                    int inBayar = scan.nextInt();
                    if (inBayar<harga){
                        System.out.println("Anda Miskin ? :P");
                        bayar=true;
                    }else{
                        int tot = inBayar-harga;
                        System.out.println("Uang kembalian : "+tot);
                        System.out.println("Terimakasih atas kunjungan anda ^_^");
                        System.out.println("___________________________________________________________________");
                        bayar=false;
                        System.exit(0);
                    }
                    }
                }else if (inNomor == 6){
                    hitung=false;
                    System.exit(0);
                }
                     else
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

        }
    }
}
