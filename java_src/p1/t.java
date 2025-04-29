package p1;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum t {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);
    

    /* renamed from: j  reason: collision with root package name */
    private final boolean f15215j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f15216k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15217l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f15218m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f15219n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f15220o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f15221p;

    t(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f15215j = z10;
        this.f15216k = z11;
        this.f15217l = z12;
        this.f15218m = z13;
        this.f15219n = z14;
        this.f15220o = z15;
        this.f15221p = z16;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static t[] valuesCustom() {
        t[] valuesCustom = values();
        return (t[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean g() {
        return this.f15219n;
    }

    public final boolean h() {
        return this.f15218m;
    }

    public final boolean i() {
        return this.f15215j;
    }

    public final boolean k() {
        return this.f15221p;
    }

    public final boolean l() {
        return this.f15216k;
    }

    public final boolean n() {
        return this.f15217l;
    }
}
