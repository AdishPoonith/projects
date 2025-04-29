package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public abstract class j3 implements h {

    /* renamed from: j  reason: collision with root package name */
    static final String f17340j = p3.n0.q0(0);

    /* renamed from: k  reason: collision with root package name */
    public static final h.a<j3> f17341k = new h.a() { // from class: s1.i3
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            j3 b10;
            b10 = j3.b(bundle);
            return b10;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static j3 b(Bundle bundle) {
        h.a aVar;
        int i10 = bundle.getInt(f17340j, -1);
        if (i10 == 0) {
            aVar = q1.f17490p;
        } else if (i10 == 1) {
            aVar = w2.f17715n;
        } else if (i10 == 2) {
            aVar = s3.f17550p;
        } else if (i10 != 3) {
            throw new IllegalArgumentException("Unknown RatingType: " + i10);
        } else {
            aVar = w3.f17719p;
        }
        return (j3) aVar.a(bundle);
    }
}
