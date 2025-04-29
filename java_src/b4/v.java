package b4;

import android.os.RemoteException;
import android.util.Log;
import c4.u1;
import c4.w0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes.dex */
abstract class v extends u1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2924a;

    /* JADX INFO: Access modifiers changed from: protected */
    public v(byte[] bArr) {
        c4.s.a(bArr.length == 25);
        this.f2924a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] x(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract byte[] M();

    public final boolean equals(Object obj) {
        k4.b zzd;
        if (obj != null && (obj instanceof w0)) {
            try {
                w0 w0Var = (w0) obj;
                if (w0Var.zzc() == this.f2924a && (zzd = w0Var.zzd()) != null) {
                    return Arrays.equals(M(), (byte[]) k4.d.M(zzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2924a;
    }

    @Override // c4.w0
    public final int zzc() {
        return this.f2924a;
    }

    @Override // c4.w0
    public final k4.b zzd() {
        return k4.d.H2(M());
    }
}
