package w9;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f20064j = new a("COROUTINE_SUSPENDED", 0);

    /* renamed from: k  reason: collision with root package name */
    public static final a f20065k = new a("UNDECIDED", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f20066l = new a("RESUMED", 2);

    /* renamed from: m  reason: collision with root package name */
    private static final /* synthetic */ a[] f20067m;

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ x9.a f20068n;

    static {
        a[] b10 = b();
        f20067m = b10;
        f20068n = x9.b.a(b10);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{f20064j, f20065k, f20066l};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20067m.clone();
    }
}
