package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class s extends r<z.d> {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7312a;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7312a = iArr;
            try {
                iArr[b2.b.f7051l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7312a[b2.b.f7052m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7312a[b2.b.f7053n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7312a[b2.b.f7054o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7312a[b2.b.f7055p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7312a[b2.b.f7056q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7312a[b2.b.f7057r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7312a[b2.b.f7058s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7312a[b2.b.f7063x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7312a[b2.b.f7065z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7312a[b2.b.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7312a[b2.b.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7312a[b2.b.C.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7312a[b2.b.f7064y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7312a[b2.b.f7062w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7312a[b2.b.f7059t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7312a[b2.b.f7060u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7312a[b2.b.f7061v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public int a(Map.Entry<?, ?> entry) {
        return ((z.d) entry.getKey()).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public Object b(q qVar, v0 v0Var, int i10) {
        return qVar.a(v0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public v<z.d> c(Object obj) {
        return ((z.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public v<z.d> d(Object obj) {
        return ((z.c) obj).e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public boolean e(v0 v0Var) {
        return v0Var instanceof z.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public void f(Object obj) {
        c(obj).u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public <UT, UB> UB g(Object obj, l1 l1Var, Object obj2, q qVar, v<z.d> vVar, UB ub, v1<UT, UB> v1Var) {
        long E;
        int x10;
        Object i10;
        ArrayList arrayList;
        z.e eVar = (z.e) obj2;
        int c10 = eVar.c();
        if (eVar.f7413b.c() && eVar.f7413b.f()) {
            switch (a.f7312a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l1Var.B(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l1Var.v(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l1Var.C(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l1Var.s(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l1Var.H(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l1Var.G(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l1Var.e(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l1Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l1Var.k(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l1Var.g(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l1Var.D(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l1Var.a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l1Var.i(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l1Var.I(arrayList);
                    ub = (UB) p1.z(obj, c10, arrayList, eVar.f7413b.g(), ub, v1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f7413b.d());
            }
            vVar.y(eVar.f7413b, arrayList);
        } else {
            Object obj3 = null;
            if (eVar.a() != b2.b.f7064y) {
                switch (a.f7312a[eVar.a().ordinal()]) {
                    case 1:
                        obj3 = Double.valueOf(l1Var.readDouble());
                        break;
                    case 2:
                        obj3 = Float.valueOf(l1Var.readFloat());
                        break;
                    case 3:
                        E = l1Var.E();
                        obj3 = Long.valueOf(E);
                        break;
                    case 4:
                        E = l1Var.d();
                        obj3 = Long.valueOf(E);
                        break;
                    case 5:
                        x10 = l1Var.x();
                        obj3 = Integer.valueOf(x10);
                        break;
                    case 6:
                        E = l1Var.f();
                        obj3 = Long.valueOf(E);
                        break;
                    case 7:
                        x10 = l1Var.n();
                        obj3 = Integer.valueOf(x10);
                        break;
                    case 8:
                        obj3 = Boolean.valueOf(l1Var.o());
                        break;
                    case 9:
                        x10 = l1Var.w();
                        obj3 = Integer.valueOf(x10);
                        break;
                    case 10:
                        x10 = l1Var.z();
                        obj3 = Integer.valueOf(x10);
                        break;
                    case 11:
                        E = l1Var.r();
                        obj3 = Long.valueOf(E);
                        break;
                    case 12:
                        x10 = l1Var.h();
                        obj3 = Integer.valueOf(x10);
                        break;
                    case 13:
                        E = l1Var.j();
                        obj3 = Long.valueOf(E);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj3 = l1Var.u();
                        break;
                    case 16:
                        obj3 = l1Var.m();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object i11 = vVar.i(eVar.f7413b);
                            if (i11 instanceof z) {
                                n1 d10 = i1.a().d(i11);
                                if (!((z) i11).O()) {
                                    Object f10 = d10.f();
                                    d10.a(f10, i11);
                                    vVar.y(eVar.f7413b, f10);
                                    i11 = f10;
                                }
                                l1Var.L(i11, d10, qVar);
                                return ub;
                            }
                        }
                        obj3 = l1Var.M(eVar.b().getClass(), qVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object i12 = vVar.i(eVar.f7413b);
                            if (i12 instanceof z) {
                                n1 d11 = i1.a().d(i12);
                                if (!((z) i12).O()) {
                                    Object f11 = d11.f();
                                    d11.a(f11, i12);
                                    vVar.y(eVar.f7413b, f11);
                                    i12 = f11;
                                }
                                l1Var.O(i12, d11, qVar);
                                return ub;
                            }
                        }
                        obj3 = l1Var.K(eVar.b().getClass(), qVar);
                        break;
                }
            } else {
                int x11 = l1Var.x();
                if (eVar.f7413b.g().a(x11) == null) {
                    return (UB) p1.L(obj, c10, x11, ub, v1Var);
                }
                obj3 = Integer.valueOf(x11);
            }
            if (eVar.d()) {
                vVar.a(eVar.f7413b, obj3);
            } else {
                int i13 = a.f7312a[eVar.a().ordinal()];
                if ((i13 == 17 || i13 == 18) && (i10 = vVar.i(eVar.f7413b)) != null) {
                    obj3 = d0.h(i10, obj3);
                }
                vVar.y(eVar.f7413b, obj3);
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public void h(l1 l1Var, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        vVar.y(eVar.f7413b, l1Var.K(eVar.b().getClass(), qVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public void i(i iVar, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        v0.a g10 = eVar.b().g();
        j F = iVar.F();
        g10.q(F, qVar);
        vVar.y(eVar.f7413b, g10.e());
        F.a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.r
    public void j(c2 c2Var, Map.Entry<?, ?> entry) {
        z.d dVar = (z.d) entry.getKey();
        if (!dVar.c()) {
            switch (a.f7312a[dVar.d().ordinal()]) {
                case 1:
                    c2Var.m(dVar.a(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    c2Var.x(dVar.a(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    c2Var.c(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    c2Var.C(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    c2Var.i(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    c2Var.u(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    c2Var.l(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    c2Var.d(dVar.a(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    c2Var.e(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    c2Var.g(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    c2Var.n(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    c2Var.H(dVar.a(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    c2Var.w(dVar.a(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    c2Var.M(dVar.a(), (i) entry.getValue());
                    return;
                case 16:
                    c2Var.A(dVar.a(), (String) entry.getValue());
                    return;
                case 17:
                    c2Var.L(dVar.a(), entry.getValue(), i1.a().c(entry.getValue().getClass()));
                    return;
                case 18:
                    c2Var.N(dVar.a(), entry.getValue(), i1.a().c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f7312a[dVar.d().ordinal()]) {
            case 1:
                p1.P(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 2:
                p1.T(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 3:
                p1.W(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 4:
                p1.e0(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 5:
            case 14:
                p1.V(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 6:
                p1.S(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 7:
                p1.R(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 8:
                p1.N(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 9:
                p1.d0(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 10:
                p1.Y(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 11:
                p1.Z(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 12:
                p1.a0(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 13:
                p1.b0(dVar.a(), (List) entry.getValue(), c2Var, dVar.f());
                return;
            case 15:
                p1.O(dVar.a(), (List) entry.getValue(), c2Var);
                return;
            case 16:
                p1.c0(dVar.a(), (List) entry.getValue(), c2Var);
                return;
            case 17:
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    return;
                }
                p1.U(dVar.a(), (List) entry.getValue(), c2Var, i1.a().c(list.get(0).getClass()));
                return;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                p1.X(dVar.a(), (List) entry.getValue(), c2Var, i1.a().c(list2.get(0).getClass()));
                return;
            default:
                return;
        }
    }
}
