package s9;

import java.io.PrintWriter;
import java.io.StringWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.l.e(th, "<this>");
        kotlin.jvm.internal.l.e(exception, "exception");
        if (th != exception) {
            y9.b.f20628a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.l.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.l.d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
