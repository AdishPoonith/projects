package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.en  reason: invalid package */
/* loaded from: classes.dex */
public final class en {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f4553a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private an f4554b = an.f4357b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f4555c = null;

    public final en a(ia iaVar, int i10, String str, String str2) {
        ArrayList arrayList = this.f4553a;
        if (arrayList != null) {
            arrayList.add(new gn(iaVar, i10, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final en b(an anVar) {
        if (this.f4553a != null) {
            this.f4554b = anVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final en c(int i10) {
        if (this.f4553a != null) {
            this.f4555c = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final in d() {
        if (this.f4553a != null) {
            Integer num = this.f4555c;
            if (num == null) {
                in inVar = new in(this.f4554b, Collections.unmodifiableList(this.f4553a), this.f4555c, null);
                this.f4553a = null;
                return inVar;
            }
            int intValue = num.intValue();
            ArrayList arrayList = this.f4553a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int a10 = ((gn) arrayList.get(i10)).a();
                i10++;
                if (a10 == intValue) {
                    in inVar2 = new in(this.f4554b, Collections.unmodifiableList(this.f4553a), this.f4555c, null);
                    this.f4553a = null;
                    return inVar2;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
