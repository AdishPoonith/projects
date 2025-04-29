package f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: c  reason: collision with root package name */
    private static b f8381c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f8383a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f8380b = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f8382d = "com.parse.bolts.measurement_event";

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            if (b.a() != null) {
                return b.a();
            }
            b bVar = new b(context, null);
            b.b(bVar);
            b.c(bVar);
            return b.a();
        }
    }

    private b(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "context.applicationContext");
        this.f8383a = applicationContext;
    }

    public /* synthetic */ b(Context context, kotlin.jvm.internal.g gVar) {
        this(context);
    }

    public static final /* synthetic */ b a() {
        if (k1.a.d(b.class)) {
            return null;
        }
        try {
            return f8381c;
        } catch (Throwable th) {
            k1.a.b(th, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            bVar.e();
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public static final /* synthetic */ void c(b bVar) {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            f8381c = bVar;
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    private final void d() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            e0.a b10 = e0.a.b(this.f8383a);
            kotlin.jvm.internal.l.d(b10, "getInstance(applicationContext)");
            b10.e(this);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void e() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            e0.a b10 = e0.a.b(this.f8383a);
            kotlin.jvm.internal.l.d(b10, "getInstance(applicationContext)");
            b10.c(this, new IntentFilter(f8382d));
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void finalize() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            q0.c0 c0Var = new q0.c0(context);
            Set<String> set = null;
            String k10 = kotlin.jvm.internal.l.k("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    kotlin.jvm.internal.l.d(key, "key");
                    bundle.putString(new ka.f("[ -]*$").b(new ka.f("^[ -]*").b(new ka.f("[^0-9a-zA-Z _-]").b(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            c0Var.d(k10, bundle);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
