package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.e2;
import com.google.android.gms.internal.auth.g2;
/* loaded from: classes.dex */
public class e2<MessageType extends g2<MessageType, BuilderType>, BuilderType extends e2<MessageType, BuilderType>> extends z0<MessageType, BuilderType> {

    /* renamed from: j  reason: collision with root package name */
    private final g2 f4042j;

    /* renamed from: k  reason: collision with root package name */
    protected g2 f4043k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f4044l = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public e2(MessageType messagetype) {
        this.f4042j = messagetype;
        this.f4043k = (g2) messagetype.g(4, null, null);
    }

    private static final void h(g2 g2Var, g2 g2Var2) {
        p3.a().b(g2Var.getClass()).e(g2Var, g2Var2);
    }

    @Override // com.google.android.gms.internal.auth.z0
    protected final /* synthetic */ z0 a(a1 a1Var) {
        d((g2) a1Var);
        return this;
    }

    /* renamed from: c */
    public final e2 clone() {
        e2 e2Var = (e2) this.f4042j.g(5, null, null);
        e2Var.d(zzg());
        return e2Var;
    }

    public final e2 d(g2 g2Var) {
        if (this.f4044l) {
            g();
            this.f4044l = false;
        }
        h(this.f4043k, g2Var);
        return this;
    }

    @Override // com.google.android.gms.internal.auth.f3
    /* renamed from: f */
    public MessageType zzg() {
        if (this.f4044l) {
            return (MessageType) this.f4043k;
        }
        g2 g2Var = this.f4043k;
        p3.a().b(g2Var.getClass()).b(g2Var);
        this.f4044l = true;
        return (MessageType) this.f4043k;
    }

    protected void g() {
        g2 g2Var = (g2) this.f4043k.g(4, null, null);
        h(g2Var, this.f4043k);
        this.f4043k = g2Var;
    }

    @Override // com.google.android.gms.internal.auth.h3
    public final /* synthetic */ g3 zzh() {
        return this.f4042j;
    }
}
