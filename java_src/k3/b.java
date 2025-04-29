package k3;

import android.text.TextUtils;
import com.google.common.collect.s;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f12502d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final s<String> f12503e = s.z("auto", "none");

    /* renamed from: f  reason: collision with root package name */
    private static final s<String> f12504f = s.A("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final s<String> f12505g = s.z("filled", "open");

    /* renamed from: h  reason: collision with root package name */
    private static final s<String> f12506h = s.A("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f12507a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12508b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12509c;

    private b(int i10, int i11, int i12) {
        this.f12507a = i10;
        this.f12508b = i11;
        this.f12509c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = b5.b.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(s.u(TextUtils.split(e10, f12502d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static k3.b b(com.google.common.collect.s<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.b(com.google.common.collect.s):k3.b");
    }
}
