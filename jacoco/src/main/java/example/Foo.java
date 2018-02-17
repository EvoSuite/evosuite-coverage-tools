package example;

public class Foo {

    private int y = 0;

    public boolean testMe(int x) {
        return x == 42;
    }

    public void inc() {
        y++;
    }

    public boolean isFoo() {
        return y == 2;
    }
}
