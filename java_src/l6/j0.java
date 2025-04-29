package l6;

import j6.n;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f13208a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13209b;

    /* renamed from: c  reason: collision with root package name */
    private final d6.e<m6.l> f13210c;

    /* renamed from: d  reason: collision with root package name */
    private final d6.e<m6.l> f13211d;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13212a;

        static {
            int[] iArr = new int[n.a.values().length];
            f13212a = iArr;
            try {
                iArr[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13212a[n.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j0(int i10, boolean z10, d6.e<m6.l> eVar, d6.e<m6.l> eVar2) {
        this.f13208a = i10;
        this.f13209b = z10;
        this.f13210c = eVar;
        this.f13211d = eVar2;
    }

    public static j0 a(int i10, j6.y1 y1Var) {
        d6.e eVar = new d6.e(new ArrayList(), m6.l.b());
        d6.e eVar2 = new d6.e(new ArrayList(), m6.l.b());
        for (j6.n nVar : y1Var.d()) {
            int i11 = a.f13212a[nVar.c().ordinal()];
            if (i11 == 1) {
                eVar = eVar.k(nVar.b().getKey());
            } else if (i11 == 2) {
                eVar2 = eVar2.k(nVar.b().getKey());
            }
        }
        return new j0(i10, y1Var.k(), eVar, eVar2);
    }

    public d6.e<m6.l> b() {
        return this.f13210c;
    }

    public d6.e<m6.l> c() {
        return this.f13211d;
    }

    public int d() {
        return this.f13208a;
    }

    public boolean e() {
        return this.f13209b;
    }
}
