package z2;

import android.net.Uri;
import android.text.TextUtils;
import h2.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.a;
import p3.j0;
import p3.v;
import s1.n1;
import t1.t1;
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f20729d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    private final int f20730b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20731c;

    public d() {
        this(0, true);
    }

    public d(int i10, boolean z10) {
        this.f20730b = i10;
        this.f20731c = z10;
    }

    private static void b(int i10, List<Integer> list) {
        if (e5.e.g(f20729d, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private x1.l d(int i10, n1 n1Var, List<n1> list, j0 j0Var) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            if (i10 != 11) {
                                if (i10 != 13) {
                                    return null;
                                }
                                return new t(n1Var.f17410l, j0Var);
                            }
                            return f(this.f20730b, this.f20731c, n1Var, list, j0Var);
                        }
                        return e(j0Var, n1Var, list);
                    }
                    return new e2.f(0, 0L);
                }
                return new h2.h();
            }
            return new h2.e();
        }
        return new h2.b();
    }

    private static f2.g e(j0 j0Var, n1 n1Var, List<n1> list) {
        int i10 = g(n1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new f2.g(i10, j0Var, null, list);
    }

    private static h0 f(int i10, boolean z10, n1 n1Var, List<n1> list, j0 j0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new n1.b().g0("application/cea-608").G()) : Collections.emptyList();
        }
        String str = n1Var.f17416r;
        if (!TextUtils.isEmpty(str)) {
            if (!v.b(str, "audio/mp4a-latm")) {
                i11 |= 2;
            }
            if (!v.b(str, "video/avc")) {
                i11 |= 4;
            }
        }
        return new h0(2, j0Var, new h2.j(i11, list));
    }

    private static boolean g(n1 n1Var) {
        k2.a aVar = n1Var.f17417s;
        if (aVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q) {
                return !((q) d10).f20841l.isEmpty();
            }
        }
        return false;
    }

    private static boolean h(x1.l lVar, x1.m mVar) {
        try {
            boolean j10 = lVar.j(mVar);
            mVar.f();
            return j10;
        } catch (EOFException unused) {
            mVar.f();
            return false;
        } catch (Throwable th) {
            mVar.f();
            throw th;
        }
    }

    @Override // z2.h
    /* renamed from: c */
    public b a(Uri uri, n1 n1Var, List<n1> list, j0 j0Var, Map<String, List<String>> map, x1.m mVar, t1 t1Var) {
        int a10 = p3.k.a(n1Var.f17419u);
        int b10 = p3.k.b(map);
        int c10 = p3.k.c(uri);
        int[] iArr = f20729d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(a10, arrayList);
        b(b10, arrayList);
        b(c10, arrayList);
        for (int i10 : iArr) {
            b(i10, arrayList);
        }
        x1.l lVar = null;
        mVar.f();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            x1.l lVar2 = (x1.l) p3.a.e(d(intValue, n1Var, list, j0Var));
            if (h(lVar2, mVar)) {
                return new b(lVar2, n1Var, j0Var);
            }
            if (lVar == null && (intValue == a10 || intValue == b10 || intValue == c10 || intValue == 11)) {
                lVar = lVar2;
            }
        }
        return new b((x1.l) p3.a.e(lVar), n1Var, j0Var);
    }
}
