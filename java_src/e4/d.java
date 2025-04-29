package e4;

import android.content.Context;
import c4.w;
import c4.y;
import c4.z;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import o4.f;
/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.api.e implements y {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g f8115k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.AbstractC0085a f8116l;

    /* renamed from: m  reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f8117m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f8118n = 0;

    static {
        a.g gVar = new a.g();
        f8115k = gVar;
        c cVar = new c();
        f8116l = cVar;
        f8117m = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, z zVar) {
        super(context, f8117m, zVar, e.a.f3761c);
    }

    @Override // c4.y
    public final Task<Void> d(final w wVar) {
        u.a a10 = u.a();
        a10.d(f.f14625a);
        a10.c(false);
        a10.b(new q() { // from class: e4.b
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                w wVar2 = w.this;
                int i10 = d.f8118n;
                ((a) ((e) obj).C()).H2(wVar2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return i(a10.a());
    }
}
