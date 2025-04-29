package a6;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private final String f264j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ p f265k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(p pVar, String str) {
        this.f265k = pVar;
        this.f264j = c4.s.f(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        f4.a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(w5.f.p(this.f264j));
        if (firebaseAuth.m() != null) {
            Task d10 = firebaseAuth.d(true);
            aVar = p.f270h;
            aVar.g("Token refreshing started", new Object[0]);
            d10.addOnFailureListener(new n(this));
        }
    }
}
