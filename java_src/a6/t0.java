package a6;

import com.google.android.gms.internal.p000firebaseauthapi.i2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    final Map f297a;

    /* renamed from: b  reason: collision with root package name */
    private i2 f298b;

    /* renamed from: c  reason: collision with root package name */
    final w5.f f299c;

    /* renamed from: d  reason: collision with root package name */
    final FirebaseAuth f300d;

    /* renamed from: e  reason: collision with root package name */
    final o0 f301e;

    public t0(w5.f fVar, FirebaseAuth firebaseAuth) {
        p0 p0Var = new p0();
        this.f297a = new HashMap();
        this.f299c = fVar;
        this.f300d = firebaseAuth;
        this.f301e = p0Var;
    }

    public static void d() {
    }

    private final Task f(String str) {
        return (Task) this.f297a.get(str);
    }

    private static String g(String str) {
        return com.google.android.gms.internal.p000firebaseauthapi.d1.d(str) ? "*" : str;
    }

    public final Task a(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        try {
            d();
            String g10 = g(str);
            Task f10 = f(g10);
            if (bool.booleanValue() || f10 == null) {
                f10 = b(g10, bool);
            }
            return f10.continueWithTask(new s0(this, recaptchaAction));
        } catch (u0 e10) {
            return Tasks.forException(e10);
        }
    }

    public final Task b(String str, Boolean bool) {
        Task f10;
        try {
            d();
            String g10 = g(str);
            return (bool.booleanValue() || (f10 = f(g10)) == null) ? this.f300d.m0("RECAPTCHA_ENTERPRISE").continueWithTask(new r0(this, g10)) : f10;
        } catch (u0 e10) {
            return Tasks.forException(e10);
        }
    }

    public final boolean e() {
        i2 i2Var = this.f298b;
        return i2Var != null && i2Var.b();
    }
}
