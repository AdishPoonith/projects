package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import c4.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public class SignInAccount extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    @Deprecated

    /* renamed from: j  reason: collision with root package name */
    final String f3721j;

    /* renamed from: k  reason: collision with root package name */
    private final GoogleSignInAccount f3722k;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    final String f3723l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f3722k = googleSignInAccount;
        this.f3721j = s.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f3723l = s.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount B() {
        return this.f3722k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 4, this.f3721j, false);
        d4.c.r(parcel, 7, this.f3722k, i10, false);
        d4.c.s(parcel, 8, this.f3723l, false);
        d4.c.b(parcel, a10);
    }
}
