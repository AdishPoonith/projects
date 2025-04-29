package com.google.android.gms.internal.p000firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g7  reason: invalid package */
/* loaded from: classes.dex */
public final class g7 implements t6 {

    /* renamed from: a  reason: collision with root package name */
    private final w6 f4606a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4607b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4608c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4609d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g7(w6 w6Var, String str, Object[] objArr) {
        this.f4606a = w6Var;
        this.f4607b = str;
        this.f4608c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4609d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f4609d = i10 | (charAt2 << i12);
                return;
            }
            i10 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i11 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f4607b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f4608c;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final w6 zza() {
        return this.f4606a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final boolean zzb() {
        return (this.f4609d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final int zzc() {
        return (this.f4609d & 1) == 1 ? 1 : 2;
    }
}
