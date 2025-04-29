package c4;

import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    private Object f3272a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3273b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f3274c;

    public d1(c cVar, Object obj) {
        this.f3274c = cVar;
        this.f3272a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f3272a;
            if (this.f3273b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f3273b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f3272a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f3274c.A;
        synchronized (arrayList) {
            arrayList2 = this.f3274c.A;
            arrayList2.remove(this);
        }
    }
}
