package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v3 extends f4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.auth.f4
    public final void a() {
        if (!j()) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry g10 = g(i10);
                if (((a2) g10.getKey()).zzc()) {
                    g10.setValue(Collections.unmodifiableList((List) g10.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((a2) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
