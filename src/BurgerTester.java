public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools B = new BurgerTools();
        BurgerTools C = new BurgerTools();
        System.out.println(B.averageDaysBeforeExpiration);
        B.averageDaysBeforeExpiration = 6;
        System.out.println(C.averageDaysBeforeExpiration);
        B.grill();
        System.out.println(B.currentTempurature);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
//        System.out.println(BurgerTools.currentTempurature); //cannot execute

    }
}
