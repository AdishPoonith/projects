package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6537a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f6538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f6539c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(a0 a0Var, String str, e eVar) {
        this.f6539c = a0Var;
        this.f6537a = str;
        this.f6538b = eVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6539c.W()).A0((String) c4.s.j(((c0) task.getResult()).g()), this.f6537a, this.f6538b);
    }
}
