package FOMUBAD_BORISTA_FONDI_20V2001.Structural.Adapter.modified.code.stack.inheritance;

public class DListImpStack extends DList implements Stack {

    @Override
    public void push(Object o) {
        insertHead(o);
    }

    @Override
    public Object pop() {
        return removeHead();
    }

    @Override
    public Object top() {
        return this.getHead();
    }

}
