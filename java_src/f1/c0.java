package f1;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8388e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f8389f = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final p0.r0 f8390a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8391b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f8392c;

    /* renamed from: d  reason: collision with root package name */
    private int f8393d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final synchronized String f(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : c0.f8389f.entrySet()) {
                str2 = ka.p.r(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        public final void a(p0.r0 behavior, int i10, String tag, String string) {
            boolean t10;
            kotlin.jvm.internal.l.e(behavior, "behavior");
            kotlin.jvm.internal.l.e(tag, "tag");
            kotlin.jvm.internal.l.e(string, "string");
            p0.f0 f0Var = p0.f0.f14852a;
            if (p0.f0.H(behavior)) {
                String f10 = f(string);
                t10 = ka.p.t(tag, "FacebookSDK.", false, 2, null);
                if (!t10) {
                    tag = kotlin.jvm.internal.l.k("FacebookSDK.", tag);
                }
                Log.println(i10, tag, f10);
                if (behavior == p0.r0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(p0.r0 behavior, String tag, String string) {
            kotlin.jvm.internal.l.e(behavior, "behavior");
            kotlin.jvm.internal.l.e(tag, "tag");
            kotlin.jvm.internal.l.e(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(p0.r0 behavior, String tag, String format, Object... args) {
            kotlin.jvm.internal.l.e(behavior, "behavior");
            kotlin.jvm.internal.l.e(tag, "tag");
            kotlin.jvm.internal.l.e(format, "format");
            kotlin.jvm.internal.l.e(args, "args");
            p0.f0 f0Var = p0.f0.f14852a;
            if (p0.f0.H(behavior)) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.l.d(format2, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, format2);
            }
        }

        public final synchronized void d(String accessToken) {
            kotlin.jvm.internal.l.e(accessToken, "accessToken");
            p0.f0 f0Var = p0.f0.f14852a;
            if (!p0.f0.H(p0.r0.INCLUDE_ACCESS_TOKENS)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            kotlin.jvm.internal.l.e(original, "original");
            kotlin.jvm.internal.l.e(replace, "replace");
            c0.f8389f.put(original, replace);
        }
    }

    public c0(p0.r0 behavior, String tag) {
        kotlin.jvm.internal.l.e(behavior, "behavior");
        kotlin.jvm.internal.l.e(tag, "tag");
        this.f8393d = 3;
        this.f8390a = behavior;
        m0 m0Var = m0.f8479a;
        this.f8391b = kotlin.jvm.internal.l.k("FacebookSDK.", m0.k(tag, "tag"));
        this.f8392c = new StringBuilder();
    }

    private final boolean g() {
        p0.f0 f0Var = p0.f0.f14852a;
        return p0.f0.H(this.f8390a);
    }

    public final void b(String string) {
        kotlin.jvm.internal.l.e(string, "string");
        if (g()) {
            this.f8392c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        kotlin.jvm.internal.l.e(format, "format");
        kotlin.jvm.internal.l.e(args, "args");
        if (g()) {
            StringBuilder sb = this.f8392c;
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            kotlin.jvm.internal.l.d(format2, "java.lang.String.format(format, *args)");
            sb.append(format2);
        }
    }

    public final void d(String key, Object value) {
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String sb = this.f8392c.toString();
        kotlin.jvm.internal.l.d(sb, "contents.toString()");
        f(sb);
        this.f8392c = new StringBuilder();
    }

    public final void f(String string) {
        kotlin.jvm.internal.l.e(string, "string");
        f8388e.a(this.f8390a, this.f8393d, this.f8391b, string);
    }
}
