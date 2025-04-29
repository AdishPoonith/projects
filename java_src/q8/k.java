package q8;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q8.k;
import r8.k;
import r8.s;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final r8.k f16398a;

    /* renamed from: b  reason: collision with root package name */
    private g f16399b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f16400c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        private void b(r8.j jVar, k.d dVar) {
            try {
                k.this.f16399b.g(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void c(r8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z10 = true;
            boolean z11 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z11) {
                    k.this.f16399b.h(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z10 = false;
                    }
                    long d10 = k.this.f16399b.d(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z10 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                    if (d10 != -2) {
                        dVar.a(Long.valueOf(d10));
                        return;
                    } else if (!z10) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void d(r8.j jVar, k.d dVar) {
            try {
                k.this.f16399b.i(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f16402a));
            hashMap.put("height", Double.valueOf(cVar.f16403b));
            dVar.a(hashMap);
        }

        private void f(r8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f16399b.b(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void g(r8.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f16399b.f(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: q8.j
                    @Override // q8.k.b
                    public final void a(k.c cVar) {
                        k.a.e(k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void h(r8.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                k.this.f16399b.c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void i(r8.j jVar, k.d dVar) {
            try {
                k.this.f16399b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e10) {
                dVar.b("error", k.c(e10), null);
            }
        }

        private void j(r8.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                k.this.f16399b.e(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e10) {
                e = e10;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e11) {
                e = e11;
                dVar2.b("error", k.c(e), null);
            }
        }

        @Override // r8.k.c
        public void I(r8.j jVar, k.d dVar) {
            if (k.this.f16399b == null) {
                return;
            }
            d8.b.f("PlatformViewsChannel", "Received '" + jVar.f16777a + "' message.");
            String str = jVar.f16777a;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1019779949:
                    if (str.equals("offset")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c(jVar, dVar);
                    return;
                case 1:
                    f(jVar, dVar);
                    return;
                case 2:
                    g(jVar, dVar);
                    return;
                case 3:
                    b(jVar, dVar);
                    return;
                case 4:
                    i(jVar, dVar);
                    return;
                case 5:
                    j(jVar, dVar);
                    return;
                case 6:
                    h(jVar, dVar);
                    return;
                case 7:
                    d(jVar, dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f16402a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16403b;

        public c(int i10, int i11) {
            this.f16402a = i10;
            this.f16403b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f16404a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16405b;

        /* renamed from: c  reason: collision with root package name */
        public final double f16406c;

        /* renamed from: d  reason: collision with root package name */
        public final double f16407d;

        /* renamed from: e  reason: collision with root package name */
        public final double f16408e;

        /* renamed from: f  reason: collision with root package name */
        public final double f16409f;

        /* renamed from: g  reason: collision with root package name */
        public final int f16410g;

        /* renamed from: h  reason: collision with root package name */
        public final a f16411h;

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f16412i;

        /* loaded from: classes.dex */
        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i10, String str, double d10, double d11, double d12, double d13, int i11, a aVar, ByteBuffer byteBuffer) {
            this.f16404a = i10;
            this.f16405b = str;
            this.f16408e = d10;
            this.f16409f = d11;
            this.f16406c = d12;
            this.f16407d = d13;
            this.f16410g = i11;
            this.f16411h = aVar;
            this.f16412i = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f16417a;

        /* renamed from: b  reason: collision with root package name */
        public final double f16418b;

        /* renamed from: c  reason: collision with root package name */
        public final double f16419c;

        public e(int i10, double d10, double d11) {
            this.f16417a = i10;
            this.f16418b = d10;
            this.f16419c = d11;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f16420a;

        /* renamed from: b  reason: collision with root package name */
        public final Number f16421b;

        /* renamed from: c  reason: collision with root package name */
        public final Number f16422c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16423d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16424e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f16425f;

        /* renamed from: g  reason: collision with root package name */
        public final Object f16426g;

        /* renamed from: h  reason: collision with root package name */
        public final int f16427h;

        /* renamed from: i  reason: collision with root package name */
        public final int f16428i;

        /* renamed from: j  reason: collision with root package name */
        public final float f16429j;

        /* renamed from: k  reason: collision with root package name */
        public final float f16430k;

        /* renamed from: l  reason: collision with root package name */
        public final int f16431l;

        /* renamed from: m  reason: collision with root package name */
        public final int f16432m;

        /* renamed from: n  reason: collision with root package name */
        public final int f16433n;

        /* renamed from: o  reason: collision with root package name */
        public final int f16434o;

        /* renamed from: p  reason: collision with root package name */
        public final long f16435p;

        public f(int i10, Number number, Number number2, int i11, int i12, Object obj, Object obj2, int i13, int i14, float f10, float f11, int i15, int i16, int i17, int i18, long j10) {
            this.f16420a = i10;
            this.f16421b = number;
            this.f16422c = number2;
            this.f16423d = i11;
            this.f16424e = i12;
            this.f16425f = obj;
            this.f16426g = obj2;
            this.f16427h = i13;
            this.f16428i = i14;
            this.f16429j = f10;
            this.f16430k = f11;
            this.f16431l = i15;
            this.f16432m = i16;
            this.f16433n = i17;
            this.f16434o = i18;
            this.f16435p = j10;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(boolean z10);

        void b(int i10, double d10, double d11);

        void c(int i10, int i11);

        long d(d dVar);

        void e(f fVar);

        void f(e eVar, b bVar);

        void g(int i10);

        void h(d dVar);

        void i(int i10);
    }

    public k(e8.a aVar) {
        a aVar2 = new a();
        this.f16400c = aVar2;
        r8.k kVar = new r8.k(aVar, "flutter/platform_views", s.f16792b);
        this.f16398a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return d8.b.d(exc);
    }

    public void d(int i10) {
        r8.k kVar = this.f16398a;
        if (kVar == null) {
            return;
        }
        kVar.c("viewFocused", Integer.valueOf(i10));
    }

    public void e(g gVar) {
        this.f16399b = gVar;
    }
}
