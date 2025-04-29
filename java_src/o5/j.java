package o5;

import g5.t;
import o5.n;
/* loaded from: classes.dex */
public abstract class j<ParametersT extends t, SerializationT extends n> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<ParametersT> f14655a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f14656b;

    /* loaded from: classes.dex */
    class a extends j<ParametersT, SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f14657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f14657c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b<ParametersT extends t, SerializationT extends n> {
    }

    private j(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f14655a = cls;
        this.f14656b = cls2;
    }

    /* synthetic */ j(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends t, SerializationT extends n> j<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f14655a;
    }

    public Class<SerializationT> c() {
        return this.f14656b;
    }
}
