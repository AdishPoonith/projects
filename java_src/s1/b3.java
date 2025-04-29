package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class b3 implements h {

    /* renamed from: m  reason: collision with root package name */
    public static final b3 f17104m = new b3(1.0f);

    /* renamed from: n  reason: collision with root package name */
    private static final String f17105n = p3.n0.q0(0);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17106o = p3.n0.q0(1);

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<b3> f17107p = new h.a() { // from class: s1.a3
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            b3 c10;
            c10 = b3.c(bundle);
            return c10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final float f17108j;

    /* renamed from: k  reason: collision with root package name */
    public final float f17109k;

    /* renamed from: l  reason: collision with root package name */
    private final int f17110l;

    public b3(float f10) {
        this(f10, 1.0f);
    }

    public b3(float f10, float f11) {
        p3.a.a(f10 > 0.0f);
        p3.a.a(f11 > 0.0f);
        this.f17108j = f10;
        this.f17109k = f11;
        this.f17110l = Math.round(f10 * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b3 c(Bundle bundle) {
        return new b3(bundle.getFloat(f17105n, 1.0f), bundle.getFloat(f17106o, 1.0f));
    }

    public long b(long j10) {
        return j10 * this.f17110l;
    }

    public b3 d(float f10) {
        return new b3(f10, this.f17109k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b3.class != obj.getClass()) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return this.f17108j == b3Var.f17108j && this.f17109k == b3Var.f17109k;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f17108j)) * 31) + Float.floatToRawIntBits(this.f17109k);
    }

    public String toString() {
        return p3.n0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f17108j), Float.valueOf(this.f17109k));
    }
}
