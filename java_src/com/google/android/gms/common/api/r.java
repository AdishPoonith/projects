package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.m;
/* loaded from: classes.dex */
final class r<R extends m> extends BasePendingResult<R> {

    /* renamed from: q  reason: collision with root package name */
    private final m f3971q;

    public r(f fVar, m mVar) {
        super(fVar);
        this.f3971q = mVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R c(Status status) {
        return (R) this.f3971q;
    }
}
