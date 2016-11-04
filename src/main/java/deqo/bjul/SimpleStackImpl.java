package deqo.bjul;

import java.util.Stack;

/* un commentaire répondant à l'exigence 3*/
public class SimpleStackImpl implements SimpleStack{

    private Stack<Object> stack = new Stack<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item)stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
