/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.grading;
import static auto.grading.LinkedList.*;

/**
 *
 * @author michael
 */
public class AutoGrading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mutation M = new Mutation();// menginisialisasi M dari class mutasi 
        LinkedList saved = new LinkedList();// menginisialisasi bahwa saved merupakan sebuah linked list
        int score= 0;
        String dummy=null;
        Crossing C = new Crossing();// menginisialisasi C dari class crossing 
        Insertion I = new Insertion();// menginisialisasi I dari class insertion
        LinkedList ans = new LinkedList(); // menginisialisasi ans merupakan linked list dari answer
        LinkedList key = new LinkedList(); //menginisialisasi key merupakan linked list dari key answer
        insert (ans, "saya");
        insert (ans,"main");
        insert (ans,"bola");
        insert (key, "bola");
        insert (key, "main");
        insert (key, "saya");
        LinkedList syn1 = new LinkedList();
        LinkedList syn2 = new LinkedList();
//        LinkedList test = ans;
//        while(test.head != null){
//            System.out.println(ans.head.data);
//            test.head = test.head.next;
//        }
        Node L = key.head; //memanggil class node yang berada pada class linkedlist dimana key akan diberikan kode sebagai head dari linked list
        ans.printList(ans);// melakukan print dari linkedlist yang terkandung di ans
        key.printList(key);// melakukan print linkedlist yang terkandung dari key
        int tscore = M.Counter(key)+2;//penilaian dimana score ditambahkan 2 apabila benar
        System.out.println(M.listnum);
        if (L == null){
            System.out.println("Kosong");
        }
        else{
            while (L != null){
                M.wordcheck(ans, L,saved);
//                System.out.println(L.data);
                L = L.next;
            }
        }
        LinkedList fxdans1= new LinkedList();
        fxdans1 = C.cross(ans, key);
        System.out.println("Kata yang sesuai" + fxdans1);
        Node imans = new Node("ber");
        Node imkey = new Node ("me");
        LinkedList ansim = I.imbans(imans);
        LinkedList keyim =I.imbkey(imkey);
        I.imbsrc(ansim,keyim);
        I.insersians(ans);
        I.insersikey(key);
        score = score + I.score;
        int fnl = score / tscore ;
        System.out.println(fnl);
    }   
}
    
