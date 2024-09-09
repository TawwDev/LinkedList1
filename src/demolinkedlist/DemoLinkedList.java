/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demolinkedlist;

/**
 *
 * @author admin
 */
public class DemoLinkedList {
    private static Node head;
    
    public static void display(Node head){
        while(head != null){
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println("");
    }
    
    public static int count(Node head){
        int cnt =0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
    
    public static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public static void addLast(int data){
        Node newNode = new Node (data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public static void main(String[] args) {
        Node n3, n9, n7;
        head = new Node (5);
        n7 = new Node (7);
        n9 = new Node (9);
        n3 = new Node (3);
        
        head.next = n3;
        n3.next = n9;
        n9.next = n7;
        
        //1. in ra node thu 0, thu 1
        System.out.println("Node 0: " + head.data);
        System.out.println("Node 1: " + head.next.data);
        
        //2 in ra node gia tri cuoi
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Node cuoi: " + temp.data);
        
        //3. in ra danh sach node
        System.out.print("Danh sach node: ");
        display(head);
        
        //4. dem danh sach node
        System.out.println("Length: " + count(head));
        
        //5. add node gtri 6 vao dau
        System.out.print("add node gtri 6 vao dau: ");
        addFirst(6);
        display(head);
        
        //6. add node gtri 2 vao cuoi
        System.out.print("add node gtri 2 vao cuoi: ");
        addLast(2);
        display(head);
        
        //7. Cap nhat lai gia tri node head = 4
        System.out.print("Cap nhat lai gia tri node head = 4: ");
        head.data = 4;
        display(head);
        
        //8. sap xep danh sach tang dan
        Node i, j;
        for(i = head; i != null ; i = i.next){
            for(j = i.next; j != null ; j = j.next){
                if(i.data > j.data){
                    //swap data node i voi j
                    int tmp = i.data;
                    i.data = j.data;
                    j.data = tmp;
                }
            }
        } 
        System.out.print("Sap xep danh sach tang dan: ");
        display(head);
    }
    
}
