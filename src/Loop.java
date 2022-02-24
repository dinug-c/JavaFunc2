public class Loop {
    public static void main(String[] args) {
        // Standar For
        for (int i = 1; i <= 10; i++){
            System.out.println("Angka : " + i);
        }

        // Pengulangan bersarang
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // While : pengecekan di awal
        int value = 1;
        while (value <= 10) {
            System.out.print("Angka : " + value);
            value++;
            System.out.print("\n");
        }

        // Dp while : pengecekan di akhir
        do {
            System.out.println("Angka : " + value);
            value++;
        } while (value <= 10);
    }
}
