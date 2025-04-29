package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.a1;
import com.google.android.gms.internal.auth.z0;
/* loaded from: classes.dex */
public abstract class z0<MessageType extends a1<MessageType, BuilderType>, BuilderType extends z0<MessageType, BuilderType>> implements f3 {
    protected abstract z0 a(a1 a1Var);

    @Override // com.google.android.gms.internal.auth.f3
    public final /* bridge */ /* synthetic */ f3 l(g3 g3Var) {
        if (zzh().getClass().isInstance(g3Var)) {
            return a((a1) g3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
