package o3;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: m  reason: collision with root package name */
    public final int f14414m;

    /* renamed from: n  reason: collision with root package name */
    public final String f14415n;

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, List<String>> f14416o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f14417p;

    public c0(int i10, String str, IOException iOException, Map<String, List<String>> map, p pVar, byte[] bArr) {
        super("Response code: " + i10, iOException, pVar, 2004, 1);
        this.f14414m = i10;
        this.f14415n = str;
        this.f14416o = map;
        this.f14417p = bArr;
    }
}
