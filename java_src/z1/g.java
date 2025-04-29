package z1;

import com.google.common.collect.q;
import p3.a0;
import p3.n0;
import p3.r;
import s1.n1;
/* loaded from: classes.dex */
final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final n1 f20718a;

    public g(n1 n1Var) {
        this.f20718a = n1Var;
    }

    private static String b(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 85) {
                if (i10 != 255) {
                    if (i10 != 8192) {
                        if (i10 != 8193) {
                            return null;
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/ac3";
                }
                return "audio/mp4a-latm";
            }
            return "audio/mpeg";
        }
        return "audio/raw";
    }

    private static a d(a0 a0Var) {
        a0Var.U(4);
        int t10 = a0Var.t();
        int t11 = a0Var.t();
        a0Var.U(4);
        int t12 = a0Var.t();
        String b10 = b(t12);
        if (b10 != null) {
            n1.b bVar = new n1.b();
            bVar.n0(t10).S(t11).g0(b10);
            return new g(bVar.G());
        }
        r.i("StreamFormatChunk", "Ignoring track with unsupported compression " + t12);
        return null;
    }

    public static a e(int i10, a0 a0Var) {
        if (i10 == 2) {
            return d(a0Var);
        }
        if (i10 == 1) {
            return f(a0Var);
        }
        r.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n0.k0(i10));
        return null;
    }

    private static a f(a0 a0Var) {
        int y10 = a0Var.y();
        String c10 = c(y10);
        if (c10 == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + y10);
            return null;
        }
        int y11 = a0Var.y();
        int t10 = a0Var.t();
        a0Var.U(6);
        int b02 = n0.b0(a0Var.M());
        int y12 = a0Var.y();
        byte[] bArr = new byte[y12];
        a0Var.l(bArr, 0, y12);
        n1.b bVar = new n1.b();
        bVar.g0(c10).J(y11).h0(t10);
        if ("audio/raw".equals(c10) && b02 != 0) {
            bVar.a0(b02);
        }
        if ("audio/mp4a-latm".equals(c10) && y12 > 0) {
            bVar.V(q.A(bArr));
        }
        return new g(bVar.G());
    }

    @Override // z1.a
    public int a() {
        return 1718776947;
    }
}
