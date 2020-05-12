public class Restaurant {

    public static void main(String[] args) {
        RestaurantFactoryProducer rsp = new RestaurantFactoryProducer();
        RestaurantAbstractFactory r1 = rsp.getRestaurantAbstractFactory(1);
        RestaurantAbstractFactory r2 = rsp.getRestaurantAbstractFactory(2);


        System.out.println( r1.getFastFood("hot dog"));
        System.out.println( r2.getFastFood("hot dog"));

        System.out.println( r1.getDrink("beer"));
        System.out.println( r2.getDrink("beer"));
    }
    
}