package org.eclipse.che.examples;

public class SinglyLinkedList {
    /*
     * Nodo que alamacena elemetnto en la lista
     */
     private static class Node{
        private String propiedad; 
        private Node next; 
        
        private Node (String e, Node n) {
            this.propiedad = e; 
            this.next = n;
        }
        
        private String getPropiedad() {
            return propiedad; 
        }
        
        private void setPropiedad(String propiedad) {
            this.propiedad = propiedad; 
        }
        
        private Node getNext() {
            return this.next; 
        }
        
        private void setNext(Node next) {
            this.next = next;
        }
    }
    
    private Node head = null; 
    private Node tail = null; 
    private int size = 0; 
    
    public int size() {
        return size; 
    }
    
    public boolean isEmpty() {
        return size == 0; 
    } 
    
    public void addFirst(String e) {
        head = new Node(e,null); 
        if (size == 0) 
        tail = head; 
        size++; 
    }
    
    public void addLast(String e) {
        Node newest = new Node(e, null); 
        if (isEmpty() )
        head = newest; 
        else 
            tail.setNext(newest); 
            tail = newest;
            size++; 
    }
    
    public String first() {
        if (isEmpty() ) 
            return null; 
            return head.getPropiedad();             
        
    }
    
      public String last() {
            if (isEmpty() )
            return null; 
            return tail.getPropiedad();             
        }
    
    public String removeFirst() {
        if( isEmpty() )
        return null; 
        String res = head.getPropiedad();
        head = head.getNext(); 
        size--;
        if (size == 0) 
        tail = null;
        return res;
    }    
}

