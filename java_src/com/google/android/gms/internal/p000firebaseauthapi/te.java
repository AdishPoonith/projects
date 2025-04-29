package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.te  reason: invalid package */
/* loaded from: classes.dex */
final class te extends sd {

    /* renamed from: a  reason: collision with root package name */
    private final char f5378a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public te(char c10) {
        this.f5378a = c10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wh
    public final boolean a(char c10) {
        return c10 == this.f5378a;
    }

    public final String toString() {
        int i10 = this.f5378a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }
}
