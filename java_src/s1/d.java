package s1;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import s1.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f17150a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17151b;

    /* renamed from: c  reason: collision with root package name */
    private b f17152c;

    /* renamed from: d  reason: collision with root package name */
    private u1.e f17153d;

    /* renamed from: f  reason: collision with root package name */
    private int f17155f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f17157h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17158i;

    /* renamed from: g  reason: collision with root package name */
    private float f17156g = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private int f17154e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f17159a;

        public a(Handler handler) {
            this.f17159a = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            d.this.h(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f17159a.post(new Runnable() { // from class: s1.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.b(i10);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void G(float f10);

        void a(int i10);
    }

    public d(Context context, Handler handler, b bVar) {
        this.f17150a = (AudioManager) p3.a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f17152c = bVar;
        this.f17151b = new a(handler);
    }

    private void a() {
        this.f17150a.abandonAudioFocus(this.f17151b);
    }

    private void b() {
        if (this.f17154e == 0) {
            return;
        }
        if (p3.n0.f15397a >= 26) {
            c();
        } else {
            a();
        }
        n(0);
    }

    private void c() {
        AudioFocusRequest audioFocusRequest = this.f17157h;
        if (audioFocusRequest != null) {
            this.f17150a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int e(u1.e eVar) {
        if (eVar == null) {
            return 0;
        }
        switch (eVar.f18574l) {
            case 0:
                p3.r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (eVar.f18572j == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                p3.r.i("AudioFocusManager", "Unidentified audio usage: " + eVar.f18574l);
                return 0;
            case 16:
                return p3.n0.f15397a >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void f(int i10) {
        b bVar = this.f17152c;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        int i11;
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || q()) {
                f(0);
                i11 = 2;
            } else {
                i11 = 3;
            }
            n(i11);
        } else if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            n(1);
            f(1);
        } else {
            p3.r.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f17154e == 1) {
            return 1;
        }
        if ((p3.n0.f15397a >= 26 ? l() : k()) == 1) {
            n(1);
            return 1;
        }
        n(0);
        return -1;
    }

    private int k() {
        return this.f17150a.requestAudioFocus(this.f17151b, p3.n0.f0(((u1.e) p3.a.e(this.f17153d)).f18574l), this.f17155f);
    }

    private int l() {
        AudioFocusRequest audioFocusRequest = this.f17157h;
        if (audioFocusRequest == null || this.f17158i) {
            this.f17157h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f17155f) : new AudioFocusRequest.Builder(this.f17157h)).setAudioAttributes(((u1.e) p3.a.e(this.f17153d)).b().f18578a).setWillPauseWhenDucked(q()).setOnAudioFocusChangeListener(this.f17151b).build();
            this.f17158i = false;
        }
        return this.f17150a.requestAudioFocus(this.f17157h);
    }

    private void n(int i10) {
        if (this.f17154e == i10) {
            return;
        }
        this.f17154e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f17156g == f10) {
            return;
        }
        this.f17156g = f10;
        b bVar = this.f17152c;
        if (bVar != null) {
            bVar.G(f10);
        }
    }

    private boolean o(int i10) {
        return i10 == 1 || this.f17155f != 1;
    }

    private boolean q() {
        u1.e eVar = this.f17153d;
        return eVar != null && eVar.f18572j == 1;
    }

    public float g() {
        return this.f17156g;
    }

    public void i() {
        this.f17152c = null;
        b();
    }

    public void m(u1.e eVar) {
        if (p3.n0.c(this.f17153d, eVar)) {
            return;
        }
        this.f17153d = eVar;
        int e10 = e(eVar);
        this.f17155f = e10;
        boolean z10 = true;
        if (e10 != 1 && e10 != 0) {
            z10 = false;
        }
        p3.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int p(boolean z10, int i10) {
        if (o(i10)) {
            b();
            return z10 ? 1 : -1;
        } else if (z10) {
            return j();
        } else {
            return -1;
        }
    }
}
