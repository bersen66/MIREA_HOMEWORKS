package My.collections.player;

import java.util.ArrayDeque;
import java.util.Deque;

public class PlayerDeque implements Player {
    ArrayDeque<Integer> deque;
    String name = "No name";


    public PlayerDeque(String name, int[] cards) {
        this.name = name;
        deque = new ArrayDeque<>();
        generateDeque(cards);
    }

    @Override
    public int getTop() {
        int temp = this.deque.getFirst();
        this.deque.removeFirst();
        return temp;
    }

    @Override
    public void generateDeque(int[] deque) {
        for (int card : deque) {
            pushBack(card);
        }
    }

    @Override
    public void pushBack(int card) {
        deque.addLast(card);
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
