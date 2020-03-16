/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.grading;
import auto.grading.LinkedList.*;
/**
 *
 * @author michael
 */
public class Crossing {
    LinkedList dummy = null;//membuat bahwa linkedlist berisi null
    public LinkedList cross(LinkedList ans, LinkedList anskey){//linkedlist cross memiliki 2 variabel yairu linkedlist ans dan linkedlist anskey
        LinkedList fixedans= new LinkedList();// menginisialisasi fixedans sebagai new linkedlist
        Node key ;// key merupakan sebuah variabel dari sebuah node yang berada dikelas node pada linked list
        key = anskey.head;// key memiliki variabel anskey yang telah memiliki head dari class node
        String wrong = "Not found";
        Node wrg = new Node(wrong);//
        System.out.println("memulai proses crossing \n");
        if (key== null){// jika key tidak berisi akan ditampikan string kosong 
            System.out.println("Kosong");
        }
        else {
            while (key != null){
                Node check = ans.head;//check merupakan sebuah node yang memiliki ans yang memiliki sebuah head dari class node
                if (check == null){// jika check diperikasa dan berisi kosong
                    System.out.println("Tidak ada  jawaban");// akan diberikan tidak ada jawaban
            }
                else{
                    while(check != null){// check tidak sama dengan null makan akan dilakukan pengecekan
                        if (key.data == check.data){// jika node kunci dan node check sama
                            fixedans.insert(fixedans, key.data);//maka akan ditampung didalam fixedans
                            break;// apabila sudah disimpan akan langsung berhenti
                        }
                        else {
                            check = check.next;//jikalau belum akan dilakukan pengecekan kembali kedalam linked list selanjutnya
                        }
                    }
                }
                key = key.next;// linkedlist selanjutnya akan dilakukan
            }
        }
//        while (check != null){
//            key = ans.head;
//            if ( ans == null){
//                System.out.println("Jawaban Kosong");
//            }
//            while(ans != null) {
//                int count;
//                if (key == null){
//                    fixedans.insertNode(fixedans,wrg);
//                    check = check.next;
//                }
//                else if ( key == check){
//                    fixedans.insertNode(fixedans,check);
//                    check = check.next;
//                }
//                else {
//                    key = key.next;
//                }
//            }
            
//        }
        return fixedans;// akan dikembalikan kedalam fixedans
    }
}
