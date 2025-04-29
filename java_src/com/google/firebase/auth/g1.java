package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f6529a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(a0 a0Var) {
        this.f6529a = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        return FirebaseAuth.getInstance(this.f6529a.W()).r0(null, (String) c4.s.j(((c0) task.getResult()).g()));
    }
}
