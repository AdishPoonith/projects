package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public final class Scope extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new t();

    /* renamed from: j  reason: collision with root package name */
    final int f3731j;

    /* renamed from: k  reason: collision with root package name */
    private final String f3732k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i10, String str) {
        c4.s.g(str, "scopeUri must not be null or empty");
        this.f3731j = i10;
        this.f3732k = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String B() {
        return this.f3732k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f3732k.equals(((Scope) obj).f3732k);
        }
        return false;
    }

    public int hashCode() {
        return this.f3732k.hashCode();
    }

    public String toString() {
        return this.f3732k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3731j);
        d4.c.s(parcel, 2, B(), false);
        d4.c.b(parcel, a10);
    }
}
