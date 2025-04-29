package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
/* loaded from: classes.dex */
final class m implements IntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final t f5884a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(t tVar) {
        this.f5884a = tVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f5884a.b(integrityTokenRequest);
    }
}
