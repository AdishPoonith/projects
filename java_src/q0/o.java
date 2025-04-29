package q0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15963b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f15964c = o.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final r f15965a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Application application, String str) {
            kotlin.jvm.internal.l.e(application, "application");
            r.f15972c.f(application, str);
        }

        public final String b(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            return r.f15972c.i(context);
        }

        public final b c() {
            return r.f15972c.j();
        }

        public final String d() {
            c cVar = c.f15900a;
            return c.b();
        }

        public final void e(Context context, String str) {
            kotlin.jvm.internal.l.e(context, "context");
            r.f15972c.m(context, str);
        }

        public final o f(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            return new o(context, null, null, null);
        }

        public final void g() {
            r.f15972c.s();
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    private o(Context context, String str, p0.a aVar) {
        this.f15965a = new r(context, str, aVar);
    }

    public /* synthetic */ o(Context context, String str, p0.a aVar, kotlin.jvm.internal.g gVar) {
        this(context, str, aVar);
    }

    public final void a() {
        this.f15965a.j();
    }

    public final void b(String str, Bundle bundle) {
        this.f15965a.l(str, bundle);
    }
}
