package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f0 extends InputStream {

    /* renamed from: j  reason: collision with root package name */
    private Iterator<ByteBuffer> f7111j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f7112k;

    /* renamed from: l  reason: collision with root package name */
    private int f7113l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f7114m;

    /* renamed from: n  reason: collision with root package name */
    private int f7115n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7116o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f7117p;

    /* renamed from: q  reason: collision with root package name */
    private int f7118q;

    /* renamed from: r  reason: collision with root package name */
    private long f7119r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(Iterable<ByteBuffer> iterable) {
        this.f7111j = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f7113l++;
        }
        this.f7114m = -1;
        if (a()) {
            return;
        }
        this.f7112k = d0.f7095e;
        this.f7114m = 0;
        this.f7115n = 0;
        this.f7119r = 0L;
    }

    private boolean a() {
        this.f7114m++;
        if (this.f7111j.hasNext()) {
            ByteBuffer next = this.f7111j.next();
            this.f7112k = next;
            this.f7115n = next.position();
            if (this.f7112k.hasArray()) {
                this.f7116o = true;
                this.f7117p = this.f7112k.array();
                this.f7118q = this.f7112k.arrayOffset();
            } else {
                this.f7116o = false;
                this.f7119r = z1.k(this.f7112k);
                this.f7117p = null;
            }
            return true;
        }
        return false;
    }

    private void b(int i10) {
        int i11 = this.f7115n + i10;
        this.f7115n = i11;
        if (i11 == this.f7112k.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f7114m == this.f7113l) {
            return -1;
        }
        int w10 = (this.f7116o ? this.f7117p[this.f7115n + this.f7118q] : z1.w(this.f7115n + this.f7119r)) & 255;
        b(1);
        return w10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f7114m == this.f7113l) {
            return -1;
        }
        int limit = this.f7112k.limit();
        int i12 = this.f7115n;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f7116o) {
            System.arraycopy(this.f7117p, i12 + this.f7118q, bArr, i10, i11);
        } else {
            int position = this.f7112k.position();
            this.f7112k.position(this.f7115n);
            this.f7112k.get(bArr, i10, i11);
            this.f7112k.position(position);
        }
        b(i11);
        return i11;
    }
}
