package okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f14758a = Logger.getLogger(g.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements m {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ o f14759j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ OutputStream f14760k;

        a(o oVar, OutputStream outputStream) {
            this.f14759j = oVar;
            this.f14760k = outputStream;
        }

        @Override // okio.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f14760k.close();
        }

        @Override // okio.m, java.io.Flushable
        public void flush() {
            this.f14760k.flush();
        }

        @Override // okio.m
        public void j(okio.c cVar, long j10) {
            p.b(cVar.f14751k, 0L, j10);
            while (j10 > 0) {
                this.f14759j.c();
                j jVar = cVar.f14750j;
                int min = (int) Math.min(j10, jVar.f14772c - jVar.f14771b);
                this.f14760k.write(jVar.f14770a, jVar.f14771b, min);
                int i10 = jVar.f14771b + min;
                jVar.f14771b = i10;
                long j11 = min;
                j10 -= j11;
                cVar.f14751k -= j11;
                if (i10 == jVar.f14772c) {
                    cVar.f14750j = jVar.b();
                    k.a(jVar);
                }
            }
        }

        public String toString() {
            return "sink(" + this.f14760k + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements n {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ o f14761j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ InputStream f14762k;

        b(o oVar, InputStream inputStream) {
            this.f14761j = oVar;
            this.f14762k = inputStream;
        }

        @Override // okio.n
        public long Q(okio.c cVar, long j10) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (i10 == 0) {
                return 0L;
            } else {
                try {
                    this.f14761j.c();
                    j f02 = cVar.f0(1);
                    int read = this.f14762k.read(f02.f14770a, f02.f14772c, (int) Math.min(j10, 8192 - f02.f14772c));
                    if (read != -1) {
                        f02.f14772c += read;
                        long j11 = read;
                        cVar.f14751k += j11;
                        return j11;
                    } else if (f02.f14771b == f02.f14772c) {
                        cVar.f14750j = f02.b();
                        k.a(f02);
                        return -1L;
                    } else {
                        return -1L;
                    }
                } catch (AssertionError e10) {
                    if (g.c(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
            }
        }

        @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f14762k.close();
        }

        public String toString() {
            return "source(" + this.f14762k + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class c extends okio.a {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Socket f14763k;

        c(Socket socket) {
            this.f14763k = socket;
        }

        @Override // okio.a
        protected IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // okio.a
        protected void p() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Exception exc;
            try {
                this.f14763k.close();
            } catch (AssertionError e10) {
                if (!g.c(e10)) {
                    throw e10;
                }
                Logger logger2 = g.f14758a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e10;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f14763k);
                logger.log(level, sb.toString(), (Throwable) exc);
            } catch (Exception e11) {
                Logger logger3 = g.f14758a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e11;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.f14763k);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
        }
    }

    private g() {
    }

    public static d a(m mVar) {
        return new h(mVar);
    }

    public static e b(n nVar) {
        return new i(nVar);
    }

    static boolean c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    private static m d(OutputStream outputStream, o oVar) {
        if (outputStream != null) {
            if (oVar != null) {
                return new a(oVar, outputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static m e(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                okio.a h10 = h(socket);
                return h10.n(d(socket.getOutputStream(), h10));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static n f(InputStream inputStream, o oVar) {
        if (inputStream != null) {
            if (oVar != null) {
                return new b(oVar, inputStream);
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    public static n g(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                okio.a h10 = h(socket);
                return h10.o(f(socket.getInputStream(), h10));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static okio.a h(Socket socket) {
        return new c(socket);
    }
}
