package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17578a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f17579b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17580c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f17581d;

    /* renamed from: e  reason: collision with root package name */
    private c f17582e;

    /* renamed from: f  reason: collision with root package name */
    private int f17583f;

    /* renamed from: g  reason: collision with root package name */
    private int f17584g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17585h;

    /* loaded from: classes.dex */
    public interface b {
        void A(int i10, boolean z10);

        void B(int i10);
    }

    /* loaded from: classes.dex */
    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = t3.this.f17579b;
            final t3 t3Var = t3.this;
            handler.post(new Runnable() { // from class: s1.u3
                @Override // java.lang.Runnable
                public final void run() {
                    t3.b(t3.this);
                }
            });
        }
    }

    public t3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f17578a = applicationContext;
        this.f17579b = handler;
        this.f17580c = bVar;
        AudioManager audioManager = (AudioManager) p3.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f17581d = audioManager;
        this.f17583f = 3;
        this.f17584g = f(audioManager, 3);
        this.f17585h = e(audioManager, this.f17583f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f17582e = cVar;
        } catch (RuntimeException e10) {
            p3.r.j("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(t3 t3Var) {
        t3Var.i();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        return p3.n0.f15397a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            p3.r.j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int f10 = f(this.f17581d, this.f17583f);
        boolean e10 = e(this.f17581d, this.f17583f);
        if (this.f17584g == f10 && this.f17585h == e10) {
            return;
        }
        this.f17584g = f10;
        this.f17585h = e10;
        this.f17580c.A(f10, e10);
    }

    public int c() {
        return this.f17581d.getStreamMaxVolume(this.f17583f);
    }

    public int d() {
        if (p3.n0.f15397a >= 28) {
            return this.f17581d.getStreamMinVolume(this.f17583f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f17582e;
        if (cVar != null) {
            try {
                this.f17578a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                p3.r.j("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f17582e = null;
        }
    }

    public void h(int i10) {
        if (this.f17583f == i10) {
            return;
        }
        this.f17583f = i10;
        i();
        this.f17580c.B(i10);
    }
}
