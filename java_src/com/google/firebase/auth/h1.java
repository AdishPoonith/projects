package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f6533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f6534b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(a0 a0Var, e eVar) {
        this.f6534b = a0Var;
        this.f6533a = eVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6534b.W()).r0(this.f6533a, (String) c4.s.j(((c0) task.getResult()).g()));
    }
}
