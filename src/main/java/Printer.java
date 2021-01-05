public class Printer {
    private int numberOfSheets;

    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
    }


    public Object print(int sheets) {
        return this.numberOfSheets - sheets;
    }
}
