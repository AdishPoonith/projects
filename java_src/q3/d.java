package q3;

import p3.a0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f16033a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16034b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16035c;

    private d(int i10, int i11, String str) {
        this.f16033a = i10;
        this.f16034b = i11;
        this.f16035c = str;
    }

    public static d a(a0 a0Var) {
        String str;
        a0Var.U(2);
        int G = a0Var.G();
        int i10 = G >> 1;
        int G2 = ((a0Var.G() >> 3) & 31) | ((G & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(G2 >= 10 ? "." : ".0");
        sb.append(G2);
        return new d(i10, G2, sb.toString());
    }
}
