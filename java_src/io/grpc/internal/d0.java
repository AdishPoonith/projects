package io.grpc.internal;

import i9.a1;
import java.net.URI;
/* loaded from: classes.dex */
public final class d0 extends i9.b1 {
    @Override // i9.a1.d
    public String a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.b1
    public boolean d() {
        return true;
    }

    @Override // i9.b1
    public int e() {
        return 5;
    }

    @Override // i9.a1.d
    /* renamed from: f */
    public c0 b(URI uri, a1.b bVar) {
        if ("dns".equals(uri.getScheme())) {
            String str = (String) b5.n.o(uri.getPath(), "targetPath");
            b5.n.k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
            return new c0(uri.getAuthority(), str.substring(1), bVar, r0.f11591u, b5.r.c(), i9.n0.a(d0.class.getClassLoader()));
        }
        return null;
    }
}
