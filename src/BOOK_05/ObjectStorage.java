package BOOK_05;

abstract public class ObjectStorage {
    int objectnum = 0;
    Object storage[] = new Object[100];

    abstract void put (Object o);
    abstract Object get();
}
