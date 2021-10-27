package My.collections.player;


import java.util.Deque;
import java.util.Stack;

public class PlayerStack implements Player {

    Stack<Integer> deque;
    String name = "No name";

    public PlayerStack(String name, int[] cards) {
        deque = new Stack<>();
        this.name = name;
        generateDeque(cards);
    }

    @Override
    public void generateDeque(int[] deque) {
        for (int card : deque) {
            this.deque.add(0, card);
        }
    }

    @Override
    public int getTop() {
        int top = this.deque.peek();
        this.deque.pop();
        return top;
    }

    @Override
    public void pushBack(int card) {
        this.deque.add(0, card);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
