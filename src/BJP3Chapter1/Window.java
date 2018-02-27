package BJP3Chapter1;
/*
Write a Java program in a class named Window that produces the preceding figure as output.
Use nested for loops to print the repeated parts of the figure.
Once you get it to work, add one class constant to your program so that the size of the
figure can be changed simply by changing that constant's value. The example output
shown is at a constant size of 3, but if you change the constant, the figure should grow
larger and wider proportionally.
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
 */
public class Window {
    public static final int size = 3;

    public static void main(String[] args){
        for(int i=0; i<2; i++){
            printFrame();
            printGlass();
        }
        printFrame();
    }

    public static void printFrame(){
        System.out.print("+");
        for(int j=size; j>0; j--){
            System.out.print("=");
        }
        System.out.print("+");
        for(int j=size; j>0; j--){
            System.out.print("=");
        }
        System.out.println("+");
    }
    public static void printGlass(){
        for(int z=0; z<size; z++){
            System.out.print("|");
            for(int h=0; h<2; h++){
                for(int b=0; b<size; b++){
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}


