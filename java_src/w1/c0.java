package w1;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import w1.h;
/* loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return p3.n0.U(p3.n0.V(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    public static int a(Exception exc, int i10) {
        int i11 = p3.n0.f15397a;
        if (i11 < 21 || !b.a(exc)) {
            if (i11 < 23 || !c.a(exc)) {
                if (i11 < 18 || !a.b(exc)) {
                    if (i11 < 18 || !a.a(exc)) {
                        if (exc instanceof p0) {
                            return 6001;
                        }
                        if (exc instanceof h.e) {
                            return 6003;
                        }
                        if (exc instanceof m0) {
                            return 6008;
                        }
                        if (i10 == 1) {
                            return 6006;
                        }
                        if (i10 == 2) {
                            return 6004;
                        }
                        if (i10 == 3) {
                            return 6002;
                        }
                        throw new IllegalArgumentException();
                    }
                    return 6007;
                }
                return 6002;
            }
            return 6006;
        }
        return b.b(exc);
    }
}
