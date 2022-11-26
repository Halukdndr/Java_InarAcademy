package chapters.chapter_11.exercises.E10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    public static final int DEFAULT_CAPACITY = 16;
    public MyStack(){
        super(DEFAULT_CAPACITY);
    }
    public MyStack(int capacity){
        super(capacity);
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }
    public int getSize(){
        return super.size();
    }
    public Object peek(){
        return super.get(super.size() - 1);
    }
    public Object pop(){
        return super.remove(super.size() - 1);
    }
    public void push(Object o){
        super.add(o);
    }
    @Override
    public String toString() {
        return "stack: " + super.toString();
    }

}
