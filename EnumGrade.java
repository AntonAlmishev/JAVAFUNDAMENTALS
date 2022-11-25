package MetodsAndArrays;

public enum EnumGrade {
         EXCELLENT('A',6),VERY_GOOD('B',5),
    GOOD('C',4),BASIC('D',3),POOR('F',2){
        @Override
        public boolean pass() {
            return false;
        }
    };



    private int digitGrade;
    private char charGrade;


    EnumGrade (char charGrade,int digitGrade){
        this.digitGrade = digitGrade;
        this.charGrade = charGrade;

    }

    public int getDigitGrade() {
        return digitGrade;
    }

    public void setDigitGrade(int digitGrade) {
        this.digitGrade = digitGrade;
    }

    public char getCharGrade() {
        return charGrade;
    }

    public void setCharGrade(char charGrade) {
        this.charGrade = charGrade;
    }
    public boolean pass(){
        return true;
    }

}
