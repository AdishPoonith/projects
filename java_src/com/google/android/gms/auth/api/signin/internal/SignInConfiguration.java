package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c4.s;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.c;
import z3.b;
import z3.y;
/* loaded from: classes.dex */
public final class SignInConfiguration extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* renamed from: j  reason: collision with root package name */
    private final String f3726j;

    /* renamed from: k  reason: collision with root package name */
    private final GoogleSignInOptions f3727k;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f3726j = s.f(str);
        this.f3727k = googleSignInOptions;
    }

    public final GoogleSignInOptions B() {
        return this.f3727k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.f3726j.equals(signInConfiguration.f3726j)) {
                GoogleSignInOptions googleSignInOptions = this.f3727k;
                GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f3727k;
                if (googleSignInOptions == null) {
                    if (googleSignInOptions2 == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f3726j).a(this.f3727k).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f3726j, false);
        c.r(parcel, 5, this.f3727k, i10, false);
        c.b(parcel, a10);
    }
}
