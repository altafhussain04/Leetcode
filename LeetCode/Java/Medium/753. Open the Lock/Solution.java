
import java.util.*;

class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        String start = "0000";

        if (dead.contains(start)) {
            return -1;
        }

        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.offer(start);
        visited.add(start);

        int moves = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int j = 0; j < size; j++) {

                String curr = q.poll();

                if (curr.equals(target)) {
                    return moves;
                }

                char[] arr = curr.toCharArray();

                for (int i = 0; i < 4; i++) {

                    char original = arr[i];

                    // Rotate forward
                    arr[i] = (char) (original == '9'
                            ? '0' : original + 1);

                    String next = new String(arr);

                    if (!dead.contains(next)
                            && !visited.contains(next)) {
                        q.offer(next);
                        visited.add(next);
                    }

                    // Rotate backward
                    arr[i] = (char) (original == '0'
                            ? '9' : original - 1);

                    next = new String(arr);

                    if (!dead.contains(next)
                            && !visited.contains(next)) {
                        q.offer(next);
                        visited.add(next);
                    }

                    arr[i] = original;
                }
            }

            moves++;
        }

        return -1;
    }
}
