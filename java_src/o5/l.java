package o5;

import java.security.GeneralSecurityException;
import t5.i0;
import t5.y;
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f14659a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.a f14660b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.crypto.tink.shaded.protobuf.i f14661c;

    /* renamed from: d  reason: collision with root package name */
    private final y.c f14662d;

    /* renamed from: e  reason: collision with root package name */
    private final i0 f14663e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f14664f;

    private l(String str, com.google.crypto.tink.shaded.protobuf.i iVar, y.c cVar, i0 i0Var, Integer num) {
        this.f14659a = str;
        this.f14660b = q.d(str);
        this.f14661c = iVar;
        this.f14662d = cVar;
        this.f14663e = i0Var;
        this.f14664f = num;
    }

    public static l b(String str, com.google.crypto.tink.shaded.protobuf.i iVar, y.c cVar, i0 i0Var, Integer num) {
        if (i0Var == i0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new l(str, iVar, cVar, i0Var, num);
    }

    @Override // o5.n
    public v5.a a() {
        return this.f14660b;
    }

    public Integer c() {
        return this.f14664f;
    }

    public y.c d() {
        return this.f14662d;
    }

    public i0 e() {
        return this.f14663e;
    }

    public String f() {
        return this.f14659a;
    }

    public com.google.crypto.tink.shaded.protobuf.i g() {
        return this.f14661c;
    }
}
