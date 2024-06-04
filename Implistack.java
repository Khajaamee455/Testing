import java.util.ArrayList;

class Stack <T> {          // stack class with <T>

    private ArrayList<T> stack;     // PRIVATE arraylist with stack

    public Stack(){
        stack = new ArrayList<>();   // stack constuctor 
    }

    public void push(T element){
        stack.add(element);         // push method to push the element
    }

    public T pop(){
        if(stack.isEmpty()){                 // pop method to pop
            throw new IllegalStateException("stack is empty");

        }
        return stack.remove(stack.size()-1);
    }

    public T peek(){
        if(stack.isEmpty()){      // peek method
            throw new IllegalStateException("stack is empty");
        }
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();         // b00lean mehtod
    }
}