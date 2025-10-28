public class ForLoops {
    public static void main(String[] args) {
        /*
            for loop:
                *Loop that helps traverse through a set number of iterations

                Structure:
                    for(<counting variable> ; <condition on counting variable> ; <incrementation>) {
                        ...
                    }

                    ex) create a for loop that loops 10 times where your counting variable starts at 3

                    for(int count = 3 ; count < 13 ; count++) {

                    }

                nested loops:
                    *Loops within other loops

                    ex)
                        for(int i = 0; i < 10; i++) {
                            for(int j = 8; i >=0; i -=3) {
                                count++;
                            }
                        }

                        System.out,println(count);

                    ex)
                        for(int i = 0; i < 5; i++) {
                            System.out.println("-");
                            for(int j = 0; j < 3; j++) {
                                System.out.println("*");
                            }
                        }

         */

        for(int outer = 0; outer < 5; outer += 2)
        {
            for(int inner = 0; inner < outer + 1; inner++)
            {
                System.out.print("*");
            }
        System.out.println();
}
         
    }
}
