package com.avp.basic.datastructure_algorithms;

public class DoublyLinkedList {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        private Node<E> prev;

        Node(E e, Node<E> next, Node<E> prev){
            this.element = e;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
