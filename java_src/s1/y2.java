package s1;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import s1.h;
/* loaded from: classes.dex */
public class y2 extends Exception implements h {

    /* renamed from: l  reason: collision with root package name */
    private static final String f17784l = p3.n0.q0(0);

    /* renamed from: m  reason: collision with root package name */
    private static final String f17785m = p3.n0.q0(1);

    /* renamed from: n  reason: collision with root package name */
    private static final String f17786n = p3.n0.q0(2);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17787o = p3.n0.q0(3);

    /* renamed from: p  reason: collision with root package name */
    private static final String f17788p = p3.n0.q0(4);

    /* renamed from: q  reason: collision with root package name */
    public static final h.a<y2> f17789q = new h.a() { // from class: s1.x2
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            return new y2(bundle);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f17790j;

    /* renamed from: k  reason: collision with root package name */
    public final long f17791k;

    /* JADX INFO: Access modifiers changed from: protected */
    public y2(Bundle bundle) {
        this(bundle.getString(f17786n), c(bundle), bundle.getInt(f17784l, 1000), bundle.getLong(f17785m, SystemClock.elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f17790j = i10;
        this.f17791k = j10;
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(f17787o);
        String string2 = bundle.getString(f17788p);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, y2.class.getClassLoader());
            Throwable b10 = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            if (b10 != null) {
                return b10;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }
}
