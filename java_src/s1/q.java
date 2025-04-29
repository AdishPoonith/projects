package s1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import s1.h;
/* loaded from: classes.dex */
public final class q extends y2 {

    /* renamed from: r  reason: collision with root package name */
    public final int f17479r;

    /* renamed from: s  reason: collision with root package name */
    public final String f17480s;

    /* renamed from: t  reason: collision with root package name */
    public final int f17481t;

    /* renamed from: u  reason: collision with root package name */
    public final n1 f17482u;

    /* renamed from: v  reason: collision with root package name */
    public final int f17483v;

    /* renamed from: w  reason: collision with root package name */
    public final u2.s f17484w;

    /* renamed from: x  reason: collision with root package name */
    final boolean f17485x;

    /* renamed from: y  reason: collision with root package name */
    public static final h.a<q> f17477y = new h.a() { // from class: s1.p
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            return q.d(bundle);
        }
    };

    /* renamed from: z  reason: collision with root package name */
    private static final String f17478z = p3.n0.q0(1001);
    private static final String A = p3.n0.q0(1002);
    private static final String B = p3.n0.q0(1003);
    private static final String C = p3.n0.q0(1004);
    private static final String D = p3.n0.q0(1005);
    private static final String E = p3.n0.q0(1006);

    private q(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    private q(int i10, Throwable th, String str, int i11, String str2, int i12, n1 n1Var, int i13, boolean z10) {
        this(j(i10, str, str2, i12, n1Var, i13), th, i11, i10, str2, i12, n1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private q(Bundle bundle) {
        super(bundle);
        this.f17479r = bundle.getInt(f17478z, 2);
        this.f17480s = bundle.getString(A);
        this.f17481t = bundle.getInt(B, -1);
        Bundle bundle2 = bundle.getBundle(C);
        this.f17482u = bundle2 == null ? null : n1.f17407y0.a(bundle2);
        this.f17483v = bundle.getInt(D, 4);
        this.f17485x = bundle.getBoolean(E, false);
        this.f17484w = null;
    }

    private q(String str, Throwable th, int i10, int i11, String str2, int i12, n1 n1Var, int i13, u2.s sVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        p3.a.a(!z10 || i11 == 1);
        p3.a.a((th != null || i11 == 3) ? true : true);
        this.f17479r = i11;
        this.f17480s = str2;
        this.f17481t = i12;
        this.f17482u = n1Var;
        this.f17483v = i13;
        this.f17484w = sVar;
        this.f17485x = z10;
    }

    public static /* synthetic */ q d(Bundle bundle) {
        return new q(bundle);
    }

    public static q f(Throwable th, String str, int i10, n1 n1Var, int i11, boolean z10, int i12) {
        return new q(1, th, null, i12, str, i10, n1Var, n1Var == null ? 4 : i11, z10);
    }

    public static q g(IOException iOException, int i10) {
        return new q(0, iOException, i10);
    }

    @Deprecated
    public static q h(RuntimeException runtimeException) {
        return i(runtimeException, 1000);
    }

    public static q i(RuntimeException runtimeException, int i10) {
        return new q(2, runtimeException, i10);
    }

    private static String j(int i10, String str, String str2, int i11, n1 n1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + n1Var + ", format_supported=" + p3.n0.W(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q e(u2.s sVar) {
        return new q((String) p3.n0.j(getMessage()), getCause(), this.f17790j, this.f17479r, this.f17480s, this.f17481t, this.f17482u, this.f17483v, sVar, this.f17791k, this.f17485x);
    }
}
