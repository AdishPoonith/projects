package q3;

import android.os.Bundle;
import p3.n0;
import s1.h;
/* loaded from: classes.dex */
public final class z implements s1.h {

    /* renamed from: n  reason: collision with root package name */
    public static final z f16157n = new z(0, 0);

    /* renamed from: o  reason: collision with root package name */
    private static final String f16158o = n0.q0(0);

    /* renamed from: p  reason: collision with root package name */
    private static final String f16159p = n0.q0(1);

    /* renamed from: q  reason: collision with root package name */
    private static final String f16160q = n0.q0(2);

    /* renamed from: r  reason: collision with root package name */
    private static final String f16161r = n0.q0(3);

    /* renamed from: s  reason: collision with root package name */
    public static final h.a<z> f16162s = new h.a() { // from class: q3.y
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            z b10;
            b10 = z.b(bundle);
            return b10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f16163j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16164k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16165l;

    /* renamed from: m  reason: collision with root package name */
    public final float f16166m;

    public z(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public z(int i10, int i11, int i12, float f10) {
        this.f16163j = i10;
        this.f16164k = i11;
        this.f16165l = i12;
        this.f16166m = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z b(Bundle bundle) {
        return new z(bundle.getInt(f16158o, 0), bundle.getInt(f16159p, 0), bundle.getInt(f16160q, 0), bundle.getFloat(f16161r, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f16163j == zVar.f16163j && this.f16164k == zVar.f16164k && this.f16165l == zVar.f16165l && this.f16166m == zVar.f16166m;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f16163j) * 31) + this.f16164k) * 31) + this.f16165l) * 31) + Float.floatToRawIntBits(this.f16166m);
    }
}
