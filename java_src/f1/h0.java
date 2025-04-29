package f1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f8445a = new h0();

    /* renamed from: b  reason: collision with root package name */
    private static final String f8446b = h0.class.getName();

    private h0() {
    }

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{p0.f0.u()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String c() {
        return "CONNECTION_FAILURE";
    }

    public static final Collection<String> d() {
        List g10;
        g10 = t9.p.g("service_disabled", "AndroidAuthKillSwitchException");
        return g10;
    }

    public static final Collection<String> e() {
        List g10;
        g10 = t9.p.g("access_denied", "OAuthAccessDeniedException");
        return g10;
    }

    public static final String f() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{p0.f0.u()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String g() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("%s", Arrays.copyOf(new Object[]{p0.f0.v()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String h() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{p0.f0.x()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String i(String subdomain) {
        kotlin.jvm.internal.l.e(subdomain, "subdomain");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String j() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{p0.f0.x()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final String k() {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        p0.f0 f0Var = p0.f0.f14852a;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{p0.f0.y()}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
