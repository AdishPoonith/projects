.class Lw1/g$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lw1/g;


# direct methods
.method public constructor <init>(Lw1/g;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lw1/g$c;->b:Lw1/g;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private a(Landroid/os/Message;Lw1/o0;)Z
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Lw1/g$d;

    iget-boolean v4, v3, Lw1/g$d;->b:Z

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return v5

    :cond_0
    iget v4, v3, Lw1/g$d;->e:I

    const/4 v6, 0x1

    add-int/2addr v4, v6

    iput v4, v3, Lw1/g$d;->e:I

    iget-object v7, v1, Lw1/g$c;->b:Lw1/g;

    invoke-static {v7}, Lw1/g;->o(Lw1/g;)Lo3/g0;

    move-result-object v7

    const/4 v8, 0x3

    invoke-interface {v7, v8}, Lo3/g0;->d(I)I

    move-result v7

    if-le v4, v7, :cond_1

    return v5

    :cond_1
    new-instance v4, Lu2/n;

    iget-wide v10, v3, Lw1/g$d;->a:J

    iget-object v12, v2, Lw1/o0;->j:Lo3/p;

    iget-object v13, v2, Lw1/o0;->k:Landroid/net/Uri;

    iget-object v14, v2, Lw1/o0;->l:Ljava/util/Map;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v17

    iget-wide v6, v3, Lw1/g$d;->c:J

    sub-long v17, v17, v6

    iget-wide v6, v2, Lw1/o0;->m:J

    move-object v9, v4

    move-wide/from16 v19, v6

    invoke-direct/range {v9 .. v20}, Lu2/n;-><init>(JLo3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v6, Lu2/q;

    invoke-direct {v6, v8}, Lu2/q;-><init>(I)V

    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v7

    instance-of v7, v7, Ljava/io/IOException;

    if-eqz v7, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    check-cast v2, Ljava/io/IOException;

    goto :goto_0

    :cond_2
    new-instance v7, Lw1/g$f;

    invoke-virtual/range {p2 .. p2}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v7, v2}, Lw1/g$f;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v7

    :goto_0
    iget-object v7, v1, Lw1/g$c;->b:Lw1/g;

    invoke-static {v7}, Lw1/g;->o(Lw1/g;)Lo3/g0;

    move-result-object v7

    new-instance v8, Lo3/g0$c;

    iget v3, v3, Lw1/g$d;->e:I

    invoke-direct {v8, v4, v6, v2, v3}, Lo3/g0$c;-><init>(Lu2/n;Lu2/q;Ljava/io/IOException;I)V

    invoke-interface {v7, v8}, Lo3/g0;->b(Lo3/g0$c;)J

    move-result-wide v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v6

    if-nez v4, :cond_3

    return v5

    :cond_3
    monitor-enter p0

    :try_start_0
    iget-boolean v4, v1, Lw1/g$c;->a:Z

    if-nez v4, :cond_4

    invoke-static/range {p1 .. p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :cond_4
    monitor-exit p0

    return v5

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method b(ILjava/lang/Object;Z)V
    .locals 8

    new-instance v7, Lw1/g$d;

    invoke-static {}, Lu2/n;->a()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    move-object v0, v7

    move v3, p3

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lw1/g$d;-><init>(JZJLjava/lang/Object;)V

    invoke-virtual {p0, p1, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw1/g$c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lw1/g$d;

    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v1}, Lw1/g;->n(Lw1/g;)Lw1/n0;

    move-result-object v1

    iget-object v2, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v2}, Lw1/g;->m(Lw1/g;)Ljava/util/UUID;

    move-result-object v2

    iget-object v3, v0, Lw1/g$d;->d:Ljava/lang/Object;

    check-cast v3, Lw1/g0$a;

    invoke-interface {v1, v2, v3}, Lw1/n0;->a(Ljava/util/UUID;Lw1/g0$a;)[B

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :cond_1
    iget-object v1, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v1}, Lw1/g;->n(Lw1/g;)Lw1/n0;

    move-result-object v1

    iget-object v2, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v2}, Lw1/g;->m(Lw1/g;)Ljava/util/UUID;

    move-result-object v2

    iget-object v3, v0, Lw1/g$d;->d:Ljava/lang/Object;

    check-cast v3, Lw1/g0$d;

    invoke-interface {v1, v2, v3}, Lw1/n0;->b(Ljava/util/UUID;Lw1/g0$d;)[B

    move-result-object v1
    :try_end_0
    .catch Lw1/o0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "DefaultDrmSession"

    const-string v3, "Key/provisioning request produced an unexpected exception. Not retrying."

    invoke-static {v2, v3, v1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    invoke-direct {p0, p1, v1}, Lw1/g$c;->a(Landroid/os/Message;Lw1/o0;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    :goto_0
    iget-object v2, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v2}, Lw1/g;->o(Lw1/g;)Lo3/g0;

    move-result-object v2

    iget-wide v3, v0, Lw1/g$d;->a:J

    invoke-interface {v2, v3, v4}, Lo3/g0;->a(J)V

    monitor-enter p0

    :try_start_1
    iget-boolean v2, p0, Lw1/g$c;->a:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lw1/g$c;->b:Lw1/g;

    invoke-static {v2}, Lw1/g;->p(Lw1/g;)Lw1/g$e;

    move-result-object v2

    iget p1, p1, Landroid/os/Message;->what:I

    iget-object v0, v0, Lw1/g$d;->d:Ljava/lang/Object;

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
