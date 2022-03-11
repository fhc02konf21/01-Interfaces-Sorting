package org.campus02.shopping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoShoppingApp {
    public static void main(String[] args) {

        Cart c1 = new Cart("max@muster.com", 1, 3, 31);
        Cart c2 = new Cart("susi@gmail.com", 2, 1, 193);
        Cart c3 = new Cart("john@johndoe.com", 3, 1, 219);

        ArrayList<Cart> listCarts = new ArrayList<>();
        listCarts.add(c1);
        listCarts.add(c2);
        listCarts.add(c3);

        System.out.println("listCarts = " + listCarts);
        Collections.sort(listCarts);
        System.out.println("listCarts = " + listCarts);
        
        Collections.sort(listCarts, new CartUsernameComparator());
        System.out.println("listCarts = " + listCarts);
        
        Collections.sort(listCarts, new CartTotalItemsComparator());
        System.out.println("listCarts = " + listCarts);
        
        Collections.sort(listCarts, new Comparator<Cart>() {
            @Override
            public int compare(Cart o1, Cart o2) {
                return Integer.compare(o2.getNumArticles(), o1.getNumArticles());
            }
        });

        System.out.println("listCarts = " + listCarts);

        Collections.sort(listCarts, (p1, p2) -> p1.getUsername().compareTo(p2.getUsername()));
        System.out.println("listCarts = " + listCarts);

        Collections.sort(listCarts, Comparator.comparing(Cart::getUsername));
        System.out.println("listCarts = " + listCarts);
    }
}
