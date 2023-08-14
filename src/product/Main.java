package product;

import static product.Store.shuffleArray;

public class Main {
    public static void main(String[] args) {
        Product [] products = new Product[]{
                new Milk("Milk",60 ),
                new Milk("Milk",60 ),
                new Milk("Milk",60 ),
                new Milk("Milk",60 ),

                new Corn("Corn",150),
                new Corn("Corn",150),
                new Corn("Corn",150),
                new Corn("Corn",150),


                new Salt("Salt",0  ),
                new Salt("Salt",0  ),
                new Salt("Salt",0  ),
                new Salt("Salt",0  ),


                new Stew("Stew",180),
                new Stew("Stew",180),
                new Stew("Stew",180),
                new Stew("Stew",180),


                new Fish("Fish",20),
                new Fish("Fish",20),
                new Fish("Fish",20),
                new Fish("Fish",20),

        };
        shuffleArray(products);

        Store store = new Store();
        store.setProducts(products);
        store.doInspection();

    }
}
