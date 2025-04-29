package p3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p3.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f15366b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f15367a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f15368a;

        /* renamed from: b  reason: collision with root package name */
        private h0 f15369b;

        private b() {
        }

        private void b() {
            this.f15368a = null;
            this.f15369b = null;
            h0.o(this);
        }

        @Override // p3.n.a
        public void a() {
            ((Message) p3.a.e(this.f15368a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) p3.a.e(this.f15368a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, h0 h0Var) {
            this.f15368a = message;
            this.f15369b = h0Var;
            return this;
        }
    }

    public h0(Handler handler) {
        this.f15367a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = f15366b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List<b> list = f15366b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // p3.n
    public boolean a(n.a aVar) {
        return ((b) aVar).c(this.f15367a);
    }

    @Override // p3.n
    public boolean b(int i10) {
        return this.f15367a.hasMessages(i10);
    }

    @Override // p3.n
    public n.a c(int i10, int i11, int i12) {
        return n().d(this.f15367a.obtainMessage(i10, i11, i12), this);
    }

    @Override // p3.n
    public boolean d(int i10) {
        return this.f15367a.sendEmptyMessage(i10);
    }

    @Override // p3.n
    public n.a e(int i10, int i11, int i12, Object obj) {
        return n().d(this.f15367a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // p3.n
    public boolean f(int i10, long j10) {
        return this.f15367a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // p3.n
    public void g(int i10) {
        this.f15367a.removeMessages(i10);
    }

    @Override // p3.n
    public n.a h(int i10, Object obj) {
        return n().d(this.f15367a.obtainMessage(i10, obj), this);
    }

    @Override // p3.n
    public void i(Object obj) {
        this.f15367a.removeCallbacksAndMessages(obj);
    }

    @Override // p3.n
    public Looper j() {
        return this.f15367a.getLooper();
    }

    @Override // p3.n
    public boolean k(Runnable runnable) {
        return this.f15367a.post(runnable);
    }

    @Override // p3.n
    public n.a l(int i10) {
        return n().d(this.f15367a.obtainMessage(i10), this);
    }
}
