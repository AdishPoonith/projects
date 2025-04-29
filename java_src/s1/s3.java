package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class s3 extends j3 {

    /* renamed from: n  reason: collision with root package name */
    private static final String f17548n = p3.n0.q0(1);

    /* renamed from: o  reason: collision with root package name */
    private static final String f17549o = p3.n0.q0(2);

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<s3> f17550p = new h.a() { // from class: s1.r3
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            s3 d10;
            d10 = s3.d(bundle);
            return d10;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final int f17551l;

    /* renamed from: m  reason: collision with root package name */
    private final float f17552m;

    public s3(int i10) {
        p3.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f17551l = i10;
        this.f17552m = -1.0f;
    }

    public s3(int i10, float f10) {
        boolean z10 = true;
        p3.a.b(i10 > 0, "maxStars must be a positive integer");
        p3.a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : false, "starRating is out of range [0, maxStars]");
        this.f17551l = i10;
        this.f17552m = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s3 d(Bundle bundle) {
        p3.a.a(bundle.getInt(j3.f17340j, -1) == 2);
        int i10 = bundle.getInt(f17548n, 5);
        float f10 = bundle.getFloat(f17549o, -1.0f);
        return f10 == -1.0f ? new s3(i10) : new s3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof s3) {
            s3 s3Var = (s3) obj;
            return this.f17551l == s3Var.f17551l && this.f17552m == s3Var.f17552m;
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(Integer.valueOf(this.f17551l), Float.valueOf(this.f17552m));
    }
}
