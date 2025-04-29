package h2;

import android.util.SparseArray;
import h2.i0;
import java.util.ArrayList;
import java.util.List;
import s1.n1;
/* loaded from: classes.dex */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f9244a;

    /* renamed from: b  reason: collision with root package name */
    private final List<n1> f9245b;

    public j(int i10) {
        this(i10, com.google.common.collect.q.z());
    }

    public j(int i10, List<n1> list) {
        this.f9244a = i10;
        this.f9245b = list;
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<n1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f9245b;
        }
        p3.a0 a0Var = new p3.a0(bVar.f9238d);
        List<n1> list = this.f9245b;
        while (a0Var.a() > 0) {
            int G = a0Var.G();
            int f10 = a0Var.f() + a0Var.G();
            if (G == 134) {
                list = new ArrayList<>();
                int G2 = a0Var.G() & 31;
                for (int i11 = 0; i11 < G2; i11++) {
                    String D = a0Var.D(3);
                    int G3 = a0Var.G();
                    boolean z10 = (G3 & 128) != 0;
                    if (z10) {
                        i10 = G3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte G4 = (byte) a0Var.G();
                    a0Var.U(1);
                    List<byte[]> list2 = null;
                    if (z10) {
                        list2 = p3.e.b((G4 & 64) != 0);
                    }
                    list.add(new n1.b().g0(str).X(D).H(i10).V(list2).G());
                }
            }
            a0Var.T(f10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f9244a) != 0;
    }

    @Override // h2.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override // h2.i0.c
    public i0 b(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f9236b));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (f(4)) {
                        return null;
                    }
                    return new w(new p(c(bVar), f(1), f(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 == 134) {
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new c0(new v("application/x-scte35"));
                                    }
                                    if (i10 != 135) {
                                        switch (i10) {
                                            case 15:
                                                if (f(2)) {
                                                    return null;
                                                }
                                                return new w(new i(false, bVar.f9236b));
                                            case 16:
                                                return new w(new o(d(bVar)));
                                            case 17:
                                                if (f(2)) {
                                                    return null;
                                                }
                                                return new w(new s(bVar.f9236b));
                                            default:
                                                switch (i10) {
                                                    case 128:
                                                        break;
                                                    case 129:
                                                        break;
                                                    case 130:
                                                        if (!f(64)) {
                                                            return null;
                                                        }
                                                        break;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return new w(new c(bVar.f9236b));
                                }
                                return new c0(new v("application/vnd.dvb.ait"));
                            }
                            return new w(new f(bVar.f9236b));
                        }
                        return new w(new k(bVar.f9236b));
                    }
                    return new w(new l(bVar.f9237c));
                } else {
                    return new w(new q(c(bVar)));
                }
            }
            return new w(new r());
        }
        return new w(new n(d(bVar)));
    }
}
