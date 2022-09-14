CRUD
public Supermarket(){
        //CRUD

        //Create
            inventory.add(new Product("Coffee", 2.79));
            inventory.add(new Product("Tea", 1.79));
            inventory.add(new Product("Buscuits", 3.79));
            inventory.add(new Product("Milk", 0.79));
            inventory.add(new Product("Oat Milk", 3.10));
        //read
            Product coffee = inventory.get(0);
        //update
            inventory.set(0, new Product("Coffee", 2.99));
        //delete
            inventory.remove(3);
            inventory.size();
}