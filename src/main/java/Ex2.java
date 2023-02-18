public class Ex2 {
    enum Type {
        Cube,
        Envelope,
        Box
    }

    public static class Box {
        int a, b, c;
        private Type type;

        public Box(int a) {
            this.a = this.b = this.c = a;
            type = Type.Cube;
        }

        public Box(int a, int b) {
            this.a = a;
            this.b = b;
            type = Type.Envelope;
        }

        public Box(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            type = Type.Box;
        }

        public Type getType() {
            return type;
        }
    }

}





