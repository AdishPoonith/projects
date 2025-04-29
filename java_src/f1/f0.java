package f1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class f0 implements ServiceConnection {

    /* renamed from: j  reason: collision with root package name */
    private final Context f8430j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f8431k;

    /* renamed from: l  reason: collision with root package name */
    private b f8432l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8433m;

    /* renamed from: n  reason: collision with root package name */
    private Messenger f8434n;

    /* renamed from: o  reason: collision with root package name */
    private final int f8435o;

    /* renamed from: p  reason: collision with root package name */
    private final int f8436p;

    /* renamed from: q  reason: collision with root package name */
    private final String f8437q;

    /* renamed from: r  reason: collision with root package name */
    private final int f8438r;

    /* renamed from: s  reason: collision with root package name */
    private final String f8439s;

    /* loaded from: classes.dex */
    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (k1.a.d(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.l.e(message, "message");
                f0.this.d(message);
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bundle bundle);
    }

    public f0(Context context, int i10, int i11, int i12, String applicationId, String str) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f8430j = applicationContext != null ? applicationContext : context;
        this.f8435o = i10;
        this.f8436p = i11;
        this.f8437q = applicationId;
        this.f8438r = i12;
        this.f8439s = str;
        this.f8431k = new a();
    }

    private final void a(Bundle bundle) {
        if (this.f8433m) {
            this.f8433m = false;
            b bVar = this.f8432l;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    private final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f8437q);
        String str = this.f8439s;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f8435o);
        obtain.arg1 = this.f8438r;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f8431k);
        try {
            Messenger messenger = this.f8434n;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.f8433m = false;
    }

    protected final Context c() {
        return this.f8430j;
    }

    protected final void d(Message message) {
        kotlin.jvm.internal.l.e(message, "message");
        if (message.what == this.f8436p) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            a(data);
            try {
                this.f8430j.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void e(Bundle bundle);

    public final void g(b bVar) {
        this.f8432l = bVar;
    }

    public final boolean h() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f8433m) {
                return false;
            }
            e0 e0Var = e0.f8417a;
            if (e0.s(this.f8438r) == -1) {
                return false;
            }
            Intent l10 = e0.l(c());
            if (l10 != null) {
                this.f8433m = true;
                c().bindService(l10, this, 1);
                z10 = true;
            }
            return z10;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(service, "service");
        this.f8434n = new Messenger(service);
        f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.l.e(name, "name");
        this.f8434n = null;
        try {
            this.f8430j.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
