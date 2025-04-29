package h4;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final f f9465a = new f();

    private f() {
    }

    public static d c() {
        return f9465a;
    }

    @Override // h4.d
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // h4.d
    public final long b() {
        return System.currentTimeMillis();
    }
}
