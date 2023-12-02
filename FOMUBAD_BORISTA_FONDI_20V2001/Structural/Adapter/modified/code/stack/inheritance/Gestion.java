package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.stack.inheritance;

public class Gestion {

    public static void main(String[] args) {
        Stack stack = new DListImpStack();

        stack.push("first");
        stack.push("second");
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
