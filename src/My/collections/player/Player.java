package My.collections.player;

import java.util.Collection;

public interface Player {
    int getTop();
    void generateDeque(int[] deque);
    void pushBack(int card);
    String getName();
    boolean isEmpty();
}
