package r6;
/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f16720j;

        a(int i10) {
            this.f16720j = i10;
        }

        public int b() {
            return this.f16720j;
        }
    }

    a b(String str);
}
