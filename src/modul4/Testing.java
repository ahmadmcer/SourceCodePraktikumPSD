package modul4;

import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList link = new LinkedList();

        if (link.isEmpty()){
            System.out.println("List kosong!");
        }

        // coba addFirst
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.addFirst(obj);
        } link.printNode();

        // coba addLast
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.addLast(obj);
        } link.printNode();

        // coba insertAfter
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert after");
            System.out.print("Masukkan key : ");
            int key = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insertAfter(key, obj);
        } link.printNode();

        // coba insertAfter
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert before");
            System.out.print("Masukkan key : ");
            int key = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insertBefore(key, obj);
        } link.printNode();

        // coba insert berdasarkan index
        for (int i = 0; i < 1; i++) {
            Node obj = new Node();
            System.out.println("\nInsert");
            System.out.print("Masukkan index : ");
            int index = scan.nextInt();
            System.out.print("Masukkan data : ");
            int input = scan.nextInt();
            obj.data = input;
            link.insert(index, obj);
        } link.printNode();

        // coba replace
        System.out.println("\nReplace data");
        System.out.print("Input data yang ingin diganti : ");
        int data1 = scan.nextInt();
        System.out.print("Input data baru : ");
        int data2 = scan.nextInt();
        link.replace(data1, data2);
        link.printNode();

        // coba remove data
        System.out.println("\nRemove data");
        System.out.print("Input data yang akan dihapus : ");
        int hapus = scan.nextInt();
        link.remove(hapus);
        link.printNode();

        // coba removeAt
        System.out.println("\nRemove index");
        System.out.print("Input index data yang akan dihapus : ");
        int hapusIndex = scan.nextInt();
        link.removeAt(hapusIndex);
        link.printNode();

        // coba removeFirst
        System.out.println("\nRemove data awal");
        link.removeFirst();
        link.printNode();

        // coba removeLast
        System.out.println("\nRemove data akhir");
        link.removeLast();
        link.printNode();

        // coba find
        System.out.println("\nMencari data");
        System.out.print("Masukkan data yang dicari : ");
        int cari = scan.nextInt();
        link.find(cari);

        // length
        System.out.println();
        link.length();

        // coba clear
        System.out.println();
        link.clear();
    }
}
