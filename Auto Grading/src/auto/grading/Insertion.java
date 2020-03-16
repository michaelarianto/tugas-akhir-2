/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.grading;
import auto.grading.LinkedList.*;
import static auto.grading.LinkedList.insert;
/**
 *
 * @author michael
 */
public class Insertion {
    Node fxdimb= null,fximbkey = null;// penginisialisasian node fxdimb dan fximbkey yang berisi null;
    Node imbuhan;// penginisialisasian node imbuhan
    Node im1 = new Node("ber");//
    Node im2 = new Node("me");
    Node im3 = new Node("ke");
    int score = 0;// menginisialisasi integer score
    Node im4 = new Node("se");
    LinkedList me = new LinkedList();
    LinkedList ber = new LinkedList();
    LinkedList ke = new LinkedList();
    LinkedList se = new LinkedList();
    public void imbuhan(){
    insert(ber,"mempunyai");
    insert(ber,"menggunakan");
    insert(ber,"menghasilkan");
    insert(ber,"sedang");
    insert(ber,"melakukan");
    insert(me, "melakukan");
    
}
    public LinkedList imbans(Node imans){
        LinkedList artiImbuhan = null;
        if(imans.data == "ber"){
            artiImbuhan = ber;
        }
        else if(imans.data == "me"){
            artiImbuhan = me;
    }
        else if(imans.data == "ke"){
            artiImbuhan = ke;
    }
        else if(imans.data == "se"){
            artiImbuhan = se;
    }
        System.out.println("Imbuhan memiliki makna :");
        artiImbuhan.printList(artiImbuhan);
        return artiImbuhan;
    }
        public LinkedList imbkey(Node imkey){
        LinkedList artiImbuhanKey = new LinkedList();
        if(imkey == im1){
            artiImbuhanKey = ber;
        }
        else if(imkey == im2){
            artiImbuhanKey = me;
    }
        else if(imkey == im3){
            artiImbuhanKey = ke;
    }
        else if(imkey == im4){
            artiImbuhanKey = se;
    }
        System.out.println("Imbuhan memiliki makna : ");
        artiImbuhanKey.printList(artiImbuhanKey);
        return artiImbuhanKey;
    }
    public LinkedList imbsrc(LinkedList jwnimbuhan,LinkedList ImbuhanKJ){
        LinkedList JawabanAkhir = new LinkedList();
        Node key = ImbuhanKJ.head;
        Node check = jwnimbuhan.head;
        while (key != null){
            while (check !=null){
                if (key.data == check.data){
                    score = score+1;
                    fxdimb = check;
                    fximbkey = key;
                }
                else{
                    check = check.next;
                }
            }
            key = key.next;
        }
        if (fxdimb == null){
            System.out.println("Imbuhan tidak sesuai");
        }
        return JawabanAkhir;
    }
    public LinkedList insersians (LinkedList ans){
        ans.insertNode(ans, fxdimb);
        return ans;
    }
    public LinkedList insersikey (LinkedList key){
        key.insertNode(key, fximbkey);
        return key;
    }
}
