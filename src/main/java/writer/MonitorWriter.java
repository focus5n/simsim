package writer;

import reader.Reader;

public class MonitorWriter implements Writer {

    @Override
    public String write(String reader) {

        String data = String.valueOf(reader);

        return data;
    }
}
