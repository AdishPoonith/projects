package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class b2 {

    /* renamed from: d  reason: collision with root package name */
    private static final b2 f4019d = new b2(true);

    /* renamed from: a  reason: collision with root package name */
    final f4 f4020a = new v3(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4021b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4022c;

    private b2() {
    }

    private b2(boolean z10) {
        b();
        b();
    }

    public static b2 a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.auth.a2 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.auth.z4 r0 = r4.zzb()
            com.google.android.gms.internal.auth.k2.e(r5)
            com.google.android.gms.internal.auth.z4 r1 = com.google.android.gms.internal.auth.z4.f4289k
            com.google.android.gms.internal.auth.a5 r1 = com.google.android.gms.internal.auth.a5.INT
            com.google.android.gms.internal.auth.a5 r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.g3
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.auth.q1
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.auth.z4 r4 = r4.zzb()
            com.google.android.gms.internal.auth.a5 r4 = r4.b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.b2.d(com.google.android.gms.internal.auth.a2, java.lang.Object):void");
    }

    public final void b() {
        if (this.f4021b) {
            return;
        }
        this.f4020a.a();
        this.f4021b = true;
    }

    public final void c(a2 a2Var, Object obj) {
        if (!a2Var.zzc()) {
            d(a2Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(a2Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f4020a.put(a2Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        b2 b2Var = new b2();
        for (int i10 = 0; i10 < this.f4020a.b(); i10++) {
            Map.Entry g10 = this.f4020a.g(i10);
            b2Var.c((a2) g10.getKey(), g10.getValue());
        }
        for (Map.Entry entry : this.f4020a.c()) {
            b2Var.c((a2) entry.getKey(), entry.getValue());
        }
        b2Var.f4022c = this.f4022c;
        return b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            return this.f4020a.equals(((b2) obj).f4020a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4020a.hashCode();
    }
}
