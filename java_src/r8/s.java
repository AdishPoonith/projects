package r8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import r8.r;
/* loaded from: classes.dex */
public final class s implements l {

    /* renamed from: b  reason: collision with root package name */
    public static final s f16792b = new s(r.f16789a);

    /* renamed from: a  reason: collision with root package name */
    private final r f16793a;

    public s(r rVar) {
        this.f16793a = rVar;
    }

    @Override // r8.l
    public ByteBuffer a(Object obj) {
        r.a aVar = new r.a();
        aVar.write(0);
        this.f16793a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r8.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        r.a aVar = new r.a();
        aVar.write(1);
        this.f16793a.p(aVar, str);
        this.f16793a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f16793a.p(aVar, d8.b.d((Throwable) obj));
        } else {
            this.f16793a.p(aVar, obj);
        }
        this.f16793a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r8.l
    public ByteBuffer c(j jVar) {
        r.a aVar = new r.a();
        this.f16793a.p(aVar, jVar.f16777a);
        this.f16793a.p(aVar, jVar.f16778b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r8.l
    public ByteBuffer d(String str, String str2, Object obj) {
        r.a aVar = new r.a();
        aVar.write(1);
        this.f16793a.p(aVar, str);
        this.f16793a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f16793a.p(aVar, d8.b.d((Throwable) obj));
        } else {
            this.f16793a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // r8.l
    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f10 = this.f16793a.f(byteBuffer);
        Object f11 = this.f16793a.f(byteBuffer);
        if (!(f10 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) f10, f11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // r8.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            r8.r r0 = r4.f16793a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            r8.r r0 = r4.f16793a
            java.lang.Object r0 = r0.f(r5)
            r8.r r1 = r4.f16793a
            java.lang.Object r1 = r1.f(r5)
            r8.r r2 = r4.f16793a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            r8.e r5 = new r8.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.s.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
