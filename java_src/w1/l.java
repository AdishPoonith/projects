package w1;

import android.net.Uri;
import com.google.common.collect.s0;
import java.util.Map;
import o3.l;
import o3.u;
import s1.v1;
import w1.h;
/* loaded from: classes.dex */
public final class l implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f19717a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private v1.f f19718b;

    /* renamed from: c  reason: collision with root package name */
    private y f19719c;

    /* renamed from: d  reason: collision with root package name */
    private l.a f19720d;

    /* renamed from: e  reason: collision with root package name */
    private String f19721e;

    private y b(v1.f fVar) {
        l.a aVar = this.f19720d;
        if (aVar == null) {
            aVar = new u.b().e(this.f19721e);
        }
        Uri uri = fVar.f17642c;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), fVar.f17647h, aVar);
        s0<Map.Entry<String, String>> it = fVar.f17644e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            l0Var.e(next.getKey(), next.getValue());
        }
        h a10 = new h.b().e(fVar.f17640a, k0.f19713d).b(fVar.f17645f).c(fVar.f17646g).d(e5.e.k(fVar.f17649j)).a(l0Var);
        a10.G(0, fVar.c());
        return a10;
    }

    @Override // w1.b0
    public y a(v1 v1Var) {
        y yVar;
        p3.a.e(v1Var.f17603k);
        v1.f fVar = v1Var.f17603k.f17678c;
        if (fVar == null || p3.n0.f15397a < 18) {
            return y.f19760a;
        }
        synchronized (this.f19717a) {
            if (!p3.n0.c(fVar, this.f19718b)) {
                this.f19718b = fVar;
                this.f19719c = b(fVar);
            }
            yVar = (y) p3.a.e(this.f19719c);
        }
        return yVar;
    }
}
