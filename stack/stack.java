public class stack {
    node top = null;

    public class node {
        String value;
        node prev = null;
        public node (String name){ 
            this.value = name;
        }
    }

    public void push (String name){
        node temp = new node(name);
        if(top == null){
            top = temp;
        }
        else{
            temp.prev = top;
            top = temp;
        }
    }

    public node pop (){
        node toreturn = top;
        top = top.prev;
        System.out.println(toreturn.value);
        return toreturn;
    }
}
