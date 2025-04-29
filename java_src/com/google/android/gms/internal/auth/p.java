package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes.dex */
final class p extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f4207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Handler handler) {
        super(null);
        this.f4207a = qVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f4207a.e();
    }
}
