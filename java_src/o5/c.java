package o5;

import g5.f;
import o5.n;
/* loaded from: classes.dex */
public abstract class c<KeyT extends g5.f, SerializationT extends n> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyT> f14631a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f14632b;

    /* loaded from: classes.dex */
    class a extends c<KeyT, SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f14633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f14633c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b<KeyT extends g5.f, SerializationT extends n> {
    }

    private c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f14631a = cls;
        this.f14632b = cls2;
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends g5.f, SerializationT extends n> c<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f14631a;
    }

    public Class<SerializationT> c() {
        return this.f14632b;
    }
}
