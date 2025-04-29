package b5;
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final v f2985a = new a();

    /* loaded from: classes.dex */
    class a extends v {
        a() {
        }

        @Override // b5.v
        public long a() {
            return System.nanoTime();
        }
    }

    protected v() {
    }

    public static v b() {
        return f2985a;
    }

    public abstract long a();
}
