package BOOK_05;

class Queue extends ObjectStorage {
     private int top = 0;
     private int bottom = 0;

    @Override
    public void put(Object o) {
        storage[top++]=0;
        objectnum++;
    }

    @Override
    public Object get() {
        objectnum--;
        return storage[bottom++];
    }
}
