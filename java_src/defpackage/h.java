package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.l;
import r8.r;
/* renamed from: h  reason: default package */
/* loaded from: classes.dex */
final class h extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final h f9053d = new h();

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r8.r
    public Object g(byte b10, ByteBuffer buffer) {
        l.e(buffer, "buffer");
        if (b10 == Byte.MIN_VALUE) {
            Object f10 = f(buffer);
            List<? extends Object> list = f10 instanceof List ? (List) f10 : null;
            if (list != null) {
                return b.f2847b.a(list);
            }
            return null;
        } else if (b10 == -127) {
            Object f11 = f(buffer);
            List<? extends Object> list2 = f11 instanceof List ? (List) f11 : null;
            if (list2 != null) {
                return d.f7549b.a(list2);
            }
            return null;
        } else {
            return super.g(b10, buffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r8.r
    public void p(ByteArrayOutputStream stream, Object obj) {
        List<Object> b10;
        l.e(stream, "stream");
        if (obj instanceof b) {
            stream.write(128);
            b10 = ((b) obj).a();
        } else if (!(obj instanceof d)) {
            super.p(stream, obj);
            return;
        } else {
            stream.write(129);
            b10 = ((d) obj).b();
        }
        p(stream, b10);
    }
}
