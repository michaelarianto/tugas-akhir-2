/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.grading;
import java.util.Random;
import auto.grading.LinkedList.*;
/**
 *
 * @author michael
 */
public class Mutation {
    int listnum = 0;
    int score = 0;
    LinkedList synonim;
public int Counter (LinkedList synonim){
    Node dum = synonim.head;
    if(dum.next == null){
        listnum = 0;
    }
    else
        while(dum != null){
            listnum = listnum +1;
            dum = dum.next;
        }
    return listnum;
}
    public LinkedList wordcheck(LinkedList sync, Node key, LinkedList saved){
        String Rest = "";
        String result = "";
        LinkedList temp_list = new LinkedList();
        temp_list = sync;
        Node temp_list_head = temp_list.head;
        
        int i=0;
        
        while(listnum != 0){
            Random random = new Random();
            int value = random.nextInt(listnum);
//            int value = 0;
            System.out.println(i+". Nilai dirandom "+value);
            
            Node dummy = sync.node(value);
            
            if(dummy.data == key.data){
                System.out.println("Dapat di "+value);
                score =score +1;
                saved.insert(saved, dummy.data);
                return saved;
//                saved.printList(saved);
            }else{
                if(value == 0){
                    temp_list.printList(temp_list);
                    Node tujuan = temp_list.head.next;
                    temp_list.head = tujuan;
                }else{
                    System.out.println("beda, mau ngapus list ke "+value);
                    temp_list.printList(temp_list);
                    temp_list.removedata(dummy.data, temp_list);
                }
                
            }
            i++;
            listnum--;
        }
        
//        System.out.print("Keluar dari looping, Sisanya ");
        saved.insert(saved, "Gak dapat");
        
//        temp_list.printList(temp_list);
//        if(temp_list.head.data == key.data){
//            return temp_list;
//        }else{
//             saved.insert(saved, "Gak dapat geblek");
//        }
        
        
//        System.out.println("Data = "+key.data);
//        for(int i = 0 ; i <= listnum; i ++ ){
//        System.out.println("LISTNUM :"+listnum);
//        while (listnum != 0){
////            System.out.println(ansnode.data);
//             int num = listnum;
//             Random listnode = new Random();
//             int value = listnode.nextInt(listnum);  
//             int d = value;
//             System.out.println(d);
//             Node dummy = sync.num(d);
//             System.out.println("Kata yang terpilih (dummy)" +dummy.data);
//             System.out.println("Nilai random adalah " + d);
//             if (dummy.data == null){
//                 System.out.println("Empty or word are unnecessary");
//                 break;
//             }
//             else if(dummy.data == key.data){  
//                 saved.insert(saved, ansnode.data);
//                 saved.printList(saved);
//                 break;
//             }
//             else if (dummy.data != key.data){
//                 System.out.println(dummy.data + " deleted");
//                 sync.removedata(dummy.data, sync);
//                 ansnode = ansnode.next;
//                 listnum = listnum -1;
//                 sync.printList(sync);
//             }
//             else{
//                 ansnode=ansnode.next;
//                 listnum = listnum -1;
//             }
//            listnum = listnum -1;
//        }
        
        return saved;
    }
}