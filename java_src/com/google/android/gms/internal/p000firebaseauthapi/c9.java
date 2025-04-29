package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c9  reason: invalid package */
/* loaded from: classes.dex */
public final class c9 {

    /* renamed from: a  reason: collision with root package name */
    Object[] f4442a;

    /* renamed from: b  reason: collision with root package name */
    int f4443b = 0;

    /* renamed from: c  reason: collision with root package name */
    b9 f4444c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(int i10) {
        this.f4442a = new Object[i10 + i10];
    }

    private final void b(int i10) {
        Object[] objArr = this.f4442a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f4442a = Arrays.copyOf(objArr, g6.a(length, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c9 a(Iterable iterable) {
        if (iterable instanceof Collection) {
            b(this.f4443b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            b(this.f4443b + 1);
            f3.a(key, value);
            Object[] objArr = this.f4442a;
            int i10 = this.f4443b;
            int i11 = i10 + i10;
            objArr[i11] = key;
            objArr[i11 + 1] = value;
            this.f4443b = i10 + 1;
        }
        return this;
    }
}
