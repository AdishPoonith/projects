package c4;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 extends p4.e {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f3269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c cVar, Looper looper) {
        super(looper);
        this.f3269b = cVar;
    }

    private static final void a(Message message) {
        d1 d1Var = (d1) message.obj;
        d1Var.b();
        d1Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        b4.b bVar;
        b4.b bVar2;
        boolean z10;
        if (this.f3269b.L.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f3269b.s()) || message.what == 5)) && !this.f3269b.i()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f3269b.I = new b4.b(message.arg2);
            if (c.f0(this.f3269b)) {
                c cVar = this.f3269b;
                z10 = cVar.J;
                if (!z10) {
                    cVar.g0(3, null);
                    return;
                }
            }
            c cVar2 = this.f3269b;
            bVar2 = cVar2.I;
            b4.b bVar3 = bVar2 != null ? cVar2.I : new b4.b(8);
            this.f3269b.f3266y.a(bVar3);
            this.f3269b.K(bVar3);
        } else if (i11 == 5) {
            c cVar3 = this.f3269b;
            bVar = cVar3.I;
            b4.b bVar4 = bVar != null ? cVar3.I : new b4.b(8);
            this.f3269b.f3266y.a(bVar4);
            this.f3269b.K(bVar4);
        } else if (i11 == 3) {
            Object obj = message.obj;
            b4.b bVar5 = new b4.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f3269b.f3266y.a(bVar5);
            this.f3269b.K(bVar5);
        } else if (i11 == 6) {
            this.f3269b.g0(5, null);
            c cVar4 = this.f3269b;
            aVar = cVar4.D;
            if (aVar != null) {
                aVar2 = cVar4.D;
                aVar2.p(message.arg2);
            }
            this.f3269b.L(message.arg2);
            c.e0(this.f3269b, 5, 1, null);
        } else if (i11 == 2 && !this.f3269b.a()) {
            a(message);
        } else if (b(message)) {
            ((d1) message.obj).c();
        } else {
            int i12 = message.what;
            Log.wtf("GmsClient", "Don't know how to handle message: " + i12, new Exception());
        }
    }
}
