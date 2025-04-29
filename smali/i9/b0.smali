.class public final Li9/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Ljavax/net/ssl/SSLSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Li9/b0;->a:Li9/a$c;

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Li9/b0;->b:Li9/a$c;

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Li9/b0;->c:Li9/a$c;

    return-void
.end method
