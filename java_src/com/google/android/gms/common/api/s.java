package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.m;
/* loaded from: classes.dex */
final class s<R extends m> extends BasePendingResult<R> {
    public s(f fVar) {
        super(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R c(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
