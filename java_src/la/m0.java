package la;
/* loaded from: classes.dex */
public enum m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13648a;

        static {
            int[] iArr = new int[m0.values().length];
            iArr[m0.DEFAULT.ordinal()] = 1;
            iArr[m0.ATOMIC.ordinal()] = 2;
            iArr[m0.UNDISPATCHED.ordinal()] = 3;
            iArr[m0.LAZY.ordinal()] = 4;
            f13648a = iArr;
        }
    }

    public final <R, T> void g(da.p<? super R, ? super v9.d<? super T>, ? extends Object> pVar, R r10, v9.d<? super T> dVar) {
        int i10 = a.f13648a[ordinal()];
        if (i10 == 1) {
            qa.a.d(pVar, r10, dVar, null, 4, null);
        } else if (i10 == 2) {
            v9.f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            qa.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new s9.l();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
