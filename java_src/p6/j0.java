package p6;

import i9.j1;
import java.util.Locale;
import q6.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b  reason: collision with root package name */
    private int f15593b;

    /* renamed from: c  reason: collision with root package name */
    private g.b f15594c;

    /* renamed from: e  reason: collision with root package name */
    private final q6.g f15596e;

    /* renamed from: f  reason: collision with root package name */
    private final a f15597f;

    /* renamed from: a  reason: collision with root package name */
    private j6.z0 f15592a = j6.z0.UNKNOWN;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15595d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(j6.z0 z0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(q6.g gVar, a aVar) {
        this.f15596e = gVar;
        this.f15597f = aVar;
    }

    private void b() {
        g.b bVar = this.f15594c;
        if (bVar != null) {
            bVar.c();
            this.f15594c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f15594c = null;
        q6.b.d(this.f15592a == j6.z0.UNKNOWN, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
        g(String.format(Locale.ENGLISH, "Backend didn't respond within %d seconds\n", 10));
        h(j6.z0.OFFLINE);
    }

    private void g(String str) {
        String format = String.format("Could not reach Cloud Firestore backend. %s\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.", str);
        Object[] objArr = new Object[1];
        if (!this.f15595d) {
            objArr[0] = format;
            q6.v.a("OnlineStateTracker", "%s", objArr);
            return;
        }
        objArr[0] = format;
        q6.v.e("OnlineStateTracker", "%s", objArr);
        this.f15595d = false;
    }

    private void h(j6.z0 z0Var) {
        if (z0Var != this.f15592a) {
            this.f15592a = z0Var;
            this.f15597f.a(z0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6.z0 c() {
        return this.f15592a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(j1 j1Var) {
        if (this.f15592a == j6.z0.ONLINE) {
            h(j6.z0.UNKNOWN);
            q6.b.d(this.f15593b == 0, "watchStreamFailures must be 0", new Object[0]);
            q6.b.d(this.f15594c == null, "onlineStateTimer must be null", new Object[0]);
            return;
        }
        int i10 = this.f15593b + 1;
        this.f15593b = i10;
        if (i10 >= 1) {
            b();
            g(String.format(Locale.ENGLISH, "Connection failed %d times. Most recent error: %s", 1, j1Var));
            h(j6.z0.OFFLINE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f15593b == 0) {
            h(j6.z0.UNKNOWN);
            q6.b.d(this.f15594c == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            this.f15594c = this.f15596e.k(g.d.ONLINE_STATE_TIMEOUT, 10000L, new Runnable() { // from class: p6.i0
                @Override // java.lang.Runnable
                public final void run() {
                    j0.this.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(j6.z0 z0Var) {
        b();
        this.f15593b = 0;
        if (z0Var == j6.z0.ONLINE) {
            this.f15595d = false;
        }
        h(z0Var);
    }
}
