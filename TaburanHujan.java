import java.util.Scanner;

public class TaburanHujan {
    static Node head = null;
    static Node tail = null;
    double saiz, i, j, temp;

    static class Node{
        double data;
        Node next;

        public Node(double data){
            this.data = data;
            this.next = null;
        }
    }

        void dataInsert(double data){ //method masukkan data
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
    
        public void dataDisplay(){ //method papar data
            Node current = head;
            if (head == null) {
                System.out.println("The given list is empty");
                return;
            }
    
            System.out.println("");
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        public static void searchingData(){ //method cari data paling tinggi
            if(head == null){
                System.out.println("List is empty");
                return;
            }
    
            double max = head.data;
            Node current = head;
    
            while (current != null){
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }
            System.out.println("Taburan hujan tertinggi adalah: " + max);
        }
    
        public static void sortingData(){ //method susun data 
            Node current = head, next = null;
        double temp;
        if (head == null) {
            return;
        }else{
            while (current != null) {
                next = current.next;
                while (next != null) {
                    if (current.data > next.data) {
                        temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    next = next.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        int saiz;
        double i;
        TaburanHujan th = new TaburanHujan();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Masukkan taburan hujan");
            System.out.println("2. Papar data taburan hujan");
            System.out.println("3. Papar data taburan hujan tertinggi");
            System.out.println("4. Papar data dalam turutan menaik");
            System.out.println("\nMasukkan pilihan anda");
            int pilihan = input.nextInt();
            System.out.println("");

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan saiz tatasusunan");
                    saiz = input.nextInt();

                System.out.println("Masukkan data");
                for (i = 0; i < saiz; i++) {
                    th.dataInsert(input.nextDouble());
                }
                break;

                case 2:
                System.out.println("Data taburan hujan di Selangor");
                th.dataDisplay();
                break;

                case 3:
                System.out.println("Data taburan hujan tertinggi di Selangor");
                TaburanHujan.searchingData();
                break;

                case 4:
                System.out.println("Data taburan hujan secara menaik");
                TaburanHujan.sortingData();
                th.dataDisplay();
                break;
            
                default:
                System.exit(0);
                System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
