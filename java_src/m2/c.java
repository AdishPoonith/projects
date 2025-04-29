package m2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f13715a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f13716b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13715a = byteArrayOutputStream;
        this.f13716b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f13715a.reset();
        try {
            b(this.f13716b, aVar.f13709j);
            String str = aVar.f13710k;
            if (str == null) {
                str = "";
            }
            b(this.f13716b, str);
            this.f13716b.writeLong(aVar.f13711l);
            this.f13716b.writeLong(aVar.f13712m);
            this.f13716b.write(aVar.f13713n);
            this.f13716b.flush();
            return this.f13715a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
