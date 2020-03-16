/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.grading;
import java.io.*;
/**
 *
 * @author michael
 */
public class LinkedList {
    Node head;
    
    static class Node {
        String data;
        Node next;
        
        Node(String d){
            data = d;
            next=null;
        }
    }
    
public static LinkedList insert(LinkedList list, String data){
 Node new_node= new Node(data);
 new_node.next = null;
 if(list.head == null){
     list.head = new_node;
 }
 else{
     Node last = list.head;
     while (last.next !=null){
         last = last.next;
     }
     last.next = new_node;
 }   
 return list;
}
public void removedata(String target, LinkedList dest){
    Node dummy = dest.head;
    if (dest == null){
        System.out.println("Linked List kosong");
    }
    else if (dummy.data == target){
        dummy = dummy.next;
    }
    else if (dummy== null){
        System.out.println("Target kosong");
    }
    else {
        while (dummy != null){
            if (dummy.next.data == target){
                dummy.next =dummy.next.next;
                break;
            }
            else{
                dummy =dummy.next;
            }
        }
    }
}
//
//public LinkedList masukkanNode(LinkedList list, Node data){
//    LinkedList newList = list;
//    Node newNode = newList.head;
//    
//    if(newNode == null){
//        newNode = data;
//    }
//    else if(newNode.next == null){
//        newNode.next = data;
//        newNode.next.next = null;
//    }else{
//        while(newNode.next != null){
//            newNode = newNode.next;
//        }
//        newNode.next = data;
//        newNode.next.next = null;
//    }
//    
//    return newList;
//}

public LinkedList insertNode(LinkedList list, Node data){
    Node dumm = list.head;
    if (dumm == null){
        dumm = data;
    }
    else if (dumm.next == null){
        dumm.next = data;
        data.next = null;
    }
    else{
        while (dumm.next != null){
            dumm = dumm.next;
        }
        dumm.next = data;
        dumm.next.next = null;
    }
    return list;
}

public static void printList(LinkedList list){
    Node currNode=list.head;
    System.out.print("Current linked list : ");
    while(currNode != null){
        System.out.print(currNode.data + " ");
        currNode=currNode.next;
        
    }
    System.out.println("\n");
}
public static void printans(LinkedList list){
    Node currNode=list.head;
    System.out.print("Jawaban yang sesuai : ");
    while(currNode != null){
        System.out.print(currNode.data + " ");
        currNode=currNode.next;
        
    }
    System.out.println("\n");
}
public void remove(int nodenum, LinkedList list){
    if(nodenum == 0 ){
        head = head.next;
    }
    else{
     Node currNode = list.head;
        for (int i=0 ; i < nodenum;i++ ){
            currNode=currNode.next;
    }
        if(currNode.next.next != null){
            currNode.next=currNode.next.next;
        }
        else{
            currNode.next = null;
        }
}
}
public Node num(int numbr){
    Node L= head;
    if(L == null){
        System.out.println("Linked list is empty");
    }
    else{
         while (numbr >= 0){
//        while (L != null){
            L = L.next;
            numbr = numbr -1;
        }
    }
//    System.out.println("Hasil random "+L.data);
    return L;
}
public Node node(int a){
    Node pro= null;
    int b = a-1;
    pro = head;
    while(b >= 0){
        pro = pro.next;
        b = b -1 ;
    }
    return pro; 
}
public static Node removehead(Node head){
    if ( head == null){
        return null;
    }
    else{
        Node dummy = head;
        head = head.next;
            return head;
    }

}
//public void removecurrNode(Node num, LinkedList x){
//    Node dummy = x.head;
//    if (dummy == null){
//        System.out.println("Linked list sudah kosong");
//    }
//    else{
//        while(dummy != null){
//            if(dummy.data != num.data){
//                dummy = dummy.next;
//            }
//            else if( dummy.data == num .data){
//                dummy.next = dummy.next.next;
//            }
//            else{
//                System.out.println("Tidak ada data yang sesuai");
//            }
//        }
//    }
//}
}