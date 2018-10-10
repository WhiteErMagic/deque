class Deque {

     int size;
     int head;
     int tail;
     int[] data;

     Deque(int size) {
         data = new int [this.size = size];
         head = size - 1;
     }

     void pushBack(int value) {
         data[tail++] = value;
         if (tail == size)
            tail = 0;
     }

     int popBack() {
         if (--tail < 0)
             tail = size - 1;
         int ret = data[tail];
         return ret;
     }

     void pushFront(int value) {
         data[head--] = value;
         if (head < 0)
             head = size - 1;
     }

     int popFront() {
         if (++head == size)
            head = 0;
         return data[head];
     }

     boolean isEmpty() {
         return head == tail;
     }

}
