package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.z.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected p1 unknownFields = p1.c();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0099a<MessageType, BuilderType> {

        /* renamed from: j  reason: collision with root package name */
        private final MessageType f6435j;

        /* renamed from: k  reason: collision with root package name */
        protected MessageType f6436k;

        /* renamed from: l  reason: collision with root package name */
        protected boolean f6437l = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f6435j = messagetype;
            this.f6436k = (MessageType) messagetype.u(f.NEW_MUTABLE_INSTANCE);
        }

        private void A(MessageType messagetype, MessageType messagetype2) {
            d1.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* renamed from: s */
        public final MessageType b() {
            MessageType e10 = e();
            if (e10.j()) {
                return e10;
            }
            throw a.AbstractC0099a.r(e10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* renamed from: t */
        public MessageType e() {
            if (this.f6437l) {
                return this.f6436k;
            }
            this.f6436k.C();
            this.f6437l = true;
            return this.f6436k;
        }

        /* renamed from: u */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().g();
            buildertype.z(e());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void v() {
            if (this.f6437l) {
                w();
                this.f6437l = false;
            }
        }

        protected void w() {
            MessageType messagetype = (MessageType) this.f6436k.u(f.NEW_MUTABLE_INSTANCE);
            A(messagetype, this.f6436k);
            this.f6436k = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t0
        /* renamed from: x */
        public MessageType c() {
            return this.f6435j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0099a
        /* renamed from: y */
        public BuilderType o(MessageType messagetype) {
            return z(messagetype);
        }

        public BuilderType z(MessageType messagetype) {
            v();
            A(this.f6436k, messagetype);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends z<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f6438b;

        public b(T t10) {
            this.f6438b = t10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a1
        /* renamed from: g */
        public T b(j jVar, q qVar) {
            return (T) z.J(this.f6438b, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends z<MessageType, BuilderType> implements t0 {
        protected v<d> extensions = v.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public v<d> N() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* loaded from: classes.dex */
    static final class d implements v.b<d> {

        /* renamed from: j  reason: collision with root package name */
        final b0.d<?> f6439j;

        /* renamed from: k  reason: collision with root package name */
        final int f6440k;

        /* renamed from: l  reason: collision with root package name */
        final u1.b f6441l;

        /* renamed from: m  reason: collision with root package name */
        final boolean f6442m;

        /* renamed from: n  reason: collision with root package name */
        final boolean f6443n;

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public int a() {
            return this.f6440k;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f6440k - dVar.f6440k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public boolean c() {
            return this.f6442m;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public u1.b d() {
            return this.f6441l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public u1.c e() {
            return this.f6441l.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public boolean f() {
            return this.f6443n;
        }

        public b0.d<?> g() {
            return this.f6439j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public s0.a m(s0.a aVar, s0 s0Var) {
            return ((a) aVar).z((z) s0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends s0, Type> extends o<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final s0 f6444a;

        /* renamed from: b  reason: collision with root package name */
        final d f6445b;

        public u1.b a() {
            return this.f6445b.d();
        }

        public s0 b() {
            return this.f6444a;
        }

        public int c() {
            return this.f6445b.a();
        }

        public boolean d() {
            return this.f6445b.f6442m;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends z<T, ?>> boolean B(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c10 = d1.a().e(t10).c(t10);
        if (z10) {
            t10.v(f.SET_MEMOIZED_IS_INITIALIZED, c10 ? t10 : null);
        }
        return c10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> b0.i<E> D(b0.i<E> iVar) {
        int size = iVar.size();
        return iVar.c(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object F(s0 s0Var, String str, Object[] objArr) {
        return new f1(s0Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T G(T t10, i iVar, q qVar) {
        return (T) s(I(t10, iVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<T, ?>> T H(T t10, byte[] bArr, q qVar) {
        return (T) s(K(t10, bArr, 0, bArr.length, qVar));
    }

    private static <T extends z<T, ?>> T I(T t10, i iVar, q qVar) {
        try {
            j w10 = iVar.w();
            T t11 = (T) J(t10, w10, qVar);
            try {
                w10.a(0);
                return t11;
            } catch (c0 e10) {
                throw e10.j(t11);
            }
        } catch (c0 e11) {
            throw e11;
        }
    }

    static <T extends z<T, ?>> T J(T t10, j jVar, q qVar) {
        T t11 = (T) t10.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e10 = d1.a().e(t11);
            e10.j(t11, k.Q(jVar), qVar);
            e10.b(t11);
            return t11;
        } catch (c0 e11) {
            e = e11;
            if (e.a()) {
                e = new c0(e);
            }
            throw e.j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof c0) {
                throw ((c0) e12.getCause());
            }
            throw new c0(e12).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof c0) {
                throw ((c0) e13.getCause());
            }
            throw e13;
        }
    }

    static <T extends z<T, ?>> T K(T t10, byte[] bArr, int i10, int i11, q qVar) {
        T t11 = (T) t10.u(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e10 = d1.a().e(t11);
            e10.h(t11, bArr, i10, i10 + i11, new e.b(qVar));
            e10.b(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (c0 e11) {
            e = e11;
            if (e.a()) {
                e = new c0(e);
            }
            throw e.j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof c0) {
                throw ((c0) e12.getCause());
            }
            throw new c0(e12).j(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw c0.k().j(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends z<?, ?>> void L(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends z<T, ?>> T s(T t10) {
        if (t10 == null || t10.j()) {
            return t10;
        }
        throw t10.p().a().j(t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> b0.i<E> x() {
        return e1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends z<?, ?>> T y(Class<T> cls) {
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
            zVar = (T) ((z) s1.k(cls)).c();
            if (zVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, zVar);
        }
        return (T) zVar;
    }

    protected void C() {
        d1.a().e(this).b(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: E */
    public final BuilderType g() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: M */
    public final BuilderType d() {
        BuilderType buildertype = (BuilderType) u(f.NEW_BUILDER);
        buildertype.z(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d1.a().e(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d1.a().e(this).d(this, (z) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int g10 = d1.a().e(this).g(this);
        this.memoizedHashCode = g10;
        return g10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final a1<MessageType> i() {
        return (a1) u(f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final boolean j() {
        return B(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int l() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void n(l lVar) {
        d1.a().e(this).i(this, m.P(lVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void q(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object r() {
        return u(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType t() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    public String toString() {
        return u0.e(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object u(f fVar) {
        return w(fVar, null, null);
    }

    protected Object v(f fVar, Object obj) {
        return w(fVar, obj, null);
    }

    protected abstract Object w(f fVar, Object obj, Object obj2);

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    /* renamed from: z */
    public final MessageType c() {
        return (MessageType) u(f.GET_DEFAULT_INSTANCE);
    }
}
