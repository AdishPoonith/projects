package q0;

import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import q0.o;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15905b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final r f15906a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final c0 a(String activityName, String str, p0.a aVar) {
            kotlin.jvm.internal.l.e(activityName, "activityName");
            return new c0(activityName, str, aVar);
        }

        public final Executor b() {
            return r.f15972c.h();
        }

        public final o.b c() {
            return r.f15972c.j();
        }

        public final String d() {
            return r.f15972c.l();
        }

        public final void e(Map<String, String> ud) {
            kotlin.jvm.internal.l.e(ud, "ud");
            g0 g0Var = g0.f15939a;
            g0.g(ud);
        }
    }

    public c0(Context context) {
        this(new r(context, (String) null, (p0.a) null));
    }

    public c0(Context context, String str) {
        this(new r(context, str, (p0.a) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0(String activityName, String str, p0.a aVar) {
        this(new r(activityName, str, aVar));
        kotlin.jvm.internal.l.e(activityName, "activityName");
    }

    public c0(r loggerImpl) {
        kotlin.jvm.internal.l.e(loggerImpl, "loggerImpl");
        this.f15906a = loggerImpl;
    }

    public final void a() {
        this.f15906a.j();
    }

    public final void b(Bundle parameters) {
        kotlin.jvm.internal.l.e(parameters, "parameters");
        if (!((parameters.getInt("previous") & 2) != 0)) {
            p0.f0 f0Var = p0.f0.f14852a;
            if (!p0.f0.p()) {
                return;
            }
        }
        this.f15906a.o("fb_sdk_settings_changed", null, parameters);
    }

    public final void c(String str, double d10, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.k(str, d10, bundle);
        }
    }

    public final void d(String str, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.l(str, bundle);
        }
    }

    public final void e(String str, String str2) {
        this.f15906a.n(str, str2);
    }

    public final void f(String str) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.o(str, null, null);
        }
    }

    public final void g(String str, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.o(str, null, bundle);
        }
    }

    public final void h(String str, Double d10, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.o(str, d10, bundle);
        }
    }

    public final void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.p(str, bigDecimal, currency, bundle);
        }
    }

    public final void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        p0.f0 f0Var = p0.f0.f14852a;
        if (p0.f0.p()) {
            this.f15906a.r(bigDecimal, currency, bundle);
        }
    }
}
