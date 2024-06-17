class Box {
    int lenght;
    int height;
    int breath;

    void setDim (int l, int h, int b) {
         lenght = l;
         height = h;
         breath = b; 
    }

    Box(int lenght, int height, int breath) {
        this.lenght = lenght;
        this.height = height;
        this.breath = breath;
    }

    Box(int l) {
        lenght = breath = height = l;
    }

    int volume(){
        return (lenght * height * breath);
    }
}
public class ClassAndObject {
    public static void main (String[] args) {

        // Box BlackBox = new Box();
        // BlackBox.lenght = 10;
        // BlackBox.height = 5;
        // BlackBox.breath = 2;
        // System.out.println("Volume of the Black Box is " + BlackBox.volume());

        // Box WoodenBox = new Box();
        // WoodenBox.setDim(20, 12, 7);
        // System.out.println("Volume of Wooden Box is " + WoodenBox.volume());

        // Box BlackBox = new Box(10, 5, 2);
        // System.out.println("Volume of the Black Box is " + BlackBox.volume());

        Box BlackBox = new Box(10);
        System.out.println("Volume of the Black Box is " + BlackBox.volume());
    }
}