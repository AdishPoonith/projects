package c4;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends c<T> implements a.f {
    private final e O;
    private final Set P;
    private final Account Q;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public h(Context context, Looper looper, int i10, e eVar, f.a aVar, f.b bVar) {
        this(context, looper, i10, eVar, (com.google.android.gms.common.api.internal.e) aVar, (com.google.android.gms.common.api.internal.m) bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(Context context, Looper looper, int i10, e eVar, com.google.android.gms.common.api.internal.e eVar2, com.google.android.gms.common.api.internal.m mVar) {
        this(context, looper, i.c(context), b4.e.m(), i10, eVar, (com.google.android.gms.common.api.internal.e) s.j(eVar2), (com.google.android.gms.common.api.internal.m) s.j(mVar));
    }

    protected h(Context context, Looper looper, i iVar, b4.e eVar, int i10, e eVar2, com.google.android.gms.common.api.internal.e eVar3, com.google.android.gms.common.api.internal.m mVar) {
        super(context, looper, iVar, eVar, i10, eVar3 == null ? null : new j0(eVar3), mVar == null ? null : new k0(mVar), eVar2.j());
        this.O = eVar2;
        this.Q = eVar2.a();
        this.P = j0(eVar2.d());
    }

    private final Set j0(Set set) {
        Set<Scope> i02 = i0(set);
        for (Scope scope : i02) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return i02;
    }

    @Override // c4.c
    protected final Set<Scope> B() {
        return this.P;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> e() {
        return o() ? this.P : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final e h0() {
        return this.O;
    }

    protected Set<Scope> i0(Set<Scope> set) {
        return set;
    }

    @Override // c4.c
    public final Account t() {
        return this.Q;
    }

    @Override // c4.c
    protected final Executor v() {
        return null;
    }
}
