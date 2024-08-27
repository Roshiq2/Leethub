class Solution {
    class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        final int m = mat.length;
        final int n = mat[0].length;

        Queue<Pos> curr = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = Integer.MAX_VALUE;
                } else {
                    curr.offer(new Pos(i, j));
                }
            }
        }

        // BFS
        Queue<Pos> next = new ArrayDeque<>();
        int steps = 0;

        while (!curr.isEmpty() || !next.isEmpty()) {
            if (curr.isEmpty()) {
                curr = next;
                next = new ArrayDeque<>();
                steps++;
            }

            Pos pos = curr.poll();
            mat[pos.x][pos.y] = steps;

            // 4 neighbors
            if (pos.x + 1 < m && mat[pos.x + 1][pos.y] > steps + 1) {
                mat[pos.x + 1][pos.y] = 0;
                next.offer(new Pos(pos.x + 1, pos.y));
            }
            if (pos.x - 1 >= 0 && mat[pos.x - 1][pos.y] > steps + 1) {
                mat[pos.x - 1][pos.y] = 0;
                next.offer(new Pos(pos.x - 1, pos.y));
            }
            if (pos.y + 1 < n && mat[pos.x][pos.y + 1] > steps + 1) {
                mat[pos.x][pos.y + 1] = 0;
                next.offer(new Pos(pos.x, pos.y + 1));
            }
            if (pos.y - 1 >= 0 && mat[pos.x][pos.y - 1] > steps + 1) {
                mat[pos.x][pos.y - 1] = 0;
                next.offer(new Pos(pos.x, pos.y - 1));
            }
        }

        return mat;
    }
}