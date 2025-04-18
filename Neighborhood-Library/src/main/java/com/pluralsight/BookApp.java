package com.pluralsight;

public class BookApp {
    public static void main(String[] args) {
        Book[] inventory = {new Book(1,"book 1", "Dune", false, "Nobody"), new Book(2, "book 2", "Mistborn", false, "Nobody"), new Book(3, "book 3", "The Well of Ascension", false, "Nobody"), new Book(4, "book 4", "The Hero of Ages", false, "Nobody"), new Book(5, "book 5", "The Way of Kings", false, "Nobody"), new Book(6, "book 6", "Words of Radiance", false, "Nobody"), new Book(7, "book 7", "Oathbringer", false, "Nobody"), new Book(8, "book 8", "Rhythm of War", true, "Anna"), new Book(9, "book 9", "Wind and Truth", false, "Nobody"), new Book(10, "book 10", "Warbreaker", true, "Roman"), new Book(11, "book 11", "Gideon the Ninth", false, "Nobody"), new Book(12, "book 12", "Harrow the Ninth", true, "Anna"), new Book(13, "book 13", "Nona the Ninth", true, "Anna"), new Book(14, "book 14", "The Name of the Wind", true, "Mike"), new Book(15, "book 15", "The Wise Mans Fear", false, "Nobody"), new Book(16, "book 16", "The Slow Regard of Silent Things", false, "Nobody"), new Book(17, "book 17", "This is How you Lose the Time War", true, "Anna"), new Book(18, "book 18", "Dungeons & Dragons Dungeon Masters Guide", false, "Nobody"), new Book(19, "book 19", "Bridge to Taribathia", true, "Caroline"), new Book(20, "book 20", "Lord of the Rings: Complete Trilogy", false, "Nobody") };

        for (Book book: inventory){
                if (book.isCheckedOut() == false) {
                    System.out.println(book.getTitle());
                }
//                how tie together
//                    ahhhhhhhhh
//now want to seperate but get categories for cehcked out or not
//                if book.isCheckedOut() = false, print Not available list
//                    create slplit on .ischeckedout true/fasle
//                need to print availabe and non available book list, SPLIT NEEDED USE BRAINCELLS
//                    dont know how to compare. bad time hard
        }
        for (Book book: inventory){
            if (book.isCheckedOut() == true) {
                System.out.println(book.getTitle());
            }
        }
    }
}