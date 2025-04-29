package a6;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends com.google.firebase.auth.h0 {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f217a;

    public f(w1 w1Var) {
        c4.s.j(w1Var);
        this.f217a = w1Var;
    }

    @Override // com.google.firebase.auth.h0
    public final Task<Void> a(com.google.firebase.auth.i0 i0Var, String str) {
        c4.s.j(i0Var);
        w1 w1Var = this.f217a;
        return FirebaseAuth.getInstance(w1Var.W()).j0(w1Var, i0Var, str);
    }

    @Override // com.google.firebase.auth.h0
    public final List<com.google.firebase.auth.j0> b() {
        return this.f217a.i0();
    }

    @Override // com.google.firebase.auth.h0
    public final Task<com.google.firebase.auth.l0> c() {
        return this.f217a.C(false).continueWithTask(new e(this));
    }

    @Override // com.google.firebase.auth.h0
    public final Task<Void> d(String str) {
        c4.s.f(str);
        w1 w1Var = this.f217a;
        return FirebaseAuth.getInstance(w1Var.W()).u0(w1Var, str);
    }
}
