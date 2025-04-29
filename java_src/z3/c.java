package z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f20862c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static c f20863d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f20864a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f20865b;

    c(Context context) {
        this.f20865b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        c4.s.j(context);
        Lock lock = f20862c;
        lock.lock();
        try {
            if (f20863d == null) {
                f20863d = new c(context.getApplicationContext());
            }
            c cVar = f20863d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f20862c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f20864a.lock();
        try {
            this.f20865b.edit().clear().apply();
        } finally {
            this.f20864a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.K(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.J(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        c4.s.j(googleSignInAccount);
        c4.s.j(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.L());
        c4.s.j(googleSignInAccount);
        c4.s.j(googleSignInOptions);
        String L = googleSignInAccount.L();
        h(i("googleSignInAccount", L), googleSignInAccount.M());
        h(i("googleSignInOptions", L), googleSignInOptions.N());
    }

    protected final String g(String str) {
        this.f20864a.lock();
        try {
            return this.f20865b.getString(str, null);
        } finally {
            this.f20864a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f20864a.lock();
        try {
            this.f20865b.edit().putString(str, str2).apply();
        } finally {
            this.f20864a.unlock();
        }
    }
}
