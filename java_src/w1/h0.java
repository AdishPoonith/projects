package w1;

import java.util.UUID;
/* loaded from: classes.dex */
public final class h0 implements v1.b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f19702d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f19703a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19704b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19705c;

    static {
        boolean z10;
        if ("Amazon".equals(p3.n0.f15399c)) {
            String str = p3.n0.f15400d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f19702d = z10;
            }
        }
        z10 = false;
        f19702d = z10;
    }

    public h0(UUID uuid, byte[] bArr, boolean z10) {
        this.f19703a = uuid;
        this.f19704b = bArr;
        this.f19705c = z10;
    }
}
