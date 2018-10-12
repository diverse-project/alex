package execboatruffle;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;

public class Sideeffects {

    public static boolean TRACE = true;
    public static boolean PRINT = true;

    public static StringBuilder SB = new StringBuilder();

    @TruffleBoundary
    public static void println(Object obj) {
        if (PRINT) {
            System.out.println(obj);
        } else if (TRACE) {
            SB.append(obj);
            SB.append(System.lineSeparator());
        }
    }
}
