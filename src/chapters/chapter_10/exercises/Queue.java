package chapters.chapter_10.exercises;

public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
    }
    public void enqueue(int v){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue(){
        int v = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return v;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return result;
    }
}