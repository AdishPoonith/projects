package g5;

import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.security.GeneralSecurityException;
import o5.d;
/* loaded from: classes.dex */
class h<PrimitiveT, KeyProtoT extends s0> implements g<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final o5.d<KeyProtoT> f8972a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f8973b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<KeyFormatProtoT extends s0, KeyProtoT extends s0> {

        /* renamed from: a  reason: collision with root package name */
        final d.a<KeyFormatProtoT, KeyProtoT> f8974a;

        a(d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f8974a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f8974a.e(keyformatprotot);
            return this.f8974a.a(keyformatprotot);
        }

        KeyProtoT a(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return b(this.f8974a.d(iVar));
        }
    }

    public h(o5.d<KeyProtoT> dVar, Class<PrimitiveT> cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f8972a = dVar;
        this.f8973b = cls;
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.f8972a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) {
        if (Void.class.equals(this.f8973b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f8972a.j(keyprotot);
        return (PrimitiveT) this.f8972a.e(keyprotot, (Class<PrimitiveT>) this.f8973b);
    }

    @Override // g5.g
    public final PrimitiveT a(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return f(this.f8972a.h(iVar));
        } catch (c0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f8972a.c().getName(), e10);
        }
    }

    @Override // g5.g
    public final s0 b(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return e().a(iVar);
        } catch (c0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f8972a.f().b().getName(), e10);
        }
    }

    @Override // g5.g
    public final t5.y c(com.google.crypto.tink.shaded.protobuf.i iVar) {
        try {
            return t5.y.V().C(d()).D(e().a(iVar).h()).B(this.f8972a.g()).b();
        } catch (c0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // g5.g
    public final String d() {
        return this.f8972a.d();
    }
}
