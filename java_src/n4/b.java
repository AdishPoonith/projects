package n4;

import android.content.Context;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class b extends w3.b {
    public b(Context context) {
        super(context);
    }

    @Override // w3.b
    public final Task<Void> z() {
        return o(u.a().b(new q() { // from class: n4.j
            @Override // com.google.android.gms.common.api.internal.q
            public final void b(Object obj, Object obj2) {
                ((f) ((i) obj).C()).M(new k(b.this, (TaskCompletionSource) obj2));
            }
        }).d(c.f14277c).e(1567).a());
    }
}
