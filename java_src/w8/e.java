package w8;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.h0;
import com.google.firebase.firestore.i0;
import com.google.firebase.firestore.o0;
import java.util.Map;
import java.util.Objects;
import r8.d;
/* loaded from: classes.dex */
public class e implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    private d.b f20042a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(d.b bVar, Exception exc) {
        bVar.b("firebase_firestore", exc.getMessage(), x8.a.a(exc));
        c(null);
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, final d.b bVar) {
        this.f20042a = bVar;
        Map map = (Map) obj;
        Object obj2 = map.get("bundle");
        Objects.requireNonNull(obj2);
        Object obj3 = map.get("firestore");
        Objects.requireNonNull(obj3);
        h0 F = ((FirebaseFirestore) obj3).F((byte[]) obj2);
        F.a(new o0() { // from class: w8.d
            @Override // com.google.firebase.firestore.o0
            public final void a(Object obj4) {
                d.b.this.a((i0) obj4);
            }
        });
        F.addOnFailureListener(new OnFailureListener() { // from class: w8.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                e.this.f(bVar, exc);
            }
        });
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        this.f20042a.c();
    }
}
