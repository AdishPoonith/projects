package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import f4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0  reason: invalid package */
/* loaded from: classes.dex */
public final class z0 implements OnFailureListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(e1 e1Var) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        a aVar;
        aVar = e1.f4522d;
        aVar.c("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}
