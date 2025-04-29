package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f2 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f6526a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6527b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6528c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f6528c = firebaseAuth;
        this.f6526a = p0Var;
        this.f6527b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String a10;
        String str = null;
        if (task.isSuccessful()) {
            str = ((a6.d1) task.getResult()).b();
            a10 = ((a6.d1) task.getResult()).a();
        } else {
            Exception exception = task.getException();
            if (exception instanceof t) {
                FirebaseAuth.d0((t) exception, this.f6526a, this.f6527b);
                return;
            }
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(task.getException() != null ? task.getException().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            a10 = null;
        }
        this.f6528c.b0(this.f6526a, str, a10);
    }
}
