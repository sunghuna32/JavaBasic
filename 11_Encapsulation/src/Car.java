public class Car {

    //Car Object의 Data는 Private로 선언
    private String type;
    private int position;
    private String maker,name;

    //Constructor
    public Car(){
        type= "자동차";
        position = 0;
    }

    //외부에서 Member 접근 가능하게 한다.
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    //외부에서는 Object의 Postion을 변경하지 못하게 한다.
    //=> forword를 통해서만 접근가능
    public void forward(){
        position++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public int getPosition() {
        return position;
    }

}
