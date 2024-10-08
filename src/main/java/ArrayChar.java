import java.util.Stack;

public class ArrayChar {
    private char[] value;
    private int count;
    private Stack<ArrayChar> history;

    public ArrayChar() {
        value = new char[0];
        count = 0;
        history = new Stack<>();
    }

    private ArrayChar(char[] value) {
        this.value = value;
        this.count = value.length;
    }

    private void append(char[] add) {
        int len = add.length;
        char[] tmp = new char[count + len];
        System.arraycopy(value, 0, tmp, 0, count);
        System.arraycopy(add, 0, tmp, count, len);
        value = tmp;
        count += len;
    }

    public void putString(String str) {
        char[] chars = str.toCharArray();
        append(chars);
        makeSnapshot();
    }

    private void makeSnapshot() {
        history.push(new ArrayChar(value));
    }

    public void undo() {
        history.pop();
        ArrayChar tmp = history.pop();
        this.value = tmp.value;
        count = tmp.count;
    }

    public char[] getValue() {
        return value;
    }
}
