package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(y yVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        n0.d();
    }
}
