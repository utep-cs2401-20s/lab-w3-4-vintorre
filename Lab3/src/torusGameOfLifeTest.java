import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class torusGameOfLifeTest{

        @Test
        public void testOneStep1(){
        int[][] A = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
        int[][] B = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};
        torusGameOfLife t = new torusGameOfLife(A);
        t.oneStep();
        assertArrayEquals(B, t.getBoard());

    }

    @Test
        public void testOneStep2(){
            int[][] A = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
            int[][] B = {{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,1,0},{0,1,0,0,1,0},{0,0,1,0,0,0},{0,0,0,0,0,0}};
            torusGameOfLife t = new torusGameOfLife(A);
            t.oneStep();
            assertArrayEquals(B,t.getBoard());
    }

    @Test
        public void testOneStep3(){
            int[][] A = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0,},{0,0,0,1,1,0},{0,0,0,0,0,0}};
            int[][] B = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,0,0,0,0},{0,0,0,0,1,0,},{0,0,0,1,1,0},{0,0,0,0,0,0}};
            torusGameOfLife t = new torusGameOfLife(A);
            t.oneStep();
            assertArrayEquals(B,t.getBoard());
    }

    @Test
        public void testOneStep4(){
            int[][] A = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,1,0,1,0,1,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};
            int[][] B = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,1,1,1,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0}};

            torusGameOfLife t = new torusGameOfLife(A);
            t.oneStep();
            assertArrayEquals(B, t.getBoard());
    }

    @Test
        public void testOneStep5(){
                int[][] A = {{1}};
                int[][] B = {{0}};

                torusGameOfLife t = new torusGameOfLife(A);
                t.oneStep();
                assertArrayEquals(B, t.getBoard());
    }

    @Test
        public void testNeighbors1(){
            int[][] A = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};

            torusGameOfLife t = new torusGameOfLife(A);
            assertEquals(2, t.neighbors(2,2));

    }

    @Test
        public void testNeighbors2(){
            int[][] A = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0}};

                torusGameOfLife t = new torusGameOfLife(A);
                assertEquals(0, t.neighbors(0,0));
    }

    @Test
        public void testNeighbors3(){
                int[][] A = {{0,0,0,0,0,0},{0,1,1,0,0,0},{0,1,1,0,0,0},{0,0,0,1,1,0,},{0,0,1,1,0,0},{0,0,0,0,0,0}};

                torusGameOfLife t = new torusGameOfLife(A);
                assertEquals(3, t.neighbors(1,1));
    }

    @Test
        public void testNeighbors4(){
                int[][] A = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{1,1,0,0,1}};

                torusGameOfLife t = new torusGameOfLife(A);
                assertEquals(2, t.neighbors(0,0));
    }

    @Test
        public void testNeighbors5(){
                int[][] A = {{0}};

                torusGameOfLife t = new torusGameOfLife(A);
                assertEquals(0, t.neighbors(0,0));
    }

    @Test
        public void testEvolution1(){
            int[][] A = {{0,0,0,0,0},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,0,0},{0,0,0,0,0}};
            int[][] B = {{0,0,0,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,0,0,0}};

            torusGameOfLife t = new torusGameOfLife(A);
            t.evolution(5);
            assertArrayEquals(B, t.getBoard());
    }

    @Test
        public void testEvolution2() {
            int[][] A = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

            torusGameOfLife t = new torusGameOfLife(A);
            t.evolution(0);
            assertArrayEquals(A, t.getBoard());
    }

    @Test
        public void testEvolution3(){
            int[][] A = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,1,1,1,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
            int[][] B = {{0,0,0,0,0,0},{0,0,0,1,0,0},{0,1,0,0,1,0},{0,1,0,0,1,0},{0,0,1,0,0,0},{0,0,0,0,0,0}};

            torusGameOfLife t = new torusGameOfLife(A);
            t.evolution(3);
            assertArrayEquals(B, t.getBoard());
    }

    @Test
        public void testEvolution4(){
                int[][] A = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};

                torusGameOfLife t = new torusGameOfLife(A);
                t.evolution(100);
                assertArrayEquals(A, t.getBoard());
    }

    @Test
        public void testEvolution5(){
                int[][] A = {{1}};
                int[][] B = {{0}};

                torusGameOfLife t = new torusGameOfLife(A);
                t.evolution(5);
                assertArrayEquals(B, t.getBoard());
    }

}

