package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k5  reason: invalid package */
/* loaded from: classes.dex */
final class k5 {

    /* renamed from: d  reason: collision with root package name */
    private static final k5 f4869d = new k5(true);

    /* renamed from: a  reason: collision with root package name */
    final w7 f4870a = new m7(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4871b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4872c;

    private k5() {
    }

    private k5(boolean z10) {
        b();
        b();
    }

    public static k5 a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.p000firebaseauthapi.j5 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.firebase-auth-api.u8 r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.p000firebaseauthapi.x5.f5628d
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.firebase-auth-api.u8 r1 = com.google.android.gms.internal.p000firebaseauthapi.u8.f5422k
            com.google.android.gms.internal.firebase-auth-api.v8 r1 = com.google.android.gms.internal.p000firebaseauthapi.v8.INT
            com.google.android.gms.internal.firebase-auth-api.v8 r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p000firebaseauthapi.w6
            if (r0 == 0) goto L44
            goto L43
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof com.google.android.gms.internal.p000firebaseauthapi.t5
            if (r0 == 0) goto L44
            goto L43
        L27:
            boolean r0 = r5 instanceof com.google.android.gms.internal.p000firebaseauthapi.m4
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
            goto L43
        L30:
            boolean r0 = r5 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r5 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r5 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r5 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r5 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.u8 r4 = r4.zzb()
            com.google.android.gms.internal.firebase-auth-api.v8 r4 = r4.b()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.k5.d(com.google.android.gms.internal.firebase-auth-api.j5, java.lang.Object):void");
    }

    public final void b() {
        if (this.f4871b) {
            return;
        }
        for (int i10 = 0; i10 < this.f4870a.b(); i10++) {
            Map.Entry g10 = this.f4870a.g(i10);
            if (g10.getValue() instanceof r5) {
                ((r5) g10.getValue()).k();
            }
        }
        this.f4870a.a();
        this.f4871b = true;
    }

    public final void c(j5 j5Var, Object obj) {
        if (!j5Var.zzc()) {
            d(j5Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(j5Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f4870a.put(j5Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        k5 k5Var = new k5();
        for (int i10 = 0; i10 < this.f4870a.b(); i10++) {
            Map.Entry g10 = this.f4870a.g(i10);
            k5Var.c((j5) g10.getKey(), g10.getValue());
        }
        for (Map.Entry entry : this.f4870a.c()) {
            k5Var.c((j5) entry.getKey(), entry.getValue());
        }
        k5Var.f4872c = this.f4872c;
        return k5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5) {
            return this.f4870a.equals(((k5) obj).f4870a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4870a.hashCode();
    }
}
