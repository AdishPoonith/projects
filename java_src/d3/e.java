package d3;

import android.os.Bundle;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.List;
import p3.n0;
import s1.h;
/* loaded from: classes.dex */
public final class e implements s1.h {

    /* renamed from: l  reason: collision with root package name */
    public static final e f7706l = new e(q.z(), 0);

    /* renamed from: m  reason: collision with root package name */
    private static final String f7707m = n0.q0(0);

    /* renamed from: n  reason: collision with root package name */
    private static final String f7708n = n0.q0(1);

    /* renamed from: o  reason: collision with root package name */
    public static final h.a<e> f7709o = new h.a() { // from class: d3.d
        @Override // s1.h.a
        public final s1.h a(Bundle bundle) {
            e b10;
            b10 = e.b(bundle);
            return b10;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final q<b> f7710j;

    /* renamed from: k  reason: collision with root package name */
    public final long f7711k;

    public e(List<b> list, long j10) {
        this.f7710j = q.v(list);
        this.f7711k = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7707m);
        return new e(parcelableArrayList == null ? q.z() : p3.c.b(b.S, parcelableArrayList), bundle.getLong(f7708n));
    }
}
