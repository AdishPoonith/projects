package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.o5;
import com.google.android.gms.internal.p000firebaseauthapi.r5;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o5  reason: invalid package */
/* loaded from: classes.dex */
public class o5<MessageType extends r5<MessageType, BuilderType>, BuilderType extends o5<MessageType, BuilderType>> extends u3<MessageType, BuilderType> {

    /* renamed from: j  reason: collision with root package name */
    private final r5 f5114j;

    /* renamed from: k  reason: collision with root package name */
    protected r5 f5115k;

    /* JADX INFO: Access modifiers changed from: protected */
    public o5(MessageType messagetype) {
        this.f5114j = messagetype;
        if (messagetype.p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5115k = messagetype.y();
    }

    private static void g(Object obj, Object obj2) {
        e7.a().b(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: h */
    public final o5 clone() {
        o5 o5Var = (o5) this.f5114j.t(5, null, null);
        o5Var.f5115k = zzk();
        return o5Var;
    }

    public final o5 i(r5 r5Var) {
        if (!this.f5114j.equals(r5Var)) {
            if (!this.f5115k.p()) {
                p();
            }
            g(this.f5115k, r5Var);
        }
        return this;
    }

    public final MessageType j() {
        MessageType zzk = zzk();
        if (zzk.o()) {
            return zzk;
        }
        throw new c8(zzk);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.v6
    /* renamed from: n */
    public MessageType zzk() {
        if (this.f5115k.p()) {
            this.f5115k.k();
            return (MessageType) this.f5115k;
        }
        return (MessageType) this.f5115k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        if (this.f5115k.p()) {
            return;
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        r5 y10 = this.f5114j.y();
        g(y10, this.f5115k);
        this.f5115k = y10;
    }
}
