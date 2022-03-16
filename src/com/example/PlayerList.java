package com.example;

public class PlayerList { // Kelas POJO
    private final String judulLagu, namaPenyanyi;

    public PlayerList(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return "PlayerList{" +
                "judulLagu='" + judulLagu + '\'' +
                ", namaPenyanyi='" + namaPenyanyi + '\'' +
                '}';
    }
}
