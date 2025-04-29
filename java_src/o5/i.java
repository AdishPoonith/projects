package o5;

import o5.n;
/* loaded from: classes.dex */
public abstract class i<SerializationT extends n> {

    /* renamed from: a  reason: collision with root package name */
    private final v5.a f14652a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f14653b;

    /* loaded from: classes.dex */
    class a extends i<SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f14654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v5.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f14654c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b<SerializationT extends n> {
    }

    private i(v5.a aVar, Class<SerializationT> cls) {
        this.f14652a = aVar;
        this.f14653b = cls;
    }

    /* synthetic */ i(v5.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends n> i<SerializationT> a(b<SerializationT> bVar, v5.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final v5.a b() {
        return this.f14652a;
    }

    public final Class<SerializationT> c() {
        return this.f14653b;
    }
}
