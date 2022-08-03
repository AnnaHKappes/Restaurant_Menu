package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myBucket = new ArrayList<>();

        MenuItem baconBrusselsSprout = new MenuItem("Bacon-wrapped Brussels Sprouts", "They are wrapped in bacon, probably taste nice", "Appetizer", 15.22);
        MenuItem banMi = new MenuItem("Ban Mi", "It's a really nice sandwish.", "Entree", 9.99);
        MenuItem flan = new MenuItem("Flan", "Sweat and tasty", "Dessert", 6.98);

        myBucket.add(baconBrusselsSprout);
        myBucket.add(banMi);
        myBucket.add(flan);

        Menu myMenu = new Menu(myBucket);
        MenuItem poutine = new MenuItem("Poutine", "Oh, this is very good", "Appetizer", 5.99);


//        myMenu.showAll();
//        myMenu.remove();
//        myMenu.add(poutine);
//        myMenu.showAll();

//        myMenu.showItem();
        myMenu.showLastUpdated();

    }
}
