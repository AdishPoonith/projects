package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class q2 extends u2 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class f4227c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q2(p2 p2Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.u2
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) u4.f(obj, j10);
        if (list instanceof o2) {
            unmodifiableList = ((o2) list).zze();
        } else if (f4227c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof o3) && (list instanceof j2)) {
                j2 j2Var = (j2) list;
                if (j2Var.zzc()) {
                    j2Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        u4.p(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.auth.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.auth.u4.f(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.auth.u4.f(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.o2
            if (r2 == 0) goto L20
            com.google.android.gms.internal.auth.n2 r1 = new com.google.android.gms.internal.auth.n2
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.o3
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.j2
            if (r2 == 0) goto L30
            com.google.android.gms.internal.auth.j2 r1 = (com.google.android.gms.internal.auth.j2) r1
            com.google.android.gms.internal.auth.j2 r0 = r1.zzd(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.auth.u4.p(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.auth.q2.f4227c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.google.android.gms.internal.auth.u4.p(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.p4
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.auth.n2 r2 = new com.google.android.gms.internal.auth.n2
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.auth.p4 r1 = (com.google.android.gms.internal.auth.p4) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.o3
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.j2
            if (r2 == 0) goto L8a
            r2 = r1
            com.google.android.gms.internal.auth.j2 r2 = (com.google.android.gms.internal.auth.j2) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.auth.j2 r1 = r2.zzd(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            com.google.android.gms.internal.auth.u4.p(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.q2.b(java.lang.Object, java.lang.Object, long):void");
    }
}
