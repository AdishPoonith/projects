package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ph  reason: invalid package */
/* loaded from: classes.dex */
final class ph implements wt {

    /* renamed from: a  reason: collision with root package name */
    private final String f5190a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5191b;

    /* renamed from: c  reason: collision with root package name */
    private uo f5192c;

    /* renamed from: d  reason: collision with root package name */
    private vn f5193d;

    /* renamed from: e  reason: collision with root package name */
    private int f5194e;

    /* renamed from: f  reason: collision with root package name */
    private hp f5195f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ph(as asVar) {
        String H = asVar.H();
        this.f5190a = H;
        if (H.equals(jb.f4809b)) {
            try {
                xo F = xo.F(asVar.G(), e5.a());
                this.f5192c = (uo) gb.c(asVar);
                this.f5191b = F.C();
            } catch (z5 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (H.equals(jb.f4808a)) {
            try {
                yn E = yn.E(asVar.G(), e5.a());
                this.f5193d = (vn) gb.c(asVar);
                this.f5194e = E.F().C();
                this.f5191b = this.f5194e + E.G().C();
            } catch (z5 e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (!H.equals(yg.f5712a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(H)));
        } else {
            try {
                kp F2 = kp.F(asVar.G(), e5.a());
                this.f5195f = (hp) gb.c(asVar);
                this.f5191b = F2.C();
            } catch (z5 e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wt
    public final li a(byte[] bArr) {
        if (bArr.length == this.f5191b) {
            if (this.f5190a.equals(jb.f4809b)) {
                to D = uo.D();
                D.i(this.f5192c);
                D.r(m4.w(bArr, 0, this.f5191b));
                return new li((s9) gb.f(this.f5190a, (uo) D.j(), s9.class));
            } else if (!this.f5190a.equals(jb.f4808a)) {
                if (this.f5190a.equals(yg.f5712a)) {
                    gp D2 = hp.D();
                    D2.i(this.f5195f);
                    D2.r(m4.w(bArr, 0, this.f5191b));
                    return new li((x9) gb.f(this.f5190a, (hp) D2.j(), x9.class));
                }
                throw new GeneralSecurityException("unknown DEM key type");
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f5194e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f5194e, this.f5191b);
                ao D3 = bo.D();
                D3.i(this.f5193d.G());
                m4 m4Var = m4.f4993k;
                D3.r(m4.w(copyOfRange, 0, copyOfRange.length));
                uq D4 = vq.D();
                D4.i(this.f5193d.H());
                D4.r(m4.w(copyOfRange2, 0, copyOfRange2.length));
                un D5 = vn.D();
                D5.t(this.f5193d.C());
                D5.r((bo) D3.j());
                D5.s((vq) D4.j());
                return new li((s9) gb.f(this.f5190a, (vn) D5.j(), s9.class));
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wt
    public final int zza() {
        return this.f5191b;
    }
}
