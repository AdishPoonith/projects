package q4;

import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.api.e implements t4.k {
    public p(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) k.f16196l, a.d.f3749c, e.a.f3761c);
    }

    @Override // t4.k
    public final Task<t4.g> b(final t4.f fVar) {
        return k(com.google.android.gms.common.api.internal.u.a().b(new com.google.android.gms.common.api.internal.q() { // from class: q4.o
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                t4.f fVar2 = t4.f.this;
                a0 a0Var = (a0) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                c4.s.b(fVar2 != null, "locationSettingsRequest can't be null");
                ((b1) a0Var.C()).O0(fVar2, new t(taskCompletionSource), null);
            }
        }).e(2426).a());
    }
}
