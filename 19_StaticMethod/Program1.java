class Program1{
    static int x=10;
    static int y=20;

}


/**

After Compilation program

Compiled from "Program1.java"
class Program1 {
  static int x;
  static int y;
  Program1();          ------->Consructor
  static {};            ------->static block for static variables
}
 */


/**
 * Compiled from "Program1.java"
class Program1 {
  static int x;

  static int y;

  Program1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10
       2: putstatic     #7                  // Field x:I
       5: bipush        20
       7: putstatic     #13                 // Field y:I
      10: return
}
 */