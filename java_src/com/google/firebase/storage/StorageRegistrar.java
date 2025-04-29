package com.google.firebase.storage;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.storage.StorageRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(b6.e eVar) {
        return new e((w5.f) eVar.a(w5.f.class), eVar.g(a6.b.class), eVar.g(z5.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b6.c<?>> getComponents() {
        return Arrays.asList(b6.c.e(e.class).f(LIBRARY_NAME).b(b6.r.k(w5.f.class)).b(b6.r.i(a6.b.class)).b(b6.r.i(z5.b.class)).d(new b6.h() { // from class: w6.e
            @Override // b6.h
            public final Object a(b6.e eVar) {
                com.google.firebase.storage.e lambda$getComponents$0;
                lambda$getComponents$0 = StorageRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c(), v6.h.b(LIBRARY_NAME, "20.2.0"));
    }
}
