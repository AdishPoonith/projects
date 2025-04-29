package io.flutter.plugins.imagepicker;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f10767a;

        /* renamed from: b  reason: collision with root package name */
        private String f10768b;

        /* renamed from: io.flutter.plugins.imagepicker.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0168a {

            /* renamed from: a  reason: collision with root package name */
            private String f10769a;

            /* renamed from: b  reason: collision with root package name */
            private String f10770b;

            public a a() {
                a aVar = new a();
                aVar.b(this.f10769a);
                aVar.c(this.f10770b);
                return aVar;
            }

            public C0168a b(String str) {
                this.f10769a = str;
                return this;
            }

            public C0168a c(String str) {
                this.f10770b = str;
                return this;
            }
        }

        a() {
        }

        static a a(ArrayList<Object> arrayList) {
            a aVar = new a();
            aVar.b((String) arrayList.get(0));
            aVar.c((String) arrayList.get(1));
            return aVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.f10767a = str;
        }

        public void c(String str) {
            this.f10768b = str;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f10767a);
            arrayList.add(this.f10768b);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private c f10771a;

        /* renamed from: b  reason: collision with root package name */
        private a f10772b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f10773c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private c f10774a;

            /* renamed from: b  reason: collision with root package name */
            private a f10775b;

            /* renamed from: c  reason: collision with root package name */
            private List<String> f10776c;

            public b a() {
                b bVar = new b();
                bVar.d(this.f10774a);
                bVar.b(this.f10775b);
                bVar.c(this.f10776c);
                return bVar;
            }

            public a b(a aVar) {
                this.f10775b = aVar;
                return this;
            }

            public a c(List<String> list) {
                this.f10776c = list;
                return this;
            }

            public a d(c cVar) {
                this.f10774a = cVar;
                return this;
            }
        }

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            Object obj = arrayList.get(0);
            bVar.d(obj == null ? null : c.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            bVar.b(obj2 != null ? a.a((ArrayList) obj2) : null);
            bVar.c((List) arrayList.get(2));
            return bVar;
        }

        public void b(a aVar) {
            this.f10772b = aVar;
        }

        public void c(List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.f10773c = list;
        }

        public void d(c cVar) {
            if (cVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10771a = cVar;
        }

        ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            c cVar = this.f10771a;
            arrayList.add(cVar == null ? null : Integer.valueOf(cVar.f10780j));
            a aVar = this.f10772b;
            arrayList.add(aVar != null ? aVar.d() : null);
            arrayList.add(this.f10773c);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        IMAGE(0),
        VIDEO(1);
        

        /* renamed from: j  reason: collision with root package name */
        final int f10780j;

        c(int i10) {
            this.f10780j = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {

        /* renamed from: j  reason: collision with root package name */
        public final String f10781j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f10782k;

        public d(String str, String str2, Object obj) {
            super(str2);
            this.f10781j = str;
            this.f10782k = obj;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(j jVar, g gVar, Boolean bool, Boolean bool2, h<List<String>> hVar);

        b b();

        void c(j jVar, l lVar, Boolean bool, Boolean bool2, h<List<String>> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends r8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final f f10783d = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return a.a((ArrayList) f(byteBuffer));
                case -127:
                    return b.a((ArrayList) f(byteBuffer));
                case -126:
                    return g.a((ArrayList) f(byteBuffer));
                case -125:
                    return j.a((ArrayList) f(byteBuffer));
                case -124:
                    return l.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> f10;
            if (obj instanceof a) {
                byteArrayOutputStream.write(128);
                f10 = ((a) obj).d();
            } else if (obj instanceof b) {
                byteArrayOutputStream.write(129);
                f10 = ((b) obj).e();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(130);
                f10 = ((g) obj).h();
            } else if (!(obj instanceof j)) {
                if (!(obj instanceof l)) {
                    super.p(byteArrayOutputStream, obj);
                    return;
                }
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((l) obj).d());
                return;
            } else {
                byteArrayOutputStream.write(131);
                f10 = ((j) obj).f();
            }
            p(byteArrayOutputStream, f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private Double f10784a;

        /* renamed from: b  reason: collision with root package name */
        private Double f10785b;

        /* renamed from: c  reason: collision with root package name */
        private Long f10786c;

        g() {
        }

        static g a(ArrayList<Object> arrayList) {
            Long valueOf;
            g gVar = new g();
            gVar.f((Double) arrayList.get(0));
            gVar.e((Double) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.g(valueOf);
            return gVar;
        }

        public Double b() {
            return this.f10785b;
        }

        public Double c() {
            return this.f10784a;
        }

        public Long d() {
            return this.f10786c;
        }

        public void e(Double d10) {
            this.f10785b = d10;
        }

        public void f(Double d10) {
            this.f10784a = d10;
        }

        public void g(Long l10) {
            if (l10 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.f10786c = l10;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f10784a);
            arrayList.add(this.f10785b);
            arrayList.add(this.f10786c);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public interface h<T> {
        void a(T t10);

        void b(Throwable th);
    }

    /* loaded from: classes.dex */
    public enum i {
        REAR(0),
        FRONT(1);
        

        /* renamed from: j  reason: collision with root package name */
        final int f10790j;

        i(int i10) {
            this.f10790j = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        private k f10791a;

        /* renamed from: b  reason: collision with root package name */
        private i f10792b;

        j() {
        }

        static j a(ArrayList<Object> arrayList) {
            j jVar = new j();
            Object obj = arrayList.get(0);
            jVar.e(obj == null ? null : k.values()[((Integer) obj).intValue()]);
            Object obj2 = arrayList.get(1);
            jVar.d(obj2 != null ? i.values()[((Integer) obj2).intValue()] : null);
            return jVar;
        }

        public i b() {
            return this.f10792b;
        }

        public k c() {
            return this.f10791a;
        }

        public void d(i iVar) {
            this.f10792b = iVar;
        }

        public void e(k kVar) {
            if (kVar == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.f10791a = kVar;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            k kVar = this.f10791a;
            arrayList.add(kVar == null ? null : Integer.valueOf(kVar.f10796j));
            i iVar = this.f10792b;
            arrayList.add(iVar != null ? Integer.valueOf(iVar.f10790j) : null);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        CAMERA(0),
        GALLERY(1);
        

        /* renamed from: j  reason: collision with root package name */
        final int f10796j;

        k(int i10) {
            this.f10796j = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        private Long f10797a;

        static l a(ArrayList<Object> arrayList) {
            Long valueOf;
            l lVar = new l();
            Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            lVar.c(valueOf);
            return lVar;
        }

        public Long b() {
            return this.f10797a;
        }

        public void c(Long l10) {
            this.f10797a = l10;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f10797a);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f10781j);
            arrayList.add(dVar.getMessage());
            obj = dVar.f10782k;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
