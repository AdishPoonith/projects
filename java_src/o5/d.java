package o5;

import com.google.crypto.tink.shaded.protobuf.s0;
import g5.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import l5.b;
import t5.y;
/* loaded from: classes.dex */
public abstract class d<KeyProtoT extends s0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f14634a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, k<?, KeyProtoT>> f14635b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f14636c;

    /* loaded from: classes.dex */
    public static abstract class a<KeyFormatProtoT extends s0, KeyProtoT extends s0> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<KeyFormatProtoT> f14637a;

        /* renamed from: o5.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0215a<KeyFormatProtoT> {

            /* renamed from: a  reason: collision with root package name */
            public KeyFormatProtoT f14638a;

            /* renamed from: b  reason: collision with root package name */
            public k.b f14639b;

            public C0215a(KeyFormatProtoT keyformatprotot, k.b bVar) {
                this.f14638a = keyformatprotot;
                this.f14639b = bVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f14637a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f14637a;
        }

        public Map<String, C0215a<KeyFormatProtoT>> c() {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT d(com.google.crypto.tink.shaded.protobuf.i iVar);

        public abstract void e(KeyFormatProtoT keyformatprotot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public d(Class<KeyProtoT> cls, k<?, KeyProtoT>... kVarArr) {
        this.f14634a = cls;
        HashMap hashMap = new HashMap();
        for (k<?, KeyProtoT> kVar : kVarArr) {
            if (hashMap.containsKey(kVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + kVar.b().getCanonicalName());
            }
            hashMap.put(kVar.b(), kVar);
        }
        this.f14636c = kVarArr.length > 0 ? kVarArr[0].b() : Void.class;
        this.f14635b = Collections.unmodifiableMap(hashMap);
    }

    public b.EnumC0195b a() {
        return b.EnumC0195b.f13064j;
    }

    public final Class<?> b() {
        return this.f14636c;
    }

    public final Class<KeyProtoT> c() {
        return this.f14634a;
    }

    public abstract String d();

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) {
        k<?, KeyProtoT> kVar = this.f14635b.get(cls);
        if (kVar != null) {
            return (P) kVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> f();

    public abstract y.c g();

    public abstract KeyProtoT h(com.google.crypto.tink.shaded.protobuf.i iVar);

    public final Set<Class<?>> i() {
        return this.f14635b.keySet();
    }

    public abstract void j(KeyProtoT keyprotot);
}
