package la;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w2<U, T extends U> extends kotlinx.coroutines.internal.z<T> implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final long f13679m;

    public w2(long j10, v9.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f13679m = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        F(x2.a(this.f13679m, this));
    }

    @Override // la.a, la.c2
    public String u0() {
        return super.u0() + "(timeMillis=" + this.f13679m + ')';
    }
}
