package s1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j2.l;
import java.util.ArrayList;
import u1.c0;
/* loaded from: classes.dex */
public class m implements p3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17368a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17372e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17374g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17375h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17376i;

    /* renamed from: b  reason: collision with root package name */
    private final j2.j f17369b = new j2.j();

    /* renamed from: c  reason: collision with root package name */
    private int f17370c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f17371d = 5000;

    /* renamed from: f  reason: collision with root package name */
    private j2.q f17373f = j2.q.f12083a;

    public m(Context context) {
        this.f17368a = context;
    }

    @Override // s1.p3
    public l3[] a(Handler handler, q3.x xVar, u1.t tVar, d3.n nVar, k2.f fVar) {
        ArrayList<l3> arrayList = new ArrayList<>();
        h(this.f17368a, this.f17370c, this.f17373f, this.f17372e, handler, xVar, this.f17371d, arrayList);
        u1.v c10 = c(this.f17368a, this.f17374g, this.f17375h, this.f17376i);
        if (c10 != null) {
            b(this.f17368a, this.f17370c, this.f17373f, this.f17372e, c10, handler, tVar, arrayList);
        }
        g(this.f17368a, nVar, handler.getLooper(), this.f17370c, arrayList);
        e(this.f17368a, fVar, handler.getLooper(), this.f17370c, arrayList);
        d(this.f17368a, this.f17370c, arrayList);
        f(this.f17368a, handler, this.f17370c, arrayList);
        return (l3[]) arrayList.toArray(new l3[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)|8|9|10|11|(2:12|13)|14|15|16|17|18|19|(5:21|22|23|24|25)|(2:27|28)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:12|13)|15|16|17|18|19|(5:21|22|23|24|25)|(2:27|28)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        r6 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(android.content.Context r15, int r16, j2.q r17, boolean r18, u1.v r19, android.os.Handler r20, u1.t r21, java.util.ArrayList<s1.l3> r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.m.b(android.content.Context, int, j2.q, boolean, u1.v, android.os.Handler, u1.t, java.util.ArrayList):void");
    }

    protected u1.v c(Context context, boolean z10, boolean z11, boolean z12) {
        return new c0.f().g(u1.f.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    protected void d(Context context, int i10, ArrayList<l3> arrayList) {
        arrayList.add(new r3.b());
    }

    protected void e(Context context, k2.f fVar, Looper looper, int i10, ArrayList<l3> arrayList) {
        arrayList.add(new k2.g(fVar, looper));
    }

    protected void f(Context context, Handler handler, int i10, ArrayList<l3> arrayList) {
    }

    protected void g(Context context, d3.n nVar, Looper looper, int i10, ArrayList<l3> arrayList) {
        arrayList.add(new d3.o(nVar, looper));
    }

    protected void h(Context context, int i10, j2.q qVar, boolean z10, Handler handler, q3.x xVar, long j10, ArrayList<l3> arrayList) {
        int i11;
        arrayList.add(new q3.h(context, i(), qVar, j10, z10, handler, xVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (l3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, q3.x.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, xVar, 50));
                    p3.r.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    arrayList.add(i11, (l3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, q3.x.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, xVar, 50));
                    p3.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i11, (l3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, q3.x.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, xVar, 50));
            p3.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    protected l.b i() {
        return this.f17369b;
    }
}
