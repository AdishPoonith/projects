package k6;

import com.google.protobuf.t1;
import d7.b0;
import d7.s;
import java.util.Map;
import m6.u;
import m6.y;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12590a = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12591a;

        static {
            int[] iArr = new int[b0.c.values().length];
            f12591a = iArr;
            try {
                iArr[b0.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12591a[b0.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12591a[b0.c.DOUBLE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12591a[b0.c.INTEGER_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12591a[b0.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12591a[b0.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12591a[b0.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12591a[b0.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12591a[b0.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12591a[b0.c.MAP_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12591a[b0.c.ARRAY_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private c() {
    }

    private void a(d7.b bVar, b bVar2) {
        i(bVar2, 50);
        for (b0 b0Var : bVar.o()) {
            f(b0Var, bVar2);
        }
    }

    private void b(String str, b bVar) {
        i(bVar, 37);
        u v10 = u.v(str);
        int q10 = v10.q();
        for (int i10 = 5; i10 < q10; i10++) {
            String n10 = v10.n(i10);
            i(bVar, 60);
            h(n10, bVar);
        }
    }

    private void c(s sVar, b bVar) {
        i(bVar, 55);
        for (Map.Entry<String, b0> entry : sVar.i0().entrySet()) {
            d(entry.getKey(), bVar);
            f(entry.getValue(), bVar);
        }
    }

    private void d(String str, b bVar) {
        i(bVar, 25);
        h(str, bVar);
    }

    private void f(b0 b0Var, b bVar) {
        int i10;
        long j10;
        double d10;
        switch (a.f12591a[b0Var.B0().ordinal()]) {
            case 1:
                i10 = 5;
                i(bVar, i10);
                return;
            case 2:
                i(bVar, 10);
                j10 = b0Var.r0() ? 1L : 0L;
                bVar.d(j10);
                return;
            case 3:
                double u02 = b0Var.u0();
                if (Double.isNaN(u02)) {
                    i10 = 13;
                    i(bVar, i10);
                    return;
                }
                i(bVar, 15);
                if (u02 != -0.0d) {
                    bVar.b(u02);
                    return;
                }
                d10 = 0.0d;
                bVar.b(d10);
                return;
            case 4:
                i(bVar, 15);
                d10 = b0Var.w0();
                bVar.b(d10);
                return;
            case 5:
                t1 A0 = b0Var.A0();
                i(bVar, 20);
                bVar.d(A0.j0());
                j10 = A0.i0();
                bVar.d(j10);
                return;
            case 6:
                d(b0Var.z0(), bVar);
                g(bVar);
                return;
            case 7:
                i(bVar, 30);
                bVar.a(b0Var.s0());
                g(bVar);
                return;
            case 8:
                b(b0Var.y0(), bVar);
                return;
            case 9:
                h7.a v02 = b0Var.v0();
                i(bVar, 45);
                bVar.b(v02.i0());
                d10 = v02.j0();
                bVar.b(d10);
                return;
            case 10:
                if (y.x(b0Var)) {
                    i10 = Integer.MAX_VALUE;
                    i(bVar, i10);
                    return;
                }
                c(b0Var.x0(), bVar);
                g(bVar);
                return;
            case 11:
                a(b0Var.q0(), bVar);
                g(bVar);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type " + b0Var.B0());
        }
    }

    private void g(b bVar) {
        bVar.d(2L);
    }

    private void h(String str, b bVar) {
        bVar.e(str);
    }

    private void i(b bVar, int i10) {
        bVar.d(i10);
    }

    public void e(b0 b0Var, b bVar) {
        f(b0Var, bVar);
        bVar.c();
    }
}
