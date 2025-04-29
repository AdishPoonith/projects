package z3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: d  reason: collision with root package name */
    private static r f20877d;

    /* renamed from: a  reason: collision with root package name */
    final c f20878a;

    /* renamed from: b  reason: collision with root package name */
    GoogleSignInAccount f20879b;

    /* renamed from: c  reason: collision with root package name */
    GoogleSignInOptions f20880c;

    private r(Context context) {
        c b10 = c.b(context);
        this.f20878a = b10;
        this.f20879b = b10.c();
        this.f20880c = b10.d();
    }

    public static synchronized r c(Context context) {
        r f10;
        synchronized (r.class) {
            f10 = f(context.getApplicationContext());
        }
        return f10;
    }

    private static synchronized r f(Context context) {
        synchronized (r.class) {
            r rVar = f20877d;
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r(context);
            f20877d = rVar2;
            return rVar2;
        }
    }

    public final synchronized GoogleSignInAccount a() {
        return this.f20879b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.f20880c;
    }

    public final synchronized void d() {
        this.f20878a.a();
        this.f20879b = null;
        this.f20880c = null;
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f20878a.f(googleSignInAccount, googleSignInOptions);
        this.f20879b = googleSignInAccount;
        this.f20880c = googleSignInOptions;
    }
}
