package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m7  reason: invalid package */
/* loaded from: classes.dex */
final class m7 extends w7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m7(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w7
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry g10 = g(i10);
                if (((j5) g10.getKey()).zzc()) {
                    g10.setValue(Collections.unmodifiableList((List) g10.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((j5) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
