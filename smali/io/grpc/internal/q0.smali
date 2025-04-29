.class public final Lio/grpc/internal/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Li9/h1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Li9/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/a$c<",
            "Li9/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.internal.GrpcAttributes.securityLevel"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->a:Li9/a$c;

    const-string v0, "io.grpc.internal.GrpcAttributes.clientEagAttrs"

    invoke-static {v0}, Li9/a$c;->a(Ljava/lang/String;)Li9/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->b:Li9/a$c;

    return-void
.end method
