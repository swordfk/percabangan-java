import java.util.Scanner;

public class atmJava {

    public static void main(String[] args) {
        int menu = 0;
        int saldo = 100000;
        boolean hitung = true;
        Scanner t = new Scanner(System.in);
        while (hitung) {
            System.out.println("Menu ATM");
            System.out.println("===============");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Simpan Uang");
            System.out.println("3.Ambil Uang");
	        System.out.println("4.Transfer Uang");
            System.out.println("5.Keluar");
            System.out.println("===============");
	        System.out.print("Masukkan pilihan anda : ");
            menu = t.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Saldo anda adalah " + saldo);
		            System.out.println("\n\n");
                    hitung = true;
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yg anda simpan = ");
                    int b = t.nextInt();
                    saldo = saldo + b;
		            System.out.print("Saldo Anda Adalah " + saldo);
		            System.out.println("\n\n");
                    hitung = true;
                    break;
                case 3:
                    System.out.print("Masukkan Jumlah uang yg anda ambil = ");
                    int n = t.nextInt();
                    if (n >= saldo) {
                        System.out.println("Saldo anda tidak cukup :)");
                        System.out.print("Saldo Anda Adalah " + saldo);
			            System.out.println("\n\n");
                    } else {
			            saldo = saldo - n;
                        System.out.print("Saldo Anda Adalah " + saldo);
			            System.out.println("\n\n");
                    }
                    hitung = true;
                    break;
		        case 4:
                    System.out.print("Masukkan nomer rekening tujan : ");
		            String r = t.next();
                    System.out.print("Masukkan nominal uang : ");
		            int m = t.nextInt();
                    if (m >= saldo) {
                        System.out.println("Saldo anda tidak cukup :)");
                        System.out.print("Saldo Anda Adalah " + saldo);
			            System.out.println("\n\n");
                    } else {
			            System.out.println("\nTransaksi berhasil");
                        System.out.println("No rekening tujuan : "+r);
                        System.out.println("Nominal uang       : "+m);
                        saldo=saldo-m;
                        System.out.print("\n\nSaldo Anda Adalah " + saldo);
			            System.out.println("\n\n");
                    }
                    System.out.print("Transaksi lagi ?(1=yes/0=no)  ");
                    int s = t.nextInt();
                    if(s==1){
                        hitung = true;
                    }else {
                        hitung = false;
                        System.exit(0);
                    }
                    break;
                case 5:
                    hitung = false;
                    System.exit(0);
            }

        }

    }
}
