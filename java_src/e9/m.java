package e9;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class m {

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(i iVar);

        void c(j jVar);

        void e(h hVar);

        void f(g gVar);

        h g(i iVar);

        void h(i iVar);

        void i(e eVar);

        i j(c cVar);

        void k(f fVar);

        void l(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends r8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final b f8179d = new b();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return c.a((ArrayList) f(byteBuffer));
                case -127:
                    return e.a((ArrayList) f(byteBuffer));
                case -126:
                    return f.a((ArrayList) f(byteBuffer));
                case -125:
                    return g.a((ArrayList) f(byteBuffer));
                case -124:
                    return h.a((ArrayList) f(byteBuffer));
                case -123:
                    return i.a((ArrayList) f(byteBuffer));
                case -122:
                    return j.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> d10;
            if (obj instanceof c) {
                byteArrayOutputStream.write(128);
                d10 = ((c) obj).l();
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                d10 = ((e) obj).f();
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                d10 = ((f) obj).d();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(131);
                d10 = ((g) obj).f();
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(132);
                d10 = ((h) obj).f();
            } else if (!(obj instanceof i)) {
                if (!(obj instanceof j)) {
                    super.p(byteArrayOutputStream, obj);
                    return;
                }
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((j) obj).f());
                return;
            } else {
                byteArrayOutputStream.write(133);
                d10 = ((i) obj).d();
            }
            p(byteArrayOutputStream, d10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f8180a;

        /* renamed from: b  reason: collision with root package name */
        private String f8181b;

        /* renamed from: c  reason: collision with root package name */
        private String f8182c;

        /* renamed from: d  reason: collision with root package name */
        private String f8183d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f8184e;

        c() {
        }

        static c a(ArrayList<Object> arrayList) {
            c cVar = new c();
            cVar.g((String) arrayList.get(0));
            cVar.k((String) arrayList.get(1));
            cVar.j((String) arrayList.get(2));
            cVar.h((String) arrayList.get(3));
            cVar.i((Map) arrayList.get(4));
            return cVar;
        }

        public String b() {
            return this.f8180a;
        }

        public String c() {
            return this.f8183d;
        }

        public Map<String, String> d() {
            return this.f8184e;
        }

        public String e() {
            return this.f8182c;
        }

        public String f() {
            return this.f8181b;
        }

        public void g(String str) {
            this.f8180a = str;
        }

        public void h(String str) {
            this.f8183d = str;
        }

        public void i(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.f8184e = map;
        }

        public void j(String str) {
            this.f8182c = str;
        }

        public void k(String str) {
            this.f8181b = str;
        }

        ArrayList<Object> l() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f8180a);
            arrayList.add(this.f8181b);
            arrayList.add(this.f8182c);
            arrayList.add(this.f8183d);
            arrayList.add(this.f8184e);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {

        /* renamed from: j  reason: collision with root package name */
        public final String f8185j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f8186k;
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private Long f8187a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f8188b;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            Long valueOf;
            e eVar = new e();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.e(valueOf);
            eVar.d((Boolean) arrayList.get(1));
            return eVar;
        }

        public Boolean b() {
            return this.f8188b;
        }

        public Long c() {
            return this.f8187a;
        }

        public void d(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"isLooping\" is null.");
            }
            this.f8188b = bool;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f8187a = l10;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f8187a);
            arrayList.add(this.f8188b);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f8189a;

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.c((Boolean) arrayList.get(0));
            return fVar;
        }

        public Boolean b() {
            return this.f8189a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"mixWithOthers\" is null.");
            }
            this.f8189a = bool;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f8189a);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private Long f8190a;

        /* renamed from: b  reason: collision with root package name */
        private Double f8191b;

        g() {
        }

        static g a(ArrayList<Object> arrayList) {
            Long valueOf;
            g gVar = new g();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.e(valueOf);
            gVar.d((Double) arrayList.get(1));
            return gVar;
        }

        public Double b() {
            return this.f8191b;
        }

        public Long c() {
            return this.f8190a;
        }

        public void d(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"speed\" is null.");
            }
            this.f8191b = d10;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f8190a = l10;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f8190a);
            arrayList.add(this.f8191b);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private Long f8192a;

        /* renamed from: b  reason: collision with root package name */
        private Long f8193b;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f8194a;

            /* renamed from: b  reason: collision with root package name */
            private Long f8195b;

            public h a() {
                h hVar = new h();
                hVar.e(this.f8194a);
                hVar.d(this.f8195b);
                return hVar;
            }

            public a b(Long l10) {
                this.f8195b = l10;
                return this;
            }

            public a c(Long l10) {
                this.f8194a = l10;
                return this;
            }
        }

        h() {
        }

        static h a(ArrayList<Object> arrayList) {
            Long valueOf;
            h hVar = new h();
            Object obj = arrayList.get(0);
            Long l10 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.e(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l10 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            hVar.d(l10);
            return hVar;
        }

        public Long b() {
            return this.f8193b;
        }

        public Long c() {
            return this.f8192a;
        }

        public void d(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"position\" is null.");
            }
            this.f8193b = l10;
        }

        public void e(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f8192a = l10;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f8192a);
            arrayList.add(this.f8193b);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private Long f8196a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f8197a;

            public i a() {
                i iVar = new i();
                iVar.c(this.f8197a);
                return iVar;
            }

            public a b(Long l10) {
                this.f8197a = l10;
                return this;
            }
        }

        i() {
        }

        static i a(ArrayList<Object> arrayList) {
            Long valueOf;
            i iVar = new i();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.c(valueOf);
            return iVar;
        }

        public Long b() {
            return this.f8196a;
        }

        public void c(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f8196a = l10;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f8196a);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        private Long f8198a;

        /* renamed from: b  reason: collision with root package name */
        private Double f8199b;

        j() {
        }

        static j a(ArrayList<Object> arrayList) {
            Long valueOf;
            j jVar = new j();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.d(valueOf);
            jVar.e((Double) arrayList.get(1));
            return jVar;
        }

        public Long b() {
            return this.f8198a;
        }

        public Double c() {
            return this.f8199b;
        }

        public void d(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"textureId\" is null.");
            }
            this.f8198a = l10;
        }

        public void e(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"volume\" is null.");
            }
            this.f8199b = d10;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f8198a);
            arrayList.add(this.f8199b);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f8185j);
            arrayList.add(dVar.getMessage());
            obj = dVar.f8186k;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
