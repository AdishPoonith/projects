package j2;

import j2.b;
import j2.l;
import j2.x;
import p3.n0;
/* loaded from: classes.dex */
public final class j implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private int f12016a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12017b;

    @Override // j2.l.b
    public l a(l.a aVar) {
        int i10;
        int i11 = n0.f15397a;
        if (i11 < 23 || ((i10 = this.f12016a) != 1 && (i10 != 0 || i11 < 31))) {
            return new x.b().a(aVar);
        }
        int k10 = p3.v.k(aVar.f12025c.f17419u);
        p3.r.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.k0(k10));
        return new b.C0178b(k10, this.f12017b).a(aVar);
    }
}
