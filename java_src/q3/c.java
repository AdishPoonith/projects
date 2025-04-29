package q3;

import android.os.Bundle;
import java.util.Arrays;
import p3.n0;
import s1.h;
/* loaded from: classes.dex */
public final class c implements s1.h {

    /* renamed from: o  reason: collision with root package name */
    public static final c f16022o = new c(1, 2, 3, null);

    /* renamed from: p  reason: collision with root package name */
    private static final String f16023p = n0.q0(0);

    /* renamed from: q  reason: collision with root package name */
    private static final String f16024q = n0.q0(1);

    /* renamed from: r  reason: collision with root package name */
    private static final String f16025r = n0.q0(2);

    /* renamed from: s  reason: collision with root package name */
    private static final String f16026s = n0.q0(3);

    /* renamed from: t  reason: collision with root package name */
    public static final h.a<c> f16027t = new h.a() { // from class: q3.b
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            c d10;
            d10 = c.d(bundle);
            return d10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final int f16028j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16029k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16030l;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f16031m;

    /* renamed from: n  reason: collision with root package name */
    private int f16032n;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f16028j = i10;
        this.f16029k = i11;
        this.f16030l = i12;
        this.f16031m = bArr;
    }

    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    public static int c(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c d(Bundle bundle) {
        return new c(bundle.getInt(f16023p, -1), bundle.getInt(f16024q, -1), bundle.getInt(f16025r, -1), bundle.getByteArray(f16026s));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16028j == cVar.f16028j && this.f16029k == cVar.f16029k && this.f16030l == cVar.f16030l && Arrays.equals(this.f16031m, cVar.f16031m);
    }

    public int hashCode() {
        if (this.f16032n == 0) {
            this.f16032n = ((((((527 + this.f16028j) * 31) + this.f16029k) * 31) + this.f16030l) * 31) + Arrays.hashCode(this.f16031m);
        }
        return this.f16032n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f16028j);
        sb.append(", ");
        sb.append(this.f16029k);
        sb.append(", ");
        sb.append(this.f16030l);
        sb.append(", ");
        sb.append(this.f16031m != null);
        sb.append(")");
        return sb.toString();
    }
}
