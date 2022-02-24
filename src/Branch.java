public class Branch {
    public static void main(String[] args) throws Exception {
        
        // If Else
        boolean isOn = false;

        if (isOn) {
            System.out.println("Menyalakan Lampu!");
        } else {
            System.out.println("Kondisi tidak terpenuhi!");
        }

        // If Else If Then Else
        int nilaiUjian = 80;
        char indeksPrestasi;

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }

        System.out.println("Nilai ujian akhir : " + indeksPrestasi);

        // Switchcase
        int input = 6;
        switch(input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                break;
        }

        // Switchcase without break
        char input2 = 'C';
        int output = 0;
        switch (input2) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);

    }
}
