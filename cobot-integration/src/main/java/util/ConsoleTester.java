package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleTester {
    public interface CallBack {
        String call(String input);
    }

    public ConsoleTester(CallBack callBack) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("input : ");

            String input = null;
            try {
                input = br.readLine();
            } catch (IOException e) {
                input = "q";
            }

            if ("q".equals(input)) {
                System.out.println("\nExit!");
                System.exit(0);
            }

            System.out.println("output: " + callBack.call(input) + "\n");
        }
    }
}