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
    public static void main(String[] args){
        int slashNumber=16;
        int starNumber=0;
        for(int j=0; j<5;j++){
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
            starNumber=32-2*slashNumber;
        }
    }
}
