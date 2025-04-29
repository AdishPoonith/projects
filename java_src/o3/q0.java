package o3;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class q0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final int f14540e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f14541f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f14542g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f14543h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f14544i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f14545j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f14546k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14547l;

    /* renamed from: m  reason: collision with root package name */
    private int f14548m;

    /* loaded from: classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public q0() {
        this(2000);
    }

    public q0(int i10) {
        this(i10, 8000);
    }

    public q0(int i10, int i11) {
        super(true);
        this.f14540e = i11;
        byte[] bArr = new byte[i10];
        this.f14541f = bArr;
        this.f14542g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // o3.l
    public void close() {
        this.f14543h = null;
        MulticastSocket multicastSocket = this.f14545j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) p3.a.e(this.f14546k));
            } catch (IOException unused) {
            }
            this.f14545j = null;
        }
        DatagramSocket datagramSocket = this.f14544i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14544i = null;
        }
        this.f14546k = null;
        this.f14548m = 0;
        if (this.f14547l) {
            this.f14547l = false;
            r();
        }
    }

    @Override // o3.l
    public Uri j() {
        return this.f14543h;
    }

    @Override // o3.l
    public long m(p pVar) {
        Uri uri = pVar.f14512a;
        this.f14543h = uri;
        String str = (String) p3.a.e(uri.getHost());
        int port = this.f14543h.getPort();
        s(pVar);
        try {
            this.f14546k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14546k, port);
            if (this.f14546k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14545j = multicastSocket;
                multicastSocket.joinGroup(this.f14546k);
                this.f14544i = this.f14545j;
            } else {
                this.f14544i = new DatagramSocket(inetSocketAddress);
            }
            this.f14544i.setSoTimeout(this.f14540e);
            this.f14547l = true;
            t(pVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14548m == 0) {
            try {
                ((DatagramSocket) p3.a.e(this.f14544i)).receive(this.f14542g);
                int length = this.f14542g.getLength();
                this.f14548m = length;
                q(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f14542g.getLength();
        int i12 = this.f14548m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f14541f, length2 - i12, bArr, i10, min);
        this.f14548m -= min;
        return min;
    }
}
