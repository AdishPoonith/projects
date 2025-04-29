package j2;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public class m extends v1.f {

    /* renamed from: j  reason: collision with root package name */
    public final n f12029j;

    /* renamed from: k  reason: collision with root package name */
    public final String f12030k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(java.lang.Throwable r4, j2.n r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f12031a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f12029j = r5
            int r5 = p3.n0.f15397a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = a(r4)
        L27:
            r3.f12030k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.m.<init>(java.lang.Throwable, j2.n):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
