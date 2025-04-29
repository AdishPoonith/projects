.class public final Lk9/f;
.super Lio/grpc/internal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/f$f;,
        Lk9/f$d;,
        Lk9/f$e;,
        Lk9/f$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/b<",
        "Lk9/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final r:Ljava/util/logging/Logger;

.field static final s:Ll9/b;

.field private static final t:J

.field private static final u:Lio/grpc/internal/f2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/f2$d<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field static final v:Lio/grpc/internal/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private static final w:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Li9/p1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lio/grpc/internal/h1;

.field private c:Lio/grpc/internal/o2$b;

.field private d:Lio/grpc/internal/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lio/grpc/internal/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/p1<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljavax/net/SocketFactory;

.field private g:Ljavax/net/ssl/SSLSocketFactory;

.field private final h:Z

.field private i:Ljavax/net/ssl/HostnameVerifier;

.field private j:Ll9/b;

.field private k:Lk9/f$c;

.field private l:J

.field private m:J

.field private n:I

.field private o:Z

.field private p:I

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-class v0, Lk9/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lk9/f;->r:Ljava/util/logging/Logger;

    new-instance v0, Ll9/b$b;

    sget-object v1, Ll9/b;->f:Ll9/b;

    invoke-direct {v0, v1}, Ll9/b$b;-><init>(Ll9/b;)V

    const/4 v1, 0x6

    new-array v1, v1, [Ll9/a;

    sget-object v2, Ll9/a;->U0:Ll9/a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ll9/a;->Y0:Ll9/a;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Ll9/a;->V0:Ll9/a;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Ll9/a;->Z0:Ll9/a;

    const/4 v5, 0x3

    aput-object v2, v1, v5

    sget-object v2, Ll9/a;->d1:Ll9/a;

    const/4 v5, 0x4

    aput-object v2, v1, v5

    sget-object v2, Ll9/a;->c1:Ll9/a;

    const/4 v5, 0x5

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Ll9/b$b;->g([Ll9/a;)Ll9/b$b;

    move-result-object v0

    new-array v1, v4, [Ll9/k;

    sget-object v2, Ll9/k;->l:Ll9/k;

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Ll9/b$b;->j([Ll9/k;)Ll9/b$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Ll9/b$b;->h(Z)Ll9/b$b;

    move-result-object v0

    invoke-virtual {v0}, Ll9/b$b;->e()Ll9/b;

    move-result-object v0

    sput-object v0, Lk9/f;->s:Ll9/b;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lk9/f;->t:J

    new-instance v0, Lk9/f$a;

    invoke-direct {v0}, Lk9/f$a;-><init>()V

    sput-object v0, Lk9/f;->u:Lio/grpc/internal/f2$d;

    invoke-static {v0}, Lio/grpc/internal/g2;->c(Lio/grpc/internal/f2$d;)Lio/grpc/internal/g2;

    move-result-object v0

    sput-object v0, Lk9/f;->v:Lio/grpc/internal/p1;

    sget-object v0, Li9/p1;->k:Li9/p1;

    sget-object v1, Li9/p1;->l:Li9/p1;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lk9/f;->w:Ljava/util/EnumSet;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/grpc/internal/b;-><init>()V

    invoke-static {}, Lio/grpc/internal/o2;->a()Lio/grpc/internal/o2$b;

    move-result-object v0

    iput-object v0, p0, Lk9/f;->c:Lio/grpc/internal/o2$b;

    sget-object v0, Lk9/f;->v:Lio/grpc/internal/p1;

    iput-object v0, p0, Lk9/f;->d:Lio/grpc/internal/p1;

    sget-object v0, Lio/grpc/internal/r0;->v:Lio/grpc/internal/f2$d;

    invoke-static {v0}, Lio/grpc/internal/g2;->c(Lio/grpc/internal/f2$d;)Lio/grpc/internal/g2;

    move-result-object v0

    iput-object v0, p0, Lk9/f;->e:Lio/grpc/internal/p1;

    sget-object v0, Lk9/f;->s:Ll9/b;

    iput-object v0, p0, Lk9/f;->j:Ll9/b;

    sget-object v0, Lk9/f$c;->j:Lk9/f$c;

    iput-object v0, p0, Lk9/f;->k:Lk9/f$c;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lk9/f;->l:J

    sget-wide v0, Lio/grpc/internal/r0;->n:J

    iput-wide v0, p0, Lk9/f;->m:J

    const v0, 0xffff

    iput v0, p0, Lk9/f;->n:I

    const v0, 0x7fffffff

    iput v0, p0, Lk9/f;->p:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk9/f;->q:Z

    new-instance v1, Lio/grpc/internal/h1;

    new-instance v2, Lk9/f$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lk9/f$e;-><init>(Lk9/f;Lk9/f$a;)V

    new-instance v4, Lk9/f$d;

    invoke-direct {v4, p0, v3}, Lk9/f$d;-><init>(Lk9/f;Lk9/f$a;)V

    invoke-direct {v1, p1, v2, v4}, Lio/grpc/internal/h1;-><init>(Ljava/lang/String;Lio/grpc/internal/h1$c;Lio/grpc/internal/h1$b;)V

    iput-object v1, p0, Lk9/f;->b:Lio/grpc/internal/h1;

    iput-boolean v0, p0, Lk9/f;->h:Z

    return-void
.end method

.method public static forTarget(Ljava/lang/String;)Lk9/f;
    .locals 1

    new-instance v0, Lk9/f;

    invoke-direct {v0, p0}, Lk9/f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c(JLjava/util/concurrent/TimeUnit;)Li9/v0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lk9/f;->i(JLjava/util/concurrent/TimeUnit;)Lk9/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Li9/v0;
    .locals 1

    invoke-virtual {p0}, Lk9/f;->j()Lk9/f;

    move-result-object v0

    return-object v0
.end method

.method protected e()Li9/v0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/v0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lk9/f;->b:Lio/grpc/internal/h1;

    return-object v0
.end method

.method f()Lk9/f$f;
    .locals 22

    move-object/from16 v0, p0

    iget-wide v1, v0, Lk9/f;->l:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x1

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    new-instance v1, Lk9/f$f;

    move-object v2, v1

    iget-object v3, v0, Lk9/f;->d:Lio/grpc/internal/p1;

    iget-object v4, v0, Lk9/f;->e:Lio/grpc/internal/p1;

    iget-object v5, v0, Lk9/f;->f:Ljavax/net/SocketFactory;

    invoke-virtual/range {p0 .. p0}, Lk9/f;->g()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v6

    iget-object v7, v0, Lk9/f;->i:Ljavax/net/ssl/HostnameVerifier;

    iget-object v8, v0, Lk9/f;->j:Ll9/b;

    iget v9, v0, Lio/grpc/internal/b;->a:I

    iget-wide v11, v0, Lk9/f;->l:J

    iget-wide v13, v0, Lk9/f;->m:J

    iget v15, v0, Lk9/f;->n:I

    move-object/from16 v21, v1

    iget-boolean v1, v0, Lk9/f;->o:Z

    move/from16 v16, v1

    iget v1, v0, Lk9/f;->p:I

    move/from16 v17, v1

    iget-object v1, v0, Lk9/f;->c:Lio/grpc/internal/o2$b;

    move-object/from16 v18, v1

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v20}, Lk9/f$f;-><init>(Lio/grpc/internal/p1;Lio/grpc/internal/p1;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ll9/b;IZJJIZILio/grpc/internal/o2$b;ZLk9/f$a;)V

    return-object v21
.end method

.method g()Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    sget-object v0, Lk9/f$b;->b:[I

    iget-object v1, p0, Lk9/f;->k:Lk9/f$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :try_start_0
    iget-object v0, p0, Lk9/f;->g:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    const-string v0, "Default"

    invoke-static {}, Ll9/h;->e()Ll9/h;

    move-result-object v1

    invoke-virtual {v1}, Ll9/h;->g()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Lk9/f;->g:Ljavax/net/ssl/SSLSocketFactory;

    :cond_0
    iget-object v0, p0, Lk9/f;->g:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "TLS Provider failure"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown negotiation type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lk9/f;->k:Lk9/f$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method h()I
    .locals 3

    sget-object v0, Lk9/f$b;->b:[I

    iget-object v1, p0, Lk9/f;->k:Lk9/f$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/16 v0, 0x1bb

    return v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lk9/f;->k:Lk9/f$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    const/16 v0, 0x50

    return v0
.end method

.method public i(JLjava/util/concurrent/TimeUnit;)Lk9/f;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "keepalive time must be positive"

    invoke-static {v0, v1}, Lb5/n;->e(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Lk9/f;->l:J

    invoke-static {p1, p2}, Lio/grpc/internal/c1;->l(J)J

    move-result-wide p1

    iput-wide p1, p0, Lk9/f;->l:J

    sget-wide v0, Lk9/f;->t:J

    cmp-long p3, p1, v0

    if-ltz p3, :cond_1

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lk9/f;->l:J

    :cond_1
    return-object p0
.end method

.method public j()Lk9/f;
    .locals 2

    iget-boolean v0, p0, Lk9/f;->h:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot change security when using ChannelCredentials"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    sget-object v0, Lk9/f$c;->k:Lk9/f$c;

    iput-object v0, p0, Lk9/f;->k:Lk9/f$c;

    return-object p0
.end method

.method public scheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Lk9/f;
    .locals 2

    new-instance v0, Lio/grpc/internal/h0;

    const-string v1, "scheduledExecutorService"

    invoke-static {p1, v1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p1}, Lio/grpc/internal/h0;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lk9/f;->e:Lio/grpc/internal/p1;

    return-object p0
.end method

.method public sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lk9/f;
    .locals 2

    iget-boolean v0, p0, Lk9/f;->h:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot change security when using ChannelCredentials"

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    iput-object p1, p0, Lk9/f;->g:Ljavax/net/ssl/SSLSocketFactory;

    sget-object p1, Lk9/f$c;->j:Lk9/f$c;

    iput-object p1, p0, Lk9/f;->k:Lk9/f$c;

    return-object p0
.end method

.method public transportExecutor(Ljava/util/concurrent/Executor;)Lk9/f;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lk9/f;->v:Lio/grpc/internal/p1;

    iput-object p1, p0, Lk9/f;->d:Lio/grpc/internal/p1;

    goto :goto_0

    :cond_0
    new-instance v0, Lio/grpc/internal/h0;

    invoke-direct {v0, p1}, Lio/grpc/internal/h0;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lk9/f;->d:Lio/grpc/internal/p1;

    :goto_0
    return-object p0
.end method
