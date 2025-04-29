package b5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f2955a;

        /* renamed from: b  reason: collision with root package name */
        private final C0060b f2956b;

        /* renamed from: c  reason: collision with root package name */
        private C0060b f2957c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2958d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2959e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a extends C0060b {
            private a() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b5.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0060b {

            /* renamed from: a  reason: collision with root package name */
            String f2960a;

            /* renamed from: b  reason: collision with root package name */
            Object f2961b;

            /* renamed from: c  reason: collision with root package name */
            C0060b f2962c;

            private C0060b() {
            }
        }

        private b(String str) {
            C0060b c0060b = new C0060b();
            this.f2956b = c0060b;
            this.f2957c = c0060b;
            this.f2958d = false;
            this.f2959e = false;
            this.f2955a = (String) n.n(str);
        }

        private C0060b f() {
            C0060b c0060b = new C0060b();
            this.f2957c.f2962c = c0060b;
            this.f2957c = c0060b;
            return c0060b;
        }

        private b g(String str, Object obj) {
            C0060b f10 = f();
            f10.f2961b = obj;
            f10.f2960a = (String) n.n(str);
            return this;
        }

        private a h() {
            a aVar = new a();
            this.f2957c.f2962c = aVar;
            this.f2957c = aVar;
            return aVar;
        }

        private b i(String str, Object obj) {
            a h10 = h();
            h10.f2961b = obj;
            h10.f2960a = (String) n.n(str);
            return this;
        }

        private static boolean j(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof k ? !((k) obj).a() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, double d10) {
            return i(str, String.valueOf(d10));
        }

        public b b(String str, int i10) {
            return i(str, String.valueOf(i10));
        }

        public b c(String str, long j10) {
            return i(str, String.valueOf(j10));
        }

        public b d(String str, Object obj) {
            return g(str, obj);
        }

        public b e(String str, boolean z10) {
            return i(str, String.valueOf(z10));
        }

        public b k() {
            this.f2958d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f2958d;
            boolean z11 = this.f2959e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f2955a);
            sb.append('{');
            String str = "";
            for (C0060b c0060b = this.f2956b.f2962c; c0060b != null; c0060b = c0060b.f2962c) {
                Object obj = c0060b.f2961b;
                if (!(c0060b instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && j(obj)) {
                    }
                }
                sb.append(str);
                String str2 = c0060b.f2960a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
