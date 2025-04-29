package com.google.protobuf;

import com.google.protobuf.i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 extends i.AbstractC0105i {

    /* renamed from: n  reason: collision with root package name */
    private final ByteBuffer f7097n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(ByteBuffer byteBuffer) {
        d0.b(byteBuffer, "buffer");
        this.f7097n = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer W(int i10, int i11) {
        if (i10 < this.f7097n.position() || i11 > this.f7097n.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer slice = this.f7097n.slice();
        slice.position(i10 - this.f7097n.position());
        slice.limit(i11 - this.f7097n.position());
        return slice;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return i.s(this.f7097n.slice());
    }

    @Override // com.google.protobuf.i
    public byte A(int i10) {
        return l(i10);
    }

    @Override // com.google.protobuf.i
    public boolean C() {
        return a2.r(this.f7097n);
    }

    @Override // com.google.protobuf.i
    public j F() {
        return j.i(this.f7097n, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public int G(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f7097n.get(i13);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public int H(int i10, int i11, int i12) {
        return a2.u(i10, this.f7097n, i11, i12 + i11);
    }

    @Override // com.google.protobuf.i
    public i K(int i10, int i11) {
        try {
            return new d1(W(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.i
    protected String O(Charset charset) {
        byte[] L;
        int i10;
        int length;
        if (this.f7097n.hasArray()) {
            L = this.f7097n.array();
            i10 = this.f7097n.arrayOffset() + this.f7097n.position();
            length = this.f7097n.remaining();
        } else {
            L = L();
            i10 = 0;
            length = L.length;
        }
        return new String(L, i10, length, charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i
    public void U(h hVar) {
        hVar.a(this.f7097n.slice());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i.AbstractC0105i
    public boolean V(i iVar, int i10, int i11) {
        return K(0, i11).equals(iVar.K(i10, i11 + i10));
    }

    @Override // com.google.protobuf.i
    public ByteBuffer e() {
        return this.f7097n.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            return obj instanceof d1 ? this.f7097n.equals(((d1) obj).f7097n) : obj instanceof m1 ? obj.equals(this) : this.f7097n.equals(iVar.e());
        }
        return false;
    }

    @Override // com.google.protobuf.i
    public byte l(int i10) {
        try {
            return this.f7097n.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.i
    public int size() {
        return this.f7097n.remaining();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public void y(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer slice = this.f7097n.slice();
        slice.position(i10);
        slice.get(bArr, i11, i12);
    }
}
