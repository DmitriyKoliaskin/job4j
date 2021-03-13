public class HelloWorld {

    /**
     * if-else оператор
     * @param args
     */
    public static void main(String[] args) {
        int value =-10;
        boolean test = value > 0;
        if (test) {
            System.out.println("Число является положительным");
        } else if (value < 0){
            System.out.println("Число является отрицательным");
        } else {
            System.out.println("Число является нулем");
        }
    }
}
