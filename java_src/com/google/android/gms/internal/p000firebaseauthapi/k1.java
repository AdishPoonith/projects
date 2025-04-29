package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k1  reason: invalid package */
/* loaded from: classes.dex */
final class k1 extends q2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4850a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4851b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(String str, String str2) {
        this.f4850a = str;
        this.f4851b = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.q2
    public final String a() {
        return this.f4851b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.q2
    public final String b() {
        return this.f4850a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            String str = this.f4850a;
            if (str != null ? str.equals(q2Var.b()) : q2Var.b() == null) {
                String str2 = this.f4851b;
                String a10 = q2Var.a();
                if (str2 != null ? str2.equals(a10) : a10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4850a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f4851b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4850a;
        String str2 = this.f4851b;
        return "RecaptchaEnforcementState{provider=" + str + ", enforcementState=" + str2 + "}";
    }
}
