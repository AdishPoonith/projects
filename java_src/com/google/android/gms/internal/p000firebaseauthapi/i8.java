package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i8  reason: invalid package */
/* loaded from: classes.dex */
public final class i8 extends h5 {
    public i8() {
        super(4);
    }

    public final i8 b(Object obj) {
        int i10 = this.f4673b + 1;
        Object[] objArr = this.f4672a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f4674c) {
                this.f4672a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.f4672a;
            int i11 = this.f4673b;
            this.f4673b = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        this.f4672a = Arrays.copyOf(objArr, g6.a(length, i10));
        this.f4674c = false;
        Object[] objArr22 = this.f4672a;
        int i112 = this.f4673b;
        this.f4673b = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }

    public final a9 c() {
        this.f4674c = true;
        return a9.p(this.f4672a, this.f4673b);
    }
}
