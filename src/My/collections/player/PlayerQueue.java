package My.collections.player;

import sun.misc.Queue;

import java.util.Stack;

public class PlayerQueue implements Player{

    String name = "No name";

    public PlayerQueue(String name, int[] deque) {

    }

    @Override
    public int getTop() {
        return 0;
    }

    @Override
    public void generateDeque(int[] deque) {

    }

    @Override
    public void pushBack(int card) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
