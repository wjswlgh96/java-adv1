package thread.control;

import jdk.jshell.spi.ExecutionControl;
import util.ThreadUtils;

import static util.ThreadUtils.*;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckRunnable implements Runnable {

        @Override
        public void run() {
            sleep(1000);
        }
    }
}
