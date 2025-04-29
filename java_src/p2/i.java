package p2;

import k2.a;
import s1.a2;
import s1.n1;
/* loaded from: classes.dex */
public abstract class i implements a.b {

    /* renamed from: j  reason: collision with root package name */
    public final String f15312j;

    public i(String str) {
        this.f15312j = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // k2.a.b
    public /* synthetic */ n1 n() {
        return k2.b.b(this);
    }

    public String toString() {
        return this.f15312j;
    }

    @Override // k2.a.b
    public /* synthetic */ void u(a2.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] w() {
        return k2.b.a(this);
    }
}
