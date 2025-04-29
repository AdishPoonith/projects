package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f10547a = false;
    }

    /* loaded from: classes.dex */
    public interface c {
        void e(String str, Boolean bool, h<Void> hVar);

        void f(String str, Boolean bool, h<Void> hVar);

        void g(String str, h<Void> hVar);
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int f10548e = 0;

        static {
            boolean z10 = b.f10547a;
        }

        void a(String str, f fVar, h<g> hVar);

        void b(h<List<g>> hVar);

        void c(h<f> hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends r8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final e f10549d = new e();

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.g(b10, byteBuffer) : g.a((ArrayList) f(byteBuffer)) : f.a((ArrayList) f(byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> f10;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f10 = ((f) obj).w();
            } else if (!(obj instanceof g)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                f10 = ((g) obj).f();
            }
            p(byteArrayOutputStream, f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private String f10550a;

        /* renamed from: b  reason: collision with root package name */
        private String f10551b;

        /* renamed from: c  reason: collision with root package name */
        private String f10552c;

        /* renamed from: d  reason: collision with root package name */
        private String f10553d;

        /* renamed from: e  reason: collision with root package name */
        private String f10554e;

        /* renamed from: f  reason: collision with root package name */
        private String f10555f;

        /* renamed from: g  reason: collision with root package name */
        private String f10556g;

        /* renamed from: h  reason: collision with root package name */
        private String f10557h;

        /* renamed from: i  reason: collision with root package name */
        private String f10558i;

        /* renamed from: j  reason: collision with root package name */
        private String f10559j;

        /* renamed from: k  reason: collision with root package name */
        private String f10560k;

        /* renamed from: l  reason: collision with root package name */
        private String f10561l;

        /* renamed from: m  reason: collision with root package name */
        private String f10562m;

        /* renamed from: n  reason: collision with root package name */
        private String f10563n;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f10564a;

            /* renamed from: b  reason: collision with root package name */
            private String f10565b;

            /* renamed from: c  reason: collision with root package name */
            private String f10566c;

            /* renamed from: d  reason: collision with root package name */
            private String f10567d;

            /* renamed from: e  reason: collision with root package name */
            private String f10568e;

            /* renamed from: f  reason: collision with root package name */
            private String f10569f;

            /* renamed from: g  reason: collision with root package name */
            private String f10570g;

            /* renamed from: h  reason: collision with root package name */
            private String f10571h;

            /* renamed from: i  reason: collision with root package name */
            private String f10572i;

            /* renamed from: j  reason: collision with root package name */
            private String f10573j;

            /* renamed from: k  reason: collision with root package name */
            private String f10574k;

            /* renamed from: l  reason: collision with root package name */
            private String f10575l;

            /* renamed from: m  reason: collision with root package name */
            private String f10576m;

            /* renamed from: n  reason: collision with root package name */
            private String f10577n;

            public f a() {
                f fVar = new f();
                fVar.j(this.f10564a);
                fVar.l(this.f10565b);
                fVar.s(this.f10566c);
                fVar.t(this.f10567d);
                fVar.m(this.f10568e);
                fVar.n(this.f10569f);
                fVar.u(this.f10570g);
                fVar.r(this.f10571h);
                fVar.v(this.f10572i);
                fVar.o(this.f10573j);
                fVar.i(this.f10574k);
                fVar.q(this.f10575l);
                fVar.p(this.f10576m);
                fVar.k(this.f10577n);
                return fVar;
            }

            public a b(String str) {
                this.f10564a = str;
                return this;
            }

            public a c(String str) {
                this.f10565b = str;
                return this;
            }

            public a d(String str) {
                this.f10569f = str;
                return this;
            }

            public a e(String str) {
                this.f10566c = str;
                return this;
            }

            public a f(String str) {
                this.f10567d = str;
                return this;
            }

            public a g(String str) {
                this.f10570g = str;
                return this;
            }

            public a h(String str) {
                this.f10572i = str;
                return this;
            }
        }

        private f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.j((String) arrayList.get(0));
            fVar.l((String) arrayList.get(1));
            fVar.s((String) arrayList.get(2));
            fVar.t((String) arrayList.get(3));
            fVar.m((String) arrayList.get(4));
            fVar.n((String) arrayList.get(5));
            fVar.u((String) arrayList.get(6));
            fVar.r((String) arrayList.get(7));
            fVar.v((String) arrayList.get(8));
            fVar.o((String) arrayList.get(9));
            fVar.i((String) arrayList.get(10));
            fVar.q((String) arrayList.get(11));
            fVar.p((String) arrayList.get(12));
            fVar.k((String) arrayList.get(13));
            return fVar;
        }

        public String b() {
            return this.f10550a;
        }

        public String c() {
            return this.f10551b;
        }

        public String d() {
            return this.f10555f;
        }

        public String e() {
            return this.f10552c;
        }

        public String f() {
            return this.f10553d;
        }

        public String g() {
            return this.f10556g;
        }

        public String h() {
            return this.f10558i;
        }

        public void i(String str) {
            this.f10560k = str;
        }

        public void j(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f10550a = str;
        }

        public void k(String str) {
            this.f10563n = str;
        }

        public void l(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f10551b = str;
        }

        public void m(String str) {
            this.f10554e = str;
        }

        public void n(String str) {
            this.f10555f = str;
        }

        public void o(String str) {
            this.f10559j = str;
        }

        public void p(String str) {
            this.f10562m = str;
        }

        public void q(String str) {
            this.f10561l = str;
        }

        public void r(String str) {
            this.f10557h = str;
        }

        public void s(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f10552c = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f10553d = str;
        }

        public void u(String str) {
            this.f10556g = str;
        }

        public void v(String str) {
            this.f10558i = str;
        }

        ArrayList<Object> w() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.f10550a);
            arrayList.add(this.f10551b);
            arrayList.add(this.f10552c);
            arrayList.add(this.f10553d);
            arrayList.add(this.f10554e);
            arrayList.add(this.f10555f);
            arrayList.add(this.f10556g);
            arrayList.add(this.f10557h);
            arrayList.add(this.f10558i);
            arrayList.add(this.f10559j);
            arrayList.add(this.f10560k);
            arrayList.add(this.f10561l);
            arrayList.add(this.f10562m);
            arrayList.add(this.f10563n);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private String f10578a;

        /* renamed from: b  reason: collision with root package name */
        private f f10579b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f10580c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f10581d;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f10582a;

            /* renamed from: b  reason: collision with root package name */
            private f f10583b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f10584c;

            /* renamed from: d  reason: collision with root package name */
            private Map<String, Object> f10585d;

            public g a() {
                g gVar = new g();
                gVar.c(this.f10582a);
                gVar.d(this.f10583b);
                gVar.b(this.f10584c);
                gVar.e(this.f10585d);
                return gVar;
            }

            public a b(Boolean bool) {
                this.f10584c = bool;
                return this;
            }

            public a c(String str) {
                this.f10582a = str;
                return this;
            }

            public a d(f fVar) {
                this.f10583b = fVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f10585d = map;
                return this;
            }
        }

        private g() {
        }

        static g a(ArrayList<Object> arrayList) {
            g gVar = new g();
            gVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            gVar.d(obj == null ? null : f.a((ArrayList) obj));
            gVar.b((Boolean) arrayList.get(2));
            gVar.e((Map) arrayList.get(3));
            return gVar;
        }

        public void b(Boolean bool) {
            this.f10580c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f10578a = str;
        }

        public void d(f fVar) {
            if (fVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f10579b = fVar;
        }

        public void e(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f10581d = map;
        }

        ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f10578a);
            f fVar = this.f10579b;
            arrayList.add(fVar == null ? null : fVar.w());
            arrayList.add(this.f10580c);
            arrayList.add(this.f10581d);
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public interface h<T> {
        void a(T t10);

        void b(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<Object> b(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
