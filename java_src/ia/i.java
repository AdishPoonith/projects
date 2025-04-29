package ia;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final i f10113j = new i("PUBLIC", 0);

    /* renamed from: k  reason: collision with root package name */
    public static final i f10114k = new i("PROTECTED", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final i f10115l = new i("INTERNAL", 2);

    /* renamed from: m  reason: collision with root package name */
    public static final i f10116m = new i("PRIVATE", 3);

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ i[] f10117n;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ x9.a f10118o;

    static {
        i[] b10 = b();
        f10117n = b10;
        f10118o = x9.b.a(b10);
    }

    private i(String str, int i10) {
    }

    private static final /* synthetic */ i[] b() {
        return new i[]{f10113j, f10114k, f10115l, f10116m};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10117n.clone();
    }
}
