package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.q0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g2 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f6530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6532c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(FirebaseAuth firebaseAuth, p0 p0Var, String str) {
        this.f6532c = firebaseAuth;
        this.f6530a = p0Var;
        this.f6531b = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String a10;
        String str;
        q0.b h02;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        String str2;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar2;
        String str3;
        if (task.isSuccessful()) {
            String b10 = ((a6.d1) task.getResult()).b();
            a10 = ((a6.d1) task.getResult()).a();
            str = b10;
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", exception != null ? "Error while validating application identity: ".concat(String.valueOf(exception.getMessage())) : "Error while validating application identity: ");
            if (exception instanceof t) {
                FirebaseAuth.d0((t) exception, this.f6530a, this.f6531b);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str = null;
            a10 = null;
        }
        long longValue = this.f6530a.g().longValue();
        h02 = this.f6532c.h0(this.f6530a.h(), this.f6530a.e());
        if (TextUtils.isEmpty(str)) {
            h02 = this.f6532c.E0(this.f6530a, h02);
        }
        q0.b bVar = h02;
        a6.j jVar = (a6.j) c4.s.j(this.f6530a.c());
        if (jVar.F()) {
            eVar2 = this.f6532c.f6460e;
            String str4 = (String) c4.s.j(this.f6530a.h());
            str3 = this.f6532c.f6464i;
            eVar2.h(jVar, str4, str3, longValue, this.f6530a.d() != null, this.f6530a.l(), str, a10, this.f6532c.c0(), bVar, this.f6530a.i(), this.f6530a.a());
            return;
        }
        eVar = this.f6532c.f6460e;
        t0 t0Var = (t0) c4.s.j(this.f6530a.f());
        str2 = this.f6532c.f6464i;
        eVar.i(jVar, t0Var, str2, longValue, this.f6530a.d() != null, this.f6530a.l(), str, a10, this.f6532c.c0(), bVar, this.f6530a.i(), this.f6530a.a());
    }
}
