package w1;

import android.util.Pair;
import java.util.Map;
/* loaded from: classes.dex */
public final class q0 {
    private static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    public static Pair<Long, Long> b(o oVar) {
        Map<String, String> c10 = oVar.c();
        if (c10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(c10, "LicenseDurationRemaining")), Long.valueOf(a(c10, "PlaybackDurationRemaining")));
    }
}
