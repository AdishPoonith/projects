package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c4.q;
import c4.s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d4.c;
import java.util.List;
/* loaded from: classes.dex */
public class TokenData extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    final int f3673j;

    /* renamed from: k  reason: collision with root package name */
    private final String f3674k;

    /* renamed from: l  reason: collision with root package name */
    private final Long f3675l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f3676m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f3677n;

    /* renamed from: o  reason: collision with root package name */
    private final List f3678o;

    /* renamed from: p  reason: collision with root package name */
    private final String f3679p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f3673j = i10;
        this.f3674k = s.f(str);
        this.f3675l = l10;
        this.f3676m = z10;
        this.f3677n = z11;
        this.f3678o = list;
        this.f3679p = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            return TextUtils.equals(this.f3674k, tokenData.f3674k) && q.b(this.f3675l, tokenData.f3675l) && this.f3676m == tokenData.f3676m && this.f3677n == tokenData.f3677n && q.b(this.f3678o, tokenData.f3678o) && q.b(this.f3679p, tokenData.f3679p);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f3674k, this.f3675l, Boolean.valueOf(this.f3676m), Boolean.valueOf(this.f3677n), this.f3678o, this.f3679p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.l(parcel, 1, this.f3673j);
        c.s(parcel, 2, this.f3674k, false);
        c.q(parcel, 3, this.f3675l, false);
        c.c(parcel, 4, this.f3676m);
        c.c(parcel, 5, this.f3677n);
        c.t(parcel, 6, this.f3678o, false);
        c.s(parcel, 7, this.f3679p, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f3674k;
    }
}
