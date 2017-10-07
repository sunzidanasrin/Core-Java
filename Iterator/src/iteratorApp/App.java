package iteratorApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Students> list = new ArrayList<Students>();
        list.add(new Students("Ruhul", "Amin", 45698, 3.00));
        list.add(new Students("Tuhin", "Amin", 45678, 3.10));
        list.add(new Students("Abid", "Amin", 45598, 3.20));

        Iterator<Students> elements = list.iterator();

        while (elements.hasNext()) {
            Students next = elements.next();
            System.out.println(next.getFirstName());
        }

    }

}
