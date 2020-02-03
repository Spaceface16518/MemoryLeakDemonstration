public class BathroomRunner {
    public static void main(String[] args) {
        final int numStalls = 10000;

        Bathroom bathroom = new Bathroom();
        for (int i = 0; i < numStalls; i++) {
            bathroom.addStall(new StallNumber(i));
        }

        //noinspection InfiniteLoopStatement
        while (true) {
            // fill  1/2
            for (int i = 0; i < numStalls / 2; i++) {
                bathroom.enterStall(new StallNumber(i));
            }

            // empty 1/4 (1/4 full)
            for (int i = 0; i < numStalls / 4; i++) {
                bathroom.exitStall(new StallNumber(i));
            }

            // fill 1/2 (3/4 full)
            for (int i = 0; i < numStalls / 2; i++) {
                bathroom.enterStall(new StallNumber(i));
            }

            // empty 3/4 (0 full)
            for (int i = 0; i < numStalls * 3 / 4; i++) {
                bathroom.exitStall(new StallNumber(i));
            }

            // fill and remove completely completely
            for (int i = 0; i < numStalls; i++) {
                bathroom.enterStall(new StallNumber(i));
            }
            for (int i = 0; i < numStalls; i++) {
                bathroom.exitStall(new StallNumber(i));
            }
        }
    }
}
