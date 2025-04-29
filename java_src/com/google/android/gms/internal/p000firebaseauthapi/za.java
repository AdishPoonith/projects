package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.za  reason: invalid package */
/* loaded from: classes.dex */
final class za implements Comparable {

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f5777j;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        za zaVar = (za) obj;
        int length = this.f5777j.length;
        int length2 = zaVar.f5777j.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f5777j;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = zaVar.f5777j[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za) {
            return Arrays.equals(this.f5777j, ((za) obj).f5777j);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5777j);
    }

    public final String toString() {
        return uu.a(this.f5777j);
    }
}
