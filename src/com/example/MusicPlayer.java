package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class MusicPlayer {
    LinkedList <PlayerList> listLagu = new LinkedList<>();

    public void addLagu( String judulLagu, String namaPenyanyi){
        listLagu.addLast(new PlayerList(judulLagu, namaPenyanyi));
    }

    public void removeLast(){
        if(listLagu.isEmpty()){
            System.out.println("Player list Masih Kosong");
        } else {
            listLagu.removeLast();
        }
    }

    public void removeWithSearch(String judulLagu){
        if(listLagu.isEmpty()){
            System.out.println("Player list Masih Kosong");
        } else {
            listLagu.removeIf(playerList -> playerList.getJudulLagu().equalsIgnoreCase(judulLagu));
        }
    }

    public void display(){
        ListIterator<PlayerList> iterator = listLagu.listIterator();

        if(listLagu.isEmpty()){
            System.out.println("Player list Masih Kosong");
        } else {
            System.out.println("Putar Maju");
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            System.out.println("Putar Mundur");
            while (iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }

        }
    }
}
