package z2;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o3.p0;
/* loaded from: classes.dex */
class a implements o3.l {

    /* renamed from: a  reason: collision with root package name */
    private final o3.l f20720a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f20721b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f20722c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f20723d;

    public a(o3.l lVar, byte[] bArr, byte[] bArr2) {
        this.f20720a = lVar;
        this.f20721b = bArr;
        this.f20722c = bArr2;
    }

    @Override // o3.l
    public void close() {
        if (this.f20723d != null) {
            this.f20723d = null;
            this.f20720a.close();
        }
    }

    @Override // o3.l
    public final Map<String, List<String>> e() {
        return this.f20720a.e();
    }

    @Override // o3.l
    public final void h(p0 p0Var) {
        p3.a.e(p0Var);
        this.f20720a.h(p0Var);
    }

    @Override // o3.l
    public final Uri j() {
        return this.f20720a.j();
    }

    @Override // o3.l
    public final long m(o3.p pVar) {
        try {
            Cipher q10 = q();
            try {
                q10.init(2, new SecretKeySpec(this.f20721b, "AES"), new IvParameterSpec(this.f20722c));
                o3.n nVar = new o3.n(this.f20720a, pVar);
                this.f20723d = new CipherInputStream(nVar, q10);
                nVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    protected Cipher q() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // o3.i
    public final int read(byte[] bArr, int i10, int i11) {
        p3.a.e(this.f20723d);
        int read = this.f20723d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
