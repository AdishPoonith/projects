package p5;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p5.c;
/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    private final c f15495a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.b f15496b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f15497c;

    private a(c cVar, v5.b bVar, Integer num) {
        this.f15495a = cVar;
        this.f15496b = bVar;
        this.f15497c = num;
    }

    public static a d(c cVar, v5.b bVar, Integer num) {
        if (bVar.b() == 32) {
            if (cVar.e() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (cVar.e() || num == null) {
                return new a(cVar, bVar, num);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        throw new GeneralSecurityException("Invalid key size");
    }

    @Override // p5.k
    public v5.a b() {
        if (this.f15495a.d() == c.a.f15504e) {
            return v5.a.a(new byte[0]);
        }
        if (this.f15495a.d() == c.a.f15503d || this.f15495a.d() == c.a.f15502c) {
            return v5.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f15497c.intValue()).array());
        }
        if (this.f15495a.d() == c.a.f15501b) {
            return v5.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f15497c.intValue()).array());
        }
        throw new IllegalStateException("Unknown AesCmacParameters.Variant: " + this.f15495a.d());
    }

    @Override // p5.k
    /* renamed from: e */
    public c c() {
        return this.f15495a;
    }
}
