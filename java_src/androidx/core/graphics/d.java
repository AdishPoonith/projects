package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final j f1701a;

    /* renamed from: b  reason: collision with root package name */
    private static final s.e<String, Typeface> f1702b;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f1703a;

        public a(h.e eVar) {
            this.f1703a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.e eVar = this.f1703a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f1703a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1701a = i10 >= 29 ? new i() : i10 >= 28 ? new h() : i10 >= 26 ? new g() : (i10 < 24 || !f.j()) ? new e() : new f();
        f1702b = new s.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f1701a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface a10;
        if (bVar instanceof e.C0023e) {
            e.C0023e c0023e = (e.C0023e) bVar;
            Typeface g10 = g(c0023e.c());
            if (g10 != null) {
                if (eVar != null) {
                    eVar.d(g10, handler);
                }
                return g10;
            }
            a10 = androidx.core.provider.g.a(context, c0023e.b(), i12, !z10 ? eVar != null : c0023e.a() != 0, z10 ? c0023e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            a10 = f1701a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (a10 != null) {
                    eVar.d(a10, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a10 != null) {
            f1702b.d(e(resources, i10, str, i11, i12), a10);
        }
        return a10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f1701a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f1702b.d(e(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f1702b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
