public class Restaurant {

    public static void main(String[] args) {
        RestaurantFactoryProducer rsp = new RestaurantFactoryProducer();
        RestaurantAbstractFactory r1 = rsp.getRestaurantAbstractFactory(1);
    }
    
}