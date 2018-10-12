package lang;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import execboatruffle.File;
import execboatruffle.Sideeffects;

public class Holder {


    private static RootCallTarget cs;

    public static void setCallSite(final File program, final BoaLang language) {
        cs = Truffle.getRuntime().createCallTarget(new RootNode(language) {
            @Override
            public Object execute(VirtualFrame frame) {
                program.eval();
                return "";
            }
        });
    }


    public static RootCallTarget callProgram() {
        return cs;
    }
}
