package com.google.android.gms.internal.p000firebaseauthapi;

import a6.j;
import a6.w1;
import android.os.Parcelable;
import android.util.Pair;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.j0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.t1;
import com.google.firebase.auth.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i0  reason: invalid package */
/* loaded from: classes.dex */
public final class i0 implements y {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f4709a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f4710b;

    public i0(j0 j0Var, TaskCompletionSource taskCompletionSource) {
        this.f4709a = j0Var;
        this.f4710b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.y
    public final void a(Object obj, Status status) {
        s.k(this.f4710b, "completion source cannot be null");
        if (status == null) {
            this.f4710b.setResult(obj);
            return;
        }
        j0 j0Var = this.f4709a;
        if (j0Var.f4790s == null) {
            h hVar = j0Var.f4787p;
            if (hVar != null) {
                this.f4710b.setException(i.b(status, hVar, j0Var.f4788q, j0Var.f4789r));
                return;
            } else {
                this.f4710b.setException(i.a(status));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.f4710b;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(j0Var.f4774c);
        j0 j0Var2 = this.f4709a;
        wv wvVar = j0Var2.f4790s;
        a0 a0Var = ("reauthenticateWithCredential".equals(j0Var2.zza()) || "reauthenticateWithCredentialWithData".equals(this.f4709a.zza())) ? this.f4709a.f4775d : null;
        int i10 = i.f4708b;
        Objects.requireNonNull(firebaseAuth);
        Objects.requireNonNull(wvVar);
        Pair pair = (Pair) i.f4707a.get(17078);
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        Parcelable.Creator<a6.h> creator = a6.h.CREATOR;
        List<j0> c10 = wvVar.c();
        ArrayList arrayList = new ArrayList();
        for (j0 j0Var3 : c10) {
            if (j0Var3 instanceof t0) {
                arrayList.add((t0) j0Var3);
            }
        }
        List<j0> c11 = wvVar.c();
        ArrayList arrayList2 = new ArrayList();
        for (j0 j0Var4 : c11) {
            if (j0Var4 instanceof t1) {
                arrayList2.add((t1) j0Var4);
            }
        }
        taskCompletionSource.setException(new u(str, str2, new a6.h(arrayList, j.C(wvVar.c(), wvVar.b()), firebaseAuth.l().q(), wvVar.a(), (w1) a0Var, arrayList2)));
    }
}
