package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public final class w2 extends j3 {

    /* renamed from: m  reason: collision with root package name */
    private static final String f17714m = p3.n0.q0(1);

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<w2> f17715n = new h.a() { // from class: s1.v2
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            w2 d10;
            d10 = w2.d(bundle);
            return d10;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    private final float f17716l;

    public w2() {
        this.f17716l = -1.0f;
    }

    public w2(float f10) {
        p3.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f17716l = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w2 d(Bundle bundle) {
        p3.a.a(bundle.getInt(j3.f17340j, -1) == 1);
        float f10 = bundle.getFloat(f17714m, -1.0f);
        return f10 == -1.0f ? new w2() : new w2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof w2) && this.f17716l == ((w2) obj).f17716l;
    }

    public int hashCode() {
        return b5.j.b(Float.valueOf(this.f17716l));
    }
}
