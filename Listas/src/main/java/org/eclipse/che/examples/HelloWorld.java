package org.eclipse.che.examples;


public class HelloWorld {
    public static void main(String... argvs) {
        
        SinglyLinkedList lista = new SinglyLinkedList(); 
        
        lista.addFirst("GUA");       
        lista.addLast("ARG"); 
        lista.addLast("BRA"); 
        lista.addLast("PAN");          
        
        String valor = lista.removeFirst(); 
        while (valor != null) {
            System.out.println(lista.first()); 
            valor = lista.removeFirst(); 
        }
        //System.out.println(lista.first()); 
        //System.out.println(lista.)
        
        
        
      /*  Node a = new Node(); 
        a.setPropiedad("GUA"); 
        
         Node b = new Node(); 
        b.setPropiedad("Mex"); 
        a.setNext(b); 
        
        Node c = new Node(); 
        c.setPropiedad("USA");
        a.getNext().setNext(c); 
        
        Node d = new Node(); 
        d.setPropiedad("ESP"); 
        a.getNext().getNext().setNext(d); 
        
        System.out.println(a.getPropiedad());
        System.out.println(a.getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());       
        */
    } 
}



    