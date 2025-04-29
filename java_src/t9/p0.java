package t9;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class p0 {

    /* renamed from: j  reason: collision with root package name */
    public static final p0 f18401j = new p0("Ready", 0);

    /* renamed from: k  reason: collision with root package name */
    public static final p0 f18402k = new p0("NotReady", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final p0 f18403l = new p0("Done", 2);

    /* renamed from: m  reason: collision with root package name */
    public static final p0 f18404m = new p0("Failed", 3);

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ p0[] f18405n;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ x9.a f18406o;

    static {
        p0[] b10 = b();
        f18405n = b10;
        f18406o = x9.b.a(b10);
    }

    private p0(String str, int i10) {
    }

    private static final /* synthetic */ p0[] b() {
        return new p0[]{f18401j, f18402k, f18403l, f18404m};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f18405n.clone();
    }
}
