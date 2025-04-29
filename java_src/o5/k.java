package o5;

import com.google.crypto.tink.shaded.protobuf.s0;
/* loaded from: classes.dex */
public abstract class k<PrimitiveT, KeyProtoT extends s0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f14658a;

    public k(Class<PrimitiveT> cls) {
        this.f14658a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> b() {
        return this.f14658a;
    }
}
