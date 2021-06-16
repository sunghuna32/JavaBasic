public class OOPTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Init객체 |Type : " +myCar.getType() +" |Position : "+myCar.getPosition()
                +" |Maker : "+ myCar.getMaker()+ " |Name : "+myCar.getName());

        myCar.setMaker("BMW");
        myCar.setName("붕붕이");
        myCar.forward();

        System.out.println("변화후객체 |Type : " +myCar.getType() +" |Position : "+myCar.getPosition()
                +" |Maker : "+ myCar.getMaker()+ " |Name : "+myCar.getName());

    }
}
