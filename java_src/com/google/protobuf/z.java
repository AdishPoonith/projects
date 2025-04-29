package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.v;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import com.google.protobuf.z.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected w1 unknownFields = w1.c();

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0103a<MessageType, BuilderType> {

        /* renamed from: j  reason: collision with root package name */
        private final MessageType f7404j;

        /* renamed from: k  reason: collision with root package name */
        protected MessageType f7405k;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f7404j = messagetype;
            if (messagetype.O()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f7405k = G();
        }

        private static <MessageType> void F(MessageType messagetype, MessageType messagetype2) {
            i1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType G() {
            return (MessageType) this.f7404j.U();
        }

        protected void A() {
            MessageType G = G();
            F(G, this.f7405k);
            this.f7405k = G;
        }

        @Override // com.google.protobuf.w0
        /* renamed from: B */
        public MessageType c() {
            return this.f7404j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0103a
        /* renamed from: C */
        public BuilderType t(MessageType messagetype) {
            return E(messagetype);
        }

        @Override // com.google.protobuf.v0.a
        /* renamed from: D */
        public BuilderType q(j jVar, q qVar) {
            z();
            try {
                i1.a().d(this.f7405k).i(this.f7405k, k.Q(jVar), qVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType E(MessageType messagetype) {
            if (c().equals(messagetype)) {
                return this;
            }
            z();
            F(this.f7405k, messagetype);
            return this;
        }

        @Override // com.google.protobuf.w0
        public final boolean j() {
            return z.N(this.f7405k, false);
        }

        @Override // com.google.protobuf.v0.a
        /* renamed from: w */
        public final MessageType b() {
            MessageType e10 = e();
            if (e10.j()) {
                return e10;
            }
            throw a.AbstractC0103a.v(e10);
        }

        @Override // com.google.protobuf.v0.a
        /* renamed from: x */
        public MessageType e() {
            if (this.f7405k.O()) {
                this.f7405k.P();
                return this.f7405k;
            }
            return this.f7405k;
        }

        /* renamed from: y */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().g();
            buildertype.f7405k = e();
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void z() {
            if (this.f7405k.O()) {
                return;
            }
            A();
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends z<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f7406b;

        public b(T t10) {
            this.f7406b = t10;
        }

        @Override // com.google.protobuf.f1
        /* renamed from: i */
        public T c(j jVar, q qVar) {
            return (T) z.Z(this.f7406b, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends z<MessageType, BuilderType> implements w0 {
        protected v<d> extensions = v.h();

        @Override // com.google.protobuf.z, com.google.protobuf.w0
        public /* bridge */ /* synthetic */ v0 c() {
            return super.c();
        }

        @Override // com.google.protobuf.z, com.google.protobuf.v0
        public /* bridge */ /* synthetic */ v0.a d() {
            return super.d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public v<d> e0() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.z, com.google.protobuf.v0
        public /* bridge */ /* synthetic */ v0.a g() {
            return super.g();
        }
    }

    /* loaded from: classes.dex */
    static final class d implements v.b<d> {

        /* renamed from: j  reason: collision with root package name */
        final d0.d<?> f7407j;

        /* renamed from: k  reason: collision with root package name */
        final int f7408k;

        /* renamed from: l  reason: collision with root package name */
        final b2.b f7409l;

        /* renamed from: m  reason: collision with root package name */
        final boolean f7410m;

        /* renamed from: n  reason: collision with root package name */
        final boolean f7411n;

        @Override // com.google.protobuf.v.b
        public int a() {
            return this.f7408k;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f7408k - dVar.f7408k;
        }

        @Override // com.google.protobuf.v.b
        public boolean c() {
            return this.f7410m;
        }

        @Override // com.google.protobuf.v.b
        public b2.b d() {
            return this.f7409l;
        }

        @Override // com.google.protobuf.v.b
        public b2.c e() {
            return this.f7409l.b();
        }

        @Override // com.google.protobuf.v.b
        public boolean f() {
            return this.f7411n;
        }

        public d0.d<?> g() {
            return this.f7407j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.v.b
        public v0.a j(v0.a aVar, v0 v0Var) {
            return ((a) aVar).E((z) v0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends v0, Type> extends o<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final v0 f7412a;

        /* renamed from: b  reason: collision with root package name */
        final d f7413b;

        public b2.b a() {
            return this.f7413b.d();
        }

        public v0 b() {
            return this.f7412a;
        }

        public int c() {
            return this.f7413b.a();
        }

        public boolean d() {
            return this.f7413b.f7410m;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    private int A(n1<?> n1Var) {
        return n1Var == null ? i1.a().d(this).e(this) : n1Var.e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static d0.g G() {
        return c0.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> d0.i<E> H() {
        return j1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends z<?, ?>> T I(Class<T> cls) {
        z<?, ?> zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zVar == null) {
            zVar = (T) ((z) z1.l(cls)).c();
            if (zVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, zVar);
        }
        return (T) zVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object M(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends z<T, ?>> boolean N(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.D(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = i1.a().d(t10).c(t10);
        if (z10) {
            t10.E(f.SET_MEMOIZED_IS_INITIALIZED, c10 ? t10 : null);
        }
        return c10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> d0.i<E> R(d0.i<E> iVar) {
        int size = iVar.size();
        return iVar.c(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object T(v0 v0Var, String str, Object[] objArr) {
        return new k1(v0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T V(T t10, i iVar) {
        return (T) w(W(t10, iVar, q.b()));
    }

    protected static <T extends z<T, ?>> T W(T t10, i iVar, q qVar) {
        return (T) w(Y(t10, iVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T X(T t10, byte[] bArr) {
        return (T) w(a0(t10, bArr, 0, bArr.length, q.b()));
    }

    private static <T extends z<T, ?>> T Y(T t10, i iVar, q qVar) {
        j F = iVar.F();
        T t11 = (T) Z(t10, F, qVar);
        try {
            F.a(0);
            return t11;
        } catch (e0 e10) {
            throw e10.k(t11);
        }
    }

    static <T extends z<T, ?>> T Z(T t10, j jVar, q qVar) {
        T t11 = (T) t10.U();
        try {
            n1 d10 = i1.a().d(t11);
            d10.i(t11, k.Q(jVar), qVar);
            d10.b(t11);
            return t11;
        } catch (e0 e10) {
            e = e10;
            if (e.a()) {
                e = new e0(e);
            }
            throw e.k(t11);
        } catch (u1 e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof e0) {
                throw ((e0) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends z<T, ?>> T a0(T t10, byte[] bArr, int i10, int i11, q qVar) {
        T t11 = (T) t10.U();
        try {
            n1 d10 = i1.a().d(t11);
            d10.j(t11, bArr, i10, i10 + i11, new f.b(qVar));
            d10.b(t11);
            return t11;
        } catch (e0 e10) {
            e = e10;
            if (e.a()) {
                e = new e0(e);
            }
            throw e.k(t11);
        } catch (u1 e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof e0) {
                throw ((e0) e12.getCause());
            }
            throw new e0(e12).k(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw e0.m().k(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<?, ?>> void b0(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
        t10.P();
    }

    private static <T extends z<T, ?>> T w(T t10) {
        if (t10 == null || t10.j()) {
            return t10;
        }
        throw t10.t().a().k(t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B() {
        return (BuilderType) D(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType C(MessageType messagetype) {
        return (BuilderType) B().E(messagetype);
    }

    protected Object D(f fVar) {
        return F(fVar, null, null);
    }

    protected Object E(f fVar, Object obj) {
        return F(fVar, obj, null);
    }

    protected abstract Object F(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.w0
    /* renamed from: J */
    public final MessageType c() {
        return (MessageType) D(f.GET_DEFAULT_INSTANCE);
    }

    int K() {
        return this.memoizedHashCode;
    }

    boolean L() {
        return K() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P() {
        i1.a().d(this).b(this);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: S */
    public final BuilderType g() {
        return (BuilderType) D(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType U() {
        return (MessageType) D(f.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.protobuf.v0
    public int a() {
        return r(null);
    }

    void c0(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.v0
    /* renamed from: d0 */
    public final BuilderType d() {
        return (BuilderType) ((a) D(f.NEW_BUILDER)).E(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return i1.a().d(this).d(this, (z) obj);
        }
        return false;
    }

    public int hashCode() {
        if (O()) {
            return z();
        }
        if (L()) {
            c0(z());
        }
        return K();
    }

    @Override // com.google.protobuf.v0
    public final f1<MessageType> i() {
        return (f1) D(f.GET_PARSER);
    }

    @Override // com.google.protobuf.w0
    public final boolean j() {
        return N(this, true);
    }

    @Override // com.google.protobuf.a
    int l() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.v0
    public void p(l lVar) {
        i1.a().d(this).h(this, m.P(lVar));
    }

    @Override // com.google.protobuf.a
    int r(n1 n1Var) {
        if (!O()) {
            if (l() != Integer.MAX_VALUE) {
                return l();
            }
            int A = A(n1Var);
            u(A);
            return A;
        }
        int A2 = A(n1Var);
        if (A2 >= 0) {
            return A2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + A2);
    }

    public String toString() {
        return x0.f(this, super.toString());
    }

    @Override // com.google.protobuf.a
    void u(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object v() {
        return D(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        u(Integer.MAX_VALUE);
    }

    int z() {
        return i1.a().d(this).g(this);
    }
}
