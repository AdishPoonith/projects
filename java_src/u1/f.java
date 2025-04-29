package u1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.google.common.collect.q;
import com.google.common.collect.r;
import com.google.common.collect.s0;
import java.util.Arrays;
import s1.n1;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f18587c = new f(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final f f18588d = new f(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    private static final com.google.common.collect.r<Integer, Integer> f18589e = new r.a().f(5, 6).f(17, 6).f(7, 6).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f18590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18591b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AudioAttributes f18592a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int[] a() {
            q.a t10 = com.google.common.collect.q.t();
            s0 it = f.f18589e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f18592a)) {
                    t10.a(Integer.valueOf(intValue));
                }
            }
            t10.a(2);
            return e5.e.k(t10.h());
        }

        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(p3.n0.G(i12)).build(), f18592a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f18590a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f18590a = new int[0];
        }
        this.f18591b = i10;
    }

    private static boolean b() {
        if (p3.n0.f15397a >= 17) {
            String str = p3.n0.f15399c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static f d(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f18588d : (p3.n0.f15397a < 29 || !(p3.n0.w0(context) || p3.n0.r0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f18587c : new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new f(a.a(), 8);
    }

    private static int e(int i10) {
        int i11 = p3.n0.f15397a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(p3.n0.f15398b) && i10 == 1) {
            i10 = 2;
        }
        return p3.n0.G(i10);
    }

    private static int g(int i10, int i11) {
        return p3.n0.f15397a >= 29 ? a.b(i10, i11) : ((Integer) p3.a.e(f18589e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Arrays.equals(this.f18590a, fVar.f18590a) && this.f18591b == fVar.f18591b;
        }
        return false;
    }

    public Pair<Integer, Integer> f(n1 n1Var) {
        int f10 = p3.v.f((String) p3.a.e(n1Var.f17419u), n1Var.f17416r);
        if (f18589e.containsKey(Integer.valueOf(f10))) {
            if (f10 == 18 && !i(18)) {
                f10 = 6;
            } else if (f10 == 8 && !i(8)) {
                f10 = 7;
            }
            if (i(f10)) {
                int i10 = n1Var.H;
                if (i10 == -1 || f10 == 18) {
                    int i11 = n1Var.I;
                    if (i11 == -1) {
                        i11 = 48000;
                    }
                    i10 = g(f10, i11);
                } else if (i10 > this.f18591b) {
                    return null;
                }
                int e10 = e(i10);
                if (e10 == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(f10), Integer.valueOf(e10));
            }
            return null;
        }
        return null;
    }

    public boolean h(n1 n1Var) {
        return f(n1Var) != null;
    }

    public int hashCode() {
        return this.f18591b + (Arrays.hashCode(this.f18590a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f18590a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f18591b + ", supportedEncodings=" + Arrays.toString(this.f18590a) + "]";
    }
}
