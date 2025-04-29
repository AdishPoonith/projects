package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f6  reason: invalid package */
/* loaded from: classes.dex */
final class f6 extends k6 {

    /* renamed from: c  reason: collision with root package name */
    private static final Class f4568c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ f6(e6 e6Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j10, int i10) {
        c6 c6Var;
        List list = (List) o8.k(obj, j10);
        if (list.isEmpty()) {
            List c6Var2 = list instanceof d6 ? new c6(i10) : ((list instanceof d7) && (list instanceof w5)) ? ((w5) list).zzd(i10) : new ArrayList(i10);
            o8.x(obj, j10, c6Var2);
            return c6Var2;
        }
        if (f4568c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            c6Var = arrayList;
        } else if (!(list instanceof j8)) {
            if ((list instanceof d7) && (list instanceof w5)) {
                w5 w5Var = (w5) list;
                if (w5Var.zzc()) {
                    return list;
                }
                w5 zzd = w5Var.zzd(list.size() + i10);
                o8.x(obj, j10, zzd);
                return zzd;
            }
            return list;
        } else {
            c6 c6Var3 = new c6(list.size() + i10);
            c6Var3.addAll(c6Var3.size(), (j8) list);
            c6Var = c6Var3;
        }
        o8.x(obj, j10, c6Var);
        return c6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final List a(Object obj, long j10) {
        return f(obj, j10, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final void b(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) o8.k(obj, j10);
        if (list instanceof d6) {
            unmodifiableList = ((d6) list).zze();
        } else if (f4568c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof d7) && (list instanceof w5)) {
                w5 w5Var = (w5) list;
                if (w5Var.zzc()) {
                    w5Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        o8.x(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final void c(Object obj, Object obj2, long j10) {
        List list = (List) o8.k(obj2, j10);
        List f10 = f(obj, j10, list.size());
        int size = f10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f10.addAll(list);
        }
        if (size > 0) {
            list = f10;
        }
        o8.x(obj, j10, list);
    }
}
