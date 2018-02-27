package BJP3Chapter1;
/*
Write a Java program in a class named SlashFigure that produces the following output.
Use nested for loops to capture the structure of the figure.
!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

 */
public class SlashFigure {
        public static void main(String[] args){
            int colNumber=22;
            int slashNumber=0;
            for(int i=0; i<6; i++){
                for(int h=slashNumber; h>0; h--){
                    System.out.print("\\");
                }
                for(int j=colNumber; j>0; j--){
                    System.out.print("!");
                }
                for(int h=slashNumber; h>0; h--){
                    System.out.print("/");
                }
                System.out.println();
                colNumber-=4;
                slashNumber+=2;
            }
        }
}

