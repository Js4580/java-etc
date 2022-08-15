package part_number_two.£part.Lambda_expressions.Lambda_1;

import java.util.Random;

public class Lambda {
    public static void main(String[] args) {
        Runner runner_1 = new Runner();
        /*runner_1.run(new EX());
        runner_1.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("hi");
            }
        });*/
        int a =1;
        runner_1.run(x-> x+2+4*6+a);

    }
}

interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable executable) {
        Random random = new Random();
        int a = executable.execute(random.nextInt(10_1));
        System.out.println(a);
    }
}
interface I{
    int hi(Integer integer);
}
