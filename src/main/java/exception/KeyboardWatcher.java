package exception;

import java.io.IOException;

public class KeyboardWatcher implements Watcher {

    @Override
    public String message(String exception) {
        return exception;
    }

}
