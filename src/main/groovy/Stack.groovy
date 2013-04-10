class Stack {
    private int[] list;
    private int current;

    def Stack() {
        list = new int[10000];
        current = -1;
    }

    def isEmpty() {
        current < 0
    }

    def size() {
        current+1
    }

    def push(value) {
        list[++current] = value;
    }
}
