package w3;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;
import n4.i;
/* loaded from: classes.dex */
public abstract class b extends e<a.d.c> {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g<i> f19843k;

    /* renamed from: l  reason: collision with root package name */
    private static final a.AbstractC0085a<i, a.d.c> f19844l;

    /* renamed from: m  reason: collision with root package name */
    private static final com.google.android.gms.common.api.a<a.d.c> f19845m;

    static {
        a.g<i> gVar = new a.g<>();
        f19843k = gVar;
        c cVar = new c();
        f19844l = cVar;
        f19845m = new com.google.android.gms.common.api.a<>("SmsRetriever.API", cVar, gVar);
    }

    public b(Context context) {
        super(context, f19845m, a.d.f3749c, e.a.f3761c);
    }

    public abstract Task<Void> z();
}
