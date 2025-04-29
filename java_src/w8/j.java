package w8;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.f0;
import java.util.Map;
import java.util.Objects;
import r8.d;
/* loaded from: classes.dex */
public class j implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    f0 f20048a;

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, final d.b bVar) {
        Object obj2 = ((Map) obj).get("firestore");
        Objects.requireNonNull(obj2);
        this.f20048a = ((FirebaseFirestore) obj2).g(new Runnable() { // from class: w8.i
            @Override // java.lang.Runnable
            public final void run() {
                d.b.this.a(null);
            }
        });
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        f0 f0Var = this.f20048a;
        if (f0Var != null) {
            f0Var.remove();
            this.f20048a = null;
        }
    }
}
