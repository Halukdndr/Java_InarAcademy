package chapters.chapter_11.examples;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack {
    private ArrayList<Object> list;

    public MyStack(){
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.lastIndexOf(this.list);
    }
    public Object pop(){
        return list.remove(list.size() - 1);
    }
    public void push(Object o){
        list.add(o);
    }
    @Override
    public String toString() {
         return "stack: " + list.toString();
        }
}
