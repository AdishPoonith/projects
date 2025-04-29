package j2;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.List;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f12031a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12032b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12033c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f12034d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12035e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12036f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12037g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12038h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12039i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12040j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f12041k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || n.a()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (supportedPerformancePoints.get(i12).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f12031a = (String) p3.a.e(str);
        this.f12032b = str2;
        this.f12033c = str3;
        this.f12034d = codecCapabilities;
        this.f12038h = z10;
        this.f12039i = z11;
        this.f12040j = z12;
        this.f12035e = z13;
        this.f12036f = z14;
        this.f12037g = z15;
        this.f12041k = p3.v.s(str2);
    }

    private static boolean A(String str) {
        return n0.f15400d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (n0.f15397a <= 22) {
            String str2 = n0.f15400d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean C() {
        String str = n0.f15398b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = n0.f15400d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    private static boolean D(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = n0.f15398b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(n0.f15398b)) ? false : true;
    }

    public static n F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)));
    }

    static /* synthetic */ boolean a() {
        return C();
    }

    private static int b(String str, String str2, int i10) {
        if (i10 > 1 || ((n0.f15397a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        p3.r.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n0.l(i10, widthAlignment) * widthAlignment, n0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point d11 = d(videoCapabilities, i10, i11);
        int i12 = d11.x;
        int i13 = d11.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f15397a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(n1 n1Var, boolean z10) {
        Pair<Integer, Integer> q10 = v.q(n1Var);
        if (q10 == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(n1Var.f17419u)) {
            if ("video/avc".equals(this.f12032b)) {
                intValue = 8;
            } else {
                intValue = "video/hevc".equals(this.f12032b) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (this.f12041k || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] h10 = h();
            if (n0.f15397a <= 23 && "video/x-vnd.on2.vp9".equals(this.f12032b) && h10.length == 0) {
                h10 = g(this.f12034d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h10) {
                if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z10) && !D(this.f12032b, intValue))) {
                    return true;
                }
            }
            y("codec.profileLevel, " + n1Var.f17416r + ", " + this.f12033c);
            return false;
        }
        return true;
    }

    private boolean q(n1 n1Var) {
        return this.f12032b.equals(n1Var.f17419u) || this.f12032b.equals(v.m(n1Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f15397a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return n0.f15397a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        p3.r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f12031a + ", " + this.f12032b + "] [" + n0.f15401e + "]");
    }

    private void y(String str) {
        p3.r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f12031a + ", " + this.f12032b + "] [" + n0.f15401e + "]");
    }

    private static boolean z(String str) {
        return "audio/opus".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12034d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i10, i11);
    }

    public v1.i f(n1 n1Var, n1 n1Var2) {
        int i10 = !n0.c(n1Var.f17419u, n1Var2.f17419u) ? 8 : 0;
        if (this.f12041k) {
            if (n1Var.C != n1Var2.C) {
                i10 |= 1024;
            }
            if (!this.f12035e && (n1Var.f17424z != n1Var2.f17424z || n1Var.A != n1Var2.A)) {
                i10 |= 512;
            }
            if (!n0.c(n1Var.G, n1Var2.G)) {
                i10 |= 2048;
            }
            if (A(this.f12031a) && !n1Var.g(n1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new v1.i(this.f12031a, n1Var, n1Var2, n1Var.g(n1Var2) ? 3 : 2, 0);
            }
        } else {
            if (n1Var.H != n1Var2.H) {
                i10 |= 4096;
            }
            if (n1Var.I != n1Var2.I) {
                i10 |= 8192;
            }
            if (n1Var.J != n1Var2.J) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f12032b)) {
                Pair<Integer, Integer> q10 = v.q(n1Var);
                Pair<Integer, Integer> q11 = v.q(n1Var2);
                if (q10 != null && q11 != null) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new v1.i(this.f12031a, n1Var, n1Var2, 3, 0);
                    }
                }
            }
            if (!n1Var.g(n1Var2)) {
                i10 |= 32;
            }
            if (z(this.f12032b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new v1.i(this.f12031a, n1Var, n1Var2, 1, 0);
            }
        }
        return new v1.i(this.f12031a, n1Var, n1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12034d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12034d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (b(this.f12031a, this.f12032b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                return true;
            } else {
                str = "channelCount.support, " + i10;
            }
        }
        y(str);
        return false;
    }

    public boolean l(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12034d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i10)) {
                return true;
            } else {
                str = "sampleRate.support, " + i10;
            }
        }
        y(str);
        return false;
    }

    public boolean n(n1 n1Var) {
        return q(n1Var) && m(n1Var, false);
    }

    public boolean o(n1 n1Var) {
        int i10;
        if (q(n1Var) && m(n1Var, true)) {
            if (!this.f12041k) {
                if (n0.f15397a >= 21) {
                    int i11 = n1Var.I;
                    if (i11 != -1 && !l(i11)) {
                        return false;
                    }
                    int i12 = n1Var.H;
                    if (i12 != -1 && !k(i12)) {
                        return false;
                    }
                }
                return true;
            }
            int i13 = n1Var.f17424z;
            if (i13 <= 0 || (i10 = n1Var.A) <= 0) {
                return true;
            }
            if (n0.f15397a >= 21) {
                return w(i13, i10, n1Var.B);
            }
            boolean z10 = i13 * i10 <= v.N();
            if (!z10) {
                y("legacyFrameSize, " + n1Var.f17424z + "x" + n1Var.A);
            }
            return z10;
        }
        return false;
    }

    public boolean p() {
        if (n0.f15397a >= 29 && "video/x-vnd.on2.vp9".equals(this.f12032b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(n1 n1Var) {
        if (this.f12041k) {
            return this.f12035e;
        }
        Pair<Integer, Integer> q10 = v.q(n1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f12031a;
    }

    public boolean w(int i10, int i11, double d10) {
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12034d;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (n0.f15397a >= 29) {
                    int a10 = a.a(videoCapabilities, i10, i11, d10);
                    if (a10 == 2) {
                        return true;
                    }
                    if (a10 == 1) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb.append(str);
                        sb.append(i10);
                        sb.append("x");
                        sb.append(i11);
                        sb.append("@");
                        sb.append(d10);
                        sb2 = sb.toString();
                    }
                }
                if (!e(videoCapabilities, i10, i11, d10)) {
                    if (i10 < i11 && E(this.f12031a) && e(videoCapabilities, i11, i10, d10)) {
                        x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
                    } else {
                        sb = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i10);
                        sb.append("x");
                        sb.append(i11);
                        sb.append("@");
                        sb.append(d10);
                        sb2 = sb.toString();
                    }
                }
                return true;
            }
            sb2 = "sizeAndRate.vCaps";
        }
        y(sb2);
        return false;
    }
}
