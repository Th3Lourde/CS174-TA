
public class linked_list {

    public static void main(String[] args) {
    Node my_ll = new Node(1, null);
    Node a = new Node(2, null);
    Node b = new Node(3, null);
    Node c = new Node(4, null);
    Node d = new Node(5, null);

    my_ll.next = a;
    a.next = b;
    b.next = c;
    c.next = d;

    System.out.println(my_ll.toString());

  }

}

class Node {
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public String toString(){
      String result = data + "-->";
      if (next != null) {
          result += next.toString();
      } else if (next == null) {
        result += "null";
      }
      return result;
    }
}
