.class final Lk9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/a$d;,
        Lk9/a$e;
    }
.end annotation


# instance fields
.field private final j:Ljava/lang/Object;

.field private final k:Lokio/c;

.field private final l:Lio/grpc/internal/d2;

.field private final m:Lk9/b$a;

.field private final n:I

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Lokio/m;

.field private s:Ljava/net/Socket;

.field private t:Z

.field private u:I

.field private v:I


# direct methods
.method private constructor <init>(Lio/grpc/internal/d2;Lk9/b$a;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk9/a;->j:Ljava/lang/Object;

    new-instance v0, Lokio/c;

    invoke-direct {v0}, Lokio/c;-><init>()V

    iput-object v0, p0, Lk9/a;->k:Lokio/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk9/a;->o:Z

    iput-boolean v0, p0, Lk9/a;->p:Z

    iput-boolean v0, p0, Lk9/a;->q:Z

    const-string v0, "executor"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/d2;

    iput-object p1, p0, Lk9/a;->l:Lio/grpc/internal/d2;

    const-string p1, "exceptionHandler"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk9/b$a;

    iput-object p1, p0, Lk9/a;->m:Lk9/b$a;

    iput p3, p0, Lk9/a;->n:I

    return-void
.end method

.method static synthetic a(Lk9/a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lk9/a;->j:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic b(Lk9/a;)Lokio/c;
    .locals 0

    iget-object p0, p0, Lk9/a;->k:Lokio/c;

    return-object p0
.end method

.method static synthetic e(Lk9/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lk9/a;->o:Z

    return p1
.end method

.method static synthetic h(Lk9/a;)I
    .locals 0

    iget p0, p0, Lk9/a;->v:I

    return p0
.end method

.method static synthetic i(Lk9/a;I)I
    .locals 1

    iget v0, p0, Lk9/a;->v:I

    sub-int/2addr v0, p1

    iput v0, p0, Lk9/a;->v:I

    return v0
.end method

.method static synthetic k(Lk9/a;)Lokio/m;
    .locals 0

    iget-object p0, p0, Lk9/a;->r:Lokio/m;

    return-object p0
.end method

.method static synthetic l(Lk9/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lk9/a;->p:Z

    return p1
.end method

.method static synthetic m(Lk9/a;)Lk9/b$a;
    .locals 0

    iget-object p0, p0, Lk9/a;->m:Lk9/b$a;

    return-object p0
.end method

.method static synthetic q(Lk9/a;)Ljava/net/Socket;
    .locals 0

    iget-object p0, p0, Lk9/a;->s:Ljava/net/Socket;

    return-object p0
.end method

.method static synthetic r(Lk9/a;)I
    .locals 2

    iget v0, p0, Lk9/a;->u:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lk9/a;->u:I

    return v0
.end method

.method static w(Lio/grpc/internal/d2;Lk9/b$a;I)Lk9/a;
    .locals 1

    new-instance v0, Lk9/a;

    invoke-direct {v0, p0, p1, p2}, Lk9/a;-><init>(Lio/grpc/internal/d2;Lk9/b$a;I)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, Lk9/a;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lk9/a;->q:Z

    iget-object v0, p0, Lk9/a;->l:Lio/grpc/internal/d2;

    new-instance v1, Lk9/a$c;

    invoke-direct {v1, p0}, Lk9/a$c;-><init>(Lk9/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/d2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public flush()V
    .locals 2

    iget-boolean v0, p0, Lk9/a;->q:Z

    if-nez v0, :cond_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lr9/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lk9/a;->j:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Lk9/a;->p:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_2
    iput-boolean v1, p0, Lk9/a;->p:Z

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lk9/a;->l:Lio/grpc/internal/d2;

    new-instance v1, Lk9/a$b;

    invoke-direct {v1, p0}, Lk9/a$b;-><init>(Lk9/a;)V

    invoke-virtual {v0, v1}, Lio/grpc/internal/d2;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v0, "AsyncSink.flush"

    invoke-static {v0}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    const-string v1, "AsyncSink.flush"

    invoke-static {v1}, Lr9/c;->h(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(Lokio/c;J)V
    .locals 6

    const-string v0, "source"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lk9/a;->q:Z

    if-nez v0, :cond_4

    const-string v0, "AsyncSink.write"

    invoke-static {v0}, Lr9/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lk9/a;->j:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lk9/a;->k:Lokio/c;

    invoke-virtual {v1, p1, p2, p3}, Lokio/c;->j(Lokio/c;J)V

    iget p1, p0, Lk9/a;->v:I

    iget p2, p0, Lk9/a;->u:I

    add-int/2addr p1, p2

    iput p1, p0, Lk9/a;->v:I

    const/4 p2, 0x0

    iput p2, p0, Lk9/a;->u:I

    iget-boolean p3, p0, Lk9/a;->t:Z

    const/4 v1, 0x1

    if-nez p3, :cond_0

    iget p3, p0, Lk9/a;->n:I

    if-le p1, p3, :cond_0

    iput-boolean v1, p0, Lk9/a;->t:Z

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lk9/a;->o:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lk9/a;->p:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lk9/a;->k:Lokio/c;

    invoke-virtual {p1}, Lokio/c;->r()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-gtz p1, :cond_1

    goto :goto_2

    :cond_1
    iput-boolean v1, p0, Lk9/a;->o:Z

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_2

    :try_start_2
    iget-object p1, p0, Lk9/a;->s:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_3
    iget-object p2, p0, Lk9/a;->m:Lk9/b$a;

    invoke-interface {p2, p1}, Lk9/b$a;->e(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :cond_2
    :try_start_4
    iget-object p1, p0, Lk9/a;->l:Lio/grpc/internal/d2;

    new-instance p2, Lk9/a$a;

    invoke-direct {p2, p0}, Lk9/a$a;-><init>(Lk9/a;)V

    invoke-virtual {p1, p2}, Lio/grpc/internal/d2;->execute(Ljava/lang/Runnable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string p1, "AsyncSink.write"

    invoke-static {p1}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_2
    :try_start_5
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p1

    const-string p2, "AsyncSink.write"

    invoke-static {p2}, Lr9/c;->h(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method t(Lokio/m;Ljava/net/Socket;)V
    .locals 2

    iget-object v0, p0, Lk9/a;->r:Lokio/m;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "AsyncSink\'s becomeConnected should only be called once."

    invoke-static {v0, v1}, Lb5/n;->u(ZLjava/lang/Object;)V

    const-string v0, "sink"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lokio/m;

    iput-object p1, p0, Lk9/a;->r:Lokio/m;

    const-string p1, "socket"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/Socket;

    iput-object p1, p0, Lk9/a;->s:Ljava/net/Socket;

    return-void
.end method

.method v(Lm9/c;)Lm9/c;
    .locals 1

    new-instance v0, Lk9/a$d;

    invoke-direct {v0, p0, p1}, Lk9/a$d;-><init>(Lk9/a;Lm9/c;)V

    return-object v0
.end method
