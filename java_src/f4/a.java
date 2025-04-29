package f4;

import android.util.Log;
import c4.j;
import java.util.Locale;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8837a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8838b;

    /* renamed from: c  reason: collision with root package name */
    private final j f8839c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8840d;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f8838b = sb;
        this.f8837a = str;
        this.f8839c = new j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f8837a, i10)) {
            i10++;
        }
        this.f8840d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f8837a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f8837a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f8837a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f8838b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f8837a, d(str, objArr));
    }

    public boolean f(int i10) {
        return this.f8840d <= i10;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f8837a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f8837a, d(str, objArr));
    }

    public void i(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f8837a, d(str, objArr), th);
    }

    public void j(Throwable th) {
        Log.wtf(this.f8837a, th);
    }
}
