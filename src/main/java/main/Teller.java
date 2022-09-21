package main;

import reader.KeyboardReader;
import reader.Reader;
import writer.MonitorWriter;
import writer.Writer;

public class Teller {

    public static void main(String... args) {

        Reader reader = new KeyboardReader();
        Writer writer = new MonitorWriter();

        String teller = writer.write(String.valueOf(reader));

        System.out.println(teller);

    }

}
