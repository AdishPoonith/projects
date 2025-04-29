package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b0 lambda$getComponents$0(b6.e eVar) {
        return new b0((Context) eVar.a(Context.class), (w5.f) eVar.a(w5.f.class), eVar.i(a6.b.class), eVar.i(z5.b.class), new p6.q(eVar.g(v6.i.class), eVar.g(r6.j.class), (w5.n) eVar.a(w5.n.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b6.c<?>> getComponents() {
        return Arrays.asList(b6.c.e(b0.class).f(LIBRARY_NAME).b(b6.r.k(w5.f.class)).b(b6.r.k(Context.class)).b(b6.r.i(r6.j.class)).b(b6.r.i(v6.i.class)).b(b6.r.a(a6.b.class)).b(b6.r.a(z5.b.class)).b(b6.r.h(w5.n.class)).d(new b6.h() { // from class: com.google.firebase.firestore.c0
            @Override // b6.h
            public final Object a(b6.e eVar) {
                b0 lambda$getComponents$0;
                lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c(), v6.h.b(LIBRARY_NAME, "24.6.0"));
    }
}
