package BJP3Chapter1;
/*
Write a program in a class named StarFigure that produces the following output using for loops.
////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
 */
public class StarFigure {
    public static final int SIZE=3;
    public static void main(String[] args){
        int slashNumber=4*(SIZE-1);
        int starNumber=0;
        for(int j=0; j<SIZE;j++){
            for(int i=0; i<slashNumber; i++){
                System.out.print("/");
            }
            for(int i=0; i<starNumber; i++){
                System.out.print("*");
            }
            for(int i=0; i<slashNumber; i++){
                System.out.print("\\");
            }
            System.out.println();
            slashNumber-=4;
            starNumber+=8;
        }
    }
}
