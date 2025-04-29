package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
final class c extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f5873a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f5874b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c(String str, Long l10, b bVar) {
        this.f5873a = str;
        this.f5874b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f5874b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f5873a.equals(integrityTokenRequest.nonce())) {
                Long l10 = this.f5874b;
                Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
                if (l10 != null ? l10.equals(cloudProjectNumber) : cloudProjectNumber == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f5873a.hashCode() ^ 1000003;
        Long l10 = this.f5874b;
        return (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f5873a;
    }

    public final String toString() {
        String str = this.f5873a;
        Long l10 = this.f5874b;
        return "IntegrityTokenRequest{nonce=" + str + ", cloudProjectNumber=" + l10 + "}";
    }
}
