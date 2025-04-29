package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.co  reason: invalid package */
/* loaded from: classes.dex */
final class co extends zk implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private final Pattern f4458j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public co(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f4458j = pattern;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zk
    public final yj a(CharSequence charSequence) {
        return new bn(this.f4458j.matcher(charSequence));
    }

    public final String toString() {
        return this.f4458j.toString();
    }
}
