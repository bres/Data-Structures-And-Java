package Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        //if the array is full,resize it
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //Add the new item at  the end of the array
        items[count] = item; //count is the number of items
        count++;
    }
    public void removeAt(int index) {
        //validate index
        if (index < 0 || index >= count)
           throw new IllegalArgumentException();
            //System.out.println("error");

            // shift the items to the left to fill the hole
            // [10,20,30,40]
            // index :1
            // 1<-2
            // 2<-3
        for (int i = index; i< count; i++)
            items[i] = items[i + 1];
        count--;
        }
    public int indexOf(int item) {
        //worst case scenario ->find the element on last position of the array O(n)
        //best case scenario -> find the element on the first position of the array O(1)

        //if we find it, return index
        for (int i = 0; i < count; i++) {
               if (items[i]==item)
                   return i;
        }
        //Otherwise return -1
        return -1;
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}

