public class dll {
    dllnode head = null;
    dllnode tail = null;
    int size;

    public class dllnode {
        int value;
        dllnode prev = null;
        dllnode next = null;
        public dllnode (int val){ 
            this.value = val;
        }
    }

    public void addtostart (int val) {
        dllnode newnode = new dllnode(val);
        if(size == 0){
            head = newnode;
            tail = newnode;
        }
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public void addtobegin (int val) {
        dllnode temp = new dllnode(val);
        if(size == 0){
            head = temp;
            tail = temp;
        }
        else{
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void returnhead () {
        if(size == 0){
            System.out.println("Empty DLL");
        }
        else{
            if(size == 1){
                System.out.println(head.value);
                head = tail = null;
                return;
            }
            dllnode toreturn = head;
            head = head.next;
            head.prev = null;
            System.out.println(toreturn.value);
            size--;
        }
    }

    public void returntail () {
        if(size == 0){
            System.out.println("Empty DLL");
        }
        else{
            if(size == 1){
                System.out.println(tail.value);
                tail = head = null;
                return;
            }
            dllnode toreturn = tail;
            tail = tail.prev;
            tail.next = null;
            System.out.println(toreturn.value);
            size--;
        }
    }

    public void findvalue (int val) {
        dllnode temp = head;
        while(temp != null){
            if(temp.value == val){
                System.out.println("Found");
                return;
            }
            else{
                 temp = temp.next;
            }
        }
        System.out.println("Not Found");
    }
}
