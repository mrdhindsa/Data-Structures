public class q {
    node head = null;
    int size = 0;

    public class node {
        String value;
        node next = null;
        public node (String name){ 
            this.value = name;
        }
    }

    public void eq (String name){
        node newnode = new node(name);
        if(size == 0){
            head = newnode;
        }
        else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    public void dq (){
        if(size == 0){
            System.out.println("Empty Q");
        }
        else{
            node toreturn = head;
            head = head.next;
            System.out.println(toreturn.value);
            size--;
        }
    }
}
