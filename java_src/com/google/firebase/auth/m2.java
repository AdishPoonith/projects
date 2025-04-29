package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m2 implements Continuation {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        return (!task.isSuccessful() && (task.getException() instanceof q) && ((q) task.getException()).a().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
