public class Ex3 {

    public static class Meaning {
        private final Integer[] array;
        private int i = 0;

        public Meaning(int count) {
            this.array = new Integer[count];
        }

        public void meaning(int number) {
            array[i] = number;
            if (i++ == 4) {
                i = 0;
            }
        }

        public double num() {
            double sum = 0;
            int count = 0;
            for (Integer j : array) {
                if (j != null) {
                    sum += j;
                    count++;
                }
            }
            if (count == 0) {
                return 0;
            }
            return sum / count;
        }
    }
}

