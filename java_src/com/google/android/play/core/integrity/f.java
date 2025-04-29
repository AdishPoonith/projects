package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
final class f extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f5876a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f5876a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5876a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f5876a;
        return "IntegrityTokenResponse{token=" + str + "}";
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f5876a;
    }
}
