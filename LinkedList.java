
public class LinkedList<Item> {

  private Node first; // beginning

  // helper Node class
  private class Node {
    private Item item;
    private Node next;
  }

  // is the list empty?
  public boolean isEmpty() {
    return first == null;
  }
  
  // find the preceding item
  private Item precedes(Item data, Node pos, Item pre){
	  if(pos.item != data) precedes(data, pos.next, pos.item); //move to next and save pos.item
	  return pre;	//return preceding item (the previous pos.item)
  }
  
  // wrapper for precedes method
  public Item precedes(Item data){
	  return precedes(data, first, null);
  }
}