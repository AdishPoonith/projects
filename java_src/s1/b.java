package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f17081a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17082b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17083c;

    /* loaded from: classes.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final InterfaceC0253b f17084j;

        /* renamed from: k  reason: collision with root package name */
        private final Handler f17085k;

        public a(Handler handler, InterfaceC0253b interfaceC0253b) {
            this.f17085k = handler;
            this.f17084j = interfaceC0253b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f17085k.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f17083c) {
                this.f17084j.E();
            }
        }
    }

    /* renamed from: s1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0253b {
        void E();
    }

    public b(Context context, Handler handler, InterfaceC0253b interfaceC0253b) {
        this.f17081a = context.getApplicationContext();
        this.f17082b = new a(handler, interfaceC0253b);
    }

    public void b(boolean z10) {
        boolean z11;
        if (z10 && !this.f17083c) {
            this.f17081a.registerReceiver(this.f17082b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else if (z10 || !this.f17083c) {
            return;
        } else {
            this.f17081a.unregisterReceiver(this.f17082b);
            z11 = false;
        }
        this.f17083c = z11;
    }
}
