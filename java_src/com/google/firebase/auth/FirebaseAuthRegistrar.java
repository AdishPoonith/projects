package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(b6.f0 f0Var, b6.f0 f0Var2, b6.f0 f0Var3, b6.f0 f0Var4, b6.f0 f0Var5, b6.e eVar) {
        return new a6.u1((w5.f) eVar.a(w5.f.class), eVar.g(z5.b.class), eVar.g(r6.i.class), (Executor) eVar.d(f0Var), (Executor) eVar.d(f0Var2), (Executor) eVar.d(f0Var3), (ScheduledExecutorService) eVar.d(f0Var4), (Executor) eVar.d(f0Var5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<b6.c<?>> getComponents() {
        final b6.f0 a10 = b6.f0.a(x5.a.class, Executor.class);
        final b6.f0 a11 = b6.f0.a(x5.b.class, Executor.class);
        final b6.f0 a12 = b6.f0.a(x5.c.class, Executor.class);
        final b6.f0 a13 = b6.f0.a(x5.c.class, ScheduledExecutorService.class);
        final b6.f0 a14 = b6.f0.a(x5.d.class, Executor.class);
        return Arrays.asList(b6.c.f(FirebaseAuth.class, a6.b.class).b(b6.r.k(w5.f.class)).b(b6.r.l(r6.i.class)).b(b6.r.j(a10)).b(b6.r.j(a11)).b(b6.r.j(a12)).b(b6.r.j(a13)).b(b6.r.j(a14)).b(b6.r.i(z5.b.class)).d(new b6.h() { // from class: com.google.firebase.auth.f1
            @Override // b6.h
            public final Object a(b6.e eVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(b6.f0.this, a11, a12, a13, a14, eVar);
            }
        }).c(), r6.h.a(), v6.h.b("fire-auth", "22.0.0"));
    }
}
