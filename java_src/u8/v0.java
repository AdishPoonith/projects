package u8;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class v0 {

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, h hVar, i<Map<String, Object>> iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends r8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f19300d = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return f.a((Map) f(byteBuffer));
                case -127:
                    return g.a((Map) f(byteBuffer));
                case -126:
                    return h.a((Map) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f10;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f10 = ((f) obj).g();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(129);
                f10 = ((g) obj).c();
            } else if (!(obj instanceof h)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                f10 = ((h) obj).f();
            }
            p(byteArrayOutputStream, f10);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void b(String str, h hVar, String str2, i<Void> iVar);

        void c(String str, i<g> iVar);

        void h(String str, String str2, i<Void> iVar);

        void i(String str, i<List<f>> iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends r8.r {

        /* renamed from: d  reason: collision with root package name */
        public static final e f19301d = new e();

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return f.a((Map) f(byteBuffer));
                case -127:
                    return g.a((Map) f(byteBuffer));
                case -126:
                    return h.a((Map) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r8.r
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Map<String, Object> f10;
            if (obj instanceof f) {
                byteArrayOutputStream.write(128);
                f10 = ((f) obj).g();
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(129);
                f10 = ((g) obj).c();
            } else if (!(obj instanceof h)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(130);
                f10 = ((h) obj).f();
            }
            p(byteArrayOutputStream, f10);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private String f19302a;

        /* renamed from: b  reason: collision with root package name */
        private Double f19303b;

        /* renamed from: c  reason: collision with root package name */
        private String f19304c;

        /* renamed from: d  reason: collision with root package name */
        private String f19305d;

        /* renamed from: e  reason: collision with root package name */
        private String f19306e;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f19307a;

            /* renamed from: b  reason: collision with root package name */
            private Double f19308b;

            /* renamed from: c  reason: collision with root package name */
            private String f19309c;

            /* renamed from: d  reason: collision with root package name */
            private String f19310d;

            /* renamed from: e  reason: collision with root package name */
            private String f19311e;

            public f a() {
                f fVar = new f();
                fVar.b(this.f19307a);
                fVar.c(this.f19308b);
                fVar.d(this.f19309c);
                fVar.f(this.f19310d);
                fVar.e(this.f19311e);
                return fVar;
            }

            public a b(String str) {
                this.f19307a = str;
                return this;
            }

            public a c(Double d10) {
                this.f19308b = d10;
                return this;
            }

            public a d(String str) {
                this.f19309c = str;
                return this;
            }

            public a e(String str) {
                this.f19311e = str;
                return this;
            }

            public a f(String str) {
                this.f19310d = str;
                return this;
            }
        }

        private f() {
        }

        static f a(Map<String, Object> map) {
            f fVar = new f();
            fVar.b((String) map.get("displayName"));
            fVar.c((Double) map.get("enrollmentTimestamp"));
            fVar.d((String) map.get("factorId"));
            fVar.f((String) map.get("uid"));
            fVar.e((String) map.get("phoneNumber"));
            return fVar;
        }

        public void b(String str) {
            this.f19302a = str;
        }

        public void c(Double d10) {
            if (d10 == null) {
                throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
            }
            this.f19303b = d10;
        }

        public void d(String str) {
            this.f19304c = str;
        }

        public void e(String str) {
            this.f19306e = str;
        }

        public void f(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"uid\" is null.");
            }
            this.f19305d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<String, Object> g() {
            HashMap hashMap = new HashMap();
            hashMap.put("displayName", this.f19302a);
            hashMap.put("enrollmentTimestamp", this.f19303b);
            hashMap.put("factorId", this.f19304c);
            hashMap.put("uid", this.f19305d);
            hashMap.put("phoneNumber", this.f19306e);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private String f19312a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f19313a;

            public g a() {
                g gVar = new g();
                gVar.b(this.f19313a);
                return gVar;
            }

            public a b(String str) {
                this.f19313a = str;
                return this;
            }
        }

        private g() {
        }

        static g a(Map<String, Object> map) {
            g gVar = new g();
            gVar.b((String) map.get("id"));
            return gVar;
        }

        public void b(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"id\" is null.");
            }
            this.f19312a = str;
        }

        Map<String, Object> c() {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f19312a);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private String f19314a;

        /* renamed from: b  reason: collision with root package name */
        private String f19315b;

        private h() {
        }

        static h a(Map<String, Object> map) {
            h hVar = new h();
            hVar.e((String) map.get("verificationId"));
            hVar.d((String) map.get("verificationCode"));
            return hVar;
        }

        public String b() {
            return this.f19315b;
        }

        public String c() {
            return this.f19314a;
        }

        public void d(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
            }
            this.f19315b = str;
        }

        public void e(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
            }
            this.f19314a = str;
        }

        Map<String, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", this.f19314a);
            hashMap.put("verificationCode", this.f19315b);
            return hashMap;
        }
    }

    /* loaded from: classes.dex */
    public interface i<T> {
        void a(T t10);

        void b(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
