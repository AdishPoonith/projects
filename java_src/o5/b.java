package o5;

import g5.x;
import o5.n;
/* loaded from: classes.dex */
public abstract class b<SerializationT extends n> {

    /* renamed from: a  reason: collision with root package name */
    private final v5.a f14628a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f14629b;

    /* loaded from: classes.dex */
    class a extends b<SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InterfaceC0214b f14630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v5.a aVar, Class cls, InterfaceC0214b interfaceC0214b) {
            super(aVar, cls, null);
            this.f14630c = interfaceC0214b;
        }

        @Override // o5.b
        public g5.f d(SerializationT serializationt, x xVar) {
            return this.f14630c.a(serializationt, xVar);
        }
    }

    /* renamed from: o5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0214b<SerializationT extends n> {
        g5.f a(SerializationT serializationt, x xVar);
    }

    private b(v5.a aVar, Class<SerializationT> cls) {
        this.f14628a = aVar;
        this.f14629b = cls;
    }

    /* synthetic */ b(v5.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends n> b<SerializationT> a(InterfaceC0214b<SerializationT> interfaceC0214b, v5.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, interfaceC0214b);
    }

    public final v5.a b() {
        return this.f14628a;
    }

    public final Class<SerializationT> c() {
        return this.f14629b;
    }

    public abstract g5.f d(SerializationT serializationt, x xVar);
}
