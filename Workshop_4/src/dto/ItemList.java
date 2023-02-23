package dto;

public class ItemList {
    private int noItem = 0;
    private int MAX = 100;
    private Item list[] = new Item[MAX];

    public ItemList() {

    }

    public boolean addItem(Item x) {
        if (noItem > MAX) {
            return false;
        } else {
            list[noItem] = x;
            noItem++;
        }
        return true;
    }

    public void displayItem() {
        for (Item x: list) {
            x.output();
        }
    }
    public Item displayListByCreator(String creator) {
        for (Item x : list) {
            if (x.getCreator().equalsIgnoreCase(creator)) {
                return x;
            }
        }
        return null;
    }

    public int findIndexByValue(int value) {
        for (int i = 0; i < noItem; i++) {
            if (list[i].getValue() == value) {
                return i;
            }
        }
        return -1;
    }
    public Item findItemByValue(int value) {
        for (int i = 0; i < noItem; i++) {
            if (list[i].getValue() == value) {
                return list[i];
            }
        }
        return null;
    }
}
