package j6;
/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private int f12203a;

    /* renamed from: b  reason: collision with root package name */
    private int f12204b;

    h1(int i10, int i11) {
        q6.b.d((i10 & 1) == i10, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i10), 1);
        this.f12204b = i10;
        d(i11);
    }

    public static h1 a() {
        return new h1(1, 1);
    }

    public static h1 b(int i10) {
        h1 h1Var = new h1(0, i10);
        h1Var.c();
        return h1Var;
    }

    private void d(int i10) {
        q6.b.d((i10 & 1) == this.f12204b, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f12203a = i10;
    }

    public int c() {
        int i10 = this.f12203a;
        this.f12203a = i10 + 2;
        return i10;
    }
}
