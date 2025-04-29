package c4;

import android.util.Log;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f3336a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3337b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        s.k(str, "log tag cannot be null");
        s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3336a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3337b = null;
        } else {
            this.f3337b = str2;
        }
    }

    private final String f(String str) {
        String str2 = this.f3337b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f3336a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }
}
