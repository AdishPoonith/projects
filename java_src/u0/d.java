package u0;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18448a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        int i10;
        int d10;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            f fVar = f.f18452a;
            String b10 = new ka.f("\\s").b(f.k(textView), "");
            int length = b10.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = b10.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        d10 = ka.c.d(charAt);
                        if (z10 && (d10 = d10 * 2) > 9) {
                            d10 = (d10 % 10) + 1;
                        }
                        i10 += d10;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                return i10 % 10 == 0;
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            f fVar = f.f18452a;
            String k10 = f.k(textView);
            if (k10 != null) {
                if (k10.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
                return Patterns.EMAIL_ADDRESS.matcher(k10).matches();
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (k1.a.d(d.class)) {
            return false;
        }
        try {
            if (view instanceof TextView) {
                d dVar = f18448a;
                if (!dVar.c((TextView) view) && !dVar.a((TextView) view) && !dVar.d((TextView) view) && !dVar.f((TextView) view) && !dVar.e((TextView) view)) {
                    if (!dVar.b((TextView) view)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, d.class);
            return false;
        }
    }
}
