package k9;

import i9.m0;
import i9.y0;
import io.grpc.internal.m2;
import io.grpc.internal.r0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    public static final m9.d f12649a;

    /* renamed from: b  reason: collision with root package name */
    public static final m9.d f12650b;

    /* renamed from: c  reason: collision with root package name */
    public static final m9.d f12651c;

    /* renamed from: d  reason: collision with root package name */
    public static final m9.d f12652d;

    /* renamed from: e  reason: collision with root package name */
    public static final m9.d f12653e;

    /* renamed from: f  reason: collision with root package name */
    public static final m9.d f12654f;

    static {
        okio.f fVar = m9.d.f13893g;
        f12649a = new m9.d(fVar, "https");
        f12650b = new m9.d(fVar, "http");
        okio.f fVar2 = m9.d.f13891e;
        f12651c = new m9.d(fVar2, "POST");
        f12652d = new m9.d(fVar2, "GET");
        f12653e = new m9.d(r0.f11580j.d(), "application/grpc");
        f12654f = new m9.d("te", "trailers");
    }

    private static List<m9.d> a(List<m9.d> list, y0 y0Var) {
        byte[][] d10 = m2.d(y0Var);
        for (int i10 = 0; i10 < d10.length; i10 += 2) {
            okio.f n10 = okio.f.n(d10[i10]);
            if (n10.r() != 0 && n10.k(0) != 58) {
                list.add(new m9.d(n10, okio.f.n(d10[i10 + 1])));
            }
        }
        return list;
    }

    public static List<m9.d> b(y0 y0Var, String str, String str2, String str3, boolean z10, boolean z11) {
        b5.n.o(y0Var, "headers");
        b5.n.o(str, "defaultPath");
        b5.n.o(str2, "authority");
        c(y0Var);
        ArrayList arrayList = new ArrayList(m0.a(y0Var) + 7);
        arrayList.add(z11 ? f12650b : f12649a);
        arrayList.add(z10 ? f12652d : f12651c);
        arrayList.add(new m9.d(m9.d.f13894h, str2));
        arrayList.add(new m9.d(m9.d.f13892f, str));
        arrayList.add(new m9.d(r0.f11582l.d(), str3));
        arrayList.add(f12653e);
        arrayList.add(f12654f);
        return a(arrayList, y0Var);
    }

    private static void c(y0 y0Var) {
        y0Var.e(r0.f11580j);
        y0Var.e(r0.f11581k);
        y0Var.e(r0.f11582l);
    }
}
