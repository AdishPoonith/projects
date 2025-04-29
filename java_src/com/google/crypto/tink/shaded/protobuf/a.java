package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.AbstractC0099a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0099a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0099a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0099a<MessageType, BuilderType>> implements s0.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static n1 r(s0 s0Var) {
            return new n1(s0Var);
        }

        protected abstract BuilderType o(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* renamed from: p */
        public BuilderType k(s0 s0Var) {
            if (c().getClass().isInstance(s0Var)) {
                return (BuilderType) o((a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String o(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public byte[] f() {
        try {
            byte[] bArr = new byte[a()];
            l d02 = l.d0(bArr);
            n(d02);
            d02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(o("byte array"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public i h() {
        try {
            i.h v10 = i.v(a());
            n(v10.b());
            return v10.a();
        } catch (IOException e10) {
            throw new RuntimeException(o("ByteString"), e10);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(h1 h1Var) {
        int l10 = l();
        if (l10 == -1) {
            int e10 = h1Var.e(this);
            q(e10);
            return e10;
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1 p() {
        return new n1(this);
    }

    void q(int i10) {
        throw new UnsupportedOperationException();
    }
}
