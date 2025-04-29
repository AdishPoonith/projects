package o3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class a0 extends m {

    /* renamed from: k  reason: collision with root package name */
    public final p f14406k;

    /* renamed from: l  reason: collision with root package name */
    public final int f14407l;

    public a0(IOException iOException, p pVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f14406k = pVar;
        this.f14407l = i11;
    }

    public a0(String str, IOException iOException, p pVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f14406k = pVar;
        this.f14407l = i11;
    }

    public a0(String str, p pVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f14406k = pVar;
        this.f14407l = i11;
    }

    public a0(p pVar, int i10, int i11) {
        super(b(i10, i11));
        this.f14406k = pVar;
        this.f14407l = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static a0 c(IOException iOException, p pVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !b5.b.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new z(iOException, pVar) : new a0(iOException, pVar, i11, i10);
    }
}
