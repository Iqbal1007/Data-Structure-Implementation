package jurnal4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String judulLagu, namaPenyanyi;
        int select;

        MusicPlayer musicPlayer = new MusicPlayer();

        do {
            System.out.println("""
                    1. Input
                    2. Hapus
                    3. Hapus berdasarkan judul lagu
                    4. Display
                    5. Exit
                    """);
            select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1 -> {
                    System.out.print("Judul Lagu : ");
                    judulLagu = br.readLine();
                    System.out.print("Nama Penyanyi : ");
                    namaPenyanyi = br.readLine();
                    musicPlayer.addLagu(judulLagu, namaPenyanyi);

                }
                case 2 -> musicPlayer.removeLast();
                case 3 -> {
                    System.out.print("Masukkan Judul Lagu :");
                    judulLagu = br.readLine();
                    musicPlayer.removeWithSearch(judulLagu);
                }
                case 4 -> musicPlayer.display();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
        while (true);

    }
}
