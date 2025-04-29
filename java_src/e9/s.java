package e9;

import android.content.Context;
import android.util.LongSparseArray;
import e9.m;
import i8.a;
import io.flutter.view.e;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public class s implements i8.a, m.a {

    /* renamed from: k  reason: collision with root package name */
    private a f8223k;

    /* renamed from: j  reason: collision with root package name */
    private final LongSparseArray<o> f8222j = new LongSparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private final p f8224l = new p();

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Context f8225a;

        /* renamed from: b  reason: collision with root package name */
        final r8.c f8226b;

        /* renamed from: c  reason: collision with root package name */
        final c f8227c;

        /* renamed from: d  reason: collision with root package name */
        final b f8228d;

        /* renamed from: e  reason: collision with root package name */
        final io.flutter.view.e f8229e;

        a(Context context, r8.c cVar, c cVar2, b bVar, io.flutter.view.e eVar) {
            this.f8225a = context;
            this.f8226b = cVar;
            this.f8227c = cVar2;
            this.f8228d = bVar;
            this.f8229e = eVar;
        }

        void a(s sVar, r8.c cVar) {
            l.m(cVar, sVar);
        }

        void b(r8.c cVar) {
            l.m(cVar, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        String a(String str);
    }

    private void n() {
        for (int i10 = 0; i10 < this.f8222j.size(); i10++) {
            this.f8222j.valueAt(i10).c();
        }
        this.f8222j.clear();
    }

    @Override // e9.m.a
    public void a() {
        n();
    }

    @Override // e9.m.a
    public void b(m.i iVar) {
        this.f8222j.get(iVar.b().longValue()).f();
    }

    @Override // e9.m.a
    public void c(m.j jVar) {
        this.f8222j.get(jVar.b().longValue()).n(jVar.c().doubleValue());
    }

    @Override // i8.a
    public void d(a.b bVar) {
        if (this.f8223k == null) {
            d8.b.i("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f8223k.b(bVar.b());
        this.f8223k = null;
        a();
    }

    @Override // e9.m.a
    public void e(m.h hVar) {
        this.f8222j.get(hVar.c().longValue()).g(hVar.b().intValue());
    }

    @Override // e9.m.a
    public void f(m.g gVar) {
        this.f8222j.get(gVar.c().longValue()).l(gVar.b().doubleValue());
    }

    @Override // e9.m.a
    public m.h g(m.i iVar) {
        o oVar = this.f8222j.get(iVar.b().longValue());
        m.h a10 = new m.h.a().b(Long.valueOf(oVar.d())).c(iVar.b()).a();
        oVar.h();
        return a10;
    }

    @Override // e9.m.a
    public void h(m.i iVar) {
        this.f8222j.get(iVar.b().longValue()).c();
        this.f8222j.remove(iVar.b().longValue());
    }

    @Override // e9.m.a
    public void i(m.e eVar) {
        this.f8222j.get(eVar.c().longValue()).k(eVar.b().booleanValue());
    }

    @Override // e9.m.a
    public m.i j(m.c cVar) {
        o oVar;
        e.c a10 = this.f8223k.f8229e.a();
        r8.c cVar2 = this.f8223k.f8226b;
        r8.d dVar = new r8.d(cVar2, "flutter.io/videoPlayer/videoEvents" + a10.e());
        if (cVar.b() != null) {
            String a11 = cVar.e() != null ? this.f8223k.f8228d.a(cVar.b(), cVar.e()) : this.f8223k.f8227c.a(cVar.b());
            Context context = this.f8223k.f8225a;
            oVar = new o(context, dVar, a10, "asset:///" + a11, null, new HashMap(), this.f8224l);
        } else {
            oVar = new o(this.f8223k.f8225a, dVar, a10, cVar.f(), cVar.c(), cVar.d(), this.f8224l);
        }
        this.f8222j.put(a10.e(), oVar);
        return new m.i.a().b(Long.valueOf(a10.e())).a();
    }

    @Override // e9.m.a
    public void k(m.f fVar) {
        this.f8224l.f8219a = fVar.b().booleanValue();
    }

    @Override // e9.m.a
    public void l(m.i iVar) {
        this.f8222j.get(iVar.b().longValue()).e();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        d8.a e10 = d8.a.e();
        Context a10 = bVar.a();
        r8.c b10 = bVar.b();
        final g8.d c10 = e10.c();
        Objects.requireNonNull(c10);
        c cVar = new c() { // from class: e9.r
            @Override // e9.s.c
            public final String a(String str) {
                return g8.d.this.h(str);
            }
        };
        final g8.d c11 = e10.c();
        Objects.requireNonNull(c11);
        a aVar = new a(a10, b10, cVar, new b() { // from class: e9.q
            @Override // e9.s.b
            public final String a(String str, String str2) {
                return g8.d.this.i(str, str2);
            }
        }, bVar.d());
        this.f8223k = aVar;
        aVar.a(this, bVar.b());
    }
}
