package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void showLastUpdated () {
        System.out.println("The menu was last up dated on: " + this.getLastUpdated());
    }

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void add(MenuItem item) {
        this.items.add(item);
    }

    public void simpleRemove(int index) {
        this.items.remove(index);
    }

    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number corresponding to the menu item you would like to remove:");
        this.showAll();
        int indexToDelete = (input.nextInt()) - 1;
        input.close();

        this.items.remove(indexToDelete);
    }

    public void simpleShowItem(int index) {
        MenuItem theItem = this.items.get(index);
//        System.out.println(theItem.getName() + ": " + theItem.getPrice());
        System.out.println(theItem.toString());
    }

    public void showItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number from 0 to " + (this.items.size()-1) + " corresponding to the menu item you would like to show:");
        int indexToShow = input.nextInt();
        input.close();
        this.simpleShowItem(indexToShow);
    }

    public void showAll() {
        for (int i = 0; i < this.items.size(); i++) {
            MenuItem theItem = this.items.get(i);
//            System.out.println(i+1 + ") " + theItem.getName() + ": " + theItem.getPrice());
            System.out.println(i+1 +") " + theItem.toString());
        }
    }
}



