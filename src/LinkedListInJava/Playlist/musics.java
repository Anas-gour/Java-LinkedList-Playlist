package LinkedListInJava.Playlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class musics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int choice;
        do {
            System.out.println("============ Welcome to PlayLis ==========");
            System.out.println("1].new song: ");
            System.out.println("2].Search song: ");
            System.out.println("3].Display all songs: ");
            System.out.println("4].Update song: ");
            System.out.println("5].Delete a song: ");
            System.out.println("0].========== Exit ==========");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Song Same: ");
                    String name = sc.nextLine();
                    list.add(name);
                    System.out.println(" Added Successfully ");
                    break;
                case 2:
                    System.out.println("Enter Song Name: ");
                    String song = sc.nextLine();
                    if (list.contains(song)){
                        int index = list.indexOf(song);
                        System.out.println("Song: "+list.get(index));
                    }
                    break;
                case 3:
                    if (list.isEmpty()){
                        System.out.println("List is Empty!");
                    }else {
                        int x = 1;
                        for (Object element:list){
                            System.out.println(x+" Song: "+element);
                            x++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter old song Name: ");
                    String oldSong = sc.nextLine();
                    if (list.contains(oldSong)){
                        int index = list.indexOf(oldSong);
                        System.out.println("Enter new Song name:");
                        String newSong = sc.nextLine();
                        list.set(index,newSong);
                        System.out.println("Updated successfully ");
                    }else{
                        System.out.println("Song not found !!");
                    }
                    break;
                case 5:
                    System.out.println("Enter song name: ");
                    String delSong = sc.nextLine();
                    if (list.contains(delSong)){
                        list.remove(delSong);
                        System.out.println("Deleted successfully !");
                    }else{
                        System.out.println("Song not found: ");
                    }
                    break;
                default:
                    System.out.println("invalid choice ! ");
                    break;
            }
            
            
        }while (choice!=0);
        sc.close();
    }
}
