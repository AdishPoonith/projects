package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0103a;
import com.google.protobuf.i;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0103a<MessageType, BuilderType>> implements v0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0103a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0103a<MessageType, BuilderType>> implements v0.a {
        protected static <T> void r(Iterable<T> iterable, List<? super T> list) {
            d0.a(iterable);
            if (!(iterable instanceof k0)) {
                if (iterable instanceof g1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    s(iterable, list);
                    return;
                }
            }
            List<?> g10 = ((k0) iterable).g();
            k0 k0Var = (k0) list;
            int size = list.size();
            for (Object obj : g10) {
                if (obj == null) {
                    String str = "Element at index " + (k0Var.size() - size) + " is null.";
                    for (int size2 = k0Var.size() - 1; size2 >= size; size2--) {
                        k0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof i) {
                    k0Var.j((i) obj);
                } else {
                    k0Var.add((String) obj);
                }
            }
        }

        private static <T> void s(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static u1 v(v0 v0Var) {
            return new u1(v0Var);
        }

        protected abstract BuilderType t(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.v0.a
        /* renamed from: u */
        public BuilderType m(v0 v0Var) {
            if (c().getClass().isInstance(v0Var)) {
                return (BuilderType) t((a) v0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void k(Iterable<T> iterable, List<? super T> list) {
        AbstractC0103a.r(iterable, list);
    }

    private String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.v0
    public byte[] f() {
        try {
            byte[] bArr = new byte[a()];
            l g02 = l.g0(bArr);
            p(g02);
            g02.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }

    @Override // com.google.protobuf.v0
    public i h() {
        try {
            i.h E = i.E(a());
            p(E.b());
            return E.a();
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.v0
    public void n(OutputStream outputStream) {
        l f02 = l.f0(outputStream, l.J(a()));
        p(f02);
        f02.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r(n1 n1Var) {
        int l10 = l();
        if (l10 == -1) {
            int e10 = n1Var.e(this);
            u(e10);
            return e10;
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1 t() {
        return new u1(this);
    }

    void u(int i10) {
        throw new UnsupportedOperationException();
    }
}
