package BOOK_05;

public  class Stack extends ObjectStorage {
    private int point = 0;
    @Override
    public void put(Object o) {
        storage[point++]=o;
        objectnum++;
    }

    @Override
   public Object get() {
        objectnum--;
        return storage[--point];
    }
}
