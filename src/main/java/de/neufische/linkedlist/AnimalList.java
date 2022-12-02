package de.neufische.linkedlist;


public class AnimalList {
    private AnimalListItem head;
    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public void addItem(Animal newAnimal){
        AnimalListItem newItem=new AnimalListItem(newAnimal);
        if (head.value==null) {
           head =newItem;
        }else {
            AnimalListItem lastItem=head;
            while (lastItem.next!=null){
                lastItem=lastItem.next;
            }
            lastItem.next=newItem;
        }
    }
    public void removeItem(String name){

        if (head.value.getName().equals(name)) {
            head =head.next;
        }else {
            AnimalListItem preItem=head;
            AnimalListItem currItem=head.next;
            while (currItem!=null){
                if (currItem.value.getName().equals(name)) {
                    preItem.next= currItem.next;
                    //System.out.println("remove:" +currItem.toString());
                }
                preItem=currItem;
                currItem= currItem.next;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        AnimalListItem currItem=head;
        while (currItem != null){
                result.append(currItem.value).append("->");
                currItem = currItem.next;
        }
        return result.toString();
    }

}
