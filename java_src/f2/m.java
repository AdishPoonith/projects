package f2;

import java.util.ArrayList;
import java.util.List;
import k2.a;
import q2.c;
import s1.u2;
import x1.a0;
/* loaded from: classes.dex */
final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final b5.q f8728d = b5.q.d(':');

    /* renamed from: e  reason: collision with root package name */
    private static final b5.q f8729e = b5.q.d('*');

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f8730a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f8731b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f8732c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8733a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8734b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8735c;

        public a(int i10, long j10, int i11) {
            this.f8733a = i10;
            this.f8734b = j10;
            this.f8735c = i11;
        }
    }

    private void a(x1.m mVar, a0 a0Var) {
        p3.a0 a0Var2 = new p3.a0(8);
        mVar.readFully(a0Var2.e(), 0, 8);
        this.f8732c = a0Var2.t() + 8;
        if (a0Var2.p() != 1397048916) {
            a0Var.f20102a = 0L;
            return;
        }
        a0Var.f20102a = mVar.p() - (this.f8732c - 12);
        this.f8731b = 2;
    }

    private static int b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw u2.a("Invalid SEF name", null);
        }
    }

    private void d(x1.m mVar, a0 a0Var) {
        long j10;
        long a10 = mVar.a();
        int i10 = (this.f8732c - 12) - 8;
        p3.a0 a0Var2 = new p3.a0(i10);
        mVar.readFully(a0Var2.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            a0Var2.U(2);
            short v10 = a0Var2.v();
            if (v10 == 2192 || v10 == 2816 || v10 == 2817 || v10 == 2819 || v10 == 2820) {
                this.f8730a.add(new a(v10, (a10 - this.f8732c) - a0Var2.t(), a0Var2.t()));
            } else {
                a0Var2.U(8);
            }
        }
        if (this.f8730a.isEmpty()) {
            j10 = 0;
        } else {
            this.f8731b = 3;
            j10 = this.f8730a.get(0).f8734b;
        }
        a0Var.f20102a = j10;
    }

    private void e(x1.m mVar, List<a.b> list) {
        long p10 = mVar.p();
        int a10 = (int) ((mVar.a() - mVar.p()) - this.f8732c);
        p3.a0 a0Var = new p3.a0(a10);
        mVar.readFully(a0Var.e(), 0, a10);
        for (int i10 = 0; i10 < this.f8730a.size(); i10++) {
            a aVar = this.f8730a.get(i10);
            a0Var.T((int) (aVar.f8734b - p10));
            a0Var.U(4);
            int t10 = a0Var.t();
            int b10 = b(a0Var.D(t10));
            int i11 = aVar.f8735c - (t10 + 8);
            if (b10 == 2192) {
                list.add(f(a0Var, i11));
            } else if (b10 != 2816 && b10 != 2817 && b10 != 2819 && b10 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static q2.c f(p3.a0 a0Var, int i10) {
        ArrayList arrayList = new ArrayList();
        List<String> f10 = f8729e.f(a0Var.D(i10));
        for (int i11 = 0; i11 < f10.size(); i11++) {
            List<String> f11 = f8728d.f(f10.get(i11));
            if (f11.size() != 3) {
                throw u2.a(null, null);
            }
            try {
                arrayList.add(new c.b(Long.parseLong(f11.get(0)), Long.parseLong(f11.get(1)), 1 << (Integer.parseInt(f11.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw u2.a(null, e10);
            }
        }
        return new q2.c(arrayList);
    }

    public int c(x1.m mVar, a0 a0Var, List<a.b> list) {
        int i10 = this.f8731b;
        long j10 = 0;
        if (i10 == 0) {
            long a10 = mVar.a();
            if (a10 != -1 && a10 >= 8) {
                j10 = a10 - 8;
            }
            a0Var.f20102a = j10;
            this.f8731b = 1;
        } else if (i10 == 1) {
            a(mVar, a0Var);
        } else if (i10 == 2) {
            d(mVar, a0Var);
        } else if (i10 != 3) {
            throw new IllegalStateException();
        } else {
            e(mVar, list);
            a0Var.f20102a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f8730a.clear();
        this.f8731b = 0;
    }
}
