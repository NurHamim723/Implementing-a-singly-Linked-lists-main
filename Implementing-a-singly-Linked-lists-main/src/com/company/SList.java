package com.company;

public class SList {

    public SListNode head;
    public int size;
    private int length;

    public SList(){
        head = null;
        size = 0;
    }
    public int length() {
        return size;
    }

    public void insertFront(Object item){
        head = new SListNode(item, head);
        size++;
    }
    public String toString() {

        int i;

        Object obj;
        String result = "[  ";
        SListNode cur = head;

        while (cur != null) {
            obj = cur.item;
            result = result + obj.toString() + "  ";
            cur = cur.next;
        }
        result = result + "]";
        return result;
    }
}
