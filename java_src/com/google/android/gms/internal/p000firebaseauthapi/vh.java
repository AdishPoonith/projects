package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vh  reason: invalid package */
/* loaded from: classes.dex */
final class vh implements y9 {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f5531f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final zh f5532a;

    /* renamed from: b  reason: collision with root package name */
    private final yh f5533b;

    /* renamed from: c  reason: collision with root package name */
    private final th f5534c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5535d;

    /* renamed from: e  reason: collision with root package name */
    private final sh f5536e;

    private vh(zh zhVar, yh yhVar, sh shVar, th thVar, int i10) {
        this.f5532a = zhVar;
        this.f5533b = yhVar;
        this.f5536e = shVar;
        this.f5534c = thVar;
        this.f5535d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vh b(nr nrVar) {
        int i10;
        zh a10;
        if (nrVar.L()) {
            if (nrVar.G().M()) {
                if (nrVar.H().y()) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                kr D = nrVar.G().D();
                yh b10 = ai.b(D);
                sh c10 = ai.c(D);
                th a11 = ai.a(D);
                int H = D.H();
                int i11 = H - 2;
                if (i11 == 1) {
                    i10 = 32;
                } else if (i11 == 2) {
                    i10 = 65;
                } else if (i11 == 3) {
                    i10 = 97;
                } else if (i11 != 4) {
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(dr.a(H)));
                } else {
                    i10 = 133;
                }
                int H2 = nrVar.G().D().H() - 2;
                if (H2 == 1) {
                    a10 = ki.a(nrVar.H().z());
                } else if (H2 != 2 && H2 != 3 && H2 != 4) {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                } else {
                    a10 = ii.a(nrVar.H().z(), nrVar.G().I().z(), gi.g(nrVar.G().D().H()));
                }
                return new vh(a10, b10, c10, a11, i10);
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f5535d;
        if (length >= i10) {
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f5535d, length);
            zh zhVar = this.f5532a;
            yh yhVar = this.f5533b;
            sh shVar = this.f5536e;
            th thVar = this.f5534c;
            return uh.b(copyOf, yhVar.a(copyOf, zhVar), yhVar, shVar, thVar, new byte[0]).a(copyOfRange, f5531f);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
