package q4;

import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f16188a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f16189b;

    /* renamed from: c  reason: collision with root package name */
    private static final StringBuilder f16190c;

    static {
        Locale locale = Locale.ROOT;
        f16188a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f16189b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f16190c = new StringBuilder(33);
    }

    public static String a(long j10) {
        String sb;
        StringBuilder sb2 = f16190c;
        synchronized (sb2) {
            sb2.setLength(0);
            b(j10, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static void b(long j10, StringBuilder sb) {
        String str;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            str = "0s";
        } else {
            sb.ensureCapacity(sb.length() + 27);
            boolean z10 = false;
            if (i10 < 0) {
                sb.append("-");
                if (j10 != Long.MIN_VALUE) {
                    j10 = -j10;
                } else {
                    j10 = Long.MAX_VALUE;
                    z10 = true;
                }
            }
            if (j10 >= 86400000) {
                sb.append(j10 / 86400000);
                sb.append("d");
                j10 %= 86400000;
            }
            if (true == z10) {
                j10 = 25975808;
            }
            if (j10 >= 3600000) {
                sb.append(j10 / 3600000);
                sb.append("h");
                j10 %= 3600000;
            }
            if (j10 >= 60000) {
                sb.append(j10 / 60000);
                sb.append("m");
                j10 %= 60000;
            }
            if (j10 >= 1000) {
                sb.append(j10 / 1000);
                sb.append("s");
                j10 %= 1000;
            }
            if (j10 <= 0) {
                return;
            }
            sb.append(j10);
            str = "ms";
        }
        sb.append(str);
    }
}
