public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools B = new BurgerTools("dhfjksha",10, 50);
//        System.out.println(B.averageDaysBeforeExpiration);
//        B.averageDaysBeforeExpiration = 6;
//        System.out.println(C.averageDaysBeforeExpiration);
//        B.grill();
//        System.out.println(B.currentTempurature);
//        System.out.println(BurgerTools.averageDaysBeforeExpiration);
//        System.out.println(BurgerTools.currentTempurature); //cannot execute
        B.setCurrentTempurature(200);
        System.out.println(B.getCurrentTempurature());

    }
}
