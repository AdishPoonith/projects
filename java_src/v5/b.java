package v5;

import g5.x;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f19429a;

    private b(a aVar) {
        this.f19429a = aVar;
    }

    public static b a(byte[] bArr, x xVar) {
        Objects.requireNonNull(xVar, "SecretKeyAccess required");
        return new b(a.a(bArr));
    }

    public int b() {
        return this.f19429a.c();
    }
}
