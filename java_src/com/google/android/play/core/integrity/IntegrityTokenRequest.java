package com.google.android.play.core.integrity;
/* loaded from: classes.dex */
public abstract class IntegrityTokenRequest {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j10);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new a();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
