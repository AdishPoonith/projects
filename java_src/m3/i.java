package m3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.n0;
import s1.u2;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13770a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String r10;
        while (true) {
            String r11 = a0Var.r();
            if (r11 == null) {
                return null;
            }
            if (f13770a.matcher(r11).matches()) {
                do {
                    r10 = a0Var.r();
                    if (r10 != null) {
                    }
                } while (!r10.isEmpty());
            } else {
                Matcher matcher = f.f13743a.matcher(r11);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String r10 = a0Var.r();
        return r10 != null && r10.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] R0 = n0.R0(str, "\\.");
        long j10 = 0;
        for (String str2 : n0.Q0(R0[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (R0.length == 2) {
            j11 += Long.parseLong(R0[1]);
        }
        return j11 * 1000;
    }

    public static void e(a0 a0Var) {
        int f10 = a0Var.f();
        if (b(a0Var)) {
            return;
        }
        a0Var.T(f10);
        throw u2.a("Expected WEBVTT. Got " + a0Var.r(), null);
    }
}
