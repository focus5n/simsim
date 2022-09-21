package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader implements Reader {

    @Override
    public String read() throws IOException {

        var input = new BufferedReader(new InputStreamReader(System.in));

        String information = input.readLine();

        if (information == null) {
            information = "Hello, Null!";
        }

        return information;
    }

}
