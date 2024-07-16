package module1_1;

/*    4-rivin kolmio for looppi
            *
           ***
          *****
         *******             */
public class task2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            System.out.println(" ".repeat((4 - i)) + "*".repeat(1 + i) + "*".repeat(i));
        }

    }
}
