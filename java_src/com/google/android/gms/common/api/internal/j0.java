package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* loaded from: classes.dex */
public final class j0 implements f.a, f.b {

    /* renamed from: b */
    private final a.f f3855b;

    /* renamed from: c */
    private final b f3856c;

    /* renamed from: f */
    private final z f3857f;

    /* renamed from: i */
    private final int f3860i;

    /* renamed from: j */
    private final h1 f3861j;

    /* renamed from: k */
    private boolean f3862k;

    /* renamed from: o */
    final /* synthetic */ f f3866o;

    /* renamed from: a */
    private final Queue f3854a = new LinkedList();

    /* renamed from: g */
    private final Set f3858g = new HashSet();

    /* renamed from: h */
    private final Map f3859h = new HashMap();

    /* renamed from: l */
    private final List f3863l = new ArrayList();

    /* renamed from: m */
    private b4.b f3864m = null;

    /* renamed from: n */
    private int f3865n = 0;

    public j0(f fVar, com.google.android.gms.common.api.e eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f3866o = fVar;
        handler = fVar.f3830y;
        a.f v10 = eVar.v(handler.getLooper(), this);
        this.f3855b = v10;
        this.f3856c = eVar.p();
        this.f3857f = new z();
        this.f3860i = eVar.u();
        if (!v10.o()) {
            this.f3861j = null;
            return;
        }
        context = fVar.f3821p;
        handler2 = fVar.f3830y;
        this.f3861j = eVar.w(context, handler2);
    }

    public static /* bridge */ /* synthetic */ void A(j0 j0Var, l0 l0Var) {
        if (j0Var.f3863l.contains(l0Var) && !j0Var.f3862k) {
            if (j0Var.f3855b.a()) {
                j0Var.f();
            } else {
                j0Var.D();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void B(j0 j0Var, l0 l0Var) {
        Handler handler;
        Handler handler2;
        b4.d dVar;
        b4.d[] g10;
        if (j0Var.f3863l.remove(l0Var)) {
            handler = j0Var.f3866o.f3830y;
            handler.removeMessages(15, l0Var);
            handler2 = j0Var.f3866o.f3830y;
            handler2.removeMessages(16, l0Var);
            dVar = l0Var.f3881b;
            ArrayList arrayList = new ArrayList(j0Var.f3854a.size());
            for (q1 q1Var : j0Var.f3854a) {
                if ((q1Var instanceof r0) && (g10 = ((r0) q1Var).g(j0Var)) != null && h4.b.b(g10, dVar)) {
                    arrayList.add(q1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q1 q1Var2 = (q1) arrayList.get(i10);
                j0Var.f3854a.remove(q1Var2);
                q1Var2.b(new com.google.android.gms.common.api.o(dVar));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean N(j0 j0Var, boolean z10) {
        return j0Var.n(false);
    }

    private final b4.d b(b4.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            b4.d[] j10 = this.f3855b.j();
            if (j10 == null) {
                j10 = new b4.d[0];
            }
            s.a aVar = new s.a(j10.length);
            for (b4.d dVar : j10) {
                aVar.put(dVar.B(), Long.valueOf(dVar.C()));
            }
            for (b4.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.B());
                if (l10 == null || l10.longValue() < dVar2.C()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void c(b4.b bVar) {
        for (r1 r1Var : this.f3858g) {
            r1Var.b(this.f3856c, bVar, c4.q.b(bVar, b4.b.f2893n) ? this.f3855b.k() : null);
        }
        this.f3858g.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3854a.iterator();
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next();
            if (!z10 || q1Var.f3914a == 2) {
                if (status != null) {
                    q1Var.a(status);
                } else {
                    q1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f3854a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1 q1Var = (q1) arrayList.get(i10);
            if (!this.f3855b.a()) {
                return;
            }
            if (l(q1Var)) {
                this.f3854a.remove(q1Var);
            }
        }
    }

    public final void g() {
        C();
        c(b4.b.f2893n);
        k();
        Iterator it = this.f3859h.values().iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (b(y0Var.f3959a.c()) == null) {
                try {
                    y0Var.f3959a.d(this.f3855b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    p(3);
                    this.f3855b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        f();
        i();
    }

    public final void h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        c4.l0 l0Var;
        C();
        this.f3862k = true;
        this.f3857f.e(i10, this.f3855b.m());
        f fVar = this.f3866o;
        handler = fVar.f3830y;
        handler2 = fVar.f3830y;
        Message obtain = Message.obtain(handler2, 9, this.f3856c);
        j10 = this.f3866o.f3815j;
        handler.sendMessageDelayed(obtain, j10);
        f fVar2 = this.f3866o;
        handler3 = fVar2.f3830y;
        handler4 = fVar2.f3830y;
        Message obtain2 = Message.obtain(handler4, 11, this.f3856c);
        j11 = this.f3866o.f3816k;
        handler3.sendMessageDelayed(obtain2, j11);
        l0Var = this.f3866o.f3823r;
        l0Var.c();
        for (y0 y0Var : this.f3859h.values()) {
            y0Var.f3961c.run();
        }
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f3866o.f3830y;
        handler.removeMessages(12, this.f3856c);
        f fVar = this.f3866o;
        handler2 = fVar.f3830y;
        handler3 = fVar.f3830y;
        Message obtainMessage = handler3.obtainMessage(12, this.f3856c);
        j10 = this.f3866o.f3817l;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    private final void j(q1 q1Var) {
        q1Var.d(this.f3857f, P());
        try {
            q1Var.c(this);
        } catch (DeadObjectException unused) {
            p(1);
            this.f3855b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        Handler handler;
        Handler handler2;
        if (this.f3862k) {
            handler = this.f3866o.f3830y;
            handler.removeMessages(11, this.f3856c);
            handler2 = this.f3866o.f3830y;
            handler2.removeMessages(9, this.f3856c);
            this.f3862k = false;
        }
    }

    private final boolean l(q1 q1Var) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(q1Var instanceof r0)) {
            j(q1Var);
            return true;
        }
        r0 r0Var = (r0) q1Var;
        b4.d b10 = b(r0Var.g(this));
        if (b10 == null) {
            j(q1Var);
            return true;
        }
        String name = this.f3855b.getClass().getName();
        String B = b10.B();
        long C = b10.C();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + B + ", " + C + ").");
        z10 = this.f3866o.f3831z;
        if (!z10 || !r0Var.f(this)) {
            r0Var.b(new com.google.android.gms.common.api.o(b10));
            return true;
        }
        l0 l0Var = new l0(this.f3856c, b10, null);
        int indexOf = this.f3863l.indexOf(l0Var);
        if (indexOf >= 0) {
            l0 l0Var2 = (l0) this.f3863l.get(indexOf);
            handler5 = this.f3866o.f3830y;
            handler5.removeMessages(15, l0Var2);
            f fVar = this.f3866o;
            handler6 = fVar.f3830y;
            handler7 = fVar.f3830y;
            Message obtain = Message.obtain(handler7, 15, l0Var2);
            j12 = this.f3866o.f3815j;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f3863l.add(l0Var);
        f fVar2 = this.f3866o;
        handler = fVar2.f3830y;
        handler2 = fVar2.f3830y;
        Message obtain2 = Message.obtain(handler2, 15, l0Var);
        j10 = this.f3866o.f3815j;
        handler.sendMessageDelayed(obtain2, j10);
        f fVar3 = this.f3866o;
        handler3 = fVar3.f3830y;
        handler4 = fVar3.f3830y;
        Message obtain3 = Message.obtain(handler4, 16, l0Var);
        j11 = this.f3866o.f3816k;
        handler3.sendMessageDelayed(obtain3, j11);
        b4.b bVar = new b4.b(2, null);
        if (m(bVar)) {
            return false;
        }
        this.f3866o.h(bVar, this.f3860i);
        return false;
    }

    private final boolean m(b4.b bVar) {
        Object obj;
        a0 a0Var;
        Set set;
        a0 a0Var2;
        obj = f.C;
        synchronized (obj) {
            f fVar = this.f3866o;
            a0Var = fVar.f3827v;
            if (a0Var != null) {
                set = fVar.f3828w;
                if (set.contains(this.f3856c)) {
                    a0Var2 = this.f3866o.f3827v;
                    a0Var2.h(bVar, this.f3860i);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean n(boolean z10) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if (this.f3855b.a() && this.f3859h.size() == 0) {
            if (!this.f3857f.g()) {
                this.f3855b.f("Timing out service connection.");
                return true;
            }
            if (z10) {
                i();
            }
            return false;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ b u(j0 j0Var) {
        return j0Var.f3856c;
    }

    public static /* bridge */ /* synthetic */ void w(j0 j0Var, Status status) {
        j0Var.d(status);
    }

    public final void C() {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        this.f3864m = null;
    }

    public final void D() {
        Handler handler;
        b4.b bVar;
        c4.l0 l0Var;
        Context context;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if (this.f3855b.a() || this.f3855b.i()) {
            return;
        }
        try {
            f fVar = this.f3866o;
            l0Var = fVar.f3823r;
            context = fVar.f3821p;
            int b10 = l0Var.b(context, this.f3855b);
            if (b10 != 0) {
                b4.b bVar2 = new b4.b(b10, null);
                String name = this.f3855b.getClass().getName();
                String obj = bVar2.toString();
                Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                G(bVar2, null);
                return;
            }
            f fVar2 = this.f3866o;
            a.f fVar3 = this.f3855b;
            n0 n0Var = new n0(fVar2, fVar3, this.f3856c);
            if (fVar3.o()) {
                ((h1) c4.s.j(this.f3861j)).K2(n0Var);
            }
            try {
                this.f3855b.b(n0Var);
            } catch (SecurityException e10) {
                e = e10;
                bVar = new b4.b(10);
                G(bVar, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new b4.b(10);
        }
    }

    public final void E(q1 q1Var) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if (this.f3855b.a()) {
            if (l(q1Var)) {
                i();
                return;
            } else {
                this.f3854a.add(q1Var);
                return;
            }
        }
        this.f3854a.add(q1Var);
        b4.b bVar = this.f3864m;
        if (bVar == null || !bVar.E()) {
            D();
        } else {
            G(this.f3864m, null);
        }
    }

    public final void F() {
        this.f3865n++;
    }

    public final void G(b4.b bVar, Exception exc) {
        Handler handler;
        c4.l0 l0Var;
        boolean z10;
        Status i10;
        Status i11;
        Status i12;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        h1 h1Var = this.f3861j;
        if (h1Var != null) {
            h1Var.L2();
        }
        C();
        l0Var = this.f3866o.f3823r;
        l0Var.c();
        c(bVar);
        if ((this.f3855b instanceof e4.e) && bVar.B() != 24) {
            this.f3866o.f3818m = true;
            f fVar = this.f3866o;
            handler5 = fVar.f3830y;
            handler6 = fVar.f3830y;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (bVar.B() == 4) {
            status = f.B;
            d(status);
        } else if (this.f3854a.isEmpty()) {
            this.f3864m = bVar;
        } else if (exc != null) {
            handler4 = this.f3866o.f3830y;
            c4.s.d(handler4);
            e(null, exc, false);
        } else {
            z10 = this.f3866o.f3831z;
            if (!z10) {
                i10 = f.i(this.f3856c, bVar);
                d(i10);
                return;
            }
            i11 = f.i(this.f3856c, bVar);
            e(i11, null, true);
            if (this.f3854a.isEmpty() || m(bVar) || this.f3866o.h(bVar, this.f3860i)) {
                return;
            }
            if (bVar.B() == 18) {
                this.f3862k = true;
            }
            if (!this.f3862k) {
                i12 = f.i(this.f3856c, bVar);
                d(i12);
                return;
            }
            f fVar2 = this.f3866o;
            handler2 = fVar2.f3830y;
            handler3 = fVar2.f3830y;
            Message obtain = Message.obtain(handler3, 9, this.f3856c);
            j10 = this.f3866o.f3815j;
            handler2.sendMessageDelayed(obtain, j10);
        }
    }

    public final void H(b4.b bVar) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        a.f fVar = this.f3855b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        fVar.f("onSignInFailed for " + name + " with " + valueOf);
        G(bVar, null);
    }

    public final void I(r1 r1Var) {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        this.f3858g.add(r1Var);
    }

    public final void J() {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if (this.f3862k) {
            D();
        }
    }

    public final void K() {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        d(f.A);
        this.f3857f.f();
        for (j.a aVar : (j.a[]) this.f3859h.keySet().toArray(new j.a[0])) {
            E(new p1(aVar, new TaskCompletionSource()));
        }
        c(new b4.b(4));
        if (this.f3855b.a()) {
            this.f3855b.d(new i0(this));
        }
    }

    public final void L() {
        Handler handler;
        b4.e eVar;
        Context context;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        if (this.f3862k) {
            k();
            f fVar = this.f3866o;
            eVar = fVar.f3822q;
            context = fVar.f3821p;
            d(eVar.f(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f3855b.f("Timing out connection while resuming.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void M(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f3866o.f3830y;
        if (myLooper == handler.getLooper()) {
            g();
            return;
        }
        handler2 = this.f3866o.f3830y;
        handler2.post(new f0(this));
    }

    public final boolean O() {
        return this.f3855b.a();
    }

    public final boolean P() {
        return this.f3855b.o();
    }

    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f3860i;
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void p(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f3866o.f3830y;
        if (myLooper == handler.getLooper()) {
            h(i10);
            return;
        }
        handler2 = this.f3866o.f3830y;
        handler2.post(new g0(this, i10));
    }

    public final int q() {
        return this.f3865n;
    }

    public final b4.b r() {
        Handler handler;
        handler = this.f3866o.f3830y;
        c4.s.d(handler);
        return this.f3864m;
    }

    public final a.f t() {
        return this.f3855b;
    }

    public final Map v() {
        return this.f3859h;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void x(b4.b bVar) {
        G(bVar, null);
    }
}
